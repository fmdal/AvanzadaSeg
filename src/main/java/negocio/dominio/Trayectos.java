package negocio.dominio;

public class Trayectos extends Viajes{
	
	protected int trayectoID;
	protected String origen;
	protected String destino;
	protected float distancia;
	
	public Trayectos () {}

	public Trayectos (int trayectoID, String origen, String destino, float distancia) {
		this.trayectoID = trayectoID;
		this.origen = origen;
		this.destino = destino;
		this.distancia = distancia;
	}

	public int getTrayectoID() {
		return trayectoID;
	}

	public void setTrayectoID(int trayectoID) {
		this.trayectoID = trayectoID;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public float getDistancia() {
		return distancia;
	}

	public void setDistancia(float distancia) {
		this.distancia = distancia;
	}

}
