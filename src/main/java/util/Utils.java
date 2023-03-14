package util;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {
	
	/**
	 * 
	 * @param msg sera el mensaje que queremos ponerle
	 * @return el DNI ya validado
	 */
	public String IntroduceDNI(String msg) {
		Scanner teclado = new Scanner(System.in);
		boolean valido=false;
		String DNI="";

		 do {
			 try {
				 System.out.println(msg);
				 DNI=teclado.nextLine();
				  if (DNI.matches("^[0-9]{8}[TRWAGMYFPDXBNJZSQVHLCKE]$")) {
					  valido=true;
				  }
			} catch (Exception e) {
				 System.out.println("No has instroducido un DNI valido");
	                teclado.nextLine(); // Limpiamos el buffer del Scanner
			}
			 
		 }while(!valido);
		 validaDni(DNI);
		 return DNI;
	  }
	/**
	 * 
	 * @param DNI es el DNI ya introducido y comprobado que es uno 
	 * @return Devolvera el DNI una vez ya se compruebe que es un DNI exsistente
	 */
	public String validaDni(String DNI) {
	        
	        // Expresión regular para validar el formato del DNI (8 números seguidos de una letra)
	        Pattern pattern = Pattern.compile("\\d{8}[A-HJ-NP-TV-Z]");
	        Matcher matcher = pattern.matcher(DNI);
	        
	        if (matcher.matches()) {
	            int dniNumerico = Integer.parseInt(DNI.substring(0, 8)); // Obtener el número de DNI como un entero
	            char dniLetra = DNI.charAt(8); // Obtener la letra del DNI
	            char[] letras = "TRWAGMYFPDXBNJZSQVHLCKE".toCharArray(); // Array con las letras correspondientes a cada número de DNI
	            char letraCorrecta = letras[dniNumerico % 23]; // Obtener la letra correspondiente al número de DNI
	            
	            if (dniLetra == letraCorrecta) {
	                System.out.println("El DNI es valido.");
	            } else {
	                System.out.println("El DNI no es valido.");
	                IntroduceDNI("Introduce el DNI Correcto");
	            }
	        } else {
	            System.out.println("El DNI no tiene un formato valido.");
	        }
		return DNI;
		
	}


	public void IntroduceCategoria() {
		// TODO Auto-generated method stub
		
	}

/**
 * 
 * @param msg es el mensaje que queremos poner en el syso
 * @return devolvera el numero de telefono ya validado
 */
	public String leeNumeroTelefono(String msg) {
		Scanner teclado = new Scanner(System.in);
		boolean valido=false;
		String phoneNumber =teclado.nextLine();// número de teléfono a validar

	        // Expresión regular para validar números de teléfono internacionales
	        String regex = "^\\+(?:[0-9]●?){6,14}[0-9]$";
	        
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(phoneNumber);

	        if (matcher.matches()) {
	            System.out.println("El número de teléfono es válido");
	        } else {
	            System.out.println("El número de teléfono no es válido");
	            leeNumeroTelefono(msg);
	        }
		return phoneNumber; 
	}
	/**
	 * 
	 * @param msg es el mensaje que queremos poner en el syso
	 * @return devolvera el  correo electronico una vez metamos una correcta
	 */
	public String LeeCorreoElectronico(String msg) {
		Scanner teclado = new Scanner(System.in);
		String Gmail ="";
		boolean valido=false;
		 do {
			 try {
				 do {
				 System.out.println(msg);
				 Gmail=teclado.nextLine();
				  if (Gmail.matches("^[a-zA-Z0-9._%+-]+@+.$")) {
					  valido=true;
				  }
				 } while (valido);
			} catch (Exception e) {
				 System.out.println("No has instroducido correo valido");
	                teclado.nextLine(); // Limpiamos el buffer del Scanner
			}
			 
		 }while(!valido);
		return Gmail;
	}


	public void AparatoAElegir() {
		// TODO Auto-generated method stub
		
	}


/**
 * 
 * @param msg es el mensaje que queremos meter
 * @return devolvera la fecha cuando esta este correcta y en el formato correcto
 */

	public String IntroduceFecha(String msg) {
		Scanner teclado=new Scanner(System.in);
		String FechaAIngresar=null;
		boolean valido= false;
		do {
			try {
				System.out.println(msg);
				System.out.println("la fecha del formato es  AAAA-MM-DD:");
				FechaAIngresar=teclado.nextLine();
				  LocalDate fechaIngresada = LocalDate.parse(FechaAIngresar);
		            System.out.println("Fecha ingresada: " + fechaIngresada);
		            valido=true;
		        } catch (Exception e) {
		            System.err.println("Formato de fecha invalido. Asegúrese de ingresar la fecha en formato AAAA-MM-DD.");
		            
		        }
		}while(!valido);
		return FechaAIngresar;
	}
	/**
	 * 
	 * @param msg es el mensaje que queremos meter
	 * @return devolvera la hora cuando esta este correcta y en el formato correcto
	 */
	public String IntroducdirHora(String msg) {
		   Scanner scanner = new Scanner(System.in);//
	        System.out.print(msg);
	        String horaTexto = scanner.nextLine();

	        try {
	            // Validar formato de hora y minutos
	            if (!horaTexto.matches("^([0-1]?[0-9]|2[0-3]):[0-5][0-9]$")) {
	                throw new FormatoHoraInvalidoException("Formato de hora invalido. Asegúrese de ingresar la hora en formato HH:MM.");
	            }

	            // Extraer valores de hora y minutos
	            String hora = horaTexto.substring(0, 2);
	            String minutos = horaTexto.substring(3, 5);
	            System.out.println("Hora: " + hora);
	            System.out.println("Minutos: " + minutos);
	        } catch (FormatoHoraInvalidoException e) {
	            System.err.println(e.getMessage());
	        }
	        return horaTexto;
	}
	  public class FormatoHoraInvalidoException extends Exception {
	        public FormatoHoraInvalidoException(String mensaje) {
	            super(mensaje);
	        }
	    }
	

	public void ComprobarCompeticion() {
		// TODO Auto-generated method stub
		
	}

	public void ComprobarPrueba() {
		// TODO Auto-generated method stub
		
	}


	public void ComprobarGimnasta() {
		// TODO Auto-generated method stub
		
	}
/**
 * 
 * @param msg este sera el mensaje que queremos meter en nuestro syso
 * @return devolvera el nombre cuando este sea uno correcto
 */
	
	public String CompruebaNombre(String msg) {
		Scanner scanner = new Scanner(System.in);
        System.out.print(msg);
        String nombre = scanner.nextLine();
        
        try {
            // Expresión regular para validar el nombre
            String regex = "^[a-zA-Z\\s]*$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(nombre);

            if (!matcher.matches()) {
                throw new IllegalArgumentException("Nombre invalido");
            }
            
            System.out.println("Nombre valido: " + nombre);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return nombre;
	}

/**
 * 
 * @param msg introduce el mensaje  que queremos meter en nuestro syso
 * @return devolvera la opcion que selecionemos
 * esta funcion se asegura de que las opciones que ponemos para el menu sea las correctas
 */

	public int compruebaMenu(String msg) {
		Scanner teclado =new Scanner(System.in);
		boolean valido=false;
		int numero=0;
		try {
			do {
				System.out.println(msg);
				numero=teclado.nextInt();
				if(numero>=0 || numero<=5);
				valido=true;
				
			} while (!valido);
			
		}catch (Exception e) {
			System.out.println("no has introducido una opcion valida");
		}
		return numero;
	}
	public static void showmessage(String msg) {
		System.out.println(msg);
	}
}
