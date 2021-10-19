package negocio.dominio;

import java.util.*;

public class Choferes extends Users {

	public Choferes(int userID, Calendar fechaNac, String contrasenia, String nombre, String apellido) {
		super();
		this.userID = userID;
		this.fechaNac = fechaNac;
		this.contrasenia = contrasenia;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.listaViajes = listaViajes;
	}
	
}
