package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.security.MessageDigest;
import java.util.Iterator;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Pattern;

/**
 * Created by shi on 2021/3/4.
 */
@RestController
public class HelloController {
    public static void main(String[] args) throws Exception {
        Map<String, String> localObject3 = new HashMap();
        localObject3.put("sysVer", "333");
//        localObject3.put("password", "31bc32c2451678a1a31af26c813293b5");
        localObject3.put("sys", "5.1.1");
//        localObject3.put("username", URLDecoder.decode("K5LZQHhgaCYwGx%252FJZosDtg%253D%253D", "UTF-8"));
//        localObject3.put("dev", "34d102bc02800c8b0c5d06d4b31bb670");
//        localObject3.put("phone", "");
//        localObject3.put("pVerifyCode", "");
//        localObject3.put("verifyCode", "");
        localObject3.put("devType", "android_Android_LIO-AN00");
//        localObject3.put("comId", URLDecoder.decode("2aOlxkSLASPtLt%2BxmyKU9g%3D%3D", "UTF-8"));
//        localObject3.put("sessionID", "da5d1611f2141bde220feb071a0943aa,IVR4C1GFV");

        String dd = MD5Util.createParamter(localObject3);
        String tt = MD5Util.replaceBlank(dd);
        String localObject4 = MD5Util.getMD5(tt);
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(localObject4);
        localStringBuilder.append("85484e99ffe38096b0091cceb7f5e795");
        String resultString = MD5Util.getMD5(localStringBuilder.toString());
        System.out.println("resultString ----------------- " + resultString);
    }

    @PostMapping("getMD5")
    @ResponseBody
    public String getMD5(@RequestBody LoginRequest request) throws Exception {
        System.out.println("LoginRequest:" + request);
        Map<String, String> localObject3 = new HashMap();
        if (request.getSysVer() != null) {
            localObject3.put("sysVer", request.getSysVer());
        }
        if (request.getPassword() != null) {
            localObject3.put("password", request.getPassword());
        }
        if (request.getSys() != null) {
            localObject3.put("sys", request.getSys());
        }
        if (request.getUsername() != null) {
            localObject3.put("username", URLDecoder.decode(request.getUsername(), "UTF-8"));
        }
        if (request.getDev() != null) {
            localObject3.put("dev", request.getDev());
        }
        if (request.getPhone() != null) {
            localObject3.put("phone", request.getPhone());
        }
        if (request.getpVerifyCode() != null) {
            localObject3.put("pVerifyCode", request.getpVerifyCode());
        }
        if (request.getVerifyCode() != null) {
            localObject3.put("verifyCode", request.getVerifyCode());
        }
        if (request.getVerifyCode() != null) {
            localObject3.put("devType", request.getDevType());
        } else {
            localObject3.put("devType", "android_Android_LIO-AN00");
        }
        if (request.getComId() != null && !"".equals(request.getComId())) {
            localObject3.put("comId", URLDecoder.decode(request.getComId(), "UTF-8"));
        }
        if (request.getSessionID() != null) {
            localObject3.put("sessionID", request.getSessionID());
        }
        if (request.getPageSize() != null) {
            localObject3.put("pageSize", request.getPageSize());
        }
        if (request.getPageNum() != null) {
            localObject3.put("pageNum", request.getPageNum());
        }
        if (request.getAnchorId() != null) {
            localObject3.put("anchorId", request.getAnchorId());
        }
        if (request.getGoodsId() != null) {
            localObject3.put("goodsId", request.getGoodsId());
        }
        if (request.getId() != null) {
            localObject3.put("id", request.getId());
        }
        if (request.getRoomId() != null) {
            localObject3.put("roomId", request.getRoomId());
        }
        if (request.getActId() != null) {
            localObject3.put("actId", request.getActId());
        }
        String dd = MD5Util.createParamter(localObject3);
        String tt = MD5Util.replaceBlank(dd);
        String localObject4 = MD5Util.getMD5(tt);
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(localObject4);
        localStringBuilder.append("85484e99ffe38096b0091cceb7f5e795");
        String resultString = MD5Util.getMD5(localStringBuilder.toString());
        System.out.println("resultString:" + resultString);
        return resultString;
    }
}
