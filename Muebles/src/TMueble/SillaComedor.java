/**
 * 
 */
package TMueble;

import java.util.Date;

import Muebles.Silla;

/**
 * @author mario
 *
 */
public class SillaComedor extends Silla {

	/**
	 * @param descrip
	 * @param peso
	 * @param dimensiones
	 * @param segMano
	 * @param antg
	 * @param fechFabric
	 * @param precio
	 * @param nPatas
	 * @param nRuedas
	 * @param trasl
	 * @param rotac
	 */
	public SillaComedor(String descrip, Double peso, String dimensiones, boolean segMano, Double antg, Date fechFabric,
			Double precio, int nPatas, int nRuedas, boolean trasl, boolean rotac) {
		super(descrip, peso, dimensiones, segMano, antg, fechFabric, precio, nPatas, nRuedas, trasl, rotac);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param descrip
	 * @param peso
	 * @param dimensiones
	 * @param segMano
	 * @param antg
	 * @param fechFabric
	 * @param precio
	 */
	public SillaComedor(String descrip, Double peso, String dimensiones, boolean segMano, Double antg, Date fechFabric,
			Double precio) {
		super(descrip, peso, dimensiones, segMano, antg, fechFabric, precio);
		// TODO Auto-generated constructor stub
	}

}
