package negocio.dominio;

public class Camiones {
	
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

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public float getTanqueNafta() {
		return tanqueNafta;
	}

	public void setTanqueNafta(float tanqueNafta) {
		this.tanqueNafta = tanqueNafta;
	}

	public float getPesoMax() {
		return pesoMax;
	}

	public void setPesoMax(float pesoMax) {
		this.pesoMax = pesoMax;
	}

	public float getLitrosxKm() {
		return litrosxKm;
	}

	public void setLitrosxKm(float litrosxKm) {
		this.litrosxKm = litrosxKm;
	}

	public Choferes getChofer() {
		return chofer;
	}

	public void setChofer(Choferes chofer) {
		this.chofer = chofer;
	}

	private String marca;
	private String modelo;
	private String patente;
	private float tanqueNafta;
	private float pesoMax;
	private float litrosxKm;
	private Choferes chofer;
	
	public Camiones () {}
	
	public Camiones (String marca, String modelo, String patente, float tanqueNafta, float pesoMax, float litrosxKm, Choferes chofer) {
		this.marca = marca;
		this.modelo = modelo;
		this.patente = patente;
		this.tanqueNafta = tanqueNafta;
		this.pesoMax = pesoMax;
		this.litrosxKm = litrosxKm;
		this.chofer = chofer;
	}
	
	
}
