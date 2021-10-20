package negocio.dominio;

public class Viajes {
	
	protected Choferes chofer;
	protected Camiones camion;
	protected float consumoNafta;
	protected Trayectos trayectos;
	
	public Viajes () {}
	
	public Viajes (int viajesID, Choferes chofer, Camiones camion, float consumoNafta, Trayectos trayectos) {
		this.viajesID = viajesID;
		this.chofer = chofer;
		this.consumoNafta = consumoNafta;
		this.trayectos = trayectos;
	}

	protected int viajesID;
	public int getViajesID() {
		return viajesID;
	}

	public void setViajesID(int viajesID) {
		this.viajesID = viajesID;
	}

	public Choferes getChofer() {
		return chofer;
	}

	public void setChofer(Choferes chofer) {
		this.chofer = chofer;
	}

	public Camiones getCamion() {
		return camion;
	}

	public void setCamion(Camiones camion) {
		this.camion = camion;
	}

	public float getConsumoNafta() {
		return consumoNafta;
	}

	public void setConsumoNafta(float consumoNafta) {
		this.consumoNafta = consumoNafta;
	}

	public Trayectos getTrayectos() {
		return trayectos;
	}

	public void setTrayectos(Trayectos trayectos) {
		this.trayectos = trayectos;
	}	
}
