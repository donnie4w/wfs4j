package com.wfs4j.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * <p>@File:wfs4j: com.wfs4j.util :SerializeUtil.java
 * <p>@Date:2017年6月30日
 * <p>@Copyright (c) 2017, donnie4w@gmail.com All Rights Reserved.
 * <p>@Author: dong
 * <p>@Desc:
 */
public class SerializeUtil<T> {

	public static byte[] encode(Object obj) throws Exception {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(baos);
		oos.writeObject(obj);
		byte[] bs = baos.toByteArray();
		baos.close();
		return bs;
	}

	@SuppressWarnings("unchecked")
	public static <T> T decode(byte[] bs) throws Exception {
		ByteArrayInputStream bais = new ByteArrayInputStream(bs);
		ObjectInputStream ois = new ObjectInputStream(bais);
		T o = (T) ois.readObject();
		bais.close();
		return o;
	}

	public static void main(String[] args) throws Exception {
		class Test implements Serializable {
			private static final long serialVersionUID = 1L;
			public String name;
		}
		Test t = new Test();
		t.name = "wuxiaodong";
		byte[] bs = SerializeUtil.encode(t);
		Test t2 = SerializeUtil.decode(bs);
		System.out.println(t2.name);
	}

}
