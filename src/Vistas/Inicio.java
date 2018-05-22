package Vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.Controlador;
import Modelo.Modelo;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Inicio extends JFrame {
	private Modelo miModelo;
	private Controlador controlador;
	private JPanel contentPane;
	private JLabel lblInicio;
	private JButton btnBoton;
	public Object dataSource;
	public static JTextField txtuser;
	public static JPasswordField pwdf;

	public Inicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblInicio = new JLabel("Inicio");
		lblInicio.setFont(new Font("Tahoma", Font.PLAIN, 34));
		lblInicio.setBounds(172, 11, 95, 44);
		contentPane.add(lblInicio);

		btnBoton = new JButton("Logeate");

		btnBoton.setBounds(172, 173, 89, 23);
		contentPane.add(btnBoton);
		btnBoton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtuser.getText().equals("Pedro"))
					controlador.validarLogTutor();
				else if (txtuser.getText().equals("Ana"))
					controlador.validarLogDirectora();
				else if (txtuser.getText().equals("admin"))
					System.out.println("En la proxima versión se añadira el rol de admin");
				else
					controlador.cerrado();

			}
		});
		txtuser = new JTextField();
		txtuser.setBounds(148, 66, 130, 26);
		contentPane.add(txtuser);
		txtuser.setColumns(10);

		JLabel lblUsuario = new JLabel("USUARIO");
		lblUsuario.setBounds(53, 72, 82, 14);
		contentPane.add(lblUsuario);

		pwdf = new JPasswordField();
		pwdf.setBounds(148, 115, 130, 20);
		contentPane.add(pwdf);

		JLabel lblContrasea = new JLabel("CONTRASE\u00D1A");
		lblContrasea.setBounds(53, 118, 82, 14);
		contentPane.add(lblContrasea);
	}

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}

	public void setModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}
}
