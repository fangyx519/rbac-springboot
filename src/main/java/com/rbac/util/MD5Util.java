package com.rbac.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author fang.yixin
 * @description md5加密工具
 * @date 2020/6/18
 */
public class MD5Util {
    private static Logger log = LoggerFactory.getLogger(MD5Util.class);
    private static MessageDigest digest = null;

   /* static {
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }*/

    /**
     * 获取字符串的md5
     * @param
     * @param
     * @return
     */
    public static synchronized String getMD5String(String data) {
        if (digest == null)
            try {
                digest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException nsae) {
                log.error("Failed to load the MD5 MessageDigest."
                        + " We will be unable to function normally.");
                nsae.printStackTrace();
            }
        digest.update(data.getBytes());
        return encodeHex(digest.digest());
    }

    private static String encodeHex(byte bytes[]) {
        StringBuffer buf = new StringBuffer(bytes.length * 2);
        for (int i = 0; i < bytes.length; i++) {
            if ((bytes[i] & 0xff) < 16)
                buf.append("0");
            buf.append(Long.toString(bytes[i] & 0xff, 16));
        }
        return buf.toString().toUpperCase();
    }

    public static boolean checkPassword(String password, String md5PwdStr) {
        String s = getMD5String(password);
        return s.equals(md5PwdStr);
    }

}
