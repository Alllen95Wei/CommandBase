// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.Constants.OperatorConstants;
import frc.robot.subsystems.Chassis;
import frc.robot.subsystems.Arm;
// import frc.robot.subsystems.Gas;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.InstantCommand;
//import frc.robot.subsystems.SparkChassis;
import edu.wpi.first.wpilibj.Joystick;
//import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final Chassis chassis = new Chassis();
  private final Arm arm = new Arm();
  // private final Gas gas = new Gas();

  private final Joystick m_driverController = new Joystick(OperatorConstants.kDriverControllerPort);

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
	  chassis.setDefaultCommand(Commands.run(() -> chassis.move(m_driverController.getY(), m_driverController.getZ()), chassis));
    
	  // Configure the trigger bindings
    configureBindings();
  }

  private void configureBindings() {
    new JoystickButton(m_driverController, 1)  .whileTrue(new InstantCommand(arm::up))
                                                            .whileFalse(new InstantCommand(arm::stop));
    new JoystickButton(m_driverController, 2)  .whileTrue(new InstantCommand(arm::down))
                                                            .whileFalse(new InstantCommand(arm::stop));
    //xBoxCmd.a().whileTrue(new InstantCommand(arm::up))
               //.whileFalse(new InstantCommand(arm::stop));
    //xBoxCmd.b().whileTrue(new InstantCommand(arm::down))
               //.whileFalse(new InstantCommand(arm::stop));
    // xBoxCmd.leftBumper().whileTrue(new InstantCommand(gas::out));
    // xBoxCmd.rightBumper().whileTrue(new InstantCommand(gas::in));
  }
}
