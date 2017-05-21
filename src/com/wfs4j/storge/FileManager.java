/**
 * Project Name:wfs4j
 * File Name:FileUtil.java
 * Package Name:com.wfs4j.storge
 * Date:2017年5月18日下午12:09:04
 * Copyright (c) 2017, donnie4w@gmail.com All Rights Reserved.
 *
 */

package com.wfs4j.storge;

import java.util.concurrent.ConcurrentHashMap;

import com.wfs4j.lru.LRUCache;

/**
 * ClassName:FileUtil <br/>
 * Date: 2017年5月18日 下午12:09:04 <br/>
 * 
 * @author dong
 * @version
 * @since JDK 1.7
 * @desc
 */
public class FileManager {
	private long fileMaxSize;
	private String currFileName;
	private LRUCache nameCache;
	private ConcurrentHashMap fileMap = new ConcurrentHashMap();
	private ConcurrentHashMap md5map = new ConcurrentHashMap();

	public FileManager(int cacheSize) {
		nameCache = new LRUCache(cacheSize);
	}
	
	
}
