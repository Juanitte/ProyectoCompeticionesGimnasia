package util;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {
	
	public String IntroduceDNI(String msg) {
		Scanner teclado = new Scanner(System.in);
		boolean valido=false;
		String DNI="";

		 do {
			 try {
				 System.out.println("Introduce el DNI");
				 DNI=teclado.nextLine();
				  if (!DNI.matches("^[0-9]{8}[TRWAGMYFPDXBNJZSQVHLCKE]$")) {
					  valido=true;
				  }
			} catch (Exception e) {
				 System.out.println("No has instroducido un DNI valido");
	                teclado.nextLine(); // Limpiamos el buffer del Scanner
			}
			 
		 }while(!valido);
		 return DNI;
	  }


	public void IntroduceCategoria() {
		// TODO Auto-generated method stub
		
	}


	public String leeNumeroTelefono(String msg) {
		Scanner teclado = new Scanner(System.in);
		boolean valido=false;
		
		return null;
	}


	public String LeeCorreoElectronico(String msg) {
		Scanner teclado = new Scanner(System.in);
		String Gmail ="";
		boolean valido=false;
		 do {
			 try {
				 System.out.println(msg);
				 Gmail=teclado.nextLine();
				  if (!Gmail.matches("^[a-zA-Z0-9._%+-]+@gmail.com$")) {
					  valido=true;
				  }
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




	public String IntroduceFecha() {
		Scanner teclado=new Scanner(System.in);
		String FechaAIngresar=null;
		boolean valido= false;
		do {
			try {
				System.out.println("Introduce la fecha de la competicion,");
				System.out.println("la fecha del formato es  AAAA-MM-DD:");
				FechaAIngresar=teclado.nextLine();
				  LocalDate fechaIngresada = LocalDate.parse(FechaAIngresar);
		            System.out.println("Fecha ingresada: " + fechaIngresada);
		        } catch (Exception e) {
		            System.err.println("Formato de fecha inválido. Asegúrese de ingresar la fecha en formato AAAA-MM-DD.");
		        }
		}while(!valido);
		return FechaAIngresar;
	}

	public String IntroducdirHora() {
		   Scanner scanner = new Scanner(System.in);
	        System.out.print("Ingrese la hora en formato HH:MM: ");
	        String horaTexto = scanner.nextLine();

	        try {
	            // Validar formato de hora y minutos
	            if (!horaTexto.matches("^([0-1]?[0-9]|2[0-3]):[0-5][0-9]$")) {
	                throw new FormatoHoraInvalidoException("Formato de hora inválido. Asegúrese de ingresar la hora en formato HH:MM.");
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

	
	public String CompruebaNombre(String msg) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        
        try {
            // Expresión regular para validar el nombre
            String regex = "^[a-zA-Z\\s]*$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(nombre);

            if (!matcher.matches()) {
                throw new IllegalArgumentException("Nombre inválido");
            }
            
            System.out.println("Nombre válido: " + nombre);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return nombre;
	}



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
}
