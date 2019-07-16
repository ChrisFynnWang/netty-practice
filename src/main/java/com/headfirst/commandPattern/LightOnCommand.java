package com.headfirst.commandPattern;

/**
 * @Author : Chris Wang
 * @Description :
 * @Date : 2019/7/13 9:03
 */
public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        System.out.println("light on!");
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
