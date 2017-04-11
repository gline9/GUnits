package gunits.test;

import gunits.measure.Measure;
import gunits.unit.basal.Mass;

public class Tester {
	public static void main(String[] args) {
		System.out.println(new Measure(1, Mass.KILOGRAMS).convertTo(Mass.POUNDS));
	}
}
