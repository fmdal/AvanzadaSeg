package negocio.dao.factory;

import negocio.dao.iDAO;
import negocio.dominio.Viajes;

public class ViajesFactory {

	public static iDAO<Viajes> getImplementation(String source) {
		if (source.equals("BD")) {
			return (iDAO<Viajes>) new Viajes();
		}

		return null;
	}
}
