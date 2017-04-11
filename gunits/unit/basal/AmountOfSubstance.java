package gunits.unit.basal;

import gunits.unit.SIUnit;
import gunits.unit.ScalarConversion;

public enum AmountOfSubstance implements ScalarConversion {
	MOLES(1),
	DEKAMOLES(MOLES.cora / 10),
	HECTOMOLES(DEKAMOLES.cora / 10),
	KILOMOLES(MOLES.cora / 1000),
	MEGAMOLES(KILOMOLES.cora / 1000),
	GIGAMOLES(MEGAMOLES.cora / 1000),
	TERAMOLES(GIGAMOLES.cora / 1000),
	PETAMOLES(TERAMOLES.cora / 1000),
	EXAMOLES(PETAMOLES.cora / 1000),
	ZETTAMOLES(EXAMOLES.cora / 1000),
	YOTTAMOLES(ZETTAMOLES.cora / 1000),
	DECAMOLES(MOLES.cora * 10),
	CENTIMOLES(DECAMOLES.cora * 10),
	MILLIMOLES(CENTIMOLES.cora * 10),
	MICROMOLES(MILLIMOLES.cora * 1000),
	NANOMOLES(MICROMOLES.cora * 1000),
	PICOMOLES(NANOMOLES.cora * 1000),
	FEMTOMOLES(PICOMOLES.cora * 1000),
	ATTOMOLES(FEMTOMOLES.cora * 1000),
	ZEPTOMOLES(ATTOMOLES.cora * 1000),
	YOCTOMOLES(ZEPTOMOLES.cora * 1000),
	POUNDMOLES(MOLES.cora / 453.59237),
	GRAMMOLES(MOLES.cora),
	KILOGRAMMOLES(KILOMOLES.cora);

	private final double cora;

	private AmountOfSubstance(double conversionRatio) {
		cora = conversionRatio;
	}

	public double getConversionRatio() {
		return cora;
	}

	public final SIUnit getUnits() {
		return SIUnit.AmountOfSubstance;
	}
}
