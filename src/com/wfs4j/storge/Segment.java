/**
 * Project Name:wfs4j
 * File Name:Segment.java
 * Package Name:com.wfs4j.storge
 * Date:2017年5月18日下午12:57:39
 * Copyright (c) 2017, donnie4w@gmail.com All Rights Reserved.
 *
 */

package com.wfs4j.storge;

/**
 * ClassName:Segment <br/>
 * Date: 2017年5月18日 下午12:57:39 <br/>
 * 
 * @author dong
 * @version
 * @since JDK 1.7
 * @desc
 */
public class Segment {
	private long id;
	private String name;
	private String fileType;
	private byte[] md5;
	private String shardName;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public byte[] getMd5() {
		return md5;
	}

	public void setMd5(byte[] md5) {
		this.md5 = md5;
	}

	public String getShardName() {
		return shardName;
	}

	public void setShardName(String shardName) {
		this.shardName = shardName;
	}
}
