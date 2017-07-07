package com.wfs4j.conf;

public class Config {
	public static String version = "1.0.0";
	public static int port = 3434;
	public static int chiplimit;
	public static long maxDataSize = 1 << 30;
	public static String fileData = "data";
	public static long maxFileSize = 1 << 24;
	public static boolean readonly = false;
	public static int keepalive = 0;
	public static long readPerSecond = 60;
	public static int serverReadTimeout = 5;
	public static String bind = "0.0.0.0";
	public static boolean compress = false;

	public static void parse() {

	}

}
