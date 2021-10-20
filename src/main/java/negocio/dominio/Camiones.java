package negocio.dominio;

public class Camiones {
	
	protected String patente;
	protected String marca;
	protected String modelo;
	protected double tanqueNafta;
	protected double pesoMax;
	protected double litrosxKm;
	
	
	public Camiones () {}
	
	public Camiones (String patente, String marca, String modelo, double tanqueNafta, double pesoMax, double litrosxKm) {
		this.patente = patente;
		this.marca = marca;
		this.modelo = modelo;
		this.tanqueNafta = tanqueNafta;
		this.pesoMax = pesoMax;
		this.litrosxKm = litrosxKm;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getTanqueNafta() {
		return tanqueNafta;
	}

	public void setTanqueNafta(double tanqueNafta) {
		this.tanqueNafta = tanqueNafta;
	}

	public double getPesoMax() {
		return pesoMax;
	}

	public void setPesoMax(double pesoMax) {
		this.pesoMax = pesoMax;
	}

	public double getLitrosxKm() {
		return litrosxKm;
	}

	public void setLitrosxKm(double litrosxKm) {
		this.litrosxKm = litrosxKm;
	}

}
