package Vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.SystemColor;

public class Addtutor extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Addtutor frame = new Addtutor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Addtutor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCrearTutor = new JLabel("Crear tutor");
		lblCrearTutor.setForeground(Color.BLACK);
		lblCrearTutor.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCrearTutor.setBounds(152, 11, 119, 35);
		contentPane.add(lblCrearTutor);
		
		textField = new JTextField();
		textField.setForeground(Color.BLACK);
		textField.setBounds(225, 77, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNmeroDeMatrcula = new JLabel("NIF");
		lblNmeroDeMatrcula.setBounds(109, 80, 106, 14);
		contentPane.add(lblNmeroDeMatrcula);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(109, 105, 106, 14);
		contentPane.add(lblNombre);
		
		JLabel lblPrimerApellido = new JLabel("Primer apellido");
		lblPrimerApellido.setBounds(109, 130, 106, 14);
		contentPane.add(lblPrimerApellido);
		
		JLabel lblSegundoApellido = new JLabel("Segundo apellido");
		lblSegundoApellido.setBounds(109, 155, 106, 14);
		contentPane.add(lblSegundoApellido);
		
		textField_1 = new JTextField();
		textField_1.setBounds(225, 102, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(225, 127, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(225, 152, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnCrear = new JButton("Crear");
		btnCrear.setForeground(SystemColor.desktop);
		btnCrear.setBounds(152, 205, 89, 23);
		contentPane.add(btnCrear);
	}
}
