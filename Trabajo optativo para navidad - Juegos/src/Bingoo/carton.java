package Bingoo;

import daw.com.Pantalla;

public class carton {

	
	private int[][] CartonNums;
	private boolean[][] Cantados;
	
	public carton() {
		this.CartonNums = new int[3][5];
		this.Cantados = new boolean[3][5];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				this.Cantados[i][j] = false;
			}
			
		}
		
		
		
		CrearCarton();
	}
	
	private void CrearCarton() {
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				this.CartonNums[i][j] = generacionNumeros();
			}
			
		}
		
		
		
	}
	

	
	
	public void MostrarCarton() {
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(this.CartonNums[i][j] + " ");
			}
			Pantalla.escribirSaltoLinea();
		}
		
	}
	
	public void ComprobarCarton(int numcomprobacion,  int jugador , Boolean[] ganador) {
		
		Pantalla.escribirSaltoLinea();
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				if (this.CartonNums[i][j] == numcomprobacion) {
					this.Cantados[i][j] = true;
					System.out.print("El jugador número " + jugador + " tiene el número " + numcomprobacion );
				}
			}
			
		}
		
		int contador2 = 0;
		for (int i = 0; i < 3; i++) {
			int contador = 0;
			
			for (int j = 0; j < 5; j++) {
				if (this.Cantados[i][j] == true) {
					contador++;
					contador2++;
				}
				
				
			}
			if (contador == 5) {
				Pantalla.escribirSaltoLinea();
				System.out.print("El jugador número " + jugador + " tiene linea");
				Pantalla.escribirSaltoLinea();
				
			}
			
			
		}
		
		if (contador2 == 15) {
			Pantalla.escribirSaltoLinea();
			System.out.print("El jugador número " + jugador + " tiene BINGO!!!");
			Pantalla.escribirSaltoLinea();
			ganador[0] = true;
			
		}
		
		
		
		
		
		
	}
	
	
	private int generacionNumeros() {
		
		
		
		 int generado;
	     boolean repetido;

	        do {
	            generado = (int) (Math.random() * 90) + 1; 
	            repetido = false;
	            
	            for (int i = 0; i < 3; i++) {
	            	for (int j = 0; j < 5; j++) {
	            		
	            	
	            	
	            	
	                if (generado == this.CartonNums[i][j]) {
	                    repetido = true;
	                    break;
	                }
	                
	            	}
	            }
	        } while (repetido);

	        return generado;
		
		
		
		
	}

	private int[][] getCartonNums() {
		return CartonNums;
	}

	private void setCartonNums(int[][] cartonNums) {
		CartonNums = cartonNums;
	}

	private boolean[][] getCantados() {
		return Cantados;
	}

	private void setCantados(boolean[][] cantados) {
		Cantados = cantados;
	}
	
	
	
	
}
