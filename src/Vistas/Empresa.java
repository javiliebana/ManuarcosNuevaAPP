package Vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Controlador.Controlador;
import Modelo.Modelo;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Empresa extends JFrame {
	private Modelo miModelo;
	private Controlador controlador;
	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JScrollPane scrollPane;
	private JButton btnModificar;
	private JButton btnAgregar;
	private JButton btnEliminar;
	private JLabel lblBuscarPorNombre;
	private JButton btnVolver;

	public Empresa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 815, 484);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 779, 246);
		contentPane.add(scrollPane);

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] { { "Google", "059685", "Gaena", "26/05/18", "c/Ponzo�a" },
				{ "Accenture", "15489", "Villaconejo", "05/04/18", "c/Lago" },
				{ "IBM", "363267", "Namibia", "26/02/18", "c/Mil Islas" }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null },

		}, new String[] { "Nombre", "Numero Convenio", "Localidad", "Fecha Firma", "Direccion" }));
		scrollPane.setViewportView(table);

		btnModificar = new JButton("Modificar");
		btnModificar.setBounds(10, 333, 89, 23);
		contentPane.add(btnModificar);

		btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(10, 299, 89, 23);
		contentPane.add(btnAgregar);

		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(10, 367, 89, 23);
		contentPane.add(btnEliminar);

		textField = new JTextField();
		textField.setBounds(403, 300, 172, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		lblBuscarPorNombre = new JLabel("Buscar por nombre:");
		lblBuscarPorNombre.setBounds(289, 303, 104, 14);
		contentPane.add(lblBuscarPorNombre);

		btnVolver = new JButton("<- Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.cerrarEmpresa();
			}
		});
		btnVolver.setBounds(700, 398, 89, 23);
		contentPane.add(btnVolver);
	}

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}

	public void setModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}
}
