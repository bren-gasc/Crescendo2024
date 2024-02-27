// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.CosoMartin;

public class movercosomartin extends Command {
  CosoMartin cosomartin2;
  /** Creates a new movercosomartin. */
  public movercosomartin(CosoMartin bandita) {
    cosomartin2 = bandita;
    addRequirements(cosomartin2);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    cosomartin2.MoverBanda();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    cosomartin2.DetenerBanda();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
