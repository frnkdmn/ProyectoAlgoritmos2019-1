package semana06;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JFrameTienda extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnArchivo;
	private JMenu mnMantenimiento;
	private JMenu mnVentas;
	private JMenu mnConfiguracin;
	private JMenu mnAyuda;
	private JMenuItem mntmSalir;
	private JMenuItem mntmConsultarColchn;
	private JMenuItem mntmModificarColchn;
	private JMenuItem mntmListarColchones;
	private JMenuItem mntmVender;
	private JMenuItem mntmGenerarReportes;
	private JMenuItem mntmConfigurarDescuentos;
	private JMenuItem mntmConfigurarObsequio;
	private JMenuItem mntmAcercaDeTienda;
	private JMenuItem mntmConfigurarCantidadptima;
	private JMenuItem mntmConfigurarPremioSorpresa;
	// Datos m�nimos del primer colch�n
	public static String marca0 = "Suavestar";
	public static double precio0 = 499.0;
	public static int garantia0 = 7;
	public static String tama�o0 = "1 1/2 Plaza";
	public static String material0 = "Tela Tricot Acolchada";
	// Datos m�nimos del segundo colch�n
	public static String marca1 = "Springwall";
	public static double precio1 = 679.0;
	public static int garantia1 = 10;
	public static String tama�o1 = "2 Plazas";
	public static String material1 = "Tejido de Punto con Algod�n Org�nico";
	// Datos m�nimos del tercer colch�n
	public static String marca2 = "Paraiso";
	public static double precio2 = 479.0;
	public static int garantia2 = 5;
	public static String tama�o2 = "1 1/2 Plazas";
	public static String material2 = "Tejido de Punto";
	// Datos m�nimos del cuarto colch�n
	public static String marca3 = "Drimer";
	public static double precio3 = 749.0;
	public static int garantia3 = 4;
	public static String tama�o3 = "Queen";
	public static String material3 = "Jacquard";
	// Datos m�nimos del quinto colch�n
	public static String marca4 = "Cisne";
	public static double precio4 = 389.0;
	public static int garantia4 = 2;
	public static String tama�o4 = "1 1/2 Plazas";
	public static String material4 = "Tejido de Punto";
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameTienda frame = new JFrameTienda();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JFrameTienda() {
		setTitle("Tienda 1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(this);
		mnArchivo.add(mntmSalir);
		
		mnMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento);
		
		mntmConsultarColchn = new JMenuItem("Consultar colch\u00F3n");
		mnMantenimiento.add(mntmConsultarColchn);
		
		mntmModificarColchn = new JMenuItem("Modificar colch\u00F3n");
		mnMantenimiento.add(mntmModificarColchn);
		
		mntmListarColchones = new JMenuItem("Listar colchones");
		mnMantenimiento.add(mntmListarColchones);
		
		mnVentas = new JMenu("Ventas");
		menuBar.add(mnVentas);
		
		mntmVender = new JMenuItem("Vender");
		mnVentas.add(mntmVender);
		
		mntmGenerarReportes = new JMenuItem("Generar reportes");
		mnVentas.add(mntmGenerarReportes);
		
		mnConfiguracin = new JMenu("Configuraci\u00F3n");
		menuBar.add(mnConfiguracin);
		
		mntmConfigurarDescuentos = new JMenuItem("Configurar descuentos");
		mnConfiguracin.add(mntmConfigurarDescuentos);
		
		mntmConfigurarObsequio = new JMenuItem("Configurar obsequio");
		mnConfiguracin.add(mntmConfigurarObsequio);
		
		mntmConfigurarCantidadptima = new JMenuItem("Configurar cantidad \u00F3ptima de colchones vendidos");
		mnConfiguracin.add(mntmConfigurarCantidadptima);
		
		mntmConfigurarPremioSorpresa = new JMenuItem("Configurar premio sorpresa");
		mnConfiguracin.add(mntmConfigurarPremioSorpresa);
		
		mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		mntmAcercaDeTienda = new JMenuItem("Acerca de Tienda");
		mnAyuda.add(mntmAcercaDeTienda);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}
	

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == mntmSalir) {
			actionPerformedMntmSalir(arg0);
		}
	}
	protected void actionPerformedMntmSalir(ActionEvent arg0) {
		System.exit(0);
	}
}