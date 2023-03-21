package interfaces;

import model.DTO.Category;
import model.DTO.Gimnast;

public interface iRepoGimnast {

	Gimnast buscarGimnastaPorDNI(String dni);
	Gimnast buscarGimnastaPorTelefono(String phone);
	Gimnast buscarGimnastaPorEmail(String email);
	boolean crearGimnasta(String dni, String name, String email, Category category, String club,String phone);
	void mostrarGimnastas();
	void modificarGimnasta(Gimnast gimnast, String dni, String name, String email, Category category, String club,String phone);
	boolean eliminarGimnasta(Gimnast gimnast);
	boolean agregarGimnasta(Gimnast gimnast);
	boolean gimnastaDuplicado(Gimnast gimnast);
	
	//Solo el dni tiene que llevar equals() para comprobar que no haya repetido.
	
}
