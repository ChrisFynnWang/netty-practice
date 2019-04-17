package com.wfan.proxy;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/3/16
 * @Other:
 */
public class Utils {
    public static<T> Class<T>getGeneticClassType(Class clz) {
        Type type = clz.getGenericSuperclass();
        if (type instanceof ParameterizedType) {
            ParameterizedType pt = (ParameterizedType) type;
            Type[] types = pt.getActualTypeArguments();
            if (types.length > 0 && types[0] instanceof Class) {
                return (Class) types[0];
            }
        }
        return (Class) Object.class;
    }
}
