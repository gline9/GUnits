package gunits.unit.derived;

import gunits.unit.MKSUnit;
import gunits.unit.SIUnit;
import gunits.unit.ScalarConversion;
import gunits.unit.basal.Distance;

public enum Energy implements ScalarConversion {
	JOULES(Force.NEWTONS.m(Distance.METERS).fromBasal(1)),
	DEKAJOULES(JOULES.cora / 10),
	HECTOJOULES(DEKAJOULES.cora / 10),
	KILOJOULES(JOULES.cora / 1000),
	MEGAJOULES(KILOJOULES.cora / 1000),
	GIGAJOULES(MEGAJOULES.cora / 1000),
	TERAJOULES(GIGAJOULES.cora / 1000),
	PETAJOULES(TERAJOULES.cora / 1000),
	EXAJOULES(PETAJOULES.cora / 1000),
	ZETTAJOULES(EXAJOULES.cora / 1000),
	YOTTAJOULES(ZETTAJOULES.cora / 1000),
	DECAJOULES(JOULES.cora * 10),
	CENTIJOULES(DECAJOULES.cora * 10),
	MILLIJOULES(CENTIJOULES.cora * 10),
	MICROJOULES(MILLIJOULES.cora * 1000),
	NANOJOULES(MICROJOULES.cora * 1000),
	PICOJOULES(NANOJOULES.cora * 1000),
	FEMTOJOULES(PICOJOULES.cora * 1000),
	ATTOJOULES(FEMTOJOULES.cora * 1000),
	ZEPTOJOULES(ATTOJOULES.cora * 1000),
	YOCTOJOULES(ZEPTOJOULES.cora * 1000),
	FOOTPOUND(JOULES.cora / 1.3558),
	HORSEPOWERHOUR(MEGAJOULES.cora / 2.6845),
	THERMS(MEGAJOULES.cora / 105.5),
	CALORIES(JOULES.cora / 4.184),
	KILOCALORIES(CALORIES.cora / 1000);

	private final double cora;

	private Energy(double conversionRatio) {
		cora = conversionRatio;
	}

	public double getConversionRatio() {
		return cora;
	}

	public final SIUnit getUnits() {
		return MKSUnit.Energy;
	}
}
