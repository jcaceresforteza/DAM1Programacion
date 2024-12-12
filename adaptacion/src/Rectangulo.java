package src;

import daw.com.Pantalla;
import daw.com.Teclado;

public class Rectangulo {

	private int color;
	private Punto centro;
	private double base;
	private double altura;
	
	public Rectangulo() {
		this.color = 0;
		this.base = 0.0;
		this.altura = 0.0;
		this.centro = new Punto();
	}	
	
	public Rectangulo(int color, Punto centro, double base, double altura) {
		this.color = color;
		this.centro = centro;
		this.base = base;
		this.altura = altura;
	}

	public Rectangulo(Rectangulo r) {
		this.color = r.color;
		this.base = r.base;
		this.altura = r.altura;
		this.centro = new Punto(r.centro);
	}


	public void mostrarDatos() {
		Pantalla.escribirString("Base del rectángulo: ", String.valueOf(base));
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirString("Altura del rectángulo: ", String.valueOf(altura));
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirString("Color del rectángulo: ", String.valueOf(color));
		Pantalla.escribirSaltoLinea();		
		Pantalla.escribirString("");
		centro.mostrarDatos();
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirSaltoLinea();
	}
	
	/*
	 * Código duplicado
	 * Control de errores
	 * No usa métodos, los redefine
	 * No se ha leído la documentación de Teclado
	 * 
	 * Crear funciones para evitar código duplicado
	 * Modificar leerDatos() para cumplir especificaciones
	 * Usar los métodos adecuados para cada tipo
	 * Buscar un método para realizar conversiones seguras
	 */
	
