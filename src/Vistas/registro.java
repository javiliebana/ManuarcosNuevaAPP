package Vistas;

import java.awt.EventQueue;
import Modelo.Modelo;
import Controlador.Controlador;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class registro extends JFrame{
	private Modelo miModelo;
	private Controlador controlador;
	private JFrame frame;
	private JPasswordField passwordField;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel lblNombre;
	private JLabel lblContrasea;
	private JLabel lblEmail;
	private JLabel lblApellido_1;
	private JLabel lblApellido;
	private JLabel lblRegistro;
	private JLabel lblUsuario;
	private JComboBox comboBox;
	private JButton btnVolver;
	private JButton btnRegistrarse;

	public registro() {
		this.setTitle("Pestaña de Registro");
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		lblNombre = new JLabel("Nombre : ");
		lblNombre.setBounds(78, 51, 66, 14);
		frame.getContentPane().add(lblNombre);

		lblApellido = new JLabel("Apellido 1 : ");
		lblApellido.setBounds(69, 76, 75, 14);
		frame.getContentPane().add(lblApellido);

		lblApellido_1 = new JLabel("Apellido 2 : ");
		lblApellido_1.setBounds(69, 101, 75, 14);
		frame.getContentPane().add(lblApellido_1);

		lblEmail = new JLabel("Email : ");
		lblEmail.setBounds(89, 154, 53, 14);
		frame.getContentPane().add(lblEmail);

		lblContrasea = new JLabel("Contrase\u00F1a : ");
		lblContrasea.setBounds(55, 183, 89, 14);
		frame.getContentPane().add(lblContrasea);

		passwordField = new JPasswordField();
		passwordField.setBounds(154, 180, 129, 20);
		frame.getContentPane().add(passwordField);

		textField = new JTextField();
		textField.setBounds(154, 151, 220, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(154, 98, 129, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(154, 73, 129, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(154, 48, 129, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);

		lblRegistro = new JLabel("Registro");
		lblRegistro.setFont(new Font("Sitka Heading", Font.PLAIN, 25));
		lblRegistro.setBounds(170, 11, 92, 26);
		frame.getContentPane().add(lblRegistro);

		btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setBounds(316, 227, 108, 23);
		frame.getContentPane().add(btnRegistrarse);

		btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.cerrarRegistro();
			}
		});
		btnVolver.setBounds(10, 227, 89, 23);
		frame.getContentPane().add(btnVolver);

		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Administrador", "Tutor", "Director" }));
		comboBox.setBounds(164, 211, 108, 20);
		frame.getContentPane().add(comboBox);

		lblUsuario = new JLabel("Usuario : ");
		lblUsuario.setBounds(78, 129, 66, 14);
		frame.getContentPane().add(lblUsuario);

		textField_4 = new JTextField();
		textField_4.setBounds(154, 126, 129, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
	}

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}

	public void setModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}

}
