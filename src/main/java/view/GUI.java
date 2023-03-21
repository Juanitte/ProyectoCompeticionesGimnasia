package view;

import interfaces.iGUI;
import util.Utils;

public class GUI implements iGUI {

	public void muestraMenuPrincipal() {
		Utils.showMessage("");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||         Competiciones Gimnasia        ||");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||-------------------------------------- ||");
		Utils.showMessage("||       1 - Gestión Competiciones       ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       2 - Gestión Gimnastas           ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       3 - Idioma                      ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       0 - Salir                       ||");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("");
		
	}

	public void muestraMenuCompeticiones() {
		Utils.showMessage("");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||          Gestor Competiciones         ||");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||-------------------------------------- ||");
		Utils.showMessage("||       1 - Añadir Competición          ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       2 - Buscar Competición          ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       3 - Mostrar Competiciones       ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       0 - Salir                       ||");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("");
		
	}

	public void muestraMenuAgregarCompeticion() {
		Utils.showMessage("");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||           Añadir Competición          ||");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||-------------------------------------- ||");
		Utils.showMessage("||              - Nombre -               ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||            - Descripción -            ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||              - Fecha -                ||");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("");
		
	}

	public void muestraMenuBuscarCompeticion() {
		Utils.showMessage("");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||           Buscar Competición          ||");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||-------------------------------------- ||");
		Utils.showMessage("||       1 - Buscar por nombre           ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       2 - Buscar por fecha            ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       0 - Salir                       ||");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("");
		
	}

	public void muestraMenuAccionesCompeticion() {
		Utils.showMessage("");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||          Acciones Competición         ||");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||-------------------------------------- ||");
		Utils.showMessage("||       1 - Añadir Prueba               ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       2 - Buscar Prueba               ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       3 - Mostrar Pruebas             ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       4 - Modificar Competición       ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       5 - Eliminar Competición        ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       0 - Salir                       ||");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("");
		
	}

	public void muestraMenuAgregarPrueba() {
		Utils.showMessage("");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||             Añadir Prueba             ||");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||-------------------------------------- ||");
		Utils.showMessage("||              - Nombre -               ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||               - Tipo -                ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||             - Categoría -             ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||              - Aparato -              ||");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("");
		
	}

	public void muestraMenuAgregarTipo() {
		Utils.showMessage("");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||             Escoger Tipo              ||");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||-------------------------------------- ||");
		Utils.showMessage("||       1 - Individual                  ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       2 - Grupo                       ||");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("");
		
	}

	public void muestraMenuAgregarCategoria() {
		Utils.showMessage("");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||           Escoger Categoría           ||");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||-------------------------------------- ||");
		Utils.showMessage("||       1 - Prebenjamín                 ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       2 - Benjamín                    ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       3 - Alevín                      ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       4 - Infantil                    ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       5 - Junior                      ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       6 - Senior                      ||");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("");
		
	}

	public void muestraMenuAgregarAparato() {
		Utils.showMessage("");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||            Escoger Aparato            ||");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||-------------------------------------- ||");
		Utils.showMessage("||       1 - Mazas                       ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       2 - Aro                         ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       3 - Cinta                       ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       4 - Cuerda                      ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       5 - Manos Libres                ||");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("");
		
	}

	public void muestraMenuBuscarPrueba() {
		Utils.showMessage("");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||             Buscar Prueba             ||");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||-------------------------------------- ||");
		Utils.showMessage("||               - Tipo -                ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||             - Categoría -             ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||              - Aparato -              ||");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("");
		
	}

	public void muestraMenuAccionesPrueba() {
		Utils.showMessage("");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||            Acciones Prueba            ||");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||-------------------------------------- ||");
		Utils.showMessage("||       1 - Añadir Participación        ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       2 - Buscar Participación        ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       3 - Mostrar Participaciones     ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       4 - Modificar Prueba            ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       5 - Eliminar Prueba             ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       6 - Menú Puntuaciones           ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       0 - Salir                       ||");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("");
		
	}

	public void muestraMenuAgregarParticipacion() {
		Utils.showMessage("");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||          Añadir Participación         ||");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||-------------------------------------- ||");
		Utils.showMessage("||                - Hora -               ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||           - Participante/s -          ||");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("");
		
	}

	public void muestraMenuAgregarParticipante() {
		Utils.showMessage("");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||          Añadir Participante          ||");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||-------------------------------------- ||");
		Utils.showMessage("||       1 - Añadir Participante         ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       0 - Salir                       ||");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("");
		
	}

	public void muestraMenuBuscarParticipacion() {
		Utils.showMessage("");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||          Buscar Participación         ||");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||-------------------------------------- ||");
		Utils.showMessage("||       1 - Buscar por dorsal           ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       2 - Buscar por hora             ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       0 - Salir                       ||");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("");
		
	}

	public void muestraMenuModificarPrueba() {
		Utils.showMessage("");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||            Modificar Prueba           ||");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||-------------------------------------- ||");
		Utils.showMessage("||               - Nombre -              ||");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("");
		
	}

	public void muestraMenuModificarCompeticion() {
		Utils.showMessage("");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||         Modificar Competición         ||");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||-------------------------------------- ||");
		Utils.showMessage("||               - Nombre -              ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||               - Fecha -               ||");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("");
		
	}

	public void muestraMenuConfirmacion() {
		Utils.showMessage("");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||            ¿Estas seguro/a?           ||");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||-------------------------------------- ||");
		Utils.showMessage("||       1 - Si                          ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       2 - No                          ||");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("");
		
	}

	public void muestraMenuGimnastas() {
		Utils.showMessage("");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||           Gestión Gimnastas           ||");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||-------------------------------------- ||");
		Utils.showMessage("||       1 - Añadir Gimnasta             ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       2 - Buscar Gimnasta             ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       3 - Mostrar Gimnastas           ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       0 - Salir                       ||");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("");
		
	}

	public void muestraMenuAgregarGimnasta() {
		Utils.showMessage("");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||            Añadir Gimnasta            ||");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||-------------------------------------- ||");
		Utils.showMessage("||                - DNI -                ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||              - Nombre -               ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||               - Email -               ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||             - Teléfono -              ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||             - Categoría -             ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||               - Club -                ||");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("");
		
	}

	public void muestraMenuAccionesGimnasta() {
		Utils.showMessage("");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||           Acciones Gimnasta           ||");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||-------------------------------------- ||");
		Utils.showMessage("||       1 - Modificar Gimnasta          ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       2 - Eliminar Gimnasta           ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       0 - Salir                       ||");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("");
		
	}

	public void muestraMenuModificarGimnasta() {
		Utils.showMessage("");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||          Modificar Gimnasta           ||");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||-------------------------------------- ||");
		Utils.showMessage("||                - DNI -                ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||              - Nombre -               ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||               - Email -               ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||             - Teléfono -              ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||             - Categoría -             ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||               - Club -                ||");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("");
		
	}

	public void muestraMenuIdioma() {
		Utils.showMessage("");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||              Menú Idioma              ||");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||-------------------------------------- ||");
		Utils.showMessage("||       1 - Español                     ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       2 - Inglés                      ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       0 - Salir                       ||");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("");
		
	}
	
	public void muestraMenuPuntos() {
		Utils.showMessage("");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||            Menú Puntuación            ||");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||-------------------------------------- ||");
		Utils.showMessage("||       1 - Puntuar                     ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       2 - Ver Ganador                 ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       0 - Salir                       ||");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("");
	}
	
	
	

	//Versión en Inglés.
	
	
	public void muestraMenuPrincipalEN() {
		Utils.showMessage("");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||               Main Menu               ||");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||-------------------------------------- ||");
		Utils.showMessage("||       1 - Competition Management      ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       2 - Gimnast Manager             ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       3 - Language                    ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       0 - End                         ||");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("");
		
	}

	public void muestraMenuCompeticionesEN() {
		Utils.showMessage("");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||           Competition Menu            ||");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||-------------------------------------- ||");
		Utils.showMessage("||       1 - Add Competition             ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       2 - Search Competition          ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       3 - Show Competitions           ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       0 - Back                        ||");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("");
		
	}

	public void muestraMenuAgregarCompeticionEN() {
		Utils.showMessage("");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||            Add Competition            ||");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||-------------------------------------- ||");
		Utils.showMessage("||              - Name -                 ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||           - Description -             ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||              - Date -                 ||");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("");
		
	}

	public void muestraMenuBuscarCompeticionEN() {
		Utils.showMessage("");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||           Filter Competition          ||");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||-------------------------------------- ||");
		Utils.showMessage("||       1 - Filter by Name              ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       2 - Filter by Date              ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       0 - Back                        ||");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("");
		
	}

	public void muestraMenuAccionesCompeticionEN() {
		Utils.showMessage("");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||         	Competition Actions         ||");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||-------------------------------------- ||");
		Utils.showMessage("||       1 - Add trial                   ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       2 - Filter trials               ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       3 - Show Trials                 ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       4 - Modify Competition          ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       5 - Delete Competition          ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       0 - Back                        ||");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("");
		
	}

	public void muestraMenuAgregarPruebaEN() {
		Utils.showMessage("");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||               Add Trial               ||");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||-------------------------------------- ||");
		Utils.showMessage("||               - Name -                ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||               - Type -                ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||              - Category -             ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||               - Gadget -              ||");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("");
		
	}

	public void muestraMenuAgregarTipoEN() {
		Utils.showMessage("");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||              Choose Type              ||");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||-------------------------------------- ||");
		Utils.showMessage("||       1 - Individual                  ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       2 - Group                       ||");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("");
		
	}

	public void muestraMenuAgregarCategoriaEN() {
		Utils.showMessage("");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||             Choose Category           ||");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||-------------------------------------- ||");
		Utils.showMessage("||       1 - Prebenjamin                 ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       2 - Benjamin                    ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       3 - Juvenile                    ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       4 - Youth                       ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       5 - Junior                      ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       6 - Senior                      ||");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("");
		
	}

	public void muestraMenuAgregarAparatoEN() {
		Utils.showMessage("");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||            Choose Gadget              ||");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||-------------------------------------- ||");
		Utils.showMessage("||       1 - Mace                        ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       2 - Ring                        ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       3 - Ribbon                      ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       4 - Rope                        ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       5 - Free Hands                  ||");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("");
		
	}

	public void muestraMenuBuscarPruebaEN() {
		Utils.showMessage("");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||             Filter Trials             ||");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||-------------------------------------- ||");
		Utils.showMessage("||               - Type -                ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||             - Category -              ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||              - Gadget -               ||");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("");
		
	}

	public void muestraMenuAccionesPruebaEN() {
		Utils.showMessage("");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||            Trial Actions              ||");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||-------------------------------------- ||");
		Utils.showMessage("||       1 - Add Entry                   ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       2 - Filter Entry                ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       3 - Show Entries                ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       4 - Modify Trial                ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       5 - Delete Trial                ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       6 - Score Menu                  ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       0 - Back                        ||");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("");
		
	}

	public void muestraMenuAgregarParticipacionEN() {
		Utils.showMessage("");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||               Add Entry               ||");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||-------------------------------------- ||");
		Utils.showMessage("||                - Hour -               ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||            - Participant/s -          ||");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("");
		
	}

	public void muestraMenuAgregarParticipanteEN() {
		Utils.showMessage("");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||            Add participant            ||");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||-------------------------------------- ||");
		Utils.showMessage("||       1 - Add Participant             ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       0 - Back                        ||");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("");
		
	}

	public void muestraMenuBuscarParticipacionEN() {
		Utils.showMessage("");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||             Search Entry              ||");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||-------------------------------------- ||");
		Utils.showMessage("||       1 - Filter by number            ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       2 - Filter by hour              ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       0 - Back                        ||");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("");
		
	}

	public void muestraMenuModificarPruebaEN() {
		Utils.showMessage("");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||              Modify Trial             ||");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||-------------------------------------- ||");
		Utils.showMessage("||               - Name -                ||");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("");
		
	}

	public void muestraMenuModificarCompeticionEN() {
		Utils.showMessage("");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||           Modify Competition          ||");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||-------------------------------------- ||");
		Utils.showMessage("||               - Name -                ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||               - Date -                ||");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("");
		
	}

	public void muestraMenuConfirmacionEN() {
		Utils.showMessage("");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||            ¿Are you sure?             ||");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||-------------------------------------- ||");
		Utils.showMessage("||       1 - Yes                         ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       2 - No                          ||");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("");
		
	}

	public void muestraMenuGimnastasEN() {
		Utils.showMessage("");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||           Gestión Gimnastas           ||");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||-------------------------------------- ||");
		Utils.showMessage("||       1 - Add Gimnast                 ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       2 - Filter Gimnasts             ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       3 - Show Gimnasts               ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       0 - Back                        ||");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("");
		
	}

	public void muestraMenuAgregarGimnastaEN() {
		Utils.showMessage("");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||              Add Gimnast              ||");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||-------------------------------------- ||");
		Utils.showMessage("||                - DNI -                ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||               - Name -                ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||               - Email -               ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||               - Phone -               ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||              - Category -             ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||                - Club -               ||");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("");
		
	}

	public void muestraMenuAccionesGimnastaEN() {
		Utils.showMessage("");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||           Gimnast Actions             ||");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||-------------------------------------- ||");
		Utils.showMessage("||       1 - Modify Gimnast              ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       2 - Delete Gimnast              ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       0 - Back                        ||");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("");
		
	}

	public void muestraMenuModificarGimnastaEN() {
		Utils.showMessage("");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||             Modify Gimnast            ||");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||-------------------------------------- ||");
		Utils.showMessage("||                - DNI -                ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||                - Name -               ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||               - Email -               ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||               - Phone -               ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||             - Category -              ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||               - Club -                ||");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("");
		
	}

	public void muestraMenuIdiomaEN() {
		Utils.showMessage("");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||             Language Menu             ||");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||-------------------------------------- ||");
		Utils.showMessage("||       1 - Spanish                     ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       2 - English                     ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       0 - Back                        ||");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("");
		
	}
	
	public void muestraMenuPuntosEN() {
		Utils.showMessage("");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||              Score Menu               ||");
		Utils.showMessage("||                                       ||");
		Utils.showMessage("||-------------------------------------- ||");
		Utils.showMessage("||       1 - Give a Score                ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       2 - Show Winner                 ||");
		Utils.showMessage("||---------------------------------------||");
		Utils.showMessage("||       0 - Back                        ||");
		Utils.showMessage("+=========================================+");
		Utils.showMessage("");
	}
}
