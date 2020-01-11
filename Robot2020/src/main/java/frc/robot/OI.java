/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.DigitalInput;

import frc.robot.RobotMap;

/**
 * Add your docs here.
 */


public class OI {
    public Joystick driverController;
    public JoystickButton testButton;

    public OI(){
        driverController = new(Joystick);
        testButton = new(RobotMap.TEST_BUTTON);

    }

}
