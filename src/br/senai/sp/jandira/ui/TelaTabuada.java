package br.senai.sp.jandira.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import br.senai.sp.jandira.model.Tabuada;

public class TelaTabuada {

	public void criarTela() {

		// fontes do projeto
		Font titulo = new Font("Arial", Font.BOLD, 40);
		Font labels = new Font("Arial", Font.PLAIN, 20);
		Font botoes = new Font("Arial", Font.BOLD, 15);
		// Cores do projeto
		Color azul = new Color(66, 133, 244);
		Color verde = new Color(56, 197, 35);

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 600);
		frame.setTitle("Tabuada");
		frame.setLayout(null);

		// criar header do frame
		JPanel header = new JPanel();
		header.setBounds(0, 0, 600, 100);
		header.setBackground(Color.WHITE);
		header.setLayout(null);

		JLabel lblTitulo = new JLabel("Tabuada");
		lblTitulo.setBounds(20, 30, 300, 30);
		lblTitulo.setFont(titulo);
		lblTitulo.setForeground(azul);

		JPanel panelFormulario = new JPanel();
		panelFormulario.setBounds(20, 110, 340, 400);
		panelFormulario.setLayout(null);

		JLabel lblMultiplicando = new JLabel("Multiplicando:");
		lblMultiplicando.setBounds(20, 110, 200, 30);
		lblMultiplicando.setFont(labels);
		lblMultiplicando.setHorizontalAlignment(SwingConstants.RIGHT);
		panelFormulario.add(lblMultiplicando);

		JLabel lblMultiplicador = new JLabel("Maximo Multiplicador:");
		lblMultiplicador.setBounds(20, 170, 200, 30);
		lblMultiplicador.setFont(labels);
		lblMultiplicador.setHorizontalAlignment(SwingConstants.RIGHT);
		panelFormulario.add(lblMultiplicador);

		JTextField txtMultiplicando = new JTextField();
		txtMultiplicando.setBounds(225, 115, 100, 30);
		panelFormulario.add(txtMultiplicando);

		JTextField txtMultiplicador = new JTextField();
		txtMultiplicador.setBounds(225, 170, 100, 30);
		panelFormulario.add(txtMultiplicador);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(20, 230, 305, 40);
		btnCalcular.setBackground(verde);
		btnCalcular.setForeground(Color.WHITE);
		btnCalcular.setFont(botoes);
		panelFormulario.add(btnCalcular);

		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(20, 290, 305, 40);
		btnLimpar.setBackground(Color.RED);
		btnLimpar.setForeground(Color.WHITE);
		btnLimpar.setFont(botoes);
		panelFormulario.add(btnLimpar);
		
		
		

		// JList

		JLabel resultado = new JLabel("Resultado:");
		resultado.setBounds(360, 120, 150, 30);
		resultado.setFont(labels);
		resultado.setForeground(verde);

		JScrollPane scroll = new JScrollPane();
		scroll.setBounds(360, 150, 200, 300);

		JList listTabuada = new JList();
		scroll.getViewport().add(listTabuada);

		DefaultListModel tabuadaModel = new DefaultListModel();

		btnCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Tabuada tabuada = new Tabuada();
				
				
				
				
				
				
				String resultadoTabuada[] = tabuada.calcular();

				for (int i = 0; i < resultadoTabuada.length; i++) {
					
					tabuadaModel.addElement(resultadoTabuada[1]);
					
				}
				
			}
		});
		
		btnLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				txtMultiplicando.setText("");
				txtMultiplicador.setText("");
				
				txtMultiplicando.requestFocus();
				
				tabuadaModel.clear();
				
			}
		});

		// header, adicione no Jpanel o lbltitulo
		header.add(lblTitulo);
		
		frame.getContentPane().add(panelFormulario);
		frame.getContentPane().add(header);
		frame.getContentPane().add(scroll);
		frame.getContentPane().add(resultado);

		frame.setVisible(true);
		
		

	}

}
