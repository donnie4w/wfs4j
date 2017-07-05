package com.wfs4j.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Md5 {

	public static byte[] getMd5(byte[] bs) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			return md.digest(bs);
		} catch (NoSuchAlgorithmException e) {
		}
		return null;
	}

	public static String getMd5(String msg) {
		String ret = null;
		try {
			byte[] result = msg.getBytes("utf-8");
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] digest = md.digest(result);
			ret = byte2hex(digest);
		} catch (UnsupportedEncodingException e) {
		} catch (NoSuchAlgorithmException e) {
		}
		return ret;
	}

	public static String byte2hex(byte[] b) {
		StringBuilder sb = new StringBuilder();
		for (int n = 0; n < b.length; n++) {
			String s1 = Integer.toHexString(b[n] & 0x0f);
			String s2 = Integer.toHexString(b[n] >> 4 & 0x0f);
			sb.append(s2);
			sb.append(s1);
		}
		return sb.toString().toUpperCase();
	}
}
