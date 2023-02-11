// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import frc.robot.Constants.Arm_ID;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
/**
 * This is a demo program showing the use of the DifferentialDrive class. Runs the motors with
 * arcade steering.
 */
public class Arm extends SubsystemBase {
  private final WPI_VictorSPX m_Arm = new WPI_VictorSPX(Arm_ID.armID);

  public Arm() {
    m_Arm.configFactoryDefault();
  }

  public void up() {
    m_Arm.set(ControlMode.PercentOutput, 0.3);
  }

  public void down() {
    m_Arm.set(ControlMode.PercentOutput, -0.4);
  }

  public void stop() {
    m_Arm.set(ControlMode.PercentOutput, 0);
  }
}
