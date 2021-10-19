package negocio.dao.factory;

import negocio.dao.iDAO;
import negocio.dao.implementacion.Implementacion;
import negocio.dominio.ClaseModelo;

public class Factory {

	public static iDAO<ClaseModelo> getImplementation(String source) {
		if (source.equals("BD")) {
			return new Implementacion();
		}

		return null;
	}

}