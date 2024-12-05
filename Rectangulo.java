package pruebaobjetos;

import daw.com.Pantalla;
import daw.com.Teclado;

public class Rectangulo {
	private int lado1;
	private int lado2;
	private Punto centro;
	private int color;

	public Rectangulo(int lado1, int lado2, Punto centro, int color) {
		
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.centro = centro;
		this.color = color;
	}
	
	
	public Rectangulo() {
		
		this.lado1 = 0;
		this.lado2 = 0;
		this.centro = new Punto ();
		this.color = 0;
	}
	
	public Rectangulo (Rectangulo Rectangulo) {
		
		this.lado1 = Rectangulo.lado1;
		this.lado2 = Rectangulo.lado2;
		this.centro = Rectangulo.centro;
		this.color = Rectangulo.color;
		
	}
	
	
	
	
	public void mostrarDatos()
	{
		centro.mostrarDatos();
		Pantalla.escribirString("Lado 1 :" + lado1);
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirString("Lado 2 :" + lado2);
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirString("Centro :" + centro);
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirString("Color :" + color);
	}

	public void cambiarDatos()
	{
		
		
		
		int ladito1 = Teclado.leerInt("lado1 :");
		int ladito2 = Teclado.leerInt("lado2 :");
		int colorcito = Teclado.leerInt("color :");
		int equisita = Teclado.leerInt("X del circulo :");
		int isita = Teclado.leerInt("Y del circulo :");
		
		
		if (ladito1 != 0 || ladito2 != 0 || colorcito != 0) {
			setLado1 (ladito1);
			setLado2 (ladito2);
			setColor (colorcito);
			this.centro.setX(equisita);
			this.centro.setY(isita);
			
		} else {
			System.out.print("No es posible dejar vacio algun campo");
		}
		
		
	}
	
	

	public int getLado1() {
		return lado1;
	}


	public void setLado1(int lado1) {
		this.lado1 = lado1;
	}


	public int getLado2() {
		return lado2;
	}


	public void setLado2(int lado2) {
		this.lado2 = lado2;
	}


	public Punto getCentro() {
		return centro;
	}


	public void setCentro(Punto centro) {
		this.centro = centro;
	}


	public int getColor() {
		return color;
	}


	public void setColor(int color) {
		this.color = color;
	}
	
	
	
	
		
	}


