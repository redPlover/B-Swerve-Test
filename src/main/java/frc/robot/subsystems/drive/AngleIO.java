package frc.robot.subsystems.drive;

import org.littletonrobotics.junction.AutoLog;

public interface AngleIO {
    @AutoLog
    public static class AngleIOInputs {
        public boolean connection = false;
        public double positionRad = 0.0;
        public double velocityRadPerSec = 0.0;
    }

    public default void updateInputs(AngleIOInputs inputs) {}
}
