package com.headfirst.commandPattern;

/**
 * @Author : Chris Wang
 * @Description :
 * @Date : 2019/7/15 17:26
 */
public class MacroCommand implements Command {

    private Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {

        for (int i = 0; i < commands.length; i++) {
            commands[i].execute();
        }
    }

    @Override
    public void undo() {

    }
}
