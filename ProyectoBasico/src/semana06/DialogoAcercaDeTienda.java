package semana06;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JSeparator;

public class DialogoAcercaDeTienda extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblTienda;
	private JButton btnCerrar;
	private JLabel lblAutor;
	private JSeparator separator;
	private JLabel lblFrancoRomeroMorales;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;

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
		try {
			DialogoAcercaDeTienda dialog = new DialogoAcercaDeTienda();
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
	public DialogoAcercaDeTienda() {
		setResizable(false);
		setTitle("Acerca de Tienda");
		setBounds(100, 100, 450, 260);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		lblTienda = new JLabel("Tienda 1.0");
		lblTienda.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTienda.setBounds(186, 11, 72, 17);
		contentPanel.add(lblTienda);

		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(186, 197, 89, 23);
		contentPanel.add(btnCerrar);

		lblAutor = new JLabel("Autores");
		lblAutor.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAutor.setBounds(197, 58, 50, 15);
		contentPanel.add(lblAutor);
		
		separator = new JSeparator();
		separator.setBounds(10, 39, 424, 3);
		contentPanel.add(separator);
		
		lblFrancoRomeroMorales = new JLabel("Franco Romero Morales");
		lblFrancoRomeroMorales.setBounds(151, 134, 166, 14);
		contentPanel.add(lblFrancoRomeroMorales);
		
		lblNewLabel = new JLabel("Bruno Alonso De La Cruz Aliaga");
		lblNewLabel.setBounds(151, 84, 166, 14);
		contentPanel.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Nahun Jos\u00E9 Pecho Marcos");
		lblNewLabel_1.setBounds(151, 159, 166, 14);
		contentPanel.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Clemente romero Sting Joel");
		lblNewLabel_2.setBounds(151, 109, 166, 14);
		contentPanel.add(lblNewLabel_2);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}

	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
}
