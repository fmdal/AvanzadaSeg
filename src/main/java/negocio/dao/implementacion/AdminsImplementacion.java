package negocio.dao.implementacion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import core.Conexion;
import negocio.dao.iDAO;
import negocio.dominio.Admins;

public class AdminsImplementacion implements iDAO<Admins> {

////////////////////////////////


		@Override
		@Override
		@Override
		public boolean add(Admins elemento) {

			String sql = "INSERT INTO admins(userID, nombre, apellido, contrasenia, fechaNac, telefono) VALUES (?,?,?,?,?,?)";

			try {
				Connection con = Conexion.getConnection();

				PreparedStatement ps = con.prepareStatement(sql);

				ps.setInt(1, (int) elemento.getUserID());
				ps.setString(2, elemento.getNombre());
				ps.setString(3, elemento.getApellido());
				ps.setString(4, elemento.getContrasenia());
				ps.setDate(5, elemento.getFechaNac());
				ps.setString(6, elemento.getTelefono());

				ps.execute();

				ps.close();

				return true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return false;
		}

		@Override
		@Override
		@Override
		@Override
		@Override
		@Override
		@Override
		public Object get(Object elemento) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		@Override
		@Override
		@Override
		@Override
		@Override
		@Override
		public boolean save() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		@Override
		@Override
		@Override
		@Override
		@Override
		@Override
		public boolean delete() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		@Override
		@Override
		@Override
		@Override
		@Override
		@Override
		public ArrayList<Admins> getLista() {

			ArrayList<Admins> usuarios = new ArrayList<>();

			Connection con = null;
			PreparedStatement prep = null;

			try {
				con = Conexion.getConnection();
				prep = con.prepareStatement("SELECT * FROM admins");

				ResultSet rs = prep.executeQuery();

				while (rs.next()) {

					Fadmin

					admin.setUserID(rs.getLong("userID"));
					admin.setNombre(rs.getString("nombre"));
					admin.setApellido(rs.getString("apellido"));
					admin.setContrasenia(rs.getString("contrasenia"));
					admin.setFechaNac(rs.getString("contrasenia"));
					admin.setTelefono(rs.getLong("telefono"));

					admin.add(admin);
				}
				prep.close();

			} catch (Exception e) {
				e.printStackTrace();
			}

			return admin;
		}

		@Override
		@Override
		@Override
		@Override
		@Override
		@Override
		@Override
		public Admins findId(long l) {

			Connection con = null;
			PreparedStatement prep = null;

			try {
				String sql = "SELECT * FROM users WHERE id=?";

				con = Conexion.getConnection();
				prep = con.prepareStatement(sql);

				prep.setInt(1, (int) id);

				ResultSet rs = prep.executeQuery();

				Admins admin = new Admins();

				if (rs.next()) {
					admin.setUserID(rs.getLong("userID"));
					admin.setNombre(rs.getString("nombre"));
					admin.setApellido(rs.getString("apellido"));
					admin.setContrasenia(rs.getString("contrasenia"));
					admin.setFechaNac(rs.getString("contrasenia"));
					admin.setTelefono(rs.getLong("telefono"));

				}
				return admin;
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		}

		@Override
		@Override
		@Override
		@Override
		public boolean deleteById(long l) {

			String sql = "UPDATE admins SET activo=0 WHERE userID=?"; // es userID ? eso esta bien?
			try {
				Connection con = Conexion.getConnection();

				PreparedStatement ps = con.prepareStatement(sql);

				ps.setLong(1, l);

				ps.execute();

				ps.close();

				return true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return false;
		}

}
