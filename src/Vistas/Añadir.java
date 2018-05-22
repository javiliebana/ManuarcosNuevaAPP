package Vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;

public class Añadir extends JFrame {

	private JPanel contentPane;
	private JLabel lblCrear;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Añadir frame = new Añadir();
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
	public Añadir() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnTutor = new JButton("Tutor");
		btnTutor.setBounds(78, 117, 106, 43);
		contentPane.add(btnTutor);
		
		JButton btnAlumno = new JButton("Alumno");
		btnAlumno.setBounds(215, 117, 99, 43);
		contentPane.add(btnAlumno);
		
		lblCrear = new JLabel("Crear");
		lblCrear.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCrear.setBounds(170, 11, 66, 23);
		contentPane.add(lblCrear);
	}
}
