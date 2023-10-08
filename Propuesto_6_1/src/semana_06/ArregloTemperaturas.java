package semana_06;

public class ArregloTemperaturas {
	private double[] temperatura;
	private int indice;
	
	public ArregloTemperaturas() {
		temperatura = new double[10];
		indice = 0;
	}
	
	//Operaciones públicas básicas
	public int tamanio() {
		return indice;
	}
	
	public double obtener(int i) {
		return temperatura[i];
	}
	
	public void adicionar(double t) {
		if(indice == temperatura.length) {
			ampliarArreglo();
		}
			temperatura[indice] = t;
			indice++;
	}
	
	//Operaciones públicas complementarias
	public void eliminarAlFinal() {
		indice--;
	}

	public void eliminarTodo() {
		indice = 0;
	}
	
	//Operaciones privadas
	private void ampliarArreglo() {
		double[] aux = temperatura;
		temperatura = new double[indice + 10];
		for (int i = 0; i < indice; i++)
			temperatura[i] = aux[i];
	}
	
	public double temperaturaMenor() {
		double menor = temperatura[0];
		for (double valor : temperatura) {
			if (valor < menor) {
				menor = valor;
			}
		}
		return menor;
	}
	
	public int posPrimeraTemperaturaNormal() {
		int i = 0;
		for (double valor : temperatura) {
			if (valor >= 36.1 && valor <= 37.2) {
				return i;
			}
			i++;
		}
		return -1;
	}
	
	public void remplazarPrimeraTemperaturaNormal() {
		int pos = posPrimeraTemperaturaNormal();
		if (pos != -1) {
			temperatura[pos] = temperaturaMenor();
		}
	}
	
	public void incrementarTemperaturas() {
		int i = 0;
		for(double valor : temperatura) {
			temperatura[i] += 0.2;
			i++;
		}
	}
}
