package semana06;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.UIManager;

public class DialogoListar extends JDialog implements ActionListener {
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JButton btnCerrar;
	private JButton btnListar;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DialogoListar dialog = new DialogoListar();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public DialogoListar() {
		setTitle("Listar");
		setResizable(false);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 424, 212);
		getContentPane().add(scrollPane);

		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 12));
		scrollPane.setViewportView(txtS);

		panel = new JPanel();
		panel.setBounds(128, 238, 188, 23);
		getContentPane().add(panel);
		panel.setLayout(null);

		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setBounds(99, 0, 89, 23);
		panel.add(btnListar);
		
				btnCerrar = new JButton("Cerrar");
				btnCerrar.setBounds(0, 0, 89, 23);
				panel.add(btnCerrar);
		btnCerrar.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnListar) {
			actionPerformedBtnListar(e);
		}
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}

	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}

	protected void actionPerformedBtnListar(ActionEvent e) {
		txtS.setText("Listado de Colchones"+"\n\n");
		txtS.append("Marca     : Suavestar"+"\n");
		txtS.append("Precio    : S/ 499.0"+"\n");
		txtS.append("Garant�a  : 7 a�os"+"\n");
		txtS.append("Tama�o    : 1 1/2 Plaza"+"\n");
		txtS.append("Material  : Tela Tricot Acolchada"+"\n\n");
		txtS.append("Marca     : Springwall"+"\n");
		txtS.append("Precio    : S/ 679.0"+"\n");
		txtS.append("Garant�a  : 10 a�os"+"\n");
		txtS.append("Tama�o    : 2 Plazas"+"\n");
		txtS.append("Material  : Tejido de Punto de Algod�n"+"\n\n");
		txtS.append("Marca     : Paraiso"+"\n");
		txtS.append("Precio    : S/ 479.0"+"\n");
		txtS.append("Garant�a  : 5 a�os"+"\n");
		txtS.append("Tama�o    : 1 1/2 Plazas"+"\n");
		txtS.append("Material  : Tejido de Punto"+"\n\n");
		txtS.append("Marca     : Drimer"+"\n");
		txtS.append("Precio    : S/ 749.0"+"\n");
		txtS.append("Garant�a  : 4 a�os"+"\n");
		txtS.append("Tama�o    : Queen"+"\n");
		txtS.append("Material  : Jacquard"+"\n\n");
		txtS.append("Marca     : Cisne"+"\n");
		txtS.append("Precio    : S/ 389.0"+"\n");
		txtS.append("Garant�a  : 2 a�os"+"\n");
		txtS.append("Tama�o    : 1 1/2 Plazas"+"\n");
		txtS.append("Material  : Tejido de Punto");
	}
}
