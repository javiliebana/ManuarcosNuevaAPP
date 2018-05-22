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
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;

public class Admin extends JFrame {
	private Modelo miModelo;
	private Controlador controlador;
	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_3;
	private JScrollPane scrollPane;
	private JLabel lblNombretutor;
	private JLabel lblNombre;
	private JLabel lblApellido;
	private JTextField textField_2;
	private JLabel lblGrupo;
	private JComboBox comboBox;
	private JButton btnAjustes;
	private JComboBox comboBox_1;
	private JButton btnEmpresa;
	private JRadioButton rdbtnAlcobendas;
	private JLabel lblCiclo;
	private JLabel lblEmpresa;
	private JRadioButton rdbtnVillaviciosa;
	private JButton btnAadir;

	public Admin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 735, 429);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 156, 699, 234);
		contentPane.add(scrollPane);

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] {
				{ "DAM", "206", "Javier", "Liebana", "04769473", "Villaviciosa", "Pedro Camacho", null },
				{ "DAM", "206", "Jorge", "Algo", "687463868", "Villaviciosa", "Pedro Camacho", "Google" },
				{ null, null, null, null, null, null, null, null }, { null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null }, { null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null }, { null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null }, { null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null }, { null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null }, },
				new String[] { "Ciclo", "Grupo", "Nombre", "Apellido", "N\u00BAAlumno", "Centro", "Tutor",
						"Empresa" }));
		scrollPane.setViewportView(table);

		lblNombretutor = new JLabel("Tutor");
		lblNombretutor.setBounds(10, 11, 89, 14);
		contentPane.add(lblNombretutor);

		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(281, 61, 46, 14);
		contentPane.add(lblNombre);

		textField = new JTextField();
		textField.setBounds(337, 58, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		lblApellido = new JLabel("Apellido\r\n");
		lblApellido.setBounds(447, 60, 46, 14);
		contentPane.add(lblApellido);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(503, 58, 107, 20);
		contentPane.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(337, 94, 86, 20);
		contentPane.add(textField_3);

		lblGrupo = new JLabel("Grupo");
		lblGrupo.setBounds(281, 96, 46, 14);
		contentPane.add(lblGrupo);

		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "DAM", "ASIR" }));
		comboBox.setBounds(198, 91, 58, 23);
		contentPane.add(comboBox);

		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "Google" }));
		comboBox_1.setBounds(503, 93, 107, 22);
		contentPane.add(comboBox_1);

		btnAjustes = new JButton("Modificar");
		btnAjustes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.abrirAjustes();
			}
		});
		btnAjustes.setBounds(620, 7, 89, 23);
		contentPane.add(btnAjustes);

		btnEmpresa = new JButton("Empresa");
		btnEmpresa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.abrirEmpresa();
			}
		});
		btnEmpresa.setBounds(422, 7, 89, 23);
		contentPane.add(btnEmpresa);

		rdbtnVillaviciosa = new JRadioButton("VillaViciosa");
		rdbtnVillaviciosa.setBounds(95, 57, 80, 23);
		contentPane.add(rdbtnVillaviciosa);

		rdbtnAlcobendas = new JRadioButton("Alcobendas");
		rdbtnAlcobendas.setBounds(95, 91, 109, 23);
		contentPane.add(rdbtnAlcobendas);

		lblCiclo = new JLabel("Ciclo:");
		lblCiclo.setBounds(198, 58, 46, 20);
		contentPane.add(lblCiclo);

		lblEmpresa = new JLabel("Empresa:");
		lblEmpresa.setBounds(447, 94, 46, 20);
		contentPane.add(lblEmpresa);
		
		btnAadir = new JButton("A\u00F1adir");
		btnAadir.setBounds(521, 7, 89, 23);
		contentPane.add(btnAadir);
	}

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}

	public void setModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}
}
