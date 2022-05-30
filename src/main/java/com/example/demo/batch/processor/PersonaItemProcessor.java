package com.example.demo.batch.processor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import com.example.demo.batch.model.Persona;

public class PersonaItemProcessor implements ItemProcessor<Persona, Persona>{

	private static final Logger LOG = LoggerFactory.getLogger(PersonaItemProcessor.class);
	
	@Override
	public Persona process(Persona item) throws Exception {
		// TODO Auto-generated method stub
		String primerNombre = item.getPrimerNombre().toUpperCase();
		String apellido = item.getApellido().toUpperCase();
		String telefono = item.getTelefono();
		
		Persona persona = new Persona(primerNombre, apellido, telefono);
		
		LOG.info("Convirtiendo ("+item+") a mayusculas... ("+persona+")");
		
		return persona;
	}
	
	

}
