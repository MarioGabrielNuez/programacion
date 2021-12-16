import java.util.Date;

/**
 * Objeto que representa la cuenta de un cliente
 */

/**
 * @author Mario Gabriel N��ez Alc�zar de Velasco
 */
public class Cuenta {
	// Formato del IBAN de la cuenta: ESXX XXXX XXXX XX XXXXXXXXX
	//                                 4     4    4   2     9
	private String iban; // n�mero de cliente
	
	private Cliente titular; // el cliente como tal
	private double saldo; // NIF del Trabajador
	private Date fechaApertura; // fecha de inicio de contrato Apertura de la cuenta
	
	/**
	 * Constructor vac�o
	 */
	public Cuenta() {
	}
	
	/**
	 * constructor con datos, la fecha se genera automaticamente.
	 * @param numero
	 * @param titular
	 * @param saldo
	 */
	public Cuenta(String numero, Cliente titular, double saldo) {
		this.iban = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.fechaApertura = new Date();
	}
	
	/**
	 * @return the numero
	 */
	public String getNumero() {
		return iban;
	}
	
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.iban = numero;
	}
	
	/**
	 * @return the titular
	 */
	public Cliente getTitular() {
		return titular;
	}
	
	/**
	 * @param titular the titular to set
	 */
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}
	
	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	/**
	 * @return the fechaApertura
	 */
	public Date getFechaApertura() {
		return fechaApertura;
	}
	
	/**
	 * @param fechaApertura the fechaApertura to set
	 */
	public void setFechaApertura(Date fechaApertura) {
		this.fechaApertura = fechaApertura;
	}

	@Override
	public String toString() {
		return "Cuenta [numero=" + iban + ", titular=" + titular + ", saldo=" + saldo + ", fechaApertura="
				+ fechaApertura + "]";
	}
}
