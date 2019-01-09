package com.java.sasha.inventory.utils;

import java.io.File;
import java.util.Collection;
import java.util.Map;

public class CommonUtils {

	public static boolean exists(String s) {
		return (s != null) && (s.trim().length() > 0);
	}

	public static boolean exists(Collection<?> c) {
		return (c != null) && !c.isEmpty();
	}

	public static boolean exists(java.util.Map<?, ?> m) {
		return (m != null) && !m.isEmpty();
	}

	public static boolean exists(Object[] a) {
		return (a != null) && (a.length > 0);
	}

	public static boolean exists(File f) {
		return (f != null) && f.exists();
	}

	public static boolean exists(Object o) {
		if (o instanceof Collection) {
			return exists((Collection<?>) o);
		}
		if (o instanceof File) {
			return exists((File) o);
		}
		if (o instanceof Map) {
			return exists((java.util.Map<?, ?>) o);
		}
		if (o instanceof Object[]) {
			return exists((Object[]) o);
		}
		if (o instanceof String) {
			return exists((String) o);
		}
		return o != null;
	}
}
