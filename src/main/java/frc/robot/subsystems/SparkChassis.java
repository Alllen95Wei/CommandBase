// package frc.robot.subsystems;

// import edu.wpi.first.wpilibj2.command.CommandBase;
// import edu.wpi.first.wpilibj2.command.SubsystemBase;
// import com.revrobotics.CANSparkMax;
// import com.revrobotics.CANSparkMaxLowLevel.MotorType;

// import frc.robot.Constants;


// public class SparkChassis extends SubsystemBase{
//     CANSparkMax m_leftFront = new CANSparkMax(Constants.Chassis.m_leftFrontID, MotorType.kBrushless);
//     CANSparkMax m_leftBack = new CANSparkMax(Constants.Chassis.m_leftBackID, MotorType.kBrushless);
//     CANSparkMax m_rightFront = new CANSparkMax(Constants.Chassis.m_rightFrontID, MotorType.kBrushless);
//     CANSparkMax m_rightBack = new CANSparkMax(Constants.Chassis.m_rightBackID, MotorType.kBrushless);

//     public SparkChassis() {
//         m_leftBack.follow(m_leftFront);
//         m_rightBack.follow (m_rightFront);
//     }

//     /* public void move() {
//         m_leftFront.set(0.5);
//         m_rightFront.set(-0.5);
//     } */

//     public CommandBase move() {
//         return runOnce(
//             () -> {
//                 m_leftFront.set(0.5);
//                 m_rightFront.set(-0.5);
//             });
//     }

//     public CommandBase stop() {
//         return runOnce(
//             () -> {
//                 m_leftFront.stopMotor();
//                 m_rightFront.stopMotor();
//             });
//     }
// }
