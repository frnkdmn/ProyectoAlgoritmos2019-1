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

public class Tienda extends JFrame implements ActionListener {

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
	// Porcentajes de descuento
	public static double porcentaje1 = 7.5;
	public static double porcentaje2 = 10.0;
	public static double porcentaje3 = 12.5;
	public static double porcentaje4 = 15.0;
	// Cantidad �ptima de colchones vendidos
	public static int cantidadOptima = 10;
	// Cantidad m�nima de colchones adquiridos para acceder al obsequio
	public static int cantidadMinimaObsequiable = 3;
	// Obsequio por cantidad m�nima de colchones adquiridos
	public static String obsequio = "USB";
	// N�mero de cliente que recibe el premio sorpresa
	public static int numeroClienteSorpresa = 5;
	// Premio sorpresa
	public static String premioSorpresa = "Un polo";
	// Contadores y Acumuladores
	public static int numeroCliente;
	public static int Ventas0,Ventas1,Ventas2,Ventas3,Ventas4;
	public static int TotalUnidadesVendidas0,TotalUnidadesVendidas1,TotalUnidadesVendidas2,TotalUnidadesVendidas3,TotalUnidadesVendidas4;
	public static double ImporteTotal0,ImporteTotal1,ImporteTotal2,ImporteTotal3,ImporteTotal4;
	public static double ImporteTotalGeneral;
	public static int CantidadTotalGeneral;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tienda frame = new Tienda();
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
	public Tienda() {
		setTitle("Tienda 1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		
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
		mntmConsultarColchn.addActionListener(this);
		mnMantenimiento.add(mntmConsultarColchn);
		
		mntmModificarColchn = new JMenuItem("Modificar colch\u00F3n");
		mntmModificarColchn.addActionListener(this);
		mnMantenimiento.add(mntmModificarColchn);
		
		mntmListarColchones = new JMenuItem("Listar colchones");
		mntmListarColchones.addActionListener(this);
		mnMantenimiento.add(mntmListarColchones);
		
		mnVentas = new JMenu("Ventas");
		menuBar.add(mnVentas);
		
		mntmVender = new JMenuItem("Vender");
		mntmVender.addActionListener(this);
		mnVentas.add(mntmVender);
		
		mntmGenerarReportes = new JMenuItem("Generar reportes");
		mntmGenerarReportes.addActionListener(this);
		mnVentas.add(mntmGenerarReportes);
		
		mnConfiguracin = new JMenu("Configuraci\u00F3n");
		menuBar.add(mnConfiguracin);
		
		mntmConfigurarDescuentos = new JMenuItem("Configurar descuentos");
		mntmConfigurarDescuentos.addActionListener(this);
		mnConfiguracin.add(mntmConfigurarDescuentos);
		
		mntmConfigurarObsequio = new JMenuItem("Configurar obsequio");
		mntmConfigurarObsequio.addActionListener(this);
		mnConfiguracin.add(mntmConfigurarObsequio);
		
		mntmConfigurarCantidadptima = new JMenuItem("Configurar cantidad \u00F3ptima de colchones vendidos");
		mntmConfigurarCantidadptima.addActionListener(this);
		mnConfiguracin.add(mntmConfigurarCantidadptima);
		
		mntmConfigurarPremioSorpresa = new JMenuItem("Configurar premio sorpresa");
		mntmConfigurarPremioSorpresa.addActionListener(this);
		mnConfiguracin.add(mntmConfigurarPremioSorpresa);
		
		mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		mntmAcercaDeTienda = new JMenuItem("Acerca de Tienda");
		mntmAcercaDeTienda.addActionListener(this);
		mnAyuda.add(mntmAcercaDeTienda);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}
	

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == mntmConfigurarObsequio) {
			actionPerformedMntmConfigurarObsequio(arg0);
		}
		if (arg0.getSource() == mntmConfigurarDescuentos) {
			actionPerformedMntmConfigurarDescuentos(arg0);
		}
		if (arg0.getSource() == mntmConfigurarPremioSorpresa) {
			actionPerformedMntmConfigurarPremioSorpresa(arg0);
		}
		if (arg0.getSource() == mntmConfigurarCantidadptima) {
			actionPerformedMntmConfigurarCantidadptima(arg0);
		}
		if (arg0.getSource() == mntmAcercaDeTienda) {
			actionPerformedMntmAcercaDeTienda(arg0);
		}
		if (arg0.getSource() == mntmVender) {
			actionPerformedMntmVender(arg0);
		}
		if (arg0.getSource() == mntmGenerarReportes) {
			actionPerformedMntmGenerarReportes(arg0);
		}
		if (arg0.getSource() == mntmListarColchones) {
			actionPerformedMntmListarColchones(arg0);
		}
		if (arg0.getSource() == mntmModificarColchn) {
			actionPerformedMntmModificarColchn(arg0);
		}
		if (arg0.getSource() == mntmConsultarColchn) {
			actionPerformedMntmConsultarColchn(arg0);
		}
		if (arg0.getSource() == mntmSalir) {
			actionPerformedMntmSalir(arg0);
		}
	}
	protected void actionPerformedMntmSalir(ActionEvent arg0) {
		System.exit(0);
	}
	protected void actionPerformedMntmConsultarColchn(ActionEvent arg0) {
		DialogoConsultar dc = new DialogoConsultar();
		dc.setVisible(true);
		dc.setLocationRelativeTo(this);
	}
	
	protected void actionPerformedMntmModificarColchn(ActionEvent arg0) {
		DialogoModificar dm = new DialogoModificar();
		dm.setVisible(true);
		dm.setLocationRelativeTo(this);
	}
	protected void actionPerformedMntmListarColchones(ActionEvent arg0) {
		DialogoListar dl = new DialogoListar();
		dl.setVisible(true);
		dl.setLocationRelativeTo(this);
	}
	protected void actionPerformedMntmGenerarReportes(ActionEvent arg0) {
		DialogoGenerarReportes dgr = new DialogoGenerarReportes();
		dgr.setVisible(true);
		dgr.setLocationRelativeTo(this);
	}
	protected void actionPerformedMntmVender(ActionEvent arg0) {
		DialogoVender dv = new DialogoVender();
		dv.setVisible(true);
		dv.setLocationRelativeTo(this);
	}
	protected void actionPerformedMntmAcercaDeTienda(ActionEvent arg0) {
		DialogoAcercaDeTienda dat = new DialogoAcercaDeTienda();
		dat.setVisible(true);
		dat.setLocationRelativeTo(this);
	}
	protected void actionPerformedMntmConfigurarCantidadptima(ActionEvent arg0) {
		DialogoConfigurarCO dcco = new DialogoConfigurarCO();
		dcco.setVisible(true);
		dcco.setLocationRelativeTo(this);
	}
	protected void actionPerformedMntmConfigurarPremioSorpresa(ActionEvent arg0) {
		DialogoConfigurarPS dcps = new DialogoConfigurarPS();
		dcps.setVisible(true);
		dcps.setLocationRelativeTo(this);
	}
	protected void actionPerformedMntmConfigurarDescuentos(ActionEvent arg0) {
		DialogoConfigurarDesc dcd = new DialogoConfigurarDesc();
		dcd.setVisible(true);
		dcd.setLocationRelativeTo(this);
	}
	
	protected void actionPerformedMntmConfigurarObsequio(ActionEvent arg0) {
		DialogoConfigurarObse dco = new DialogoConfigurarObse();
		dco.setVisible(true);
		dco.setLocationRelativeTo(this);
	}
}
