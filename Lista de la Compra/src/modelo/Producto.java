/**
 * 
 */
package modelo;

/**
 * @author Mario Gabriel Núñez Alcázar de Velasco
 *
 */
public class Producto {
	/**
	 * Nombre del producto
	 */
	private String nombreProducto;
	
	/**
	 * Cantidad
	 */
	private int cantidad;
	
	/**
	 * Constructor declarativo del objeto
	 * @param nombreProducto - Nombre del producto
	 * @param i - Cantidad
	 */
	public Producto(String nombreProducto, int i) {
		this.nombreProducto = nombreProducto;
		this.cantidad = i;
	}

	/**
	 * devuelve nombreProducto.
	 * 
	 * @return the nombreProducto
	 */
	public String getNombreProducto() {
		return nombreProducto;
	}

	/**
	 * devuelve cantidad.
	 * 
	 * @return the cantidad
	 */
	public int getCantidad() {
		return cantidad;
	}
}
