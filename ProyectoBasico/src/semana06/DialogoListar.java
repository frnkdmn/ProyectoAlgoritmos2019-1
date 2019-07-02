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
	void imprimir(String texto){
		txtS.append(""+texto+"\n");
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}

	protected void actionPerformedBtnListar(ActionEvent e) {
		procesar();
	}
	void procesar(){
		txtS.setText("");
		imprimir("Listado de Colchones"+"\n");
		imprimir("Marca     : "+Tienda.marca0);
		imprimir("Precio    : "+Tienda.precio0);
		imprimir("Garant�a  : "+Tienda.garantia0);
		imprimir("Tama�o    : "+Tienda.tama�o0);
		imprimir("Material  : "+Tienda.material0+"\n");
		imprimir("Marca     : "+Tienda.marca1);
		imprimir("Precio    : "+Tienda.precio1);
		imprimir("Garant�a  : "+Tienda.garantia1);
		imprimir("Tama�o    : "+Tienda.tama�o1);
		imprimir("Material  : "+Tienda.material1+"\n");
		imprimir("Marca     : "+Tienda.marca2);
		imprimir("Precio    : "+Tienda.precio2);
		imprimir("Garant�a  : "+Tienda.garantia2);
		imprimir("Tama�o    : "+Tienda.tama�o2);
		imprimir("Material  : "+Tienda.material2+"\n");
		imprimir("Marca     : "+Tienda.marca3);
		imprimir("Precio    : "+Tienda.precio3);
		imprimir("Garant�a  : "+Tienda.garantia3);
		imprimir("Tama�o    : "+Tienda.tama�o3);
		imprimir("Material  : "+Tienda.material3+"\n");
		imprimir("Marca     : "+Tienda.marca4);
		imprimir("Precio    : "+Tienda.precio4);
		imprimir("Garant�a  : "+Tienda.garantia4);
		imprimir("Tama�o    : "+Tienda.tama�o4);
		imprimir("Material  : "+Tienda.material4);
	}
}
