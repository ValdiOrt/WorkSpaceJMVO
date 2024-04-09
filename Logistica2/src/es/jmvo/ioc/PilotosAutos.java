package es.jmvo.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PilotosAutos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 
		//Creacion objetos tipo Piloto
		Pilotos Piloto1 = new PilotoCoches();		
		//uso objetos creados
		System.out.println(Piloto1.getTareas());*/
		
		//1- Crear contexto, cargar archivo xml
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//2- Pedir al xml el bean
		
		Pilotos Jaime = contexto.getBean("miPiloto", Pilotos.class);
		
		//3- usar objeto
		
		System.out.println(Jaime.getTareas());
		System.out.println(Jaime.getInforme());
		
		//4 cerrar el contexto
		
		contexto.close();
		
		
		
		
		
	}

		
}
