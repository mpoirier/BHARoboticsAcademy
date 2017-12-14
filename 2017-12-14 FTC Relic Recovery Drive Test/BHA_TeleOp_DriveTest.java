/*
Copyright BHA Beariers Robotics Academy 2016-2017 :-)
 */

package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/**
 * This is the BHA TeleOp Testing OpMode for Driving ONLY.
 *
 * Consists of only two motors: leftMotor and rightMotor.
 *
 */

@TeleOp(name="TeleOp DriveTest", group="BHA")
public class BHA_TeleOp_DriveTest extends OpMode {

    /* Declare OpMode members. */
    BHA_Hardware_DriveTest robot       = new BHA_Hardware_DriveTest(); //define a robot object from BHA_Hardware_DriveTest class

    /*
     * Code to run ONCE when the driver hits INIT
     */
    @Override
    public void init() {
        /* Initialize the hardware variables.
         * The init() method of the hardware class does all the work here
         */
        robot.init(hardwareMap);

        // Send telemetry message to signify robot waiting;
        telemetry.addData("Say", "BHA_Hardware_DriveTest Initialized.");    //
    }

    /*
     * Code to run REPEATEDLY after the driver hits INIT, but before they hit PLAY
     */
    @Override
    public void init_loop() {
    }

    /*
     * Code to run ONCE when the driver hits PLAY
     */
    @Override
    public void start() {
    }
    /*
     * Code to run REPEATEDLY after the driver hits PLAY but before they hit STOP
     */
    @Override
    public void loop() {
        double left;
        double right;

        // GAMEPAD #1
        // The joystick goes negative when pushed forwards, so negate it
        left = -gamepad1.left_stick_y;
        right = -gamepad1.right_stick_y;
        robot.leftMotor.setPower(left);
        robot.rightMotor.setPower(right);

    }

    /*
     * Code to run ONCE after the driver hits STOP
     */
    @Override
    public void stop() {
        robot.rightMotor.setPower(0);
        robot.leftMotor.setPower(0);
    }

}
