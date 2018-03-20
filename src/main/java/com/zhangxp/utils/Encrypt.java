package com.zhangxp.utils;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

import org.apache.commons.lang3.StringUtils;

public class Encrypt {
	
	private static final Base64.Encoder encoder = Base64.getEncoder();
	private static final Base64.Decoder decoder = Base64.getDecoder();
	
	public static String encodeByBase64(String str) {
		if(StringUtils.isBlank(str)) {
			return "";
		}
		String encodStr = "password"+str;
		try {
			encodStr = encoder.encodeToString(encodStr.getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return encodStr;
	}
	
	public static String decodeByBase64(String str) {
		if(StringUtils.isBlank(str)) {
			return "";
		}
		String decodeStr = null;
		try {
			decodeStr = new String(decoder.decode(str),"UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return decodeStr.substring(8);
	}
	
}
