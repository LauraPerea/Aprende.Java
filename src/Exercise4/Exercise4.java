package Exercise4;
import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		

		        Scanner scanner = new Scanner(System.in);
		        
		  
		        final double TIPO_CAMBIO = 166.386;
		        
		        
		        System.out.print("Introduce la cantidad en euros que deseas convertir: ");
		        double euros = scanner.nextDouble();
		        
		     
		        double pesetas = euros * TIPO_CAMBIO;
		        
		    
		        System.out.printf("%.2f euros son %.2f pesetas%n", euros, pesetas);
		        
		        scanner.close();
		    }
		
	

	}
	


