import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class ConnBasedatos {

Connection miConn=null;	
public Connection conectarBase() {

try {
			
Connection miConn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Restaurante","postgres", "J231890644");			
Statement miStatment = miConn.createStatement();

JOptionPane.showInternalMessageDialog( null, "La conexión fue realizada exitosamente");
						
} catch (Exception e) {
JOptionPane.showInternalMessageDialog(null, "Fallo al conectar:"+e.toString() );
		
}		
return miConn;		
}
}