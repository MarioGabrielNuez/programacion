/*
 * Paquete al que pertenece
 */
package Objetos;

import java.util.Date;

/**
 * Ser, o no ser..., un mueble...
 */

/**
 * @author Mario Gabriel Núñez Alcázar de Velasco
 *
 */
public class Mueble {
	private String descrip;
	private Double peso;
	private String dimensiones;
	private boolean segMano;
	private Double antg;
	private Date fechFabric;
	private Double precio;
	
	/**
	 * @param descrip
	 * @param peso
	 * @param dimensiones
	 * @param segMano
	 * @param antg
	 * @param fechFabric
	 */
	public Mueble(String descrip, Double peso, String dimensiones, boolean segMano, Double antg, Date fechFabric, Double precio) {
		this.descrip = descrip;
		this.peso = peso;
		this.dimensiones = dimensiones;
		this.segMano = segMano;
		this.antg = antg;
		this.fechFabric = fechFabric;
		this.precio = precio;
	}

	/**
	 * @return the descrip
	 */
	public String getDescrip() {
		return descrip;
	}
	
	/**
	 * @return the precio
	 */
	public Double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(Double precio) {
		this.precio = precio;
	}


	/**
	 * @param descrip the descrip to set
	 */
	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}

	/**
	 * @return the peso
	 */
	public Double getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(Double peso) {
		this.peso = peso;
	}

	/**
	 * @return the dimensiones
	 */
	public String getDimensiones() {
		return dimensiones;
	}

	/**
	 * @param dimensiones the dimensiones to set
	 */
	public void setDimensiones(String dimensiones) {
		this.dimensiones = dimensiones;
	}

	/**
	 * @return the segMano
	 */
	public boolean isSegMano() {
		return segMano;
	}

	/**
	 * @param segMano the segMano to set
	 */
	public void setSegMano(boolean segMano) {
		this.segMano = segMano;
	}

	/**
	 * @return the antg
	 */
	public Double getAntg() {
		return antg;
	}

	/**
	 * @param antg the antg to set
	 */
	public void setAntg(Double antg) {
		this.antg = antg;
	}

	/**
	 * @return the fechFabric
	 */
	public Date getFechFabric() {
		return fechFabric;
	}

	/**
	 * @param fechFabric the fechFabric to set
	 */
	public void setFechFabric(Date fechFabric) {
		this.fechFabric = fechFabric;
	}
}
