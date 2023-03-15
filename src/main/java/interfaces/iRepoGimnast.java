package interfaces;

import model.DTO.Category;
import model.DTO.Gimnast;

public interface iRepoGimnast {

	Gimnast buscarGimnastaPorDNI(String dni);
	Gimnast buscarGimnastaPorTelefono(String phone);
	Gimnast buscarGimnastaPorEmail(String email);
	boolean crearGimnasta(String dni, String name, String email, Category category, String club,String phone);
	void mostrarGimnastas();
	void modificarGimnasta(String dni, String name, String email, Category category, String club,String phone);
	Gimnast eliminarGimnasta(Gimnast gimnast);
	
	//Solo el dni tiene que llevar equals() para comprobar que no haya repetido.
	
}
