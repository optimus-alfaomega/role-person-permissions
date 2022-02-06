package com.co.ao.command;

import com.co.ao.Input.Input;
import com.co.ao.Output.Output;

public interface Command {

    public Command init();

    public Command init(Input i, Output o);

    public Command exec();

    public Command exec(Object[] args);

    public Command exec(String[] args);

    public Command hold();

    public Command stop();

    public Command log();

    public Command start();

    public Command type(Class type);

    public Command debug(boolean onoff);

    public Command cleanAll();

}
