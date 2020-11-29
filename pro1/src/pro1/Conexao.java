package pro1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;


public class Conexao {

	//	 variavel que faz a conexão	
	private Connection com;				
	public Connection getCom() {
		return com;
	}
	public void setCom(Connection com) {
		this.com = com;
	}
	//	 variavel que dah os comandos de SQL	
	private Statement st;				
	//	Variaveis que fazem a url pra conexão do banco
	//private String endereco;
	private String endereco;
	private ResultSet rs;

	public Conexao() {
		try {
			
			// Dados da conexão
			
			endereco = "jdbc:sqlserver://127.0.0.1:53545;databaseName=projetopoo;user=dashboard;password=123456";
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			
			
			com = DriverManager.getConnection(endereco);

			//Variavel que permite a execução de comandos sql 
			st = com.createStatement();
			System.out.println("sucessso!!!");
		}catch (Exception e){

			JOptionPane.showMessageDialog(null,"Nao foi possivel conectar ao banco\n:"+e.toString(), "Alerta",JOptionPane.INFORMATION_MESSAGE );

		}

	}

	//	 Funcao que executa a sql
	public void Comando(String sql){

		try{
			st.executeUpdate(sql);
		}

		catch(Exception e){

			JOptionPane.showMessageDialog(null,"Erro na operacao requisitada\n"+e.toString(), "Alerta",JOptionPane.INFORMATION_MESSAGE );
		}
	}

	public ResultSet Select(String sql){
		try{
			rs = st.executeQuery(sql);

		}
		catch(Exception e){

			JOptionPane.showMessageDialog(null,"Erro no select\n"+e.toString(), "Alerta",JOptionPane.INFORMATION_MESSAGE );
		}

		return(rs);
	}

	//Fecha a conexao do banco
	public void close(){
		try{
			com.close();

		}catch (Exception e){

			JOptionPane.showMessageDialog(null,"Erro para fechar a conexao\n"+e.toString(), "Alerta",JOptionPane.INFORMATION_MESSAGE );
		}
	}
	//
	public boolean isConnected(){
		try{
			if(com.isClosed() == true)
				return false;
			else
				return true;

		}catch (Exception e){
			return false;
		}
	}
	
	public void consulta()
	{
		ResultSet rs = Select("select * from os");
		try {
			while(rs.next())
			{
				/*
				String id1 = rs.getString("id");
				String tipo1 = rs.getString("tipo");
				String cidade1 = rs.getString("cidade");
				String olocal1 = rs.getString("olocal");
				String area1 = rs.getString("area");
			    String obs1= rs.getString("obs"); */
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new Conexao();
	}
}