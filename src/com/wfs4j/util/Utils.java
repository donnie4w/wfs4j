package com.wfs4j.util;

import java.util.zip.CRC32;

/**
 * <p>
 * 
 * @File:wfs4j: com.wfs4j.util :Utils.java
 *              <p>
 * @Date:2017年7月3日
 *                 <p>
 * @Copyright (c) 2017, donnie4w@gmail.com All Rights Reserved.
 *            <p>
 * @Author: dong
 *          <p>
 * @Desc:
 */
public class Utils {
	/**
	 * @param bs
	 * @return
	 */
	public static String fingerprint(byte[] bs) {
		CRC32 crc32 = new CRC32();
		crc32.update(bs);
		return Long.toHexString(crc32.getValue());
	}

	public static byte[] compresseEncode(byte[] bs) {
		return bs;
	}

	public static byte[] compresseDecode(byte[] bs) {
		return bs;
	}

}
