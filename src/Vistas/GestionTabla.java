package Vistas;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Controlador.Controlador;
import Modelo.Modelo;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GestionTabla extends JFrame {
	private Modelo miModelo;
	private Controlador controlador;
	private JTable table;
	private JButton btnEliminar;
	private DefaultTableModel Modelo;
	private JScrollPane scrollPane;
	private JButton btnModificar;
	private JButton btnVolver;

	public GestionTabla() {
		getContentPane().setLayout(null);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 140, 807, 521);
		getContentPane().add(scrollPane);

		table = new JTable();
		Modelo = new DefaultTableModel(
				new Object[][] {
						{ "Pedro1", "Camacho", "123456789", "111111111", "1111111111", "1111111111", "1111111111" },
						{ "Pedro2", "Camacho", "123456789", "111111111", "1111111111", "1111111111", "1111111111" },
						{ "Pedro3", "Camacho", "123456789", "111111111", "1111111111", "1111111111", "1111111111" }, },
				new String[] { "Nombre", "Apellido", "numero alumno", "ciclo", "grupo", "empresa", "centro" });
		table.setModel(Modelo);
		scrollPane.setViewportView(table);

		btnModificar = new JButton("Modificar");
		btnModificar.setBounds(699, 31, 89, 23);
		getContentPane().add(btnModificar);

		btnEliminar = new JButton("- Eliminar");
		btnEliminar.setBounds(699, 77, 89, 23);
		getContentPane().add(btnEliminar);

		btnVolver = new JButton("<- Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.cerrarAjustes();
			}
		});
		btnVolver.setBounds(6, 6, 117, 29);
		getContentPane().add(btnVolver);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 807, 683);
		setLocationRelativeTo(null);
	}

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}

	public void setModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}
}
