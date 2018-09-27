package tddZadaci;

public class Converter {
	
	public double kiloToPound(double kilo) {
		return kilo * 2.20462262;
	}
	
	public double poundToKilo(double pound) {
		return pound * 0.45359237;
	}

	public double cmToInches(double cm) {
		return cm * 0.393700787;
	}
	
	public double inchesToCm(double inches) {
		return inches * 2.54;
	}
	
	public double celsiusToFahrenheit(double c) {
		return c * ((double) 9 / 5) + 32;
	}
	
	public double fahrenheitToCelsius(double f) {
		return (f - 32) * ((double) 5 / 9);
	}
	
}

