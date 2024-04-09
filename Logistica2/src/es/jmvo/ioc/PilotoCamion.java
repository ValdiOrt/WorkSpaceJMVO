package es.jmvo.ioc;

public class PilotoCamion implements Pilotos {
	
	private CreacionInformes informeNuevo;
	
	
	
	public PilotoCamion(CreacionInformes informeNuevo) {
		
		this.informeNuevo = informeNuevo;
	}

	public String getTareas() {
		return "Conductor, camiones pesados";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe de ruta Camion pesado" + informeNuevo.getInforme();
	}

}
