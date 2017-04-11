package gunits.unit;

public class MKSUnit extends SIUnit {

	// static variables to store commonly used mks units
	public static final MKSUnit Time = new MKSUnit(0, 0, 1);
	public static final MKSUnit Distance = new MKSUnit(1, 0, 0);
	public static final MKSUnit Mass = new MKSUnit(0, 1, 0);
	public static final MKSUnit Frequency = new MKSUnit(0, 0, -1);
	public static final MKSUnit Force = new MKSUnit(1, 1, -2);
	public static final MKSUnit Weight = new MKSUnit(1, 1, -2);
	public static final MKSUnit Pressure = new MKSUnit(-1, 1, -2);
	public static final MKSUnit Energy = new MKSUnit(2, 1, -2);
	public static final MKSUnit Work = new MKSUnit(2, 1, -2);
	public static final MKSUnit Power = new MKSUnit(2, 1, -3);
	public static final MKSUnit Area = new MKSUnit(2, 0, 0);
	public static final MKSUnit Volume = new MKSUnit(3, 0, 0);
	public static final MKSUnit Speed = new MKSUnit(1, 0, -1);
	public static final MKSUnit Flow = new MKSUnit(3, 0, -1);
	public static final MKSUnit Acceleration = new MKSUnit(1, 0, -2);
	public static final MKSUnit Jerk = new MKSUnit(1, 0, -3);
	public static final MKSUnit Snap = new MKSUnit(1, 0, -4);
	public static final MKSUnit Momentum = new MKSUnit(1, 1, -1);
	public static final MKSUnit AngularMomentum = new MKSUnit(2, 1, -1);
	public static final MKSUnit Torque = new MKSUnit(2, 1, -2);
	public static final MKSUnit Yank = new MKSUnit(1, 1, -3);
	public static final MKSUnit AreaDensity = new MKSUnit(-2, 1, 0);
	public static final MKSUnit Density = new MKSUnit(-3, 1, 0);
	public static final MKSUnit SpecificVolume = new MKSUnit(3, -1, 0);
	public static final MKSUnit Action = new MKSUnit(2, 1, -1);
	public static final MKSUnit SpecificEnergy = new MKSUnit(2, 0, -2);
	public static final MKSUnit EnergyDensity = new MKSUnit(-1, 1, -2);
	public static final MKSUnit SurfaceTension = new MKSUnit(0, 1, -2);
	public static final MKSUnit HeatFluxDensity = new MKSUnit(0, 1, -3);
	public static final MKSUnit KinematicViscosity = new MKSUnit(2, 0, -1);
	public static final MKSUnit DynamicViscosity = new MKSUnit(-1, 1, -1);
	public static final MKSUnit LinearMassDensity = new MKSUnit(-1, 1, 0);
	public static final MKSUnit FuelEfficiency = new MKSUnit(-2, 0, 0);
	public static final MKSUnit MassFlowRate = new MKSUnit(0, 1, -1);
	public static final MKSUnit PowerDensity = new MKSUnit(-1, 1, -3);
	public static final MKSUnit EnergyFluxDensity = new MKSUnit(0, 1, -3);
	public static final MKSUnit Compressibility = new MKSUnit(1, -1, 2);
	public static final MKSUnit RadiantExposure = new MKSUnit(0, 1, -2);
	public static final MKSUnit MomentOfInertia = new MKSUnit(2, 1, 0);
	public static final MKSUnit SpecificAngularMomentum = new MKSUnit(2, 0, -1);
	public static final MKSUnit FrequencyDrift = new MKSUnit(0, 0, -2);
	public static final MKSUnit SpectralPower = new MKSUnit(1, 1, -3);

	public MKSUnit(int m, int kg, int s) {
		super(m, kg, s, 0, 0, 0, 0);
	}
}
