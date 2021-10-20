package negocio.dao.implementacion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;

import core.Conexion;
import negocio.dao.iDAO;
import negocio.dominio.Camiones;
import negocio.dominio.Users;

public class CamionesImplementacion implements iDAO<Camiones> {

		@Override
		@Override
		@Override
		public boolean add(Camiones elemento) {

			String sql = "INSERT INTO users(userID, nombre, apellido, contrasenia, fechaNac, telefono, categoria, listaCamiones) VALUES (?,?,?,?,?,?,?,?)";

			try {
				Connection con = Conexion.getConnection();

				PreparedStatement ps = con.prepareStatement(sql);

				ps.setString(1, elemento.getUserID());
				ps.setString(2, elemento.getNombre());
				ps.setString(3, elemento.getApellido());
				ps.setString(4, elemento.getContrasenia());
				ps.setString(5, elemento.getFechaNac());
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
		public ArrayList<Users> getLista() {

			ArrayList<Users> usuarios = new ArrayList<>();

			Connection con = null;
			PreparedStatement prep = null;

			try {
				con = Conexion.getConnection();
				prep = con.prepareStatement("SELECT * FROM users");

				ResultSet rs = prep.executeQuery();

				while (rs.next()) {

					Users usuario = new Users();

					usuario.setUserID(rs.getLong("userID"));
					usuario.setNombre(rs.getString("nombre"));
					usuario.setApellido(rs.getString("apellido"));
					usuario.setContrasenia(rs.getString("contrasenia"));
					usuario.setFechaNac(rs.getString("contrasenia"));
					usuario.setTelefono(rs.getLong("telefono"));

					usuarios.add(usuario);
				}
				prep.close();

			} catch (Exception e) {
				e.printStackTrace();
			}

			return usuarios;
		}

		@Override
		@Override
		@Override
		@Override
		@Override
		@Override
		@Override
		public Users findId(long l) {

			Connection con = null;
			PreparedStatement prep = null;

			try {
				String sql = "SELECT * FROM users WHERE id=?";

				con = Conexion.getConnection();
				prep = con.prepareStatement(sql);

				prep.setInt(1, (int) id);

				ResultSet rs = prep.executeQuery();

				Users usuario = new Users();

				if (rs.next()) {
					usuario.setUserID(rs.getLong("userID"));
					usuario.setNombre(rs.getString("nombre"));
					usuario.setApellido(rs.getString("apellido"));
					usuario.setContrasenia(rs.getString("contrasenia"));
					usuario.setFechaNac(rs.getString("contrasenia"));
					usuario.setTelefono(rs.getLong("telefono"));

				}
				return usuario;
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

			String sql = "UPDATE users SET activo=0 WHERE userID=?";

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
