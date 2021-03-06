package com.example.demo;

import java.security.MessageDigest;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Pattern;

/**
 * Created by shi on 2021/3/4.
 */
public class MD5Util {

    public static String replaceBlank(String paramString){
        String str = "";
        if (paramString != null) {
            str = Pattern.compile("\t|\r|\n|\\s*").matcher(paramString).replaceAll("");
        }
        return str;
    }

    public static String createParamter(Map localObject3){
        TreeMap localTreeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        localTreeMap.putAll(localObject3);
        Set<String> keySet = localTreeMap.keySet();
        Iterator localIterator = localTreeMap.keySet().iterator();
        StringBuilder localStringBuilder = new StringBuilder();
        for (String key : keySet){
            String str = (String) localTreeMap.get(key);
            localStringBuilder.append(str);
        }
        return localStringBuilder.toString();
    }

    public static String getMD5(String paramString){
        try {
            MessageDigest localObject = MessageDigest.getInstance("MD5");
            localObject.update(paramString.getBytes("UTF-8"));
            byte[] ss = localObject.digest();
            StringBuffer localObject2 = new StringBuffer();
            for(int i=0;i<ss.length;i++){
                if (Integer.toHexString((ss[i] & 0xFF)).length() == 1)
                {
                    localObject2.append("0");
                    localObject2.append(Integer.toHexString(ss[i] & 0xFF));
                }
                else
                {
                    localObject2.append(Integer.toHexString(ss[i] & 0xFF));
                }
//                System.out.println(i + " ------------- " +localObject2.toString());
            }
            return localObject2.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
