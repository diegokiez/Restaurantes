/**
 * 
 */
package com.devpredator.practicajsf.services;

import java.util.ArrayList;
import java.util.List;

import com.devpredator.practicajsf.entity.Gerente;
import com.devpredator.practicajsf.entity.Restaurante;

/**
 * @author diegokiez
 *
 */
public class RestaurenteService {
	
	public List<Restaurante> ConsultarRestaurantes(){
		
		//Declaracion de la lista
		
		List<Restaurante> Restaurantes = new ArrayList<Restaurante>();
		
		//			Declaracion de Restaurantes
		
		Restaurante McDonalds = new Restaurante();
		Restaurante BurgerKing = new Restaurante();
		Restaurante Starbucks = new Restaurante();
		Restaurante KFC = new Restaurante();
		Restaurante Subway = new Restaurante();
		
		//			Declaracion de Gerentes
		
		Gerente Marlon = new Gerente();
		Gerente Paul = new Gerente();
		Gerente James = new Gerente();
		Gerente Robert = new Gerente();
		Gerente Clint = new Gerente();
		
		//			Creacion de Gerentes
		
		Marlon.setNombre("Marlon");
		Marlon.setPrimerApellido("Brando");
		Marlon.setSegundoApellido("Stewart");
		
		Paul.setNombre("Paul");
		Paul.setPrimerApellido("Newman");
		Paul.setSegundoApellido("Cooper");
		
		James.setNombre("James");
		James.setPrimerApellido("Dean");
		James.setSegundoApellido("Grant");
		
		Robert.setNombre("Robert");
		Robert.setPrimerApellido("Redford");
		Robert.setSegundoApellido("Hudson");
		
		Clint.setNombre("Clint");
		Clint.setPrimerApellido("Flynn");
		Clint.setSegundoApellido("Clift");
		
		//		Creacion de Restaurantes
		
		McDonalds.setNombre("McDonalds");
		McDonalds.setPais("EUA");
		McDonalds.setDireccion("Lombard Street");
		McDonalds.setGerente(Marlon);
		
		BurgerKing.setNombre("BurgerKing");
		BurgerKing.setPais("Reino Unido");
		BurgerKing.setDireccion("Abbey Road");
		BurgerKing.setGerente(Paul);
		
		Starbucks.setNombre("Starbucks");
		Starbucks.setPais("España");
		Starbucks.setDireccion("La Rambla");
		Starbucks.setGerente(James);
		
		KFC.setNombre("KFC");
		KFC.setPais("Israel");
		KFC.setDireccion("Via Dolorosa");
		KFC.setGerente(Robert);
		
		Subway.setNombre("Subway");
		Subway.setPais("EUA");
		Subway.setDireccion("Wall Street");
		Subway.setGerente(Clint);
		
		//Creacion de la lista
		
		Restaurantes.add(BurgerKing);
		Restaurantes.add(KFC);
		Restaurantes.add(Starbucks);
		Restaurantes.add(Subway);
		Restaurantes.add(McDonalds);
		
		return Restaurantes;
	}
}
