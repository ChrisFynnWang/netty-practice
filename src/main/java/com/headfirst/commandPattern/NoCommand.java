package com.headfirst.commandPattern;

/**
 * @Author : Chris Wang
 * @Description :
 * @Date : 2019/7/13 9:03
 */
public class NoCommand implements Command {

    private Light light;

    public NoCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        System.out.println("do nothing!");
    }

    @Override
    public void undo() {

    }
}
