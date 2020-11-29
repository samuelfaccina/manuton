package pro1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JTextField;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class excluir {

	private JFrame frame;
	private JTextField caseescolha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					excluir window = new excluir();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public excluir() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(100, 100, 319, 214);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("EXCLUIR\r\n:");
		lblNewLabel.setBounds(10, 11, 283, 19);
		frame.getContentPane().add(lblNewLabel);
		
		caseescolha = new JTextField();
		caseescolha.setBounds(10, 66, 211, 19);
		frame.getContentPane().add(caseescolha);
		caseescolha.setColumns(10);
		
		JLabel lblNumero_1 = new JLabel("Qual o numero da OS?");
		lblNumero_1.setBounds(10, 41, 235, 14);
		frame.getContentPane().add(lblNumero_1);
		
		JButton BOTAO = new JButton("EXECUTAR");
		BOTAO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			String id1 = caseescolha.getText();
			Controle co = new Controle();
			co.exclui(id1);
			frame.dispose();
			}
		});
		BOTAO.setBounds(10, 115, 283, 49);
		frame.getContentPane().add(BOTAO);
	}
}
