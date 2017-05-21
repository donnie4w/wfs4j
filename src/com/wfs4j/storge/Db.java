/**
 * Project Name:wfs4j
 * File Name:Db.java
 * Package Name:com.wfs4j.storge
 * Date:2017年5月18日上午10:48:04
 * Copyright (c) 2017, donnie4w@gmail.com All Rights Reserved.
 *
 */

package com.wfs4j.storge;

import static org.iq80.leveldb.impl.Iq80DBFactory.factory;

import java.io.File;

import org.iq80.leveldb.DB;
import org.iq80.leveldb.Options;

import com.wfs4j.exception.WfsRunTimeException;

/**
 * ClassName:Db <br/>
 * Date: 2017年5月18日 上午10:48:04 <br/>
 * 
 * @author dong
 * @version
 * @since JDK 1.7
 * @desc
 */
public class Db {
	private DB db;

	public Db(String dbname) {
		Options options = new Options();
		options.createIfMissing(true);
		try {
			db = factory.open(new File(dbname), options);
		} catch (Exception e) {
			throw new WfsRunTimeException(e);
		}
	}

	public boolean exist(byte[] key) {
		byte[] v = db.get(key);
		return v != null;
	}

	public void put(byte[] key, byte[] value) {
		db.put(key, value);
	}

	public byte[] get(byte[] key) {
		return db.get(key);
	}

	public void del(byte[] key) {
		db.delete(key);
	}

}
