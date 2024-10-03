//crea un hashmap con el nombre de el pais como llave y el de su capital como contenido 
//abre un ciclo while en donde el usurio puede ingresar el nombre de un país
//En caso de ya tenerlo registrado en el hash map le mostrara la capital en caso contrario le pedida al usuario que ingrese la capital
//Y creara un nuevo registro con la información dada
//se saldar del ciclo while hasta que usuario escriba la palabra salir
import java.util.HashMap;
import java.util.Scanner;

public class Código7 {
	//se añadio el método main
	public static void main(String[] args) {
		//seimporto el scanner y se le agrego el System.in como parámetro
	    Scanner s = new Scanner(System.in);
	    //se importo el hashmap y se cambio el nombre de el hasmap a capitales y sus tipos de datos
	    HashMap<String, String> capitales = new HashMap<>();
	
	    capitales.put("Canadá", "Otawwa");
	    capitales.put("Estados Unidos", "Washington DC");
	    capitales.put("México", "México DF");
	    capitales.put("Belice", "Belmopán");
	    capitales.put("Costa rica", "San José");
	    //se le agergo su capital al elemento
	    capitales.put("El Salvador","San Salvador");
	    capitales.put("Guatemala", "Ciudad de Guatemala");
	    capitales.put("Honduras", "Tegucigalpa");
	    capitales.put("Nicaragua", "Managua");
	    capitales.put("Panamá", "Panamá");
	   // se corrigio la escritura de la plabara String
	    String c = "";
	    do {
	    	//se corrigio la escritura del metodo sysout
	    	System.out.println("Escribe el nombre de un país y te diré su capital: ");
	    	System.out.println("Si deseas salir de la aplicación escriba la palabra 'salir'");
	    	//se cambio el tipo de entrada que recine el escaner
	    	c = s.nextLine();
	    	//se corrigio el metodo equals 
	    	if (!c.equals("salir")) {
	    		//se cambio el nombre del map que llama y que busque por llave
	    		if (capitales.containsKey(c)) {
	    			//se corrigio la escritura del metodo sysout 
	    			System.out.print("La capital de " + c);
	    			//se cambio el metodo para conseguir el nombre de la capital
	    			System.out.println(" es " + capitales.get(c));
		        } else {
		        	System.out.print("No conozco la respuesta ");
		        	System.out.print("¿cuál es la capital de " + c + "?: ");
		        	String ca = s.nextLine();
		        	capitales.put(c, ca);
		        	System.out.println("Gracias por enseñarme nuevas capitales");
		        }
		      }
	      //se corrigio la escritura de la palabra while y se le agrego un parentesis faltante
	    } while (!c.equals("salir"));
	  
	}
}
