package com.headfirst.commandPattern;

/**
 * @Author : Chris Wang
 * @Description :
 * @Date : 2019/7/13 9:03
 */
public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        System.out.println("light on!");
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
