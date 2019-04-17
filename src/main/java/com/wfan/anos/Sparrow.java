package com.wfan.anos;

import com.wfan.anos.Desc.Color;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/3/12
 * @Other:
 */
public class Sparrow extends Bird {

    private Color color;

    public Sparrow() {
        color = Color.Grayish;
    }

    public Sparrow(Color color) {
        this.color = color;
    }

    @Override
    public Color getColor() {
        return color;
    }
}
