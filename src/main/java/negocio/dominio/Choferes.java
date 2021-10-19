package negocio.dominio;

import java.util.ArrayList;

public class Choferes extends Users {

	public Choferes(int userID, long dni, String contrasenia, String nombre, String apellido) {
		super();
		this.userID = userID;
		this.dni = dni;
		this.contrasenia = contrasenia;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public Choferes(Carrito usuarioCarrito, int userID, long dni, String contrasenia, String nombre,
			String apellido, ArrayList<Domicilio> listaDomicilios, Domicilio domicilioPrincipal,
			ArrayList<Tarjeta> listaTarjetas, Tarjeta tarjetaPrincipal) {
		super(userID, dni, contrasenia, nombre, apellido, listaDomicilios, domicilioPrincipal, listaTarjetas,
				tarjetaPrincipal);
		this.usuarioCarrito = usuarioCarrito;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return el dato de usuarioCarrito
	 */
	public Carrito getUsuarioCarrito() {
		return usuarioCarrito;
	}

	/**
	 * @param usuarioCarrito para cargar en usuarioCarrito
	 */
	public void setUsuarioCarrito(Carrito usuarioCarrito) {
		this.usuarioCarrito = usuarioCarrito;
	}
}
