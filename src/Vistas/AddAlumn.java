package Vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AddAlumn extends JFrame {

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
					AddAlumn frame = new AddAlumn();
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
	public AddAlumn() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAadir = new JLabel("A\u00F1adir");
		lblAadir.setBounds(10, 11, 46, 14);
		contentPane.add(lblAadir);
		
		JLabel lblNombre = new JLabel("Nombre:\r\n");
		lblNombre.setBounds(106, 82, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellidos = new JLabel("Segundo apellido:\r\n");
		lblApellidos.setBounds(106, 107, 86, 14);
		contentPane.add(lblApellidos);
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setBounds(106, 157, 46, 14);
		contentPane.add(lblDni);
		
		JLabel lblPrimerApellido = new JLabel("Primer apellido:");
		lblPrimerApellido.setBounds(106, 132, 81, 14);
		contentPane.add(lblPrimerApellido);
		
		textField = new JTextField();
		textField.setBounds(198, 79, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(197, 104, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(197, 129, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(198, 154, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
	}
}
