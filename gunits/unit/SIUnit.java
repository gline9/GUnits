package gunits.unit;

public class SIUnit {

	// stores all of the commonly used SI units that couldn't be listed in as an
	// mks unit.
	public static final SIUnit ElectricCurrent = new SIUnit(0, 0, 0, 1, 0, 0, 0);
	public static final SIUnit AmountOfSubstance = new SIUnit(0, 0, 0, 0, 1, 0, 0);
	public static final SIUnit Temperature = new SIUnit(0, 0, 0, 0, 0, 1, 0);
	public static final SIUnit LuminusIntensity = new SIUnit(0, 0, 0, 0, 0, 0, 1);
	public static final SIUnit ElectricCharge = new SIUnit(0, 0, 1, 1, 0, 0, 0);
	public static final SIUnit Voltage = new SIUnit(2, 1, -3, -1, 0, 0, 0);
	public static final SIUnit ElectricalCapacitance = new SIUnit(-2, -1, 4, 2, 0, 0, 0);
	public static final SIUnit ElectricalResistance = new SIUnit(2, 1, -3, -2, 0, 0, 0);
	public static final SIUnit ElectricalConductance = new SIUnit(-2, -1, 3, 2, 0, 0, 0);
	public static final SIUnit MagneticFlux = new SIUnit(2, 1, -2, -1, 0, 0, 0);
	public static final SIUnit MagneticFieldStrength = new SIUnit(0, 1, -2, -1, 0, 0, 0);
	public static final SIUnit Inductance = new SIUnit(2, 1, -2, -2, 0, 0, 0);
	public static final SIUnit LuminusFlux = new SIUnit(0, 0, 0, 0, 0, 0, 1, 2);
	public static final SIUnit Illuminance = new SIUnit(-2, 0, 0, 0, 0, 0, 1, 2);
	public static final SIUnit CatalyticActivity = new SIUnit(0, 0, -1, 0, 1, 0, 0);
	public static final SIUnit Molarity = new SIUnit(-3, 0, 0, 0, 1, 0, 0);
	public static final SIUnit MolarVolume = new SIUnit(3, 0, 0, 0, 1, 0, 0);
	public static final SIUnit Entropy = new SIUnit(2, 1, -2, 0, 0, 1, 0);
	public static final SIUnit MolarEntropy = new SIUnit(2, 1, -2, 0, -1, -1, 0);
	public static final SIUnit SpecificEntropy = new SIUnit(2, 0, -2, 0, 0, -1, 0);
	public static final SIUnit MolarEnergy = new SIUnit(2, 1, -2, 0, -1, 0, 0);
	public static final SIUnit ThermalConductivity = new SIUnit(1, 1, -3, 0, 0, -1, 0);
	public static final SIUnit PolarizationDensity = new SIUnit(-2, 0, 1, 1, 0, 0, 0);
	public static final SIUnit ChargeDensity = new SIUnit(-3, 0, 1, 1, 0, 0, 0);
	public static final SIUnit CurrentDensity = new SIUnit(-2, 0, 0, 1, 0, 0, 0);
	public static final SIUnit ElectricalConductivity = new SIUnit(-3, -1, 3, 2, 0, 0, 0);
	public static final SIUnit MolarConductivity = new SIUnit(0, -1, 3, 2, -1, 0, 0);
	public static final SIUnit Permittivity = new SIUnit(-3, -1, 4, 2, 0, 0, 0);
	public static final SIUnit MagneticPermeability = new SIUnit(1, 1, -2, -2, 0, 0, 0);
	public static final SIUnit ElectricFieldStrength = new SIUnit(1, 1, -3, -1, 0, 0, 0);
	public static final SIUnit Magnetization = new SIUnit(-1, 0, 0, 1, 0, 0, 0);
	public static final SIUnit Luminance = Illuminance;
	public static final SIUnit Exposure = new SIUnit(0, -1, 1, 1, 0, 0, 0);
	public static final SIUnit Resistivity = new SIUnit(3, 1, -3, -2, 0, 0, 0);
	public static final SIUnit LinearChargeDensity = new SIUnit(-1, 0, 1, 1, 0, 0, 0);
	public static final SIUnit Molality = new SIUnit(0, -1, 0, 0, 1, 0, 0);
	public static final SIUnit MolarMass = new SIUnit(0, 1, 0, 0, -1, 0, 0);
	public static final SIUnit MagneticDipoleMoment = new SIUnit(2, 0, 0, 1, 0, 0, 0);
	public static final SIUnit ThermalResistance = new SIUnit(-2, -1, 3, 0, 0, 1, 0);
	public static final SIUnit ThermalExpansion = new SIUnit(0, 0, 0, 0, 0, -1, 0);
	public static final SIUnit ThermalGradient = new SIUnit(-1, 0, 0, 0, 0, 1, 0);
	public static final SIUnit ElectronMobility = new SIUnit(0, -1, 2, 1, 0, 0, 0);
	public static final SIUnit MagneticReluctance = new SIUnit(-2, -1, 2, 2, 0, 0, 0);
	public static final SIUnit MagneticVectorPotential = new SIUnit(1, 1, -2, -1, 0, 0, 0);
	public static final SIUnit MagneticMoment = new SIUnit(3, 1, -2, -1, 0, 0, 0);
	public static final SIUnit MagneticRigidity = new SIUnit(1, 1, -2, -1, 0, 0, 0);
	public static final SIUnit CatalyticEfficiency = new SIUnit(3, 0, -1, 0, -1, 0, 0);
	public static final SIUnit LuminusEfficacy = new SIUnit(-2, -1, 3, 0, 0, 0, 1);
	public static final SIUnit MagneticSusceptibility = new SIUnit(-1, -1, 2, 2, 0, 0, 0);
	public static final SIUnit Angle = new SIUnit(0, 0, 0, 0, 0, 0, 0, 1);
	public static final SIUnit SolidAngle = new SIUnit(0, 0, 0, 0, 0, 0, 0, 2);
	public static final SIUnit AngularVelocity = new SIUnit(0, 0, -1, 0, 0, 0, 0, 1);
	public static final SIUnit AngularAcceleration = new SIUnit(0, 0, -2, 0, 0, 0, 0, 1);
	public static final SIUnit AngularMomentum = new SIUnit(2, 1, -1, 0, 0, 0, 0, 1);
	

