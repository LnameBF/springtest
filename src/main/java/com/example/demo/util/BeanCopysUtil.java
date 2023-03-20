package com.example.demo.util;

import org.springframework.beans.BeanUtils;

public class BeanCopysUtil {
    //单个bean拷贝
    public static <V> V BeanCopy(Object ser, Class<V> vClass) {
        //创建
        V o = null;
        try {
            o = vClass.newInstance();
            //拷贝bean
            BeanUtils.copyProperties(ser,o);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return o;
    }
}
