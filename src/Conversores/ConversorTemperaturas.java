package Conversores;

public class ConversorTemperaturas {
	
	private double temperatura;
	private String tipoDeDato;
	
	public double convertirTemperatura(double cantidad, String tipo, String tipoDestino) {
		
		this.temperatura = cantidad;
		this.tipoDeDato = tipo;
		
		switch (tipoDeDato.toLowerCase()) {
		case "c" :
			
			if(tipoDestino == "f") {
				return (this.temperatura * 9/5) + 32;
			}else if(tipoDestino == "k") {
				return this.temperatura +  273.15;
			}else if(tipoDestino == "c") {
				return this.temperatura;
			}else {
				throw new IllegalAccessError("Tipo de destino erroneo");
			}
						
		case "k" :
			
			if(tipoDestino == "f") {
				return (this.temperatura - 273.15) * 9/5 + 32;
			}else if(tipoDestino == "k") {
				return this.temperatura;
			}else if(tipoDestino == "c") {
				return this.temperatura - 273.15;
			}else {
				throw new IllegalAccessError("Tipo de destino erroneo");
			}			
			
		case "f" :
			
			if(tipoDestino == "f") {
				return this.temperatura;
			}else if(tipoDestino == "k") {
				return (this.temperatura - 32) * 5/9 + 273.15;
			}else if(tipoDestino == "c") {
				return (this.temperatura - 32) * 5/9;
			}else {
				throw new IllegalAccessError("Tipo de destino erroneo");
			}
								

		default:
			throw new IllegalAccessError("Error de tipo");
		}
		
	}

}
