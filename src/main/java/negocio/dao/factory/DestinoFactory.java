package negocio.dao.factory;

import negocio.dao.iDAO;
import negocio.dominio.Trayectos;

public class DestinosFactory implements iDAO<Trayectos> {

	public static iDAO<Trayectos> getImplementation(String source) {
		if (source.equals("BD")) {
			return (iDAO<Trayectos>) new Trayectos();
		}

		return null;
	}
}
