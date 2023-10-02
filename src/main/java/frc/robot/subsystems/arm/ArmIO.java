package frc.robot.subsystems.arm;

import org.littletonrobotics.junction.AutoLog;

public interface ArmIO {
    @AutoLog
    public static class ArmIOInputs {
        public double armPositionRad = 0.0;
        public double armVelocityRadPerSec = 0.0;
        public double armAppliedVolts = 0.0;
        public double[] armCurrentAmps = new double[] {};
    }

    public default void setVolts(double volts) {}

    public default void updateInputs(ArmIOInputs inputs) {}
}
