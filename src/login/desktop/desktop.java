package login.desktop;

import java.awt.Frame;

import Conexao.dao.Conexao;
import java.awt.event.ActionEvent;

import Conexao.dao.*;

import java.awt.event.ActionListener;

import javax.swing.*;

import login.pojo.*;

public  class  desktop implements ActionListener {
	
	int a;
	public  void a() {
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
		// Criando JFrame's
		JFrame frame = new JFrame("Tela de Cadastro");
		JFrame frame2 = new JFrame("Tela de Login");
		JFrame frame3 = new JFrame("Tela Inicial");
		
		// Definindo tamanho do frame
		frame.setSize(400,400);
		frame2.setSize(400,400);
		frame3.setSize(600,600);

		// Definindo visibilidade
		frame.setVisible(false);
		frame2.setVisible(true);
		frame3.setVisible(false);
		
		// Desativa o layout automático
		frame.getContentPane().setLayout(null);
		frame2.getContentPane().setLayout(null);
		frame3.getContentPane().setLayout(null);
		
		// Encerra programa de fato
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Impede que usuario manipule o painel
		frame.setResizable(false);
		frame2.setResizable(false);
		frame3.setResizable(false);
		
		// Centraliza painel no centro da tela
		frame.setLocationRelativeTo(null);
		frame2.setLocationRelativeTo(null);
		frame3.setLocationRelativeTo(null);

		
		// Criando label
		JLabel t1 = new JLabel("Usuario:");
		JLabel t2 = new JLabel("Senha:");
		JLabel t3 = new JLabel("CRIE UMA CONTA");
		
		// Criando caixa de textos
		JTextField c1 = new JTextField();
		JTextField c2 = new JTextField();
		
		
		
		// Criando butões
		JButton btn1 = new JButton("Cadastro");
		JButton btn2 = new JButton("Cancelar");
		JButton btnA1 = new JButton("Tenho uma conta");
		
		
		// Adicionadno label's ao painel
		frame.getContentPane().add(t1);
		frame.getContentPane().add(t2);
		frame.getContentPane().add(t3);
		
		// Adicionando caixa de textos
		frame.getContentPane().add(c1);
		frame.getContentPane().add(c2);
		
		// Adicionando butões ao painel
		frame.getContentPane().add(btn1);
		frame.getContentPane().add(btn2);
		frame.getContentPane().add(btnA1);
		
		// Definindo localização dos Label's
		t1.setBounds(50, 120, 150, 30);
		t2.setBounds(50,170,150,30);
		t3.setBounds(50, 50, 300, 30);
				
		// Definindo localização dos JTextField's
		c1.setBounds(100, 120, 200, 30);
		c2.setBounds(100, 170, 200, 30);
		
		// Definindo localização dos JButton's
		btn1.setBounds(120, 230, 150, 30);
		btn2.setBounds(120, 300, 150, 30);
		btnA1.setBounds(230, 10, 150, 30);

		
		//Painel de Login
		
		//Criando label's
		JLabel t4 = new JLabel("Usuario:");
		JLabel t5 = new JLabel("Senha");
		JLabel t6 = new JLabel("INFOMRE SEUS DADOS PARA LOGAR");
		
		// Criando JTextField's
		JTextField c3 = new JTextField("");
		JTextField c4 = new JTextField("");
		
		//Criando Butões
		JButton btn3 = new JButton("Login");
		JButton btn4 = new JButton("Cancelar");
		JButton btnA2 = new JButton("Cadastrar");
		
		//Adicionando label's ao painel
		frame2.getContentPane().add(t4);
		frame2.getContentPane().add(t5);
		frame2.getContentPane().add(t6);
		
		//Adicionando JTextField's ao painel
		frame2.getContentPane().add(c3);
		frame2.getContentPane().add(c4);
		
		//Adicionando Butões ao painel
		frame2.getContentPane().add(btn3);
		frame2.getContentPane().add(btn4);
		frame2.getContentPane().add(btnA2);
		
		//Definindo localização dos JLabel's
		t4.setBounds(50, 120, 150, 30);
		t5.setBounds(50,170,150,30);
		t6.setBounds(50, 50, 300, 30);

		
		// Definindo localização dos JTextField's
		c3.setBounds(100, 120, 200, 30);
		c4.setBounds(100, 170, 200, 30);

		
		// Definindo localização dos JButton's
		btn3.setBounds(120, 230, 150, 30);
		btn4.setBounds(120, 300, 150, 30);
		btnA2.setBounds(230, 10, 150, 30);

		
		
		ActionListener btnal1 = new ActionListener() {


			@Override
			public void actionPerformed(ActionEvent e) {
				
				// Envia os dados do JTextField para as variaveis em questão
				String usuario = c1.getText();
				String senha = c2.getText();
				
				
				
				
				//String senhaStr = c2.getText();
				//int senha = Integer.parseInt(senhaStr);

				// Chama a classe de conexão com o banco de dados
				Conexao.InserirUsuario(usuario, senha);
				
				
				//Limpa os campos após o envio
				c1.setText("");
				c2.setText("");
				
				
				frame.setVisible(false);				
				frame2.setVisible(true);
				

			}
				
			};
			
			btn1.addActionListener(btnal1);
					
				
			ActionListener btnal2 = new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					System.exit(0);
			}
			
				
			};
			
			btn2.addActionListener(btnal2);
			
			
			
			

			ActionListener btnal3 = new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
					String usuarioC = c3.getText();
					String senhaC = c4.getText();
					
										
					//JOptionPane.showMessageDialog(null, usuarioC);
					//JOptionPane.showMessageDialog(null, senhaC);
					
					Login.recuperarDados(usuarioC, senhaC);
					
					c3.setText("");
					c4.setText("");					

				}
				
				
						};
						
			 btn3.addActionListener(btnal3);
			 
			 ActionListener btnal4 = new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					System.exit(0);
					
				}
				
				 
			 };
			 btn4.addActionListener(btnal4);
			 
			 ActionListener btnALA1 = new ActionListener () {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
					frame.setVisible(false);
					frame2.setVisible(true);
					
				}
				 
			 };
			 btnA1.addActionListener(btnALA1);
			 
			 ActionListener btnALA2 = new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
					frame2.setVisible(false);
					frame.setVisible(true);
					
					
					
				}
				 
			 };
			 btnA2.addActionListener(btnALA2);
			 
			 	}
	
	public static void TelaInicial() {
		JFrame frame4 = new JFrame("Tela Inicial");
		frame4.setVisible(true);
		frame4.setSize(600,600);
		frame4.setResizable(false);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	


}
