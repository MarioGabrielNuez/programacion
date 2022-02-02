package Muebles;
import java.util.Date;
import Objetos.Mueble;

/**
 * 
 */

/**
 * @author Mario Gabriel Núñez Alcázar de Velasco
 */

public class Silla extends Mueble {
	private int nPatas;
	private int nRuedas;
	private boolean trasl;
	private boolean rotac;

	/**
	 * @param descrip
	 * @param peso
	 * @param dimensiones
	 * @param segMano
	 * @param antg
	 * @param fechFabric
	 */
	public Silla(String descrip, Double peso, String dimensiones, boolean segMano, Double antg, Date fechFabric, Double precio) {
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
	 * @param nPatas
	 * @param nRuedas
	 * @param trasl
	 * @param rotac
	 */
	public Silla(String descrip, Double peso, String dimensiones, boolean segMano, Double antg, Date fechFabric, Double precio,
			int nPatas, int nRuedas, boolean trasl, boolean rotac) {
		super(descrip, peso, dimensiones, segMano, antg, fechFabric, precio);
		this.nPatas = nPatas;
		this.nRuedas = nRuedas;
		this.trasl = trasl;
		this.rotac = rotac;
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
	 * @return the nRuedas
	 */
	public int getnRuedas() {
		return nRuedas;
	}

	/**
	 * @param nRuedas the nRuedas to set
	 */
	public void setnRuedas(int nRuedas) {
		this.nRuedas = nRuedas;
	}

	/**
	 * @return the trasl
	 */
	public boolean isTrasl() {
		return trasl;
	}

	/**
	 * @param trasl the trasl to set
	 */
	public void setTrasl(boolean trasl) {
		this.trasl = trasl;
	}

	/**
	 * @return the rotac
	 */
	public boolean isRotac() {
		return rotac;
	}

	/**
	 * @param rotac the rotac to set
	 */
	public void setRotac(boolean rotac) {
		this.rotac = rotac;
	}
}
