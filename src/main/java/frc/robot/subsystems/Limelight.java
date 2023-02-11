package frc.robot.subsystems;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Limelight extends SubsystemBase{
    private static NetworkTable table = NetworkTableInstance.getDefault().getTable("limelight-unicorn"); 
    private static NetworkTableEntry tid = table.getEntry("tid");
    private static NetworkTableEntry botpose = table.getEntry("botpose");

    public static double getID() {
        double IDs = tid.getDouble(-1);
        return IDs;
    }

    public static double[] getPose() {
        double[] Pose = botpose.getDoubleArray(new double[6]);
        return Pose;
    }

    @Override
    public void periodic() {
        SmartDashboard.putNumber("ID", getID());
        SmartDashboard.putNumberArray("Pose", getPose());
    }

}
