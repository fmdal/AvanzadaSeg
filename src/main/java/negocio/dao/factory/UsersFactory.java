package negocio.dao.factory;

import negocio.dao.iDAO;
import negocio.dominio.Users;

public class UsersFactory {

	public static iDAO<Users> getImplementation(String source) {
		if (source.equals("BD")) {
			return (iDAO<Users>) new Users();
		}

		return null;
	}
}
