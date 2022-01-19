import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * 
 */

/**
 * @author Mario Gabriel Núñez Alcázar de Velasco
 *
 */
public class Back {
	public static Conexion conex = new Conexion();
	
	public static ArrayList<Persona> selectPe() {
		ArrayList<Persona> pers = new ArrayList<Persona>();

		String query = "SELECT * FROM PERSONAS";
		
		ResultSet result = null;
		PreparedStatement statment = null;
		result = null;
		
		conex.conect();
		
		try {
			statment = conex.getConexion().prepareStatement(query);
			result = statment.executeQuery();
		} catch (SQLException e) {
			System.out.println("error en la consulta");
		}
		
		try {
			int x = 0;
			while(result.next() == true) {
				pers.add(x, new Persona());
				pers.get(x).setIdPer(result.getInt("CODP"));
				pers.get(x).setNmbr(result.getString("APELLNOM"));
				pers.get(x).setNif(result.getString("NIF"));
				pers.get(x).setEml(result.getString("EMAIL"));
				pers.get(x).setDmcl(result.getString("DIRECCION"));
				pers.get(x).setTlfn(result.getString("TLF"));
				pers.get(x).setfNacim(result.getDate("FNACI"));
				x++;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error: Dato no encontrado");
		}
		
		conex.desconexion();
		
		return pers;
	}
	
	public static ArrayList<Cuenta> selectCu() {
		ArrayList<Cuenta> cue_s = new ArrayList<Cuenta>();
		
		String query = "SELECT * FROM CUENTAS";
		
		ResultSet result = null;
		PreparedStatement statment = null;
		result = null;
		
		conex.conect();
		
		try {
			statment = conex.getConexion().prepareStatement(query);
			result = statment.executeQuery();
		} catch (SQLException e) {
			System.out.println("error en la consulta");
		}
		
		try {
			int x = 0;
			while(result.next() == true) {
				cue_s.add(x, new Cuenta());
				cue_s.get(x).setIdCu(result.getInt("CODC"));
				cue_s.get(x).setIban(result.getString("IBAN"));
				cue_s.get(x).setBsrvcns(result.getString("BANCO"));
				cue_s.get(x).setDirSuc(result.getString("DIRSUC"));
				x++;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error: Dato no encontrado");
		}
		
		conex.desconexion();
		
		return cue_s;
	}
	
	public static ArrayList<Asignacion> selectAs() {
		ArrayList<Asignacion> asig = new ArrayList<Asignacion>();
		
		String query = "SELECT * FROM ASIGNACION";
		
		ResultSet result = null;
		PreparedStatement statment = null;
		result = null;
		
		conex.conect();
		
		try {
			statment = conex.getConexion().prepareStatement(query);
			result = statment.executeQuery();
		} catch (SQLException e) {
			System.out.println("error en la consulta");
		}
		
		try {
			int x = 0;
			while(result.next() == true) {
				asig.add(x, new Asignacion());
				asig.get(x).setCodp(result.getInt("APELLNOM"));
				asig.get(x).setCodc(result.getInt("NIF"));
				asig.get(x).setAlta(result.getDate("EMAIL"));
				asig.get(x).setBaja(result.getDate("DIRECCION"));
				asig.get(x).setObservacion(result.getString("TLF"));
				x++;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error: Dato no encontrado");
		}
		
		conex.desconexion();
		
		return asig;
	}
	
	public static ArrayList<Transferencia> selectTr() {
		ArrayList<Transferencia> trans = new ArrayList<Transferencia>();
		
		String query = "SELECT * FROM PERSONAS";
		
		ResultSet result = null;
		PreparedStatement statment = null;
		result = null;
		
		conex.conect();
		
		try {
			statment = conex.getConexion().prepareStatement(query);
			result = statment.executeQuery();
		} catch (SQLException e) {
			System.out.println("error en la consulta");
		}
		
		try {
			int x = 0;
			while(result.next() == true) {
				trans.add(x, new Transferencia());
				trans.get(x).setCodOpe(result.getInt("CODOPE"));
				trans.get(x).setCodPemi(result.getInt("CODPEMI"));
				trans.get(x).setCodCe(result.getInt("CODCE"));
				trans.get(x).setCodPr(result.getInt("CODPR"));
				trans.get(x).setCodCre(result.getInt("CODCRE"));
				trans.get(x).setFechaOpe(result.getDate("FECHAOPE"));
				trans.get(x).setConcepto(result.getString("CONCEPTO"));
				trans.get(x).setImporte(result.getDouble("IMPORTE"));
				x++;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error: Dato no encontrado");
		}
		
		conex.desconexion();
		
		return trans;
	}

}
