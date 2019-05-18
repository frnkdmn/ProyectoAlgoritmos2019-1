package semana06;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class DialogoGenerarReportes extends JDialog implements ActionListener, ItemListener {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblNewLabel;
	private JComboBox<String> cboTipoReporte;
	private JButton btnCerrar;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogoGenerarReportes dialog = new DialogoGenerarReportes();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogoGenerarReportes() {
		setTitle("Generar Reportes");
		setBounds(100, 100, 540, 400);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblNewLabel = new JLabel("Tipo de Reporte");
		lblNewLabel.setBounds(10, 11, 91, 14);
		contentPanel.add(lblNewLabel);
		
		cboTipoReporte = new JComboBox<String>();
		cboTipoReporte.addItemListener(this);
		cboTipoReporte.setModel(new DefaultComboBoxModel<String>(new String[] {"Ventas por marca", "Marcas con venta \u00F3ptima", "Precios en relaci\u00F3n al promedio", "Precio promedio, mayor y menor"}));
		cboTipoReporte.setBounds(101, 8, 300, 20);
		contentPanel.add(cboTipoReporte);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(425, 7, 89, 23);
		contentPanel.add(btnCerrar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 36, 504, 314);
		contentPanel.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
		txtS.setText("Ventas por colch�n" + "\n\n");
		txtS.append ("Marcas			: Suavestar" + "\n");
		txtS.append ("Cantidad de ventas		: 5" + "\n");
		txtS.append ("Cantidad total de unidades vendidas 	: 12" + "\n");
		txtS.append ("Importente total acumulado		: S/. 5998.0"+ "\n\n");
		txtS.append ("Marca			: Springwall" + "\n");
		txtS.append ("Cantidad de ventas		: 6" + "\n");
		txtS.append ("Cantidad total de unidades vendidas	: 20" + "\n");
		txtS.append ("Importe total acumulado		: S/. 13580.0" + "\n");
		txtS.append ("." + "\n");
		txtS.append ("." + "\n");
		txtS.append ("." + "\n");
		txtS.append ("Importe total general acumulado	: S/. 66700.0" + "\n");
		txtS.append ("Cantidad total general de ventas	: 25 " + "\n");
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnNewButton(e);
		}
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
	}
	public void itemStateChanged(ItemEvent arg0) {
		if (arg0.getSource() == cboTipoReporte) {
			itemStateChangedCboTipoReporte(arg0);
		}
	}
	protected void itemStateChangedCboTipoReporte(ItemEvent arg0) {
		int item = cboTipoReporte.getSelectedIndex();
		switch (item) {
			case 0:
				txtS.setText("Ventas por colch�n" + "\n\n");
				txtS.append ("Marcas			: Suavestar" + "\n");
				txtS.append ("Cantidad de ventas		: 5" + "\n");
				txtS.append ("Cantidad total de unidades vendidas 	: 12" + "\n");
				txtS.append ("Importente total acumulado		: S/. 5998.0"+ "\n\n");
				txtS.append ("Marca			: Springwall" + "\n");
				txtS.append ("Cantidad de ventas		: 6" + "\n");
				txtS.append ("Cantidad total de unidades vendidas	: 20" + "\n");
				txtS.append ("Importe total acumulado		: S/. 13580.0" + "\n");
				txtS.append ("." + "\n");
				txtS.append ("." + "\n");
				txtS.append ("." + "\n");
				txtS.append ("Importe total general acumulado	: S/. 66700.0" + "\n");
				txtS.append ("Cantidad total general de ventas	: 25 " + "\n");
				break;
			case 1:
				txtS.setText("Colchones con venta �ptima" + "\n\n");
				txtS.append ("Marca			: Springwall" + "\n");
				txtS.append ("Cantidad total de unidades vendidas	: 15 (5 m�s que la cantidad �ptima)" + "\n\n");
				txtS.append ("Marca			: Cisne" + "\n");
				txtS.append ("Cantidad total de unidades vendidas	: 25 (15 m�s que la cantidad �ptima)" + "\n");
				txtS.append ("." + "\n");
				txtS.append ("." + "\n");
				txtS.append (".");
				break;
			case 2:
				txtS.setText("Precios en relaci�n al promedio" + "\n\n");
				txtS.append ("Nombre	: Suavestar" + "\n");
				txtS.append ("Precio	: 499.0 (menor al promedio)" + "\n\n");
				txtS.append ("Nombre	: Springwall" + "\n");
				txtS.append ("Precio	: 679.0 (mayor al promedio)" + "\n\n");
				txtS.append ("Nombre	: Paraiso" + "\n");
				txtS.append ("Precio	: 479.0 (menor al promedio)" + "\n\n");
				txtS.append ("Nombre	: Drimer" + "\n");
				txtS.append ("Precio	: 749.0 (mayor al promedio)" + "\n\n");
				txtS.append ("Nombre	: Cisne" + "\n");
				txtS.append ("Precio	: 389.0 (mayor al promedio)" + "\n\n");
				txtS.append ("Precio promedio : S/ 559.0");
				break;
			default:
				txtS.setText("Precio promedio, menor y mayor" + "\n\n");
				txtS.append ("Precio promedio : S/ 559.0" + "\n");
				txtS.append ("Precio menor	  : S/ 389.0" + "\n");
				txtS.append ("Precio mayor	  : S/ 749.0" + "\n");
				
		}
	}
}
