package pro1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Janela {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela window = new Janela();
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
	public Janela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 307, 346);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel INFOS = new JLabel("Selecione o que deseja executar:\r\n\r\n");
		INFOS.setBounds(10, 11, 414, 35);
		frame.getContentPane().add(INFOS);
		
		JLabel lblInserirLixeira = new JLabel("1- Inserir OS");
		lblInserirLixeira.setBounds(10, 48, 105, 35);
		frame.getContentPane().add(lblInserirLixeira);
		
		JLabel lblAlterarLixeira = new JLabel("2- Alterar OS");
		lblAlterarLixeira.setBounds(9, 82, 101, 35);
		frame.getContentPane().add(lblAlterarLixeira);
		
		JLabel INFOS_1_1 = new JLabel("3- Excluir OS");
		INFOS_1_1.setBounds(9, 119, 106, 35);
		frame.getContentPane().add(INFOS_1_1);
		
		JLabel lblBuscarLixeira = new JLabel("4- Buscar OS");
		lblBuscarLixeira.setBounds(10, 151, 105, 35);
		frame.getContentPane().add(lblBuscarLixeira);
		
		JLabel INFOS_1_2 = new JLabel("5- Relatorio das OS'S");
		INFOS_1_2.setBounds(10, 188, 317, 35);
		frame.getContentPane().add(INFOS_1_2);
		
		JLabel INFOS_1_2_1 = new JLabel("6- Sair");
		INFOS_1_2_1.setBounds(10, 222, 41, 35);
		frame.getContentPane().add(INFOS_1_2_1);
		
		JButton btnNewButton = new JButton("executar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0){
			new inserir();	
			}
		});
		btnNewButton.setBounds(192, 48, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("executar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ERROR ();
			}
		});
		btnNewButton_1.setBounds(192, 88, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("executar");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			new ERROR ();
			}
		});
		btnNewButton_1_1.setBounds(192, 194, 89, 23);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("executar");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			new ERROR ();
			}
		});
		btnNewButton_1_2.setBounds(192, 157, 89, 23);
		frame.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("executar");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			new excluir();
			}
		});
		btnNewButton_1_3.setBounds(192, 125, 89, 23);
		frame.getContentPane().add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("executar");
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			new ERROR ();
			}
		});
		btnNewButton_1_4.setBounds(192, 228, 89, 23);
		frame.getContentPane().add(btnNewButton_1_4);
	}
}
