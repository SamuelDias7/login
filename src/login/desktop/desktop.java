package login.desktop;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.*;

import login.pojo.*;

public class desktop implements ActionListener{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Instanciando objetos
		dados obj = new dados();
		
		
		// Criando JFrame's
		JFrame frame = new JFrame("Tela de login");
		JFrame frame2 = new JFrame("Tela inicial");
		
		// Definindo tamanho do frame
		frame.setSize(400,400);
		frame2.setSize(600,600);

		// Definindo visibilidade
		frame.setVisible(true);
		frame2.setVisible(false);
		
		// Desativa o layout automático
		frame.getContentPane().setLayout(null);
		frame2.getContentPane().setLayout(null);
		
		// Encerra programa de fato
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// IMpede que usuario manipule o painel
		frame.setResizable(false);
		frame2.setResizable(false);
		
		// Centraliza painel no centro da tela
		frame.setLocationRelativeTo(null);
		frame2.setLocationRelativeTo(null);

		
		// Criando label
		JLabel t1 = new JLabel("Usuario:");
		JLabel t2 = new JLabel("Senha:");
		JLabel t3 = new JLabel("INFORME SEUS DADOS PARA EFETUAR LOGIN");
		
		// Criando caixa de textos
		JTextField c1 = new JTextField();
		JTextField c2 = new JTextField();
		
		// Criando butões
		JButton btn1 = new JButton("login");
		JButton btn2 = new JButton("cancelar");
		
		
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
		
		ActionListener btnal1 = new ActionListener() {


			@Override
			public void actionPerformed(ActionEvent e) {
				
				// TODO Auto-generated method stub
						//JOptionPane.showMessageDialog(null, "Dados validos");
				
				
				frame2.setVisible(true);
				frame.setVisible(false);

			}
				
			};
			
			btn1.addActionListener(btnal1);
					
				
			ActionListener btnal2 = new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					//JOptionPane.showMessageDialog(null, "operação será cancelada");
					System.exit(0);
			}
			
				
			};
			
			btn2.addActionListener(btnal2);


	}

	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	//adicionando ActionListener aos butões correspondentes
	

}
