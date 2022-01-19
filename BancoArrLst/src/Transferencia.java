import java.util.*;

/**
 * 
 */

/**
 * @author Mario Gabriel Núñez Alcázar de Velasco
 *
 */
public class Transferencia {
	/*
	 * Codigo Operación
	 */
	private int codOpe;
	/*
	/*
	 * Codigo Persona Emisora
	 */
	private int codPemi;
	/*
	 * Codigo Cuenta Emisora
	 */
	private int codCe;
	/*
	 * Codigo Persona Receptora
	 */
	private int codPr;
	/*
	 * Codigo Cuenta Receptora
	 */
	private int codCre;
	/*
	 * Fecha de operación
	 */
	private Date fechaOpe;
	/*
	 * Concepto
	 */
	private String concepto;
	/*
	 * importe
	 */
	private Double importe;
	
	/**
	 * 
	 */
	public Transferencia() {
	}
	
	/**
	 * @param codPemi
	 * @param codCe
	 * @param codPr
	 * @param codCre
	 * @param fechaOpe
	 * @param concepto
	 * @param importe
	 * @param codOpe
	 */
	public Transferencia(int codOpe, int codPemi, int codCe, int codPr, int codCre, Date fechaOpe, String concepto, Double importe) {
		this.codPemi = codPemi;
		this.codCe = codCe;
		this.codPr = codPr;
		this.codCre = codCre;
		this.fechaOpe = fechaOpe;
		this.concepto = concepto;
		this.importe = importe;
		this.codOpe = codOpe;
	}

	/**
	 * @return the codPemi
	 */
	public int getCodOpe() {
		return codOpe;
	}

	/**
	 * @param codPemi the codPemi to set
	 */
	public void setCodOpe(int codOpe) {
		this.codOpe = codOpe;
	}
	
	/**
	 * @return the codPemi
	 */
	public int getCodPemi() {
		return codPemi;
	}
	
	/**
	 * @param codPemi the codPemi to set
	 */
	public void setCodPemi(int codPemi) {
		this.codPemi = codPemi;
	}

	/**
	 * @return the codCe
	 */
	public int getCodCe() {
		return codCe;
	}

	/**
	 * @param codCe the codCe to set
	 */
	public void setCodCe(int codCe) {
		this.codCe = codCe;
	}

	/**
	 * @return the codPr
	 */
	public int getCodPr() {
		return codPr;
	}

	/**
	 * @param codPr the codPr to set
	 */
	public void setCodPr(int codPr) {
		this.codPr = codPr;
	}

	/**
	 * @return the codCre
	 */
	public int getCodCre() {
		return codCre;
	}

	/**
	 * @param codCre the codCre to set
	 */
	public void setCodCre(int codCre) {
		this.codCre = codCre;
	}

	/**
	 * @return the fechaOpe
	 */
	public Date getFechaOpe() {
		return fechaOpe;
	}

	/**
	 * @param fechaOpe the fechaOpe to set
	 */
	public void setFechaOpe(Date fechaOpe) {
		this.fechaOpe = fechaOpe;
	}

	/**
	 * @return the concepto
	 */
	public String getConcepto() {
		return concepto;
	}

	/**
	 * @param concepto the concepto to set
	 */
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	/**
	 * @return the importe
	 */
	public Double getImporte() {
		return importe;
	}

	/**
	 * @param importe the importe to set
	 */
	public void setImporte(Double importe) {
		this.importe = importe;
	}
}
