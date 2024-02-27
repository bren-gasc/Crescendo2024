// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class disparatoti extends SubsystemBase {
  CANSparkMax motor8;
  CANSparkMax motor9;

  MotorControllerGroup group2;

  /** Creates a new disparatoti. */
  public disparatoti() {
    motor8 = new CANSparkMax(9, MotorType.kBrushless);
    motor9 = new CANSparkMax(8, MotorType.kBrushless);
    motor8.setInverted(true);
    group2 = new MotorControllerGroup(motor8, motor9);
  }

  public void disparar(){
   group2.set(0.90);
  }

  public void nodisparar(){
   group2.set(0);
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
