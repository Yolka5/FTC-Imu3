package org.firstinspires.ftc.teamcode.drive.opmode.Angle_PID_Tutorial;

import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Config
public class PIDConstants {
    public static double Kp = 1.8;  //Proportional gain
    public static double Ki = 0.0;  //Integral gain
    public static double Kd = 0.031;  //Derivative gain
}
