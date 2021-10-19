package negocio.dominio;

import java.util.ArrayList;

import dominio.Carrito;
import dominio.Cliente;
import dominio.Domicilio;
import dominio.Tarjeta;

public class Admins extends Cliente {

	private Carrito usuarioCarrito;

	/**
	 * @param nroIdentificacion
	 * @param dni
	 * @param contrasenia
	 * @param nombre
	 * @param apellido
	 */
	public Usuario(int nroIdentificacion, long dni, String contrasenia, String nombre, String apellido) {
		super();
		this.nroIdentificacion = nroIdentificacion;
		this.dni = dni;
		this.contrasenia = contrasenia;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public Usuario(Carrito usuarioCarrito, int nroIdentificacion, long dni, String contrasenia, String nombre,
			String apellido, ArrayList<Domicilio> listaDomicilios, Domicilio domicilioPrincipal,
			ArrayList<Tarjeta> listaTarjetas, Tarjeta tarjetaPrincipal) {
		super(nroIdentificacion, dni, contrasenia, nombre, apellido, listaDomicilios, domicilioPrincipal, listaTarjetas,
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
