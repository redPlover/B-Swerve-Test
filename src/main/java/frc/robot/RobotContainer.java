package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.subsystems.arm.ArmIOSim;
import frc.robot.subsystems.arm.ArmSubsystem;
import frc.robot.subsystems.drive.AngleIO;
import frc.robot.subsystems.drive.Drivesubsystem;
import frc.robot.subsystems.drive.ModuleIOSim;

public class RobotContainer {
    private final CommandXboxController controller = new CommandXboxController(Constants.OIConstants.driverControllerPort);

    private final Drivesubsystem driveSubsystem;
    private final ArmSubsystem armSubsystem;

    public RobotContainer(String mode) {
        switch(mode) {
            case("Real"):
                // driveSubsystem = new Drivesubsystem(); TODO
                // armSubsystem = new ArmSubsystem(); TODO
                driveSubsystem = null;
                armSubsystem = null;
                break;
            case("Sim"):
                driveSubsystem = new Drivesubsystem(new ModuleIOSim(), new ModuleIOSim(), new ModuleIOSim(), new ModuleIOSim(), new AngleIO() {});
                armSubsystem = new ArmSubsystem(new ArmIOSim());
                break;
            default:
                driveSubsystem = null;
                armSubsystem = null;
                break;
        }

        configureButtonBindings();
    }

    private void configureButtonBindings() {
        controller.a().onTrue(new InstantCommand(() -> armSubsystem.setVolts(5)));
    }

    public Command getAutoCommand(String autoSelected) {
        if(autoSelected.equals("default")) {
            return null;
        }
        else if(autoSelected.equals("custom")) {
            return null;
        }
        else {
            return null;
        }
    }
}
