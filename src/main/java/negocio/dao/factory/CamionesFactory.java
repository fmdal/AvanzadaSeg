package negocio.dao.factory;

import negocio.dao.iDAO;
import negocio.dominio.Camiones;

public class CamionesFactory {

	public static iDAO<Camiones> getImplementation(String source) {
		if (source.equals("BD")) {
			return (iDAO<Camiones>) new Camiones();
		}

		return null;
	}
}
