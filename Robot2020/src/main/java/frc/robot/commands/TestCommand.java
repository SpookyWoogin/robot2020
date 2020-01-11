/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.TestMotor;
import frc.robot.OI;
import frc.robot.RobotMap;

public class TestCommand extends CommandBase {
  /**
   * Creates a new TestCommand.
   */
  OI oi;
  public TestCommand() {
    // Use addRequirements() here to declare subsystem dependencies.
    this.oi = oi;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    boolean xPressed = this.oi.getRawButton(RobotMap.TEST_BUTTON);
    if(xPressed){
      System.out.println("the button was pressed and things should have happened.");
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
