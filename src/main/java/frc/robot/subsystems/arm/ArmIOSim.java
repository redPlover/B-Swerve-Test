package frc.robot.subsystems.arm;

import edu.wpi.first.math.system.plant.DCMotor;
import edu.wpi.first.wpilibj.simulation.SingleJointedArmSim;

public class ArmIOSim implements ArmIO {
    private final SingleJointedArmSim armSim = new SingleJointedArmSim(DCMotor.getNeo550(1), 1, 0, 0.5, 0, Math.PI/2, true); // TODO: Change this

    public void setVolts(double volts) {
        armSim.setInputVoltage(volts);
    }

    public void updateInputs(ArmIOInputs inputs) {
        armSim.update(0.02);
        inputs.armPositionRad = armSim.getAngleRads();
        inputs.armVelocityRadPerSec = armSim.getVelocityRadPerSec();
        inputs.armAppliedVolts = armSim.getCurrentDrawAmps();
        inputs.armCurrentAmps = new double[] {armSim.getCurrentDrawAmps()};
    }
}
