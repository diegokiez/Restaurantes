/**
 * 
 */
package com.devpredator.practicajsf.controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.devpredator.practicajsf.entity.Restaurante;
import com.devpredator.practicajsf.services.RestaurenteService;

/**
 * @author diegokiez
 *
 */

@ManagedBean
@ViewScoped
public class RestauranteController {
	
	List<Restaurante> restaurantes;
	RestaurenteService restaurantesService = new RestaurenteService();
	
	@PostConstruct
	public void init() {
		this.consultarRestaurantes();
	}
	
	public void consultarRestaurantes() {
		this.restaurantes = this.restaurantesService.ConsultarRestaurantes();
	}

	/**
	 * @return the restaurantes
	 */
	public List<Restaurante> getRestaurantes() {
		return restaurantes;
	}

	/**
	 * @param restaurantes the restaurantes to set
	 */
	public void setRestaurantes(List<Restaurante> restaurantes) {
		this.restaurantes = restaurantes;
	}

	/**
	 * @return the restaurantesService
	 */
	public RestaurenteService getRestaurantesService() {
		return restaurantesService;
	}

	/**
	 * @param restaurantesService the restaurantesService to set
	 */
	public void setRestaurantesService(RestaurenteService restaurantesService) {
		this.restaurantesService = restaurantesService;
	}
	
	
	
}
