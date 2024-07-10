package frc.robot;

import frc.robot.subsystems.DifferentialDriveSub;
import frc.robot.subsystems.ExampleSubsystem;

/**
 * Subsystems - Use this class to initialize and access all subsystems globally.
 */
public class Subsystems {
  public static final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();
  public static final DifferentialDriveSub diffDrive = new DifferentialDriveSub();
}
