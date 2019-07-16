package com.headfirst.commandPattern;

/**
 * @Author : Chris Wang
 * @Description :
 * @Date : 2019/7/13 9:12
 */
public class GarageDoorOpenCommand implements Command {

    private GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        System.out.println("garageDoor open!");
        garageDoor.open();

    }

    @Override
    public void undo() {
        garageDoor.close();
    }
}
