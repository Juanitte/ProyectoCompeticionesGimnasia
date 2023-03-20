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
	
	
	

	//A partir de aquí es la traducción al inglés y se encarga Javi, has terminado.
	
	
	

	public void muestraMenuPrincipalEN() {
		// TODO Auto-generated method stub
		
	}

	public void muestraMenuCompeticionesEN() {
		// TODO Auto-generated method stub
		
	}

	public void muestraMenuAgregarCompeticionEN() {
		// TODO Auto-generated method stub
		
	}

	public void muestraMenuBuscarCompeticionEN() {
		// TODO Auto-generated method stub
		
	}

	public void muestraMenuAccionesCompeticionEN() {
		// TODO Auto-generated method stub
		
	}

	public void muestraMenuAgregarPruebaEN() {
		// TODO Auto-generated method stub
		
	}

	public void muestraMenuAgregarTipoEN() {
		// TODO Auto-generated method stub
		
	}

	public void muestraMenuAgregarCategoriaEN() {
		// TODO Auto-generated method stub
		
	}

	public void muestraMenuAgregarAparatoEN() {
		// TODO Auto-generated method stub
		
	}

	public void muestraMenuBuscarPruebaEN() {
		// TODO Auto-generated method stub
		
	}

	public void muestraMenuAccionesPruebaEN() {
		// TODO Auto-generated method stub
		
	}

	public void muestraMenuAgregarParticipacionEN() {
		// TODO Auto-generated method stub
		
	}

	public void muestraMenuAgregarParticipanteEN() {
		// TODO Auto-generated method stub
		
	}

	public void muestraMenuBuscarParticipacionEN() {
		// TODO Auto-generated method stub
		
	}

	public void muestraMenuModificarPruebaEN() {
		// TODO Auto-generated method stub
		
	}

	public void muestraMenuModificarCompeticionEN() {
		// TODO Auto-generated method stub
		
	}

	public void muestraMenuConfirmacionEN() {
		// TODO Auto-generated method stub
		
	}

	public void muestraMenuGimnastasEN() {
		// TODO Auto-generated method stub
		
	}

	public void muestraMenuAgregarGimnastaEN() {
		// TODO Auto-generated method stub
		
	}

	public void muestraMenuAccionesGimnastaEN() {
		// TODO Auto-generated method stub
		
	}

	public void muestraMenuModificarGimnastaEN() {
		// TODO Auto-generated method stub
		
	}

	public void muestraMenuIdiomaEN() {
		// TODO Auto-generated method stub
		
	}

	public void muestraMenuPuntosEN() {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	

}
