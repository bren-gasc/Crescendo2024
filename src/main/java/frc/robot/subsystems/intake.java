// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class intake extends SubsystemBase {
  CANSparkMax motor1;
  CANSparkMax motor2;

  MotorControllerGroup group1;
  /** Creates a new intake. */
  public intake() {
    motor1 = new CANSparkMax(Constants.OperatorConstants.IDMOTOR5, MotorType.kBrushless);
    motor2 = new CANSparkMax(Constants.OperatorConstants.IDMOTOR6, MotorType.kBrushless);
    group1 = new MotorControllerGroup(motor1, motor2);

motor1.setInverted(true);
  }

  public void MoverIntake(){
    group1.set(0.30);
  }
public void DetenerIntake(){
  group1.set(0);
}
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
