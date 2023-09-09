package Conexao.dao;

import java.sql.*;

import javax.swing.JOptionPane;

import login.desktop.*;

public class Conexao extends desktop {
	private static String url = "jdbc:mysql://127.0.0.1:3306/tabela";
	private static String user = "root";
	private static String password = "makakobala2";
	
	public static void InserirUsuario(String usuario, String senha) {
		
		try {
			Connection conexao = DriverManager.getConnection(url,user,password);
			
						
			if(conexao != null) {
				System.out.println("Conexão com o banco de dados estabelecida ");
				String sql = "INSERT INTO usuarios (usuario, senha) VALUES (? , ?)";
				PreparedStatement preparedStatement = conexao.prepareStatement(sql);
				preparedStatement.setString(1, usuario);
				preparedStatement.setString(2, senha);
				
				// Instanciando objetos
				desktop obj = new desktop();
				
				
				
				
				
				int check = preparedStatement.executeUpdate();
				
				// Checa se os dados foram enviados
				if(check != 0) {
					System.out.println("Dados enviados");
					
					
				}else {
					System.out.println("Erro ao enviar os dados");
				}
				
				preparedStatement.close();
				conexao.close();
				
				
				
				
				
			}else {
				System.out.println("Erro ao se conectar com o banco de dados");
				
			}
			
			JOptionPane.showMessageDialog(null, "DADOS CADASTRADOS");
			
			// Checa o banco de dados e compara com as informações que o usuario informou:
			
	
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Erro ao se conectar com o banco de dados");
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}
	
	
	
	

}
