package negocio.dao.factory;

import negocio.dao.iDAO;
import negocio.dominio.Choferes;

public class ChoferesFactory {

	public static iDAO<Choferes> getImplementation(String source) {
		if (source.equals("BD")) {
			return (iDAO<Choferes>) new Choferes();
		}

		return null;
	}
}
