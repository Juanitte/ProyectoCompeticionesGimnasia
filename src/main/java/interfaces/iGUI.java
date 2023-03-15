package interfaces;

public interface iGUI {

	void muestraMenuPrincipal();				//Este es el menú Principal. Tiene 4 opciones: 1 - Gestión Competiciones. 2 - Gestión Gimnastas. 3 - Idioma. 0 - Salir.
	void muestraMenuCompeticiones();			//Este es el menú de gestión de competiciones. Tiene 4 opciones: 1 - Añadir Competición. 2 - Buscar Competición. 3 - Mostrar Competiciones. 0 - Salir.
	void muestraMenuAgregarCompeticion();		//Este es el menú de agregar competición. Contiene información sobre los campos a rellenar(Nombre - Fecha).
	void muestraMenuBuscarCompeticion();		//Este es el menú de buscar competición. Tiene 3 opciones: 1 - Buscar por Nombre. 2 - Buscar por Fecha. 0 - Salir.
	void muestraMenuAccionesCompeticion();		//Este es el menú de acciones de competición. Tiene 6 opciones: 1 - Agregar Prueba. 2 - Buscar Prueba. 3 - Mostrar Pruebas. 4 - Modificar Competición. 5 - Eliminar Competición. 0 - Salir.
	void muestraMenuAgregarPrueba();			//Este es el menú de agregar prueba. Contiene información sobre los campos a rellenar(Nombre - Tipo - Categoría - Aparato).
	void muestraMenuAgregarTipo();				//Este es el menú de agregar tipo. Tiene 2 opciones: 1 - Individual. 2 - De Grupo.
	void muestraMenuAgregarCategoria();			//Este es el menú de agregar categoría. Tiene 6 opciones: 1 - Prebenjamín. 2 - Benjamín. 3 - Alevín. 4 - Infantil. 5 - Junior. 6 - Senior.
	void muestraMenuAgregarAparato();			//Este es el menú de agregar aparato. Tiene 5 opciones: 1 - Mazas. 2 - Aro. 3 - Cinta. 4 - Cuerda. 5 - Manos Libres.
	void muestraMenuBuscarPrueba();				//Este es el menú de buscar prueba. Contiene información sobre los campos a rellenar(Tipo - Categoría - Aparato).
	void muestraMenuAccionesPrueba();			//Este es el menú de acciones de prueba. Tiene  opciones: 1 - Agregar Participación. 2 - Buscar Participación. 3 - Mostrar Participaciones. 4 - Modificar Prueba. 5 - Eliminar Prueba. 0 - Salir.
	void muestraMenuAgregarParticipacion();		//Este es el menú de agregar participación. Contiene información sobre los campos a rellenar(Participante - Hora).
	void muestraMenuAgregarParticipante();		//Este es el menú de agregar participante a un grupo. Tiene 2 opciones: 1 - Agregar Participante. 0 - Salir.
	void muestraMenuBuscarParticipacion();		//Este es el menú de buscar participación. Tiene 3 opciones: 1 - Buscar por Dorsal. 2 - Buscar por Hora. 0 - Salir.
	void muestraMenuModificarPrueba();			//Este es el menú de modificar prueba. Contiene información sobre los campos a rellenar(Nombre).
	void muestraMenuModificarCompeticion();		//Este es el menú de modificar competición. Contiene información sobre los campos a rellenar(Nombre - Fecha).
	void muestraMenuConfirmacion();				//Este es el menú de confirmación. Debe preguntar al usuario si está seguro de realizar esa acción. Tiene 2 opciones: 1 - Si. 2 - No.
	void muestraMenuGimnastas();				//Este es el menú de gestión de gimnastas. Tiene  opciones: 1 - Añadir Gimnasta. 2 - Buscar Gimnasta. 3 - Mostrar Gimnastas. 0 - Salir.
	void muestraMenuAgregarGimnasta();			//Este es el menú de agregar gimnasta. Contiene información sobre los campos a rellenar(DNI - Nombre - Email - Teléfono - Categoría - Club).
	void muestraMenuBuscarGimnasta();			//Este es el menú de buscar gimnasta. Tiene 4 opciones: 1 - Buscar por DNI. 2 - Buscar por Teléfono. 3 - Buscar por Email. 0 - Salir.
	void muestraMenuAccionesGimnasta();			//Este es el menú de acciones de gimnasta. Tiene  opciones: 1 - Modificar Gimnasta. 2 - Eliminar Gimnasta. 0 - Salir.
	void muestraMenuModificarGimnasta();		//Este es el menú de modificar gimnasta. Contiene información sobre los campos a rellenar(DNI - Nombre - Email - Teléfono - Categoría - Club).
	void muestraMenuIdioma();					//Este es el menú de idiomas. Tiene 3 opciones: 1 - Español. 2 - Inglés. 0 - Salir.
	
