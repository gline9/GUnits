package gunits.unit.basal;

import gunits.unit.MKSUnit;
import gunits.unit.SIUnit;
import gunits.unit.ScalarConversion;

public enum Mass implements ScalarConversion{
	GRAMS(1),
	DEKAGRAMS(GRAMS.cora / 10),
	HECTOGRAMS(DEKAGRAMS.cora / 10),
	KILOGRAMS(GRAMS.cora / 1000),
	MEGAGRAMS(KILOGRAMS.cora / 1000),
	GIGAGRAMS(MEGAGRAMS.cora / 1000),
	TERAGRAMS(GIGAGRAMS.cora / 1000),
	PETAGRAMS(TERAGRAMS.cora / 1000),
	EXAGRAMS(PETAGRAMS.cora / 1000),
	ZETTAGRAMS(EXAGRAMS.cora / 1000),
	YOTTAGRAMS(ZETTAGRAMS.cora / 1000),
	DECAGRAMS(GRAMS.cora * 10),
	CENTIGRAMS(DECAGRAMS.cora * 10),
	MILLIGRAMS(CENTIGRAMS.cora * 10),
	MICROGRAMS(MILLIGRAMS.cora * 1000),
	NANOGRAMS(MICROGRAMS.cora * 1000),
	PICOGRAMS(NANOGRAMS.cora * 1000),
	FEMTOGRAMS(PICOGRAMS.cora * 1000),
	ATTOGRAMS(FEMTOGRAMS.cora * 1000),
	ZEPTOGRAMS(ATTOGRAMS.cora * 1000),
	YOCTOGRAMS(ZEPTOGRAMS.cora * 1000),
	GRAINS(MILLIGRAMS.cora / 64.79891),
	DRAMS(GRAMS.cora / 1.7718451953125),
	OUNCES(DRAMS.cora / 16),
	POUNDS(OUNCES.cora / 16),
	HUNDREDWEIGHTS(POUNDS.cora / 100),
	TONS(HUNDREDWEIGHTS.cora / 20),
	PENNYWEIGHTS(GRAINS.cora / 24),
	TROYOUNCES(PENNYWEIGHTS.cora / 20),
	TROYPOUNDS(TROYOUNCES.cora / 12),
	SLUGS(KILOGRAMS.cora * 14.5939);

	private final double cora;

	private Mass(double conversionRatio) {
		cora = conversionRatio;
	}

	public double getConversionRatio() {
		return cora;
	}

	public final SIUnit getUnits() {
		return MKSUnit.Mass;
	}
}
