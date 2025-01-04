package Bingoo;

public class Bombo {

	private int[] numeritos;
	private int numeroTirada;
	
	public Bombo(){
		this.numeritos = new int[91];
		this.numeroTirada = 1;
	}
	
	
	private void relleno() {
		
		this.numeritos[this.numeroTirada] = generacionNumeros();
		this.numeroTirada++;
		
		
		
	}
	
	
	public int Tirada() {
		relleno();
		
		
		
		return this.numeritos[this.numeroTirada - 1];
		
		
		
	}
	
	
	private int generacionNumeros() {
		
		
		
		 int generado;
	     boolean repetido;

	        do {
	            generado = (int) (Math.random() * 90) + 1; 
	            repetido = false;
	            
	            for (int i = 0; i < this.numeroTirada; i++) {
	                if (generado == this.numeritos[i]) {
	                    repetido = true;
	                    break;
	                }
	            }
	        } while (repetido);

	        return generado;
		
		
		
		
	}


	private int[] getNumeritos() {
		return numeritos;
	}


	private void setNumeritos(int[] numeritos) {
		this.numeritos = numeritos;
	}


	private int getNumeroTirada() {
		return numeroTirada;
	}


	private void setNumeroTirada(int numeroTirada) {
		this.numeroTirada = numeroTirada;
	}
	
	
	
}
