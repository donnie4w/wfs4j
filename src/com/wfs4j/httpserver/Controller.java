/**
 * Project Name:wfs4j
 * File Name:Controller.java
 * Package Name:com.wfs4j.httpserver
 * Date:2017年5月17日下午7:58:47
 * Copyright (c) 2017, donnie4w@gmail.com All Rights Reserved.
 *
 */

package com.wfs4j.httpserver;

import java.util.concurrent.ConcurrentSkipListMap;

/**
 * ClassName:Controller <br/>
 * Date: 2017年5月17日 下午7:58:47 <br/>
 * 
 * @author dong
 * @version
 * @since JDK 1.7
 * @desc
 */
public class Controller {
	private static ConcurrentSkipListMap<String, RouteHandler> ctl = new ConcurrentSkipListMap<>();

	public static void addHandler(String regex, RouteHandler handler) {
		ctl.put(regex, handler);
	}

	public static RouteHandler Route(String uri) {
		RouteHandler retHandler = null;
		for (String key : ctl.keySet()) {
			if (parse(key, uri)) {
				retHandler = ctl.get(key);
			}
		}
		return retHandler;
	}

	public static boolean parse(String regex, String url) {
		if (regex.endsWith("/")) {
			regex = regex + ".*?";
		}
		if (url.contains("?")) {
			url = url.substring(0, url.indexOf("?"));
		}
		String[] regexs = regex.split("/");
		String[] uris = url.split("/");
		if (regexs.length > uris.length) {
			return false;
		} else {
			for (int i = 0; i < regexs.length; i++) {
				if (i < regexs.length - 1 && !uris[i].matches(regexs[i]) && regexs[i].length() > 0) {
					return false;
				} else if (i == regexs.length - 1) {
					String res = url.substring(url.indexOf("/", i - 1) + 1, url.length());
					if (regexs[i].length() > 0 && !res.equals(regexs[i])
							&& !res.startsWith(regexs[i].endsWith("/") ? regexs[i] : regexs[i] + "/")) {
						return false;
					}
				}
			}
			return true;
		}
	}
}
