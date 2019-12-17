/**
 * 
 */
package calcprima;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Clase Main.
 *
 * @author dcmonten
 */
public class Main {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
	    Calculadora calculadora = new Calculadora();
	    
		do {
			System.out.println("\n------Calculadora de primas---------\n");
			try {
				BufferedReader scan = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
			    System.out.println("Ingrese la edad del conductor: ");
			    int edad = Integer.parseInt(scan.readLine());
			    System.out.println("Ingrese la cantidad de puntos en la licencia del conductor: ");
			    int puntos = Integer.parseInt(scan.readLine());
			    calculadora.retornar_prima(edad, puntos);
				
			} catch (NumberFormatException e) {	
				System.out.println("Error\n Usted no insert� n�meros enteros, intente de nuevo.");				
			}catch (IllegalArgumentException e) {
				System.out.println("Error\n"+e.toString());
			} catch (IOException e) {
				System.out.println("Error\n"+e.toString());
			} 
		}while(true);

	}

}
