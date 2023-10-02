package frc.robot.subsystems.drive;

import org.littletonrobotics.junction.AutoLog;

public interface ModuleIO {
    @AutoLog
    public static class ModuleIOInputs {
        public double drivePositionRad = 0.0;
        public double driveVelocityRadPerSec = 0.0;
        public double driveVelocityFilteredRadPerSec = 0.0;
        public double driveAppliedVolts = 0.0;
        public double[] driveCurrentAmps = new double[] {};

        public double turnAbsolutePositionRad = 0.0;
        public double turnPositionRad = 0.0;
        public double turnVelocityRadPerSec = 0.0;
        public double turnAppliedVolts = 0.0;
        public double[] turnCurrentAmps = new double[] {};
    }

    public default void setDriveVolts(double volts) {}

    public default void setRotationVolts(double volts) {}

    public default void updateInputs(ModuleIOInputs inputs) {}
}
