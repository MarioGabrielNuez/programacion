package TMueble;

import java.util.Date;

import Muebles.Mesa;

public class MesaComedor extends Mesa {

	/**
	 * @param descrip
	 * @param peso
	 * @param dimensiones
	 * @param segMano
	 * @param antg
	 * @param fechFabric
	 * @param precio
	 * @param forma
	 * @param nPatas
	 * @param despleg
	 */
	public MesaComedor(String descrip, Double peso, String dimensiones, boolean segMano, Double antg, Date fechFabric,
			Double precio, String forma, int nPatas, boolean despleg) {
		super(descrip, peso, dimensiones, segMano, antg, fechFabric, precio, forma, nPatas, despleg);
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
	public MesaComedor(String descrip, Double peso, String dimensiones, boolean segMano, Double antg, Date fechFabric,
			Double precio) {
		super(descrip, peso, dimensiones, segMano, antg, fechFabric, precio);
		// TODO Auto-generated constructor stub
	}

}
