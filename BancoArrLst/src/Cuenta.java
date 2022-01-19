import java.util.*;

/**
 * Objeto que representa la cuenta de un cliente.
 * 
 * @author Mario Gabriel Núñez Alcázar de Velasco
 */
public class Cuenta {
	/**
	 * Numero IBAN de la cuenta del cliente.
	 * 
	 * <br><br>Formato del IBAN de la cuenta.<br>
	 * <img src="./resources/img/jpg/codigo-iban.jpg" alt="Esquema del formato" style="width: 50%">
	 */
	/*
	 * **********************************************************
	 * Formato del IBAN de la cuenta: ESXX XXXX XXXX XX XXXXXXXXX
	 *                                 4     4    4   2     10
	 * ********************************************************** 
	 */
	private String iban;
	
	/**
	 * Identificador interno de la cuenta.
	 */
	private int idCu;

	/**
	 * Nombre del Banco.
	 */
	private String nmbrbnc;

	/**
	 * Dirección de la sucursal.
	 */
	private String dirSuc;
	
	/**
	 * Titular de la cuenta bancaria.
	 */
	private Persona titular;
	
	/**
	 * Saldo actual de la cuenta bancaria.
	 * 
	 * <br><br>Resultado de la suma de todos los movimientos de la cuenta.
	 */
	private double saldo;
	
	/**
	 * Fecha de Apertura de la cuenta.
	 */
	private Date fechaApertura;
	
	/**
	 * Fecha de cierre de la cuenta.
	 */
	private Date fechaCierre;
	
	/**
	 * Campo Observaciones.
	 */
	private String bsrvcns;
	
	/**
	 * Constructor sin datos, para llamar a la clase Cuenta sin datos.
	 */
	public Cuenta(){}
	
	/**
	 * Constructor con datos para crear objetos Cuenta que representarán una nueva cuenta bancaría.
	 * 
	 * @param iban - Codigo IBAN de la cuenta.
	 * @param nmbrbnc - Nombre de la entidad bancaria.
	 * @param titular - titular de la cuenta; Objeto tipo Persona.
	 * @param saldo - Saldo de la cuenta bancaria.
	 * @param idCu - identificador interno de la cuenta.
	 */
	public Cuenta(String iban, String nmbrbnc, String dirSuc, Persona titular, double saldo, String bsrvcns, int idCu) {
		this.iban = iban; //Obtenemos el IBAN de la cuenta
		this.nmbrbnc = nmbrbnc; //Obtenemos el nombre de la entidad bancaria
		this.dirSuc = dirSuc; //Obtenemos el nombre de la entidad bancaria
		this.titular = titular; //Obtenemos el titular de la cuenta
		this.saldo = saldo; //Obtenemos el saldo de la cuenta
		this.fechaApertura = new Date(); //Obtenemos la fecha de hoy como fecha de apertura de la cuenta
		this.bsrvcns = bsrvcns; //Campo Observaciones.
		this.idCu = idCu;//obtenemos el identificador intewrno de la cuenta
	}

	/**
	 * Clase para mostrar en consola los diferentes objetos creados con esta clase.
	 * @return String - datos del objeto.
	 */
	@Override
	public String toString() {
		return "Cuenta [iban=" + iban + ", idCu=" + idCu + ", nmbrbnc=" + nmbrbnc + ", dirSuc=" + dirSuc + ", titular="
				+ titular + ", saldo=" + saldo + ", fechaApertura=" + fechaApertura + ", fechaCierre=" + fechaCierre
				+ ", bsrvcns=" + bsrvcns + "]";
	}

	/**
	 * Método Get para obtener el IBAN de la cuenta en el objeto.
	 * @return iban - IBAN de la cuenta.
	 */
	public String getIban() {
		return iban;
	}
	
	/**
	 * Método Get para obtener el Nombre de la entidad bancaria en el objeto.
	 * @return nmbrbnc - Nombre de la entidad bancaria.
	 */
	public String getNmbrbnc() {
		return nmbrbnc;
	}

	/**
	 * Método Get para obtener el Titular de la cuenta en el objeto.
	 * @return titular - Titular de la cuenta.
	 */
	public Persona getTitular() {
		return titular;
	}

	/**
	 * Método Get para obtener el Saldo de la cuenta en el objeto.
	 * @return saldo - Saldo de la cuenta.
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Método Get para obtener La Fecha de apertura de la cuenta en el objeto.
	 * @return fechaApertura - Fecha de apertura de la cuenta.
	 */
	public Date getFechaApertura() {
		return fechaApertura;
	}

	/**
	 * Método Get para obtener La Fecha de Cierre de la cuenta en el objeto.
	 * @return fechaCierre - Fecha de Cierre de la cuenta.
	 */
	public Date getFechaCierre() {
		return fechaCierre;
	}

	/**
	 * Método Set para establecer el IBAN de la cuenta en el objeto.
	 * @param iban - IBAN de la cuenta.
	 */
	public void setIban(String iban) {
		this.iban = iban;
	}

	/**
	 * Método Set para establecer el Nombre de la entidad bancaria en el objeto.
	 * @param nmbrbnc - Nombre de la entidad bancaria.
	 */
	public void setNmbrbnc(String nmbrbnc) {
		this.nmbrbnc = nmbrbnc;
	}

	/**
	 * Método Set para establecer el Titular de la cuenta en el objeto.
	 * @param titular - Titular de la cuenta.
	 */
	public void setTitular(Persona titular) {
		this.titular = titular;
	}

	/**
	 * Método Set para establecer el Saldo de la cuenta en el objeto.
	 * @param saldo - Saldo de la cuenta.
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Método Set para establecer la Fecha de apertura de la cuenta en el objeto.
	 * @param fechaApertura - Fecha de apertura de la cuenta.
	 */
	public void setFechaApertura(Date fechaApertura) {
		this.fechaApertura = fechaApertura;
	}

	/**
	 * Método Set para establecer la Fecha de cierre de la cuenta en el objeto.
	 * @param fechaCierre - Fecha de cierre de la cuenta.
	 */
	public void setFechaCierre(Date fechaCierre) {
		this.fechaCierre = fechaCierre;
	}

	/**
	 * @return the dirSuc
	 */
	public String getDirSuc() {
		return dirSuc;
	}

	/**
	 * @return the bsrvcns
	 */
	public String getBsrvcns() {
		return bsrvcns;
	}

	/**
	 * @param dirSuc the dirSuc to set
	 */
	public void setDirSuc(String dirSuc) {
		this.dirSuc = dirSuc;
	}
	
	/**
	 * @return the idCu
	 */
	public int getIdCu() {
		return idCu;
	}
	
	/**
	 * @param dirSuc the idCu to set
	 */
	public void setIdCu(int idCu) {
		this.idCu = idCu;
	}

	/**
	 * @param bsrvcns the bsrvcns to set
	 */
	public void setBsrvcns(String bsrvcns) {
		this.bsrvcns = bsrvcns;
	}
}
