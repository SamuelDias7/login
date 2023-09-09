package Conexao.dao;



import java.sql.DriverManager;


import login.desktop.*;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import login.desktop.desktop;

import java.sql.*;



public class Login extends desktop {
	
	int d = 9;
	
	private static String url = "jdbc:mysql://127.0.0.1:3306/tabela";
	private static String user = "root";
	private static String password = "makakobala2";

	public static void recuperarDados(String usuarioC, String senhaC ) {

			try {
				Connection conexao = DriverManager.getConnection(url,user,password);
				
				String sql = "SELECT * FROM usuarios WHERE usuario = ? AND senha = ?";
				PreparedStatement statement = conexao.prepareStatement(sql);
				statement.setString(1, usuarioC);
				statement.setString(2, senhaC);
				ResultSet resultSet = statement.executeQuery();
				
				
				// Checar se o usuario foi autenticado com sucess0
				if( resultSet.next()) {
					System.out.println("Dados compativeis");
					
					desktop.TelaInicial();
					
					
				}else {
					JOptionPane.showMessageDialog(null, "USUARIO OU SENHA INVALIDO");
					
					
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		
	}

}
