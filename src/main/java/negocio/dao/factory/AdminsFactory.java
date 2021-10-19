package negocio.dao.factory;

import negocio.dao.iDAO;
import negocio.dominio.Admins;

public class AdminsFactory {

	public static iDAO<Admins> getImplementation(String source) {
		if (source.equals("BD")) {
			return (iDAO<Admins>) new Admins();
		}

		return null;
	}
}
