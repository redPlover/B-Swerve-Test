package frc.robot.subsystems.drive;

import edu.wpi.first.math.system.plant.DCMotor;
import edu.wpi.first.wpilibj.simulation.FlywheelSim;

public class ModuleIOSim implements ModuleIO {
    // TODO: Change this
    private FlywheelSim driveSim = new FlywheelSim(DCMotor.getNEO(1), 1, 1);
    private FlywheelSim turnSim = new FlywheelSim(DCMotor.getNEO(1), 1, 1);

    public void setDriveVolts(double volts) {
        driveSim.setInputVoltage(volts);
    }

    public void setRotationVolts(double volts) {
        turnSim.setInputVoltage(volts);
    }

    public void updateInputs(ModuleIOInputs inputs) {
        driveSim.update(0.02);
        turnSim.update(0.02);
    }
}
