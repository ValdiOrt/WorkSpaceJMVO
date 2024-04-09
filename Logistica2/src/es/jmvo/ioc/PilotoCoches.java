package es.jmvo.ioc;

public class PilotoCoches implements Pilotos {

	// Creación campo tiempo CreacionInforme (Interfaz)
	
	private CreacionInformes informeNuevo;
	
	
	//Creación de contructor que inyecta la dependencia
	public PilotoCoches(CreacionInformes informeNuevo) {
		this.informeNuevo =informeNuevo;
	};
	
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Conductor vehiculos ligeros";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe de ruta del Piloto de coche" + informeNuevo.getInforme();
	}

}
