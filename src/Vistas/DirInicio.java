package Vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Controlador.Controlador;
import Modelo.Modelo;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;

public class DirInicio extends JFrame {
	private Modelo miModelo;
	private Controlador controlador;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JScrollPane scrollPane;
	private JLabel lblNombretutor;
	private JLabel lblNombre;
	private JLabel lblTutor;
	private JLabel lblApellido;
	private JTextField textField_2;
	private JLabel lblGrupo;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JPanel contentPane;
	private JLabel lblCiclo;
	private JLabel lblEmpresa;
	private JRadioButton rdbtnVillaviciosa;
	private JRadioButton rdbtnAlcobendas;
	private JTextField txtCreUnaContrasea;

	public DirInicio() {
		this.setTitle("Pesta�a de director");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 735, 429);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 145, 699, 234);
		contentPane.add(scrollPane);

		table = new JTable();
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				table.setModel(miModelo.getTablaGen());
			}
		});
		scrollPane.setViewportView(table);

		lblNombretutor = new JLabel("Director");
		lblNombretutor.setBounds(10, 11, 89, 14);
		contentPane.add(lblNombretutor);

		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(196, 65, 46, 14);
		contentPane.add(lblNombre);

		lblTutor = new JLabel("Tutor");
		lblTutor.setBounds(196, 99, 46, 14);
		contentPane.add(lblTutor);

		textField = new JTextField();
		textField.setBounds(252, 62, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(252, 96, 86, 20);
		contentPane.add(textField_1);

		lblApellido = new JLabel("Apellido\r\n");
		lblApellido.setBounds(362, 64, 46, 14);
		contentPane.add(lblApellido);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(418, 62, 107, 20);
		contentPane.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(418, 96, 107, 20);
		contentPane.add(textField_3);

		lblGrupo = new JLabel("Grupo");
		lblGrupo.setBounds(362, 98, 46, 14);
		contentPane.add(lblGrupo);

		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "DAM", "ASIR" }));
		comboBox.setBounds(114, 95, 58, 23);
		contentPane.add(comboBox);

		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "Google" }));
		comboBox_1.setBounds(571, 95, 89, 22);
		contentPane.add(comboBox_1);

		lblCiclo = new JLabel("Ciclo:");
		lblCiclo.setBounds(114, 65, 46, 14);
		contentPane.add(lblCiclo);

		lblEmpresa = new JLabel("Empresa:");
		lblEmpresa.setBounds(571, 65, 46, 14);
		contentPane.add(lblEmpresa);

		rdbtnVillaviciosa = new JRadioButton("VillaViciosa");
		rdbtnVillaviciosa.setBounds(0, 61, 99, 23);
		contentPane.add(rdbtnVillaviciosa);

		rdbtnAlcobendas = new JRadioButton("Alcobendas");
		rdbtnAlcobendas.setBounds(0, 95, 99, 23);
		contentPane.add(rdbtnAlcobendas);

		txtCreUnaContrasea = new JTextField();
		txtCreUnaContrasea.setText("Creé una contraseña....");
		txtCreUnaContrasea.setBounds(551, 11, 158, 26);
		contentPane.add(txtCreUnaContrasea);
		txtCreUnaContrasea.setColumns(10);

		JButton btnGenerar = new JButton("Generar");
		btnGenerar.setBounds(448, 13, 89, 23);
		contentPane.add(btnGenerar);

	}

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}

	public void setModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}
}
