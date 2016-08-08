package com.java.sourabh.designPatterns.commandDesign;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sourabh on 8/8/2016.
 */
public class PlayWithRemote {

    public static void main(String[] args) {
        ElectronicDevice newDevice = TVRemote.getDevice();
        TurnTVOn onCommand = new TurnTVOn(newDevice);
        DeviceButton onPressed = new DeviceButton(onCommand);
        onPressed.press();

        //----------------------

        TurnTVOff offCommand = new TurnTVOff(newDevice);
        onPressed = new DeviceButton(offCommand);
        onPressed.press();

        //-----------------------

        TurnTVUp upCommand = new TurnTVUp(newDevice);
        onPressed = new DeviceButton(upCommand);
        onPressed.press();
        onPressed.press();
        onPressed.press();

        //-----------------------
        Television theTV = new Television();
        Radio theRadio = new Radio();

        List<ElectronicDevice>  allDevices = new ArrayList<>();
        allDevices.add(theTV);
        allDevices.add(theRadio);

        TurnItAllOff turnOffDevices = new TurnItAllOff(allDevices);
        DeviceButton turnThemOff = new DeviceButton(turnOffDevices);
        turnThemOff.press();

        //------------------
        turnThemOff.pressUndo();
    }
}
