import java.sql.Statement;
import java.sql.*;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Valores {

int ID;
String Nombre;
int PrecioP;
	
public int getID() {
return ID;
}
public void setID(int id) {
ID = id;
}
public String getNombre() {
return Nombre;
}
public void setNombre(String nombre) {
Nombre = nombre;
}
public int getPrecioP() {
return PrecioP;
}
public void setPrecioP(int precioP) {
PrecioP = precioP;
}

public void MostarDatos(JTable MatrizDatos) {
		
ConnBasedatos objConn = new ConnBasedatos();
		
DefaultTableModel modelo = new DefaultTableModel();
		
String sql = "";
		
modelo.addColumn("ID");
modelo.addColumn("Nombre");
modelo.addColumn("Precio");
		
MatrizDatos.setModel(modelo);
		
sql = "Select * from Datos;";
		
String [] val = new String [3];
Statement miStatement;
		
try {
			
miStatement = objConn.conectarBase().createStatement();
ResultSet resul = miStatement.executeQuery(sql);

while(resul.next()) {
			 	
val[0] = resul.getString(1);
val[1] = resul.getString(2);
val[2] = resul.getString(3);
				
modelo.addRow(val);
					
}			
MatrizDatos.setModel(modelo);
			
} catch (Exception e) {

JOptionPane.showInternalMessageDialog(null, "Hubo un error: "+e.toString());
				
}		
}	
}