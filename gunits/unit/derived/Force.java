package gunits.unit.derived;

import gunits.unit.MKSUnit;
import gunits.unit.SIUnit;
import gunits.unit.ScalarConversion;
import gunits.unit.basal.Distance;
import gunits.unit.basal.Mass;
import gunits.unit.basal.Time;

public enum Force implements ScalarConversion {
	NEWTONS(Mass.KILOGRAMS.m(Distance.METERS).per(Time.SECONDS.m(Time.SECONDS)).fromBasal(1)),
	DEKANEWTONS(NEWTONS.cora / 10),
	HECTONEWTONS(DEKANEWTONS.cora / 10),
	KILONEWTONS(NEWTONS.cora / 1000),
	MEGANEWTONS(KILONEWTONS.cora / 1000),
	GIGANEWTONS(MEGANEWTONS.cora / 1000),
	TERANEWTONS(GIGANEWTONS.cora / 1000),
	PETANEWTONS(TERANEWTONS.cora / 1000),
	EXANEWTONS(PETANEWTONS.cora / 1000),
	ZETTANEWTONS(EXANEWTONS.cora / 1000),
	YOTTANEWTONS(ZETTANEWTONS.cora / 1000),
	DECANEWTONS(NEWTONS.cora * 10),
	CENTINEWTONS(DECANEWTONS.cora * 10),
	MILLINEWTONS(CENTINEWTONS.cora * 10),
	MICRONEWTONS(MILLINEWTONS.cora * 1000),
	NANONEWTONS(MICRONEWTONS.cora * 1000),
	PICONEWTONS(NANONEWTONS.cora * 1000),
	FEMTONEWTONS(PICONEWTONS.cora * 1000),
	ATTONEWTONS(FEMTONEWTONS.cora * 1000),
	ZEPTONEWTONS(ATTONEWTONS.cora * 1000),
	YOCTONEWTONS(ZEPTONEWTONS.cora * 1000),
	POUNDS(NEWTONS.cora / 4.4482216152605),
	KILOGRAMS(NEWTONS.cora / 9.80665);

	private final double cora;

	private Force(double conversionRatio) {
		this.cora = conversionRatio;
	}

	@Override
	public double getConversionRatio() {
		return cora;
	}

	@Override
	public SIUnit getUnits() {
		return MKSUnit.Force;
	}
}
