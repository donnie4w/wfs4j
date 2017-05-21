/**
 * Project Name:wfs4j
 * File Name:Md5Bean.java
 * Package Name:com.wfs4j.storge
 * Date:2017年5月18日下午1:00:27
 * Copyright (c) 2017, donnie4w@gmail.com All Rights Reserved.
 *
 */

package com.wfs4j.storge;

/**
 * ClassName:Md5Bean <br/>
 * Date: 2017年5月18日 下午1:00:27 <br/>
 * 
 * @author dong
 * @version
 * @since JDK 1.7
 * @desc
 */
public class Md5Bean {
	private long offset;
	private int size;
	private String fileName;
	private int quoteNum;
	private byte[] sequence;
	private boolean compress;

	public long getOffset() {
		return offset;
	}

	public void setOffset(long offset) {
		this.offset = offset;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public int getQuoteNum() {
		return quoteNum;
	}

	public void setQuoteNum(int quoteNum) {
		this.quoteNum = quoteNum;
	}

	public byte[] getSequence() {
		return sequence;
	}

	public void setSequence(byte[] sequence) {
		this.sequence = sequence;
	}

	public boolean isCompress() {
		return compress;
	}

	public void setCompress(boolean compress) {
		this.compress = compress;
	}
}
