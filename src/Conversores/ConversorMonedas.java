package Conversores;
import java.util.HashMap;
import java.util.Map;


public class ConversorMonedas {
	
	private Double cantidad; 
	private String monedaOrigen;
	private String monedaDestino;
	
	Map<String, Double> tasasCambio = new HashMap<>();
	
	public ConversorMonedas(){
		//asignando las tasas de cambio				
		tasasCambio.put("usd", 1.0);
		tasasCambio.put("cop", 0.00024);
		tasasCambio.put("ars", 0.0038);	
		tasasCambio.put("eur", 1.10);
		tasasCambio.put("gbp", 1.29);
		tasasCambio.put("jpy", 0.0071);
		tasasCambio.put("krw", 0.00077);
		tasasCambio.put("ves", 0.035);
		tasasCambio.put("brl", 0.2);
		tasasCambio.put("ves", 0.035);
		
		
	}
	
	
	
	public double convertirMoneda(double cantidad ,String mOrigen ,String mDestino ) {
				
		this.cantidad = cantidad;
		this.monedaOrigen = mOrigen.toLowerCase();
		this.monedaDestino = mDestino.toLowerCase();
		
		if (monedaOrigen.equals(monedaDestino)) {
			return this.cantidad; // no se necesita convercion
		}
		
		if(tasasCambio.containsKey(monedaOrigen) && tasasCambio.containsKey(monedaDestino)) {
			return this.cantidad * tasasCambio.get(monedaOrigen) / tasasCambio.get(monedaDestino);
		}
				
		throw new IllegalAccessError("conversion no sopotada");
		
	}

}
