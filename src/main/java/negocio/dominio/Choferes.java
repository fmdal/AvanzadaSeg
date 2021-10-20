package negocio.dominio;

import java.util.*;

public class Choferes extends Users {
	
	protected String categoria;
	protected ArrayList<Camiones> listaCamiones = new ArrayList<Camiones>(); 

	public Choferes () {}
	
	public Choferes(int userID, Calendar fechaNac, String contrasenia, String nombre, String apellido, String categoria, String telefono, ArrayList<Camiones> listaCamiones) {
		
		super();
		this.userID = userID;
		this.fechaNac = fechaNac;
		this.contrasenia = contrasenia;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.listaViajes = listaViajes;
		this.categoria = categoria;
		this.listaCamiones = listaCamiones;
	}
	
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public ArrayList<Camiones> getListaCamiones() {
		return listaCamiones;
	}

	public void setListaCamiones(ArrayList<Camiones> listaCamiones) {
		this.listaCamiones = listaCamiones;
	}
}
