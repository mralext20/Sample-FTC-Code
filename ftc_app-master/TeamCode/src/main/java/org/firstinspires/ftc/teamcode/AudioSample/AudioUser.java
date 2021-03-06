package org.firstinspires.ftc.teamcode.AudioSample;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import java.io.IOException;

/*
This code is written as an example only.
Obviously, it was not tested on your team's robot.
Teams who use and reference this code are expected to understand code they use.

If you use our code and see us at competition, come say hello!
*/

public class AudioUser extends OpMode {
    AudioHandler audioHandler;
    @Override
    public void init() {
        AudioHandler audioHandler = null;
        try {
            audioHandler = new AudioHandler();
            audioHandler.playSound();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void loop() {
        if(gamepad1.a){
            if(!audioHandler.isPlaying()) {
                audioHandler.playSound();
            }
        }
    }
}
