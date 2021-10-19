package negocio.dominio;

import java.util.*;

public abstract class Users {

	protected long userID;
	protected long telefono;
	protected String contrasenia;
	protected String nombre;
	protected String apellido;
	protected ArrayList<Viajes> listaViajes = new ArrayList<Viajes>();
	protected Calendar fechaNac;

	public Users() {
	}

	public Users(long userID, long telefono, String contrasenia, String nombre, String apellido,
			ArrayList<Viajes> listaViajes, Calendar fechaNac) {
		// TODO Auto-generated constructor stub
		this.userID = userID;
		this.telefono = telefono;
		this.contrasenia = contrasenia;
		this.nombre = nombre;
		this.apellido = apellido;
		this.listaViajes = listaViajes;
		this.fechaNac = fechaNac;
	}

	/**
	 * @param userID
	 * @param telefono
	 * @param contrasenia
	 * @param nombre
	 * @param apellido
	 * @param listaViajes
	 * @param fechaNac
	 */
//	public Users1(String userID, long telefono, String contrasenia, String nombre, String apellido, 
//			ArrayList<Viajes> listaViajes, Calendar fechaNac) {
//		super();
//		this.userID = userID;
//		this.telefono = telefono;
//		this.contrasenia = contrasenia;
//		this.nombre = nombre;
//		this.apellido = apellido;
//		this.listaViajes = listaViajes;
//		this.fechaNac = fechaNac;
//	}

	public long getUserID() {
		return userID;
	}

	public void setUserID(long userID) {
		this.userID = userID;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public ArrayList<Viajes> getListaViajes() {
		return listaViajes;
	}

	public void setListaViajes(ArrayList<Viajes> listaViajes) {
		this.listaViajes = listaViajes;
	}

	public Calendar getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Calendar fechaNac) {
		this.fechaNac = fechaNac;
	}

}