	private double controlErrores0double(String nueva) {
		
		double resultado = 0.0;
		boolean indicar = false;
		
		do {
			if (indicar) {
				Pantalla.escribirString("Indica de nuevo el valor(No puede ser menor que 0 o texto): ");
				nueva = Teclado.leerString();
			}
			
			
			if (!nueva.isEmpty()) {
			
				try {
					resultado = Double.parseDouble(nueva);
				} catch (NumberFormatException e) {
					resultado = -1;
				}
			}
			
			indicar = true;
			
		} while (resultado <= 0.0);
		
		return resultado;
	}
	
	
	
private double controlErrores0int(String nueva) {
		
		double resultado = 0.0;
		boolean indicar = false;
		
		do {
			if (indicar) {
				Pantalla.escribirString("Indica de nuevo el valor(No puede ser menor que 0 o texto): ");
				nueva = Teclado.leerString();
			}
			
			
			if (!nueva.isEmpty()) {
			
				try {
					resultado = Integer.valueOf(nueva);
				} catch (NumberFormatException e) {
					resultado = -1;
				}
			}
			
			indicar = true;
			
		} while (resultado < 0.0);
		
		return resultado;
	}
	

private boolean comprobartexto(String nueva) {
	
	
	try {
		Double.parseDouble(nueva);
		return true;
	} catch (NumberFormatException e) {
		return false;
	}
	
}

	
	public void cambiarDatos() {
		

		
		
		String altnueva;
		do {
			Pantalla.escribirString("Indica el nuevo valor de la altura: ");
			altnueva = Teclado.leerString();
			
			if (!altnueva.isEmpty()) {
			
				try {
					this.altura = Double.parseDouble(altnueva);
				} catch (NumberFormatException e) {
					altnueva = "-1";
				}
			} else {
				altnueva = "0.0";
			}
			
		} while (Double.parseDouble(altnueva) < 0.0);
		
		
		if (Double.parseDouble(altnueva) != 0.0) {
			this.altura = Double.parseDouble(altnueva);
		}
		
		
		
		
		/*if (altnueva.isEmpty() || !comprobartexto(altnueva)) {
		
		
		this.altura = controlErrores0double(altnueva);
		
		} else {
			
			if (Double.parseDouble(altnueva) <= 0) {
				
				this.altura = controlErrores0double(altnueva);
				
			} else {
				this.altura = Double.parseDouble(altnueva);;
			}
			
			
			
		} */
		
		
	
		String baseNueva;
		do {
			Pantalla.escribirString("Indica el nuevo valor de la base: ");
			baseNueva = Teclado.leerString();
			
			if (!baseNueva.isEmpty()) {
			
				try {
					this.base = Double.parseDouble(baseNueva);
				} catch (NumberFormatException e) {
					baseNueva = "-1";
				}
			} else {
				baseNueva = "0.0";
			}
			
		} while (Double.parseDouble(baseNueva) < 0.0);
		
		
		if (Double.parseDouble(baseNueva) != 0.0) {
			this.base = Double.parseDouble(baseNueva);
		}
		
		/*if (baseNueva.isEmpty() || !comprobartexto(baseNueva)) {

			this.base = controlErrores0double(baseNueva);
			
			} else {
				if (Double.parseDouble(baseNueva) <= 0) {
					
					this.base = controlErrores0double(baseNueva);
					
				} else {
					this.base = Double.parseDouble(baseNueva);
				}
				
				
			}*/
		
		
	
		
		String colorNuevo;
		do {
			Pantalla.escribirString("Indica el nuevo valor del color: ");
			colorNuevo = Teclado.leerString();
			
			if (!colorNuevo.isEmpty()) {
			
				try {
					this.color = Integer.valueOf(colorNuevo);
				} catch (NumberFormatException e) {
					colorNuevo = "-1";
				}
			} else {
				colorNuevo = "0";
			}
			
		} while (Integer.valueOf(colorNuevo) < 0);
		
		
		if (Integer.valueOf(colorNuevo) != 0) {
			this.color = Integer.valueOf(colorNuevo);
		}
		
		/*if (colorNuevo.isEmpty() || !comprobartexto(colorNuevo)) {
			
			this.color = (int) controlErrores0int(colorNuevo);
			
			} else {
				
				if (Integer.valueOf(colorNuevo) <= 0) {
					
					this.color = (int) controlErrores0int(colorNuevo);
					
				}else {
					this.color = Integer.valueOf(colorNuevo);
				}
				
			}*/
		
		
		
		
	
		
		
		
		String xNueva;
		do {
			Pantalla.escribirString("Indica el nuevo valor de X: ");
			xNueva = Teclado.leerString();
			
			if (!xNueva.isEmpty()) {
			
				try {
					this.centro.setX(Integer.valueOf(xNueva));
				} catch (NumberFormatException e) {
					xNueva = "999999999";
				} 
			} else {
				xNueva = "0";
			}
		} while (Integer.valueOf(xNueva) == 999999999);
		
		
		
		
		if (Integer.valueOf(xNueva) != 0) {
			this.centro.setX(Integer.valueOf(xNueva));
		}
		
		
		
		
		
		

		/*while (yNueva.isEmpty() || comprobartexto(yNueva) ) {
			
			Pantalla.escribirString("Indica el nuevo valor de la Y del punto : ");
			yNueva = Teclado.leerString();
			try {
				Integer.valueOf(yNueva);
				
			} catch (NumberFormatException e) {
				yNueva = "";
			}
		
		}*/
		String yNueva;
		do {
			Pantalla.escribirString("Indica el nuevo valor de la Y del punto : ");
			yNueva = Teclado.leerString();
			
			if (!yNueva.isEmpty()) {
			
				try {
					this.centro.setY(Integer.valueOf(yNueva));
				} catch (NumberFormatException e) {
					yNueva = "999999999";
				} 
			} else {
				yNueva = "0";
			}
		} while (Integer.valueOf(yNueva) == 999999999);
		
		
		
		
		if (Integer.valueOf(yNueva) != 0) {
			this.centro.setY(Integer.valueOf(yNueva));
		}
		
		
		
		
		
		
		
		
		
		//Double.isNaN(Double.valueOf(alturaNueva));
		
		
	}
	
	
	
	/**
	 * @return the color
	 */
	public int getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(int color) {
		this.color = color;
	}

	/**
	 * @return the centro
	 */
	public Punto getCentro() {
		return centro;
	}

	/**
	 * @param centro the centro to set
	 */
	public void setCentro(Punto centro) {
		this.centro = centro;
	}

	/**
	 * @return the base
	 */
	public double getBase() {
		return base;
	}

	/**
	 * @param base the base to set
	 */
	public void setBase(double base) {
		this.base = base;
	}

	/**
	 * @return the altura
	 */
	public double getAltura() {
		return altura;
	}

	/**
	 * @param altura the altura to set
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
}
