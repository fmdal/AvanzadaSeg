package negocio.dao.factory;

import negocio.dao.iDAO;
import negocio.dominio.Destinos;

public class DestinosFactory implements iDAO<Destinos> {

	public static iDAO<Destinos> getImplementation(String source) {
		if (source.equals("BD")) {
			return (iDAO<Destinos>) new Destinos();
		}

		return null;
	}
}
