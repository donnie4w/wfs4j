/**
 * Project Name:wfs4j
 * File Name:Storge.java
 * Package Name:com.wfs4j.storge
 * Copyright (c) 2017, donnie4w@gmail.com All Rights Reserved.
 *
 */

package com.wfs4j.storge;

/**
 * ClassName: Storge.java <br/>
 * date: 2017年5月17日 上午11:22:17 <br/>
 *
 * @author dong
 * @version
 * @since JDK 1.7
 * @classDesc 类描述:
 */
public interface Storge {

	public boolean appendData(byte[] bs, String name, String fileType);

	public boolean getData(String name);

	public boolean delData(String name);

	public boolean exist(String name);
}
