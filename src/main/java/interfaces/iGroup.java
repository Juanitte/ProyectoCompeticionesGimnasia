package interfaces;

import model.DTO.Gimnast;

public interface iGroup {

	boolean gimnastasCompatibles(Gimnast gimnast);
	void modificarGrupo();
	boolean insertarGimnasta(Gimnast gimnast);
	Gimnast borrarGimnasta(Gimnast gimnast);
}
