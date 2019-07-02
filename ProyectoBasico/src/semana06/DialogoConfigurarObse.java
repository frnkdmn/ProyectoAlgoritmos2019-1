package semana06;

import java.awt.BorderLayout;


import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DialogoConfigurarObse extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtCantidadMinima;
	private JTextField txtObsequio;
	private JButton btnAceptar;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogoConfigurarObse dialog = new DialogoConfigurarObse();
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
	public DialogoConfigurarObse() {
		setTitle("Configurar obsequio");
		setBounds(100, 100, 500, 150);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Cantidad m\u00EDnima de colchones adquiridos ");
			lblNewLabel.setBounds(10, 11, 249, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Obsequio");
			lblNewLabel_1.setBounds(10, 36, 219, 14);
			contentPanel.add(lblNewLabel_1);
		}
		{
			txtCantidadMinima = new JTextField();
			txtCantidadMinima.setBounds(269, 8, 86, 20);
			contentPanel.add(txtCantidadMinima);
			txtCantidadMinima.setColumns(10);
		}
		{
			txtObsequio = new JTextField();
			txtObsequio.setBounds(269, 33, 86, 20);
			contentPanel.add(txtObsequio);
			txtObsequio.setColumns(10);
		}
		{
			btnAceptar = new JButton("Aceptar");
			btnAceptar.addActionListener(this);
			btnAceptar.setBounds(385, 7, 89, 23);
			contentPanel.add(btnAceptar);
		}
		{
			btnCerrar = new JButton("Cerrar");
			btnCerrar.addActionListener(this);
			btnCerrar.setBounds(385, 32, 89, 23);
			contentPanel.add(btnCerrar);
			txtCantidadMinima.setText(String.valueOf(Tienda.cantidadMinimaObsequiable));
			txtObsequio.setText(Tienda.obsequio);
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
		if (e.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(e);
		}
	}
	void mensaje(String msj){
		JOptionPane.showMessageDialog(this, msj);
	}
	
	protected void actionPerformedBtnAceptar(ActionEvent e) {
		procesar();
	}
	void procesar(){
		
		try {
			int cantidadMinima= Integer.parseInt(txtCantidadMinima.getText());
			String obsequio= txtObsequio.getText();
			if(cantidadMinima<0){
				mensaje("No se aceptan valores negativos");
			}else{
				Tienda.cantidadMinimaObsequiable=cantidadMinima;
				Tienda.obsequio=obsequio;
				dispose();
			}
		}
		catch (Exception e) {
			mensaje("Datos no válidos");
		}
		
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
}
