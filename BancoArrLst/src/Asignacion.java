import java.util.*;

/**
 * 
 */

/**
 * @author Mario Gabriel Núñez Alcázar de Velasco
 *
 */
public class Asignacion {
	private int codp;//Codigo Persona
	private int codc;//Codigo Cuenta
	private Date alta;
	private Date baja;
	private String observacion;
		
	/**
	 * 
	 */
	public Asignacion() {
	}

	/**
	 * @param codp
	 * @param codc
	 * @param alta
	 * @param baja
	 * @param observacion
	 */
	public Asignacion(int codp, int codc, Date alta, Date baja, String observacion) {
		this.codp = codp;
		this.codc = codc;
		this.alta = alta;
		this.baja = baja;
		this.observacion = observacion;
	}

	@Override
	public String toString() {
		return "Asignacion [codp=" + codp + ", codc=" + codc + ", alta=" + alta + ", baja=" + baja + ", observacion="
				+ observacion + "]";
	}

	/**
	 * @return the codp
	 */
	public int getCodp() {
		return codp;
	}

	/**
	 * @param codp the codp to set
	 */
	public void setCodp(int codp) {
		this.codp = codp;
	}

	/**
	 * @return the codc
	 */
	public int getCodc() {
		return codc;
	}

	/**
	 * @param codc the codc to set
	 */
	public void setCodc(int codc) {
		this.codc = codc;
	}

	/**
	 * @return the alta
	 */
	public Date getAlta() {
		return alta;
	}

	/**
	 * @param alta the alta to set
	 */
	public void setAlta(Date alta) {
		this.alta = alta;
	}

	/**
	 * @return the baja
	 */
	public Date getBaja() {
		return baja;
	}

	/**
	 * @param baja the baja to set
	 */
	public void setBaja(Date baja) {
		this.baja = baja;
	}

	/**
	 * @return the observacion
	 */
	public String getObservacion() {
		return observacion;
	}

	/**
	 * @param observacion the observacion to set
	 */
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	
}
