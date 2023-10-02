package frc.robot.subsystems.drive;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivesubsystem extends SubsystemBase {

    private final ModuleIO[] modules = new ModuleIO[4];
    
    public Drivesubsystem(ModuleIO frontLeft, ModuleIO frontRight, ModuleIO backLeft, ModuleIO backRight, AngleIO angleIO) {
        modules[0] = frontLeft;
        modules[1] = frontRight;
        modules[2] = backLeft;
        modules[3] = backRight;
    }
}
