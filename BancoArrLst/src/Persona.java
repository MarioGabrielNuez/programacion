import java.util.*;

/**
 * Objeto que representa al cliente del banco.
 * 
 * @author Mario Gabriel Núñez Alcázar de Velasco
 */
public class Persona {
	
	/**
	 * Numero de Identificacion Interno del cliente.
	 */
	private int idPer;
	
	/**
	 * Numero de Identificacion Fiscal del cliente.
	 */
	private String nif;
	
	/**
	 * Nombre del cliente.
	 */
	private String nmbr;
	
	/**
	 * Apellidos del cliente.
	 */
	private Date fNacim;
	
	/**
	 * Telefono del cliente.
	 */
	private String tlfn;
	
	/**
	 * Email del cliente.
	 */
	private String eml;
	
	/**
	 * Domicilio del cliente.
	 */
	private String dmcl;
	
	/**
	 * Constructor vacío, para llamar a la clase Persona sin datos.
	 */
	public Persona() {}

	/**
	 * Constructor con datos para crear objetos Persona.
	 * 
	 * @param nif - Numero de Identificacion Fiscal del cliente.
	 * @param nmbr - Nombre del cliente.
	 * @param fNacim - Fecha de Nacimiento del cliente.
	 * @param tlfn - Telefono del cliente.
	 * @param eml - Email del cliente.
	 * @param dmcl - Domicilio del cliente.
	 * @Param idPer - Identificador interno de la persona
	 */
	public Persona(String nif, String nmbr, Date fNacim, String tlfn, String eml, String dmcl, int idPer) {
		this.nif = nif; //Establecemos el NIF cel cliente
		this.nmbr = nmbr; //Establecemos el Nombre del cliente
		this.fNacim = fNacim; //Establecemos los apellidos del cliente
		this.tlfn = tlfn; //Establecemos el Telefono del cliente
		this.eml = eml; //Establecemos el Email del cliente 
		this.dmcl = dmcl; //Establecemos el Domicilio del cliente
		this.idPer = idPer;//establecemos el identificador interno de la persona
	}
	
	@Override
	public String toString() {
		return "Persona [idPer=" + idPer + ", nif=" + nif + ", nmbr=" + nmbr + ", fNacim=" + fNacim + ", tlfn=" + tlfn
				+ ", eml=" + eml + ", dmcl=" + dmcl + "]";
	}

	/**
	 * Método Get para obtener el Numero de Identificacion Fiscal del cliente en el objeto.
	 * @return nif - Numero de Identificacion Fiscal del cliente.
	 */
	public String getNif() {
		return nif;
	}

	/**
	 * Método Get para obtener el Nombre del cliente en el objeto.
	 * @return nmbr - Nombre del cliente.
	 */
	public String getNmbr() {
		return nmbr;
	}

	/**
	 * Método Get para obtener los apellidos del cliente en el objeto.
	 * @return apllds - Apellidos del cliente.
	 */
	public Date getfNacim() {
		return fNacim;
	}

	/**
	 * Método Get para obtener el Telefono del cliente en el objeto.
	 * @return tlfn - Telefono del cliente.
	 */
	public String getTlfn() {
		return tlfn;
	}

	/**
	 * Método Get para obtener el E-Mail del cliente en el objeto.
	 * @return eml - E-Mail del cliente.
	 */
	public String getEml() {
		return eml;
	}

	/**
	 * Método Get para obtener el Domicilio del cliente en el objeto.
	 * @return dmcl - Domicilio del cliente.
	 */
	public String getDmcl() {
		return dmcl;
	}

	/**
	 * Método Set para establecer el NIF del cliente en el objeto.
	 * @param nif - NIF del cliente.
	 */
	public void setNif(String nif) {
		this.nif = nif;
	}

	/**
	 * Método Set para establecer el Nombre del cliente en el objeto.
	 * @param nmbr - Nombre del cliente.
	 */
	public void setNmbr(String nmbr) {
		this.nmbr = nmbr;
	}

	/**
	 * Método Set para establecer los Apellidos del cliente en el objeto.
	 * @param apllds - Apellidos del cliente.
	 */
	public void setfNacim(Date fNacim) {
		this.fNacim = fNacim;
	}

	/**
	 * Método Set para establecer el Telefono del cliente en el objeto.
	 * @param tlfn - Telefono del cliente.
	 */
	public void setTlfn(String tlfn) {
		this.tlfn = tlfn;
	}

	/**
	 * Método Set para establecer el E-Mail del cliente en el objeto.
	 * @param eml - E-Mail del cliente.
	 */
	public void setEml(String eml) {
		this.eml = eml;
	}

	/**
	 * Método Set para establecer el domicilio del cliente en el objeto.
	 * @param dmcl - Domicilio del cliente.
	 */
	public void setDmcl(String dmcl) {
		this.dmcl = dmcl;
	}
	
	/**
	 * Método Set para establecer el Identificador interno del cliente en el objeto.
	 * @param idPer - Identificador interno del cliente.
	 */
	public void setIdPer(int idPer) {
		this.idPer = idPer;
	}
	
	/**
	 * Método Get para obtener el Identificador interno del cliente en el objeto.
	 * @param idPer - Identificador interno del cliente.
	 */
	public int getIdPer() {
		return idPer;
	}
}
