import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.UIManager;
import javax.swing.ImageIcon;

public class Valoresins extends JFrame {

private JPanel contenPane;
private JTable Matriz;
private JTextField textID;
private JTextField textNombre;
private JTextField textPrecio;
	
public static void main(String[] args) {
		
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
Valoresins frame = new Valoresins();
frame.setVisible(true);
					
} catch (Exception e) {
e.printStackTrace();
}
}
});
}

public Valoresins() { 
	
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 660, 466);
contenPane = new JPanel();
contenPane.setBorder(UIManager.getBorder("CheckBox.border"));

setContentPane(contenPane);
contenPane.setLayout(null);
		
JPanel panel = new JPanel();
panel.setBackground(new Color(0, 128, 0));
panel.setBounds(10, 11, 212, 276);
panel.setBorder(new LineBorder(new Color(0, 0, 0)));
contenPane.add(panel);
panel.setLayout(null);
		
JLabel lblID = new JLabel("ID:\n\r");
lblID.setForeground(new Color(255, 255, 255));
lblID.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
lblID.setBounds(10, 50, 58, 14);
panel.add(lblID);
		
JLabel lblNombre = new JLabel("Nombre:\n\r");
lblNombre.setForeground(new Color(255, 255, 255));
lblNombre.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
lblNombre.setBounds(10, 75, 66, 14);
panel.add(lblNombre);
		
JLabel lblPrecio = new JLabel("Precio:\t\n\r\t");
lblPrecio.setForeground(new Color(255, 255, 255));
lblPrecio.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
lblPrecio.setBounds(10, 100, 74, 14);
panel.add(lblPrecio);
		
textID = new JTextField();
textID.setFont(new Font("Yu Gothic UI", Font.PLAIN, 12));
textID.setBounds(100, 49, 86, 20);
panel.add(textID);
textID.setColumns(10);
		
textNombre = new JTextField();
textNombre.setFont(new Font("Yu Gothic UI", Font.PLAIN, 12));
textNombre.setColumns(10);
textNombre.setBounds(100, 74, 102, 20);
panel.add(textNombre);

textPrecio = new JTextField();
textPrecio.setFont(new Font("Yu Gothic UI", Font.PLAIN, 12));
textPrecio.setColumns(10);
textPrecio.setBounds(100, 99, 74, 20);
panel.add(textPrecio);
		
JButton btnGuardar = new JButton("Guardar datos");
btnGuardar.setFont(new Font("Yu Gothic UI", Font.PLAIN, 12));
btnGuardar.setBounds(9, 155, 164, 23);
panel.add(btnGuardar);
		
JButton btnEliminar = new JButton("Eliminar datos");
btnEliminar.setFont(new Font("Yu Gothic UI", Font.PLAIN, 12));
btnEliminar.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
}			
}
);
		
btnEliminar.setBounds(9, 189, 164, 23);
panel.add(btnEliminar);
		
JButton btnActualizar = new JButton("Actualizar datos");
btnActualizar.setFont(new Font("Yu Gothic UI", Font.PLAIN, 12));
btnActualizar.setBounds(9, 223, 165, 23);
panel.add(btnActualizar);
		
JLabel lblDatos = new JLabel("Datos");
lblDatos.setForeground(new Color(255, 255, 255));
lblDatos.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
lblDatos.setBounds(84, 11, 97, 14);
panel.add(lblDatos);
		
JPanel panel1 = new JPanel();
panel1.setBackground(new Color(0, 128, 0));
panel1.setBounds(231, 11, 403, 379);
panel1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Lista de Datos", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
contenPane.add(panel1);
panel1.setLayout(null);

Matriz = new JTable();
Matriz.setModel(new DefaultTableModel(
new Object[][] {
},
new String[] {
}
)
);
Matriz.setFont(new Font("Yu Gothic UI", Font.PLAIN, 12));
Matriz.setBounds(21, 26, 352, 332);
panel1.add(Matriz);
Valores objDatos = new Valores();
objDatos.MostarDatos(Matriz);

}
}