	private final int m;
	private final int kg;
	private final int s;
	private final int a;
	private final int mol;
	private final int k;
	private final int cd;

	private final int rad;

	public SIUnit(int m, int kg, int s, int a, int mol, int k, int cd) {
		this.m = m;
		this.kg = kg;
		this.s = s;
		this.a = a;
		this.mol = mol;
		this.k = k;
		this.cd = cd;
		rad = 0;
	}

	public SIUnit(int m, int kg, int s, int a, int mol, int k, int cd, int rad) {
		this.m = m;
		this.kg = kg;
		this.s = s;
		this.a = a;
		this.mol = mol;
		this.k = k;
		this.cd = cd;
		this.rad = rad;
	}

	/**
	 * @return power for meters
	 * @since Apr 2, 2016
	 */
	public final int getM() {
		return m;
	}

	/**
	 * @return power for kilograms
	 * @since Apr 2, 2016
	 */
	public final int getKg() {
		return kg;
	}

	/**
	 * @return power for seconds
	 * @since Apr 2, 2016
	 */
	public final int getS() {
		return s;
	}

	/**
	 * @return power for amperes
	 * @since Apr 2, 2016
	 */
	public final int getA() {
		return a;
	}

	/**
	 * @return power for moles
	 * @since Apr 2, 2016
	 */
	public final int getMol() {
		return mol;
	}

	/**
	 * @return power for kelvin
	 * @since Apr 2, 2016
	 */
	public final int getK() {
		return k;
	}

	/**
	 * @return power for candelas
	 * @since Apr 2, 2016
	 */
	public final int getCd() {
		return cd;
	}

	/**
	 * 
	 * @return power for candelas
	 * @since Apr 4, 2016
	 */
	public final int getRad() {
		return rad;
	}

	public final SIUnit per(SIUnit unit) {
		return new SIUnit(m - unit.m, kg - unit.kg, s - unit.s, a - unit.a, mol - unit.mol, k - unit.k, cd - unit.cd,
				rad - unit.rad);
	}

	public final SIUnit m(SIUnit unit) {
		return new SIUnit(m + unit.m, kg + unit.kg, s + unit.s, a + unit.a, mol + unit.mol, k + unit.k, cd + unit.cd,
				rad + unit.rad);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + cd;
		result = prime * result + k;
		result = prime * result + kg;
		result = prime * result + m;
		result = prime * result + mol;
		result = prime * result + s;
		result = prime * result + rad;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof SIUnit))
			return false;
		SIUnit other = (SIUnit) obj;
		if (a != other.a)
			return false;
		if (cd != other.cd)
			return false;
		if (k != other.k)
			return false;
		if (kg != other.kg)
			return false;
		if (m != other.m)
			return false;
		if (mol != other.mol)
			return false;
		if (s != other.s)
			return false;
		if (rad != other.rad)
			return false;
		return true;
	}

	public String toString() {
		String results = "";
		if (m != 0)
			results += "m" + (m == 1 ? "" : "^" + m);
		if (kg != 0)
			results += (results.equals("") ? "" : " ") + "kg" + (kg == 1 ? "" : "^" + kg);
		if (s != 0)
			results += (results.equals("") ? "" : " ") + "s" + (s == 1 ? "" : "^" + s);
		if (a != 0)
			results += (results.equals("") ? "" : " ") + "A" + (a == 1 ? "" : "^" + a);
		if (mol != 0)
			results += (results.equals("") ? "" : " ") + "mol" + (mol == 1 ? "" : "^" + mol);
		if (k != 0)
			results += (results.equals("") ? "" : " ") + "K" + (k == 1 ? "" : "^" + k);
		if (cd != 0)
			results += (results.equals("") ? "" : " ") + "cd" + (cd == 1 ? "" : "^" + cd);
		if (rad != 0)
			results += (results.equals("") ? "" : " ") + "rad" + (rad == 1 ? "" : "^" + rad);

		return results;
	}

}
