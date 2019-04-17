package com.wfan.anos;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/3/12
 * @Other:
 */
public enum BirdNet {

    Sparrow;

    public Bird reproduce() {
        Desc bd = Sparrow.class.getAnnotation(Desc.class);
        return bd == null ? new Sparrow() : new Sparrow(bd.c());
    }
}
