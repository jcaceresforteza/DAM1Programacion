package Bingoo;

import daw.com.Pantalla;
import daw.com.Teclado;
import java.util.Scanner;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numJugadores;
		Boolean[] ganador = {false};
		
		Bombo aJugar = new Bombo();
		
		
		
		
		
		boolean jugadorescorrecto;
		jugadorescorrecto = false;
		
		
        do {
          
        	
        	numJugadores = Teclado.leerInt("Diga el número de jugadores. Debe ser entre 2 y 10 jugadores.");
        		if (numJugadores > 1 && numJugadores < 11) {
        			jugadorescorrecto = true;
        		
        	
            
                } else {
                	Pantalla.escribirString("Por favor, debe ser entre 2 y 10 jugadores.");
                	Pantalla.escribirSaltoLinea();
                	
                }
            
        } while (!jugadorescorrecto);
		
		
        carton[] participantes = new carton[numJugadores];
        
        for (int i = 0; i < numJugadores; i++) {
        	participantes[i] = new carton();
        }
        
        
        
        for (int i = 0; i < numJugadores; i++) {
        	System.out.print("Jugador nº " + (i+1));
        	Pantalla.escribirSaltoLinea();
        	participantes[i].MostrarCarton();
        	Pantalla.escribirSaltoLinea();
        }
        
      
        
        System.out.print("¡Que empiece el juego!");
        Pantalla.escribirSaltoLinea();
        
        int contador = 0;
        do{
        	int giracionNumero = aJugar.Tirada();
        	contador++;
            
            System.out.print("Ha salido el..." + giracionNumero);
            Pantalla.escribirSaltoLinea();
            Pantalla.escribirSaltoLinea();
            
            for (int j = 0; j < numJugadores; j++) {
            	participantes[j].ComprobarCarton(giracionNumero ,(j+1) , ganador);
            }
            
            if (ganador[0]) {
                System.out.println("¡¡¡SE ACABÓ!!!");
                break; 
            } else {
            	
            	if (contador == 5) {
            		Pantalla.escribirSaltoLinea();
        			System.out.print("Recordemos los cartones de los jugadores:");
            		for (int i = 0; i < numJugadores; i++) {
            			
            			Pantalla.escribirSaltoLinea();
                    	System.out.print("Jugador nº " + (i+1));
                    	Pantalla.escribirSaltoLinea();
                    	participantes[i].MostrarCarton();
                    	Pantalla.escribirSaltoLinea();
                    }
            		contador = 0;
            	} 
            	
            	Scanner scanner = new Scanner(System.in);
                Pantalla.escribirSaltoLinea();
                Pantalla.escribirSaltoLinea();
                System.out.println("Presione Enter para el siguiente número");
                scanner.nextLine();  
                Pantalla.escribirSaltoLinea();
            }
            
            
            
            
        }  while (!ganador[0]);
        
        
		
        
        
        
		
     
		
		
	}

}
