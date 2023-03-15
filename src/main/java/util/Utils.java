package util;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {
	
	/**
	 * Método que valida que un dni introducido tenga el formato correcto.
	 * @param dni , el DNI a validar.
	 * @return un boolean true si el formato es válido o false si no lo es.
	 */
	public static boolean validaDni(String dni) {
		boolean valido = false;

				  if (dni.matches("^[0-9]{8}[TRWAGMYFPDXBNJZSQVHLCKE]$")) {
					  valido=true;
				  }
		 return valido;
	  }
	/**
	 * Método que valida que la letra de un DNI introducido sea correcta.
	 * @param dni , es el DNI ya introducido y comprobado que es uno 
	 * @return un boolean true si la letra es válida o false si no lo es.
	 */
	public static boolean validaLetraDni(String dni) {
	        boolean isValid = false;
	        // Expresión regular para validar el formato del DNI (8 números seguidos de una letra)
	        Pattern pattern = Pattern.compile("\\d{8}[A-HJ-NP-TV-Z]");
	        Matcher matcher = pattern.matcher(dni);
	        
	        if (matcher.matches()) {
	            int dniNumerico = Integer.parseInt(dni.substring(0, 8)); // Obtener el número de DNI como un entero
	            char dniLetra = dni.charAt(8); // Obtener la letra del DNI
	            char[] letras = "TRWAGMYFPDXBNJZSQVHLCKE".toCharArray(); // Array con las letras correspondientes a cada número de DNI
	            char letraCorrecta = letras[dniNumerico % 23]; // Obtener la letra correspondiente al número de DNI
	            
	            if (dniLetra == letraCorrecta) {
	                isValid = true;
	            }
	        }
		return isValid;
		
	}

/**
 * Método que valida que un número esté en formato correcto.
 * @param phoneNumber , el número de teléfono a validar.
 * @return un boolean true si es válido o false si no lo es.
 */
	public static boolean validaNumeroTelefono(String phoneNumber) {
		boolean valido=false;

	        // Expresión regular para validar números de teléfono internacionales
	        String regex = "^\\+(?:[0-9]●?){6,14}[0-9]$";
	        
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(phoneNumber);

	        if (matcher.matches()) {
	            valido = true;
	        }
		return valido; 
	}
	
	/**
	 * Método que valida que un email tenga el formato correcto.
	 * @param email , el email a validar.
	 * @return un boolean true si es válido o false si no lo es.
	 */
	public static boolean validaEmail(String email) {
		boolean valido=false;
				  if (email.matches("^[a-zA-Z0-9._%+-]+@+.$")) {
					  valido=true;
				  }
				  
		return valido;
	}


/**
 * Método que valida que una fecha introducida esté en formato correcto.
 * @param msg es el mensaje que queremos meter
 * @return devolvera la fecha cuando esta este correcta y en el formato correcto
 */

	public static boolean validaFecha(String fechaAIngresar) {
		boolean valido= false;
			try {
				  LocalDate fechaIngresada = LocalDate.parse(fechaAIngresar);
		            System.out.println("Fecha ingresada: " + fechaIngresada);
		            valido=true;
		        } catch (Exception e) {
		            Utils.showMessage("Formato de fecha inválido. Asegúrese de ingresar la fecha en formato AAAA-MM-DD.");
		            
		        }
		return valido;
	}
	/**
	 * Método que valida que una hora esté en formato correcto.
	 * @param horaTexto , la hora introducida por el usuario.
	 * @return un boolean true si la hora es correcta y false si es incorrecta.
	 */
	public static boolean validaHora(String horaTexto) {
		boolean isValid = false;
	      
	            // Validar formato de hora y minutos
	        if (horaTexto.matches("^([0-1]?[0-9]|2[0-3]):[0-5][0-9]$")) {
	            isValid = true;
	        }
	       
	        return isValid;
	}
/**
 * Método que valida que un nombre contenga solo letras.
 * @param nombre , el nombre a validar.
 * @return un boolean true si es válido y false si no lo es.
 */
	
	public static boolean compruebaNombre(String nombre) {
        boolean isValid = false;
		
            // Expresión regular para validar el nombre
            String regex = "^[a-zA-Z\\s]*$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(nombre);

            if (!matcher.matches()) {
            }else {
            isValid = true;
            }
        return isValid;
	}
	
	/**
	 * Método que muestra un mensaje.
	 * @param msg , el mensaje a mostrar.
	 */
	
	public static void showMessage(String msg) {
		System.out.println(msg);
	}
	
	/**
	 * Método que valida que un número introducido sea entero.
	 * @param msg , el mensaje a mostrar para pedir el número.
	 * @return , el número entero validado.
	 */
	
	public static int intInput(String msg) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		boolean isCorrect = false;
		int number = 0;
		
		do {
			System.out.print(msg);
			try {
				number = sc.nextInt();
				isCorrect = true;
			}catch(Exception InputMismatchException){
				System.out.println("");
				System.out.println("Incorrect input");
				System.out.println("");
				sc.nextLine();
			}
		}while(!isCorrect);
		
		return number;
	}
	
	/**
	 * Método que valida que un número introducido sea decimal.
	 * @param msg , el mensaje a mostrar para pedir el número.
	 * @return , el número decimal validado.
	 */
	
	public static double doubleInput(String msg) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		boolean isCorrect = false;
		double number = 0;
		
		do {
			System.out.print(msg);
			try {
				number = sc.nextDouble();
				isCorrect = true;
			}catch(Exception InputMismatchException){
				System.out.println("");
				System.out.println("Incorrect input");
				System.out.println("");
				sc.nextLine();
			}
		}while(!isCorrect);
		
		return number;
	}
	
	/**
	 * Método que valida que han introducido una cadena de texto.
	 * @param msg , el mensaje a mostrar para pedir el texto.
	 * @return , la cadena de texto que el usuario ha introducido.
	 */
	
	public static String stringInput(String msg) {
		System.out.print(msg);
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
}
