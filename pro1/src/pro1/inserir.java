package pro1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JTextField;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class inserir {

	private JFrame frame;
	private JTextField tipo;
	private JTextField cidade;
	private JTextField olocal;
	private JTextField area;
	private JTextField obs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					inserir window = new inserir();
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
	public inserir() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(100, 100, 319, 463);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("INSERIR: \r\n");
		lblNewLabel.setBounds(10, 11, 283, 19);
		frame.getContentPane().add(lblNewLabel);
		
		tipo = new JTextField();
		tipo.setBounds(10, 66, 211, 19);
		frame.getContentPane().add(tipo);
		tipo.setColumns(10);
		
		JLabel lblNumero_1 = new JLabel("Qual a o Tipo de Solicita\u00E7\u00E3o?");
		lblNumero_1.setBounds(10, 41, 235, 14);
		frame.getContentPane().add(lblNumero_1);
		
		JLabel lblQualAcidade = new JLabel("Qual a cidade?");
		lblQualAcidade.setBounds(9, 123, 201, 19);
		frame.getContentPane().add(lblQualAcidade);
		
		JLabel lblQualOlocal = new JLabel("Qual o local:");
		lblQualOlocal.setBounds(10, 154, 235, 19);
		frame.getContentPane().add(lblQualOlocal);
		
		JLabel lblQualaArea = new JLabel("\u00C1rea Servi\u00E7o:");
		lblQualaArea.setBounds(8, 185, 119, 19);
		frame.getContentPane().add(lblQualaArea);
		
		JLabel lblQualObservaoDo = new JLabel("Qual observa\u00E7\u00E3o da manuten\u00E7\u00E3o \u00E9 relevante:");
		lblQualObservaoDo.setBounds(8, 216, 455, 19);
		frame.getContentPane().add(lblQualObservaoDo);
		
		
		cidade = new JTextField();
		cidade.setBounds(144, 122, 150, 20);
		frame.getContentPane().add(cidade);
		cidade.setColumns(10);
		
		olocal = new JTextField();
		olocal.setColumns(10);
		olocal.setBounds(144, 153, 151, 20);
		frame.getContentPane().add(olocal);
		
		area = new JTextField();
		area.setColumns(10);
		area.setBounds(144, 184, 149, 20);
		frame.getContentPane().add(area);
		
		obs = new JTextField();
		area.setColumns(10);
		area.setBounds(144, 184, 149, 20);
		frame.getContentPane().add(obs);
		
		JButton BOTAO = new JButton("EXECUTAR");
		BOTAO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			String tipo1 = tipo.getText();
			String cidade1 = cidade.getText();
			String olocal1 = olocal.getText();
			String area1 = area.getText();
			String obs1 = obs.getText();
			Controle co = new Controle();
			co.insere(tipo1, cidade1, olocal1, area1, obs1);
			frame.dispose();
			}
		});
		BOTAO.setBounds(94, 316, 102, 49);
		frame.getContentPane().add(BOTAO);
		
		obs = new JTextField();
		obs.setColumns(10);
		obs.setBounds(10, 246, 283, 59);
		frame.getContentPane().add(obs);
	}
}
