package evaluacion2;

public class Electrodomestico {

	public final static String COLOR_DEF = "blanco"; 

	public final static char CONSUMO_ENERGETICO_DEF = 'F'; 

	public final static double PRECIO_BASE_DEF = 100000; 

	public final static double PESO_DEF = 5; 

	protected double precioBase;

	protected String color;

	protected  char consumoEnergetico;

	protected double peso;

	private void comprobarColor(String color) {

		String colores[] = { "blanco", "negro", "rojo", "azul", "gris" };
		boolean encontrado = false;

		for (int i = 0; i < colores.length && !encontrado; i++) {

			if (colores[i].equals(color)) {
				encontrado = true;
			}

		}

		if (encontrado) {
			this.color = color;
		} else {
			this.color = COLOR_DEF;
		}

	}

	private void comprobarConsumoEnergetico(char consumoEnergetico) {

		if (consumoEnergetico >= 65 && consumoEnergetico <= 70) {
			this.consumoEnergetico = consumoEnergetico;
		} else {
			this.consumoEnergetico = CONSUMO_ENERGETICO_DEF;
		}

	}

	public double getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	public double precioFinal() {
		
		double valor = 0;
		
		switch (consumoEnergetico) {
		
		case 'A':
			valor += 100;
			break;
		
		case 'B':
			valor += 80;
			break;
		
		case 'C':
			valor += 60;
			break;
		
		case 'D':
			valor += 50;
			break;
		
		case 'E':
			valor += 30;
			break;
		
		case 'F':
			valor += 10;
			break;
		}

		if (peso >= 0 && peso < 19) {
			valor += 10;
		} else if (peso >= 20 && peso < 49) {
			valor += 50;
		} else if (peso >= 50 && peso <= 79) {
			valor += 80;
		} else if (peso >= 80) {
			valor += 100;
		}

		return precioBase + valor;
	}

	public Electrodomestico() {
		this(PRECIO_BASE_DEF, PESO_DEF, CONSUMO_ENERGETICO_DEF, COLOR_DEF); 
	}

	public Electrodomestico(double precioBase, double peso) {
		this(precioBase, peso, CONSUMO_ENERGETICO_DEF, COLOR_DEF); 
	}

	public Electrodomestico(double precioBase, double peso, char consumoEnergetico, String color) { 
																									
		this.precioBase = precioBase;
		this.peso = peso;
		comprobarConsumoEnergetico(consumoEnergetico);
		comprobarColor(color);
	}

}