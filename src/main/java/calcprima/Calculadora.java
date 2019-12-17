/**
 * 
 */
package calcprima;
/**
 * @author dcmonten
 * *
 */
public class Calculadora {
	
	/** La tarifa base de la prima. */
	private static final double TARIFA_BASE = 500.0;
	
	/** El factor de riesgo por rango de edad. */
	private static final double[] FACTOR_EDAD = {2.8,1.8,1.0,0.8,1.5};
	
	/** La reduccion aplicable por rango de edad. */
	private static final int[] REDUCCION={50,50,100,150,200};
	 
    
    /**
     * Instancia una nueva calculadora.
     */
    public Calculadora() {
		
	}

	/**
	 * Retornar prima.
	 *
	 * @param edad, la edad del conductor
	 * @param puntos, los puntos en la licencia del conductor
	 * @return la prima calculada
	 */
	public double retornar_prima(int edad, int puntos) throws IllegalArgumentException {   	
    	if (puntos < 1 || puntos > 30) 
    	{
    		throw new IllegalArgumentException("Puntos fuera del rango, deben estar entre 1 y 30.");   		
    	}
    	else
    	{
            double pr = calcular_prima(edad,puntos);
            if (pr>0) 
            {
            	System.out.println("El valor es de "+pr);
            	return pr;
            }
            else 
            {
            	throw new IllegalArgumentException("La edad debe estar entre 18 y 90 a�os."); 
            }
    	}
    }
    
	
    /**
     * Calcular prima.
     *
     * @param edad, la edad del conductor
     * @param puntos, los puntos en la licencia del conductor
     * @return la prima calculada
     */
    public double calcular_prima(int edad, int puntos){
        
        int indice = rango_edad(edad);
        
        if (indice>=0)
        {
            boolean red = aplica_reduccion(indice, puntos);
            double fe = FACTOR_EDAD[indice];
            double redux = (red) ? REDUCCION[indice]:0.0;
            return TARIFA_BASE*fe - redux;
            
        } 
        else 
        {
        	return indice;    
        }
        
    }
    
    /**
     * Rango edad.
     *
     * @param edad, la edad del conductor
     * @return el �ndice que debe usarse en el arreglo, de acuerdo a la edad
     */
    public int rango_edad(int edad){
    
        if (edad < 18 || edad > 90)  {
            return -1;
        }      
            
        else if(edad >= 18 && edad < 25)
        {
            return 0;
        }     
            
        else if(edad >= 25 && edad < 35)
        {
            return 1;
        }     
            
        else if(edad >= 35 && edad < 45)
        {
            return 2;
        }     
            
        else if(edad >= 45 && edad < 65)
        {
            return 3;
        }
           
        else
        {
            return 4;
        }
    
    }
	
    
 
    /**
     * Aplica reduccion.
     *
     * @param index_edad, el �ndice de la edad, calculado con rango_edad
     * @param puntos, los puntos en la licencia del conductor
     * @return true, si no se han perdido muchos puntos y se puede aplicar la reducci�n
     */
    public boolean aplica_reduccion(int index_edad, int puntos){
        
        boolean check = true;
        
        int perdidos = 30 - puntos;
        
        switch(index_edad) {
            case 0:
                check = (perdidos <=1);
                break;
            case 1:
               check = (perdidos <=3);
                break;
            case 2:
              check = (perdidos <=5);
                break;
            case 3:
              check = (perdidos <=7);
                break;
            case 4:
              check = (perdidos <=5);
                break;
            default:
            	throw new IllegalArgumentException("Edad fuera del rango entre 18 y 90 a�os.");
        }
        
        return check;
    
    }

}
