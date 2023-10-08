package semana_06;

public class ArregloEdades {
	private int[] edad;
	private int indice;

	public ArregloEdades() {
		edad = new int[10];
		indice = 0;
	}

	// Operaciones p�blicas b�sicas
	public int tamanio() {
		return indice;
	}

	public int obtener(int i) {
		return edad[i];
	}

	public void adicionar(int e) {
		if (indice == edad.length)
			ampliarArreglo();
		edad[indice] = e;
		indice++;
	}

	// Operaciones p�blicas complementarias
	public void eliminarAlFinal() {
		indice--;
	}

	public void eliminarTodo() {
		indice = 0;
	}

	// Operaciones privadas
	private void ampliarArreglo() {
		int[] aux = edad;
		edad = new int[indice + 10];
		for (int i = 0; i < indice; i++)
			edad[i] = aux[i];
	}

	public int edadMayor() {
		int mayor = 0;
		for (int valor : edad) {
			if (valor > mayor) {
				mayor = valor;
			}
		}
		return mayor;
	}

	public int posPrimeraEdadAdulta() {
		int i = 0;
		for (int valor : edad) {
			if (valor >= 20 && valor <= 59) {
				return i;
			}
			i++;
		}
		return -1;
	}
	
	public void incrementarPrimeraEdadAdulta() {
		edad[posPrimeraEdadAdulta()] += 5;
	}

	public void remplazarPrimeraEdadAdulta() {
		int pos = posPrimeraEdadAdulta();
		if (pos != -1) {
			edad[pos] = edadMayor();
		}
	}

}