	// A partir de aquí se encarga Javi, que son los mismos menús pero en inglés.
	
	void muestraMenuPrincipalEN();				//Este es el menú Principal. Tiene 4 opciones: 1 - Gestión Competiciones. 2 - Gestión Gimnastas. 3 - Idioma. 0 - Salir.
	void muestraMenuCompeticionesEN();			//Este es el menú de gestión de competiciones. Tiene 4 opciones: 1 - Añadir Competición. 2 - Buscar Competición. 3 - Mostrar Competiciones. 0 - Salir.
	void muestraMenuAgregarCompeticionEN();		//Este es el menú de agregar competición. Contiene información sobre los campos a rellenar(Nombre - Fecha).
	void muestraMenuBuscarCompeticionEN();		//Este es el menú de buscar competición. Tiene 3 opciones: 1 - Buscar por Nombre. 2 - Buscar por Fecha. 0 - Salir.
	void muestraMenuAccionesCompeticionEN();	//Este es el menú de acciones de competición. Tiene 6 opciones: 1 - Agregar Prueba. 2 - Buscar Prueba. 3 - Mostrar Pruebas. 4 - Modificar Competición. 5 - Eliminar Competición. 0 - Salir.
	void muestraMenuAgregarPruebaEN();			//Este es el menú de agregar prueba. Contiene información sobre los campos a rellenar(Nombre - Tipo - Categoría - Aparato).
	void muestraMenuAgregarTipoEN();			//Este es el menú de agregar tipo. Tiene 2 opciones: 1 - Individual. 2 - De Grupo.
	void muestraMenuAgregarCategoriaEN();		//Este es el menú de agregar categoría. Tiene 6 opciones: 1 - Prebenjamín. 2 - Benjamín. 3 - Alevín. 4 - Infantil. 5 - Junior. 6 - Senior.
	void muestraMenuAgregarAparatoEN();			//Este es el menú de agregar aparato. Tiene 5 opciones: 1 - Mazas. 2 - Aro. 3 - Cinta. 4 - Cuerda. 5 - Manos Libres.
	void muestraMenuBuscarPruebaEN();			//Este es el menú de buscar prueba. Contiene información sobre los campos a rellenar(Tipo - Categoría - Aparato).
	void muestraMenuAccionesPruebaEN();			//Este es el menú de acciones de prueba. Tiene  opciones: 1 - Agregar Participación. 2 - Buscar Participación. 3 - Mostrar Participaciones. 4 - Modificar Prueba. 5 - Eliminar Prueba. 0 - Salir.
	void muestraMenuAgregarParticipacionEN();	//Este es el menú de agregar participación. Contiene información sobre los campos a rellenar(Participante - Hora).
	void muestraMenuAgregarParticipanteEN();	//Este es el menú de agregar participante a un grupo. Tiene 2 opciones: 1 - Agregar Participante. 0 - Salir.
	void muestraMenuBuscarParticipacionEN();	//Este es el menú de buscar participación. Tiene 3 opciones: 1 - Buscar por Dorsal. 2 - Buscar por Hora. 0 - Salir.
	void muestraMenuModificarPruebaEN();		//Este es el menú de modificar prueba. Contiene información sobre los campos a rellenar(Nombre).
	void muestraMenuModificarCompeticionEN();	//Este es el menú de modificar competición. Contiene información sobre los campos a rellenar(Nombre - Fecha).
	void muestraMenuConfirmacionEN();			//Este es el menú de confirmación. Debe preguntar al usuario si está seguro de realizar esa acción. Tiene 2 opciones: 1 - Si. 2 - No.
	void muestraMenuGimnastasEN();				//Este es el menú de gestión de gimnastas. Tiene  opciones: 1 - Añadir Gimnasta. 2 - Buscar Gimnasta. 3 - Mostrar Gimnastas. 0 - Salir.
	void muestraMenuAgregarGimnastaEN();		//Este es el menú de agregar gimnasta. Contiene información sobre los campos a rellenar(DNI - Nombre - Email - Teléfono - Categoría - Club).
	void muestraMenuBuscarGimnastaEN();			//Este es el menú de buscar gimnasta. Tiene 4 opciones: 1 - Buscar por DNI. 2 - Buscar por Teléfono. 3 - Buscar por Email. 0 - Salir.
	void muestraMenuAccionesGimnastaEN();		//Este es el menú de acciones de gimnasta. Tiene  opciones: 1 - Modificar Gimnasta. 2 - Eliminar Gimnasta. 0 - Salir.
	void muestraMenuModificarGimnastaEN();		//Este es el menú de modificar gimnasta. Contiene información sobre los campos a rellenar(DNI - Nombre - Email - Teléfono - Categoría - Club).
	void muestraMenuIdiomaEN();					//Este es el menú de idiomas. Tiene 3 opciones: 1 - Español. 2 - Inglés. 0 - Salir.
}
