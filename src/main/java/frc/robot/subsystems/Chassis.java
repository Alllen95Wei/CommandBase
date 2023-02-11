// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;

import frc.robot.Constants.Chassis_ID;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
/**
 * This is a demo program showing the use of the DifferentialDrive class. Runs the motors with
 * arcade steering.
 */
public class Chassis extends SubsystemBase {
  private final WPI_VictorSPX m_leftFront = new WPI_VictorSPX(Chassis_ID.m_leftFrontID);
  private final WPI_VictorSPX m_rightFront = new WPI_VictorSPX(Chassis_ID.m_rightFrontID);
  private final WPI_VictorSPX m_leftBack = new WPI_VictorSPX(Chassis_ID.m_leftBackID);
  private final WPI_VictorSPX m_rightBack = new WPI_VictorSPX(Chassis_ID.m_rightBackID);
  private final MotorControllerGroup m_left = new MotorControllerGroup(m_leftFront, m_leftBack);
  private final MotorControllerGroup m_right = new MotorControllerGroup(m_rightFront, m_rightBack);
  private final DifferentialDrive m_robotDrive = new DifferentialDrive(m_left, m_right);

  public Chassis() {
    m_leftFront.configFactoryDefault();
    m_rightFront.configFactoryDefault();
    m_leftBack.configFactoryDefault();
    m_rightBack.configFactoryDefault();
    m_left.setInverted(true);
  }

  public void move(double x, double z) {
    m_robotDrive.arcadeDrive(x * 0.5, z * 0.5);
  }
}
