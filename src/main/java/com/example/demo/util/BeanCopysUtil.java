package com.example.demo.util;

import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BeanCopysUtil {
    //单个bean拷贝
    public static <V> V BeanCopy(Object ser, Class<V> vClass) {
        //创建
        V o = null;
        try {
            o = vClass.newInstance();
            //拷贝bean
            BeanUtils.copyProperties(ser, o);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return o;
    }

    public static <V, O> List<V> BeanCoPys(List<O> list, Class<V> vClass) {
        List<V> collect = list.stream().map(new Function<O, V>() {
            @Override
            public V apply(O o) {
                return BeanCopy(o, vClass);
            }
        }).collect(Collectors.toList());
        return collect;
    }
}
