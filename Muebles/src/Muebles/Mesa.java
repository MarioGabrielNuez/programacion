package Muebles;

import java.util.Date;
import Objetos.Mueble;

/**
 * 
 */

/**
 * @author Mario Gabriel Núñez Alcázar de Velasco
 *
 */
public class Mesa extends Mueble{
	private String forma;
	private int nPatas;
	private boolean despleg;
	
	/**
	 * @param descrip
	 * @param peso
	 * @param dimensiones
	 * @param segMano
	 * @param antg
	 * @param fechFabric
	 */
	public Mesa(String descrip, Double peso, String dimensiones, boolean segMano, Double antg, Date fechFabric, Double precio) {
		super(descrip, peso, dimensiones, segMano, antg, fechFabric, precio);
		// TODO Auto-generated constructor stub
	}
	

	/**
	 * @param descrip
	 * @param peso
	 * @param dimensiones
	 * @param segMano
	 * @param antg
	 * @param fechFabric
	 * @param forma
	 * @param nPatas
	 * @param despleg
	 */
	public Mesa(String descrip, Double peso, String dimensiones, boolean segMano, Double antg, Date fechFabric, Double precio,
			String forma, int nPatas, boolean despleg) {
		super(descrip, peso, dimensiones, segMano, antg, fechFabric, precio);
		this.forma = forma;
		this.nPatas = nPatas;
		this.despleg = despleg;
	}

	/**
	 * @return the forma
	 */
	public String getForma() {
		return forma;
	}

	/**
	 * @param forma the forma to set
	 */
	public void setForma(String forma) {
		this.forma = forma;
	}

	/**
	 * @return the nPatas
	 */
	public int getnPatas() {
		return nPatas;
	}

	/**
	 * @param nPatas the nPatas to set
	 */
	public void setnPatas(int nPatas) {
		this.nPatas = nPatas;
	}

	/**
	 * @return the despleg
	 */
	public boolean isDespleg() {
		return despleg;
	}

	/**
	 * @param despleg the despleg to set
	 */
	public void setDespleg(boolean despleg) {
		this.despleg = despleg;
	}
}
