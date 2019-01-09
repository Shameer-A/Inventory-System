package com.java.sasha.inventory.config.spring.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import junit.framework.Assert;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.java.sasha.inventory.communication.api.IUserCommunication;
import com.java.sasha.inventory.communication.model.Roles;
import com.java.sasha.inventory.communication.model.User;
import com.java.sasha.inventory.utils.CommonUtils;
import com.java.sasha.inventory.utils.Constants;


@Controller
public class InventoryController implements InitializingBean {

	private static final Logger LOG = Logger.getLogger(InventoryController.class);
	
	@Autowired
	IUserCommunication userCommunication;
	
	public void afterPropertiesSet() throws Exception {
		Assert.assertNotNull("User Communication must be set", userCommunication);
	}
	
	@RequestMapping(value ={"/" , "/home"})
	public ModelAndView getHomePage(){
		
		LOG.debug("Default Home Page is requested from the controller");
		System.out.println("Default Home Page is requested from the controller");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", getWelcomeMessage());
		modelAndView.addObject("title",Constants.LOGIN_PAGE_TITLE);
		modelAndView.setViewName("Home");
		
		return modelAndView;
	}
	
	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest httpRequest){
		
		LOG.debug("Login request is invoked");
		
		ModelAndView modelAndView = new ModelAndView();
		
		String userName = httpRequest.getParameter("userName");
		String password = httpRequest.getParameter("password");
		
		LOG.debug("User name : "+userName+" Password : "+password);
		
		modelAndView.addObject("message", "Login Requested");
		modelAndView.addObject("title","Login Request");
		modelAndView.setViewName("Home");
		
		return modelAndView;
		
	}
	
	@RequestMapping("/register")
	public ModelAndView register(){
	
		LOG.debug("Registration request is invoked");
		
		LOG.debug("Fetch Roles : "+userCommunication.getRoles());
		
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("message", "Staff Registration");
		modelAndView.addObject("title",Constants.REGISTRATION_PAGE_TITLE);
		modelAndView.addObject("roleMap", intialiseRoles());
		modelAndView.setViewName("RegistrationPage");
		
		
		return modelAndView; 
	}
	
	@RequestMapping("/addStaff")
	public ModelAndView addStaff(@Valid @ModelAttribute("user")User registrationUser, BindingResult result){
		
		LOG.debug("Add Staff Request invoked. with details "+registrationUser);
		
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("message", getWelcomeMessage());
		modelAndView.addObject("title",Constants.LOGIN_PAGE_TITLE);
		modelAndView.setViewName("Home");
		
		return modelAndView;
	}
	
	public Map<Roles, String> intialiseRoles(){
		
		Map<Roles, String> roleMap = new HashMap<Roles,String>();
		
		List<Roles> roleList = userCommunication.getRoles();
		
		if(CommonUtils.exists(roleList)){

			for (Roles role : roleList) {
				roleMap.put(role, role.getRole());
			}
		}
		
		return roleMap;
	}
	
	@ModelAttribute("user")
    public User initializeUser() {
        return new User();
    }
	
	@ModelAttribute("message")
	public String getWelcomeMessage(){
		return "Welcome to Sasha Inventory System";
	}

	public IUserCommunication getUserCommunication() {
		return userCommunication;
	}

	public void setUserCommunication(IUserCommunication userCommunication) {
		this.userCommunication = userCommunication;
	}

}
