package Conversores;

public class ConversorTemperaturas {
	
	public double convertirTemperatura(double temperaturaInicial, String unidadOrigen, String unidadDestino) {
		
		
		if (unidadOrigen.equalsIgnoreCase(unidadDestino)) {
			return temperaturaInicial; // No se requiere conversión
		}
		
		
		switch (unidadOrigen.toLowerCase()) {
			case "c":
				return convertirDesdeCelsius(temperaturaInicial, unidadDestino);
			case "f":
				return convertirDesdeFahrenheit(temperaturaInicial, unidadDestino);
			case "k":
				return convertirDesdeKelvin(temperaturaInicial, unidadDestino);
			default:
				throw new IllegalArgumentException("Unidad de temperatura no válida: " + unidadOrigen);
		}
	}
	
	private double convertirDesdeCelsius(double temperatura, String unidadDestino) {
		switch (unidadDestino.toLowerCase()) {
			case "f":
				return (temperatura * 9 / 5) + 32;
			case "k":
				return temperatura + 273.15;
			default:
				throw new IllegalArgumentException("Unidad de temperatura no válida: " + unidadDestino);
		}
	}
	
	private double convertirDesdeFahrenheit(double temperatura, String unidadDestino) {
		switch (unidadDestino.toLowerCase()) {
			case "c":
				return (temperatura - 32) * 5 / 9;
			case "k":
				return (temperatura + 459.67) * 5 / 9;
			default:
				throw new IllegalArgumentException("Unidad de temperatura no válida: " + unidadDestino);
		}
	}
	
	private double convertirDesdeKelvin(double temperatura, String unidadDestino) {
		switch (unidadDestino.toLowerCase()) {
			case "c":
				return temperatura - 273.15;
			case "f":
				return (temperatura * 9 / 5) - 459.67;
			default:
				throw new IllegalArgumentException("Unidad de temperatura no válida: " + unidadDestino);
		}
	}
}
