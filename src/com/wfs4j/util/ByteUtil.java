package com.wfs4j.util;

import java.nio.ByteBuffer;

public class ByteUtil {
	public static byte[] int2bytes(int row) {
		ByteBuffer bb = ByteBuffer.allocate(4);
		bb.putInt(row);
		return bb.array();
	}

	public static int bytes2int(byte[] bs) {
		ByteBuffer bb = ByteBuffer.wrap(bs);
		return bb.getInt();
	}

	public static void main(String[] args) {
		byte[] bb = ByteUtil.int2bytes(2000000000);
		System.out.println(bytes2int(bb));
	}
}
