package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;

import frc.robot.Constants;

public class Gas {
    private final Compressor compressor = new Compressor(Constants.Gas_ID.CompID, PneumaticsModuleType.CTREPCM);
    private final DoubleSolenoid dSolenoid = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, Constants.Gas_ID.dSolenID_F, Constants.Gas_ID.dSolenID_R);
    
    public Gas() {
    }

    public void out() {
        dSolenoid.set(Value.kForward);
    }
    
    public void in() {
        dSolenoid.set(Value.kReverse);
    }

    public void start_com() {
        compressor.enableDigital();
    }

    public void stop_com() {
        compressor.disable();
    }

}
