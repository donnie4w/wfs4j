/**
 * Project Name:wfs4j
 * File Name:RouteHandler.java
 * Package Name:com.wfs4j.httpserver
 * Date:2017年5月17日下午8:00:48
 * Copyright (c) 2017, donnie4w@gmail.com All Rights Reserved.
 *
 */

package com.wfs4j.httpserver;

import io.netty.handler.codec.http.HttpContent;
import io.netty.handler.codec.http.HttpRequest;

/**
 * ClassName:RouteHandler <br/>
 * Date: 2017年5月17日 下午8:00:48 <br/>
 * 
 * @author dong
 * @version
 * @since JDK 1.7
 * @desc
 */
public interface RouteHandler {
	public byte[] handler(HttpRequest request, HttpContent content);
}
