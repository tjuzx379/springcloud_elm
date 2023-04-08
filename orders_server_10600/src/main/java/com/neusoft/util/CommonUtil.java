package com.neusoft.util;

import java.text.SimpleDateFormat;
import org.springframework.*;
import org.springframework.util.DigestUtils;

import java.util.Calendar;

public class CommonUtil {
    public static String getCurrentDate(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        return sdf.format(calendar.getTime());
    }
    
   public static String getMd5(String password){
	return DigestUtils.md5DigestAsHex(password.getBytes());
}
} 
