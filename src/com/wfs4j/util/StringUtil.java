package com.wfs4j.util;

import java.io.UnsupportedEncodingException;

public class StringUtil {
	public static boolean notEmpty(String s) {
		return s != null && s.trim().length() > 0;
	}

	public static byte[] toBytes(String s) {
		try {
			return s.getBytes("utf-8");
		} catch (UnsupportedEncodingException e) {
		}
		return null;
	}

	public static String toString(byte[] bs) {
		try {
			return new String(bs, "utf-8");
		} catch (UnsupportedEncodingException e) {
		}
		return null;
	}
}
