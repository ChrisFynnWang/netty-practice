package com.headfirst.commandPattern;

import org.junit.Test;

/**
 * @Author : Chris Wang
 * @Description :
 * @Date : 2019/7/13 9:08
 */
public class RemoteControlTest {

    private static final SimpleRemoteControl remote = new SimpleRemoteControl();

    @Test
    public void testLightOnCommand() {

        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        remote.setCommand(0, lightOnCommand, lightOffCommand);
        remote.onButtonWasPressed(0);
    }

    @Test
    public void testGarageDoorOpenCommand() {

    }

    @Test
    public void testMacroCommand() {


    }

}
