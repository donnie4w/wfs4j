/**
 * Project Name:wfs4j
 * File Name:MockRouteHandler.java
 * Package Name:com.wfs4j.httpserver
 * Date:2017年5月19日上午1:33:43
 * Copyright (c) 2017, donnie4w@gmail.com All Rights Reserved.
 *
 */

package com.wfs4j.handler;

import java.io.UnsupportedEncodingException;

import com.wfs4j.httpserver.RouteHandler;

import io.netty.handler.codec.http.HttpRequest;

/**
 * ClassName:MockRouteHandler <br/>
 * Date: 2017年5月19日 上午1:33:43 <br/>
 * 
 * @author dong
 * @version
 * @since JDK 1.7
 * @desc
 */
public class MockRouteHandler implements RouteHandler {
	public byte[] handler(HttpRequest req, byte[] body) {
		System.out.println("mock uri:" + req.uri());
		System.out.println("mock method:" + req.method());
		String s = "";
		try {
			s = new String(body, "utf-8");
		} catch (UnsupportedEncodingException e) {
		}
		return ("ret," + s).getBytes();
	}
}
