package com.java.sourabh.designPatterns.commandDesign;

import java.util.List;

/**
 * Created by Sourabh on 8/8/2016.
 */
public class TurnItAllOff implements Command {

    List<ElectronicDevice> theDevices;

    public TurnItAllOff(List<ElectronicDevice> theDevices) {
        this.theDevices = theDevices;
    }

    @Override
    public void execute() {
        theDevices.stream().forEach(device -> device.off());
    }

    @Override
    public void undo() {
        theDevices.stream().forEach(device -> device.on()   );
    }
}
