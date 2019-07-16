package com.headfirst.commandPattern;

/**
 * @Author : Chris Wang
 * @Description :
 * @Date : 2019/7/13 9:03
 */
public interface Command {

    void execute();

    void undo();

}
