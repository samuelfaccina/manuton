package pro1;
public class Controle {

	public void insere( String tipo1,String cidade1,String olocal1,String area1,String obs1)
	{
		Conexao co = new Conexao();
		co.Comando("INSERT INTO os\n" + 
				"(tipo,cidade,olocal,area,obs)\n" + 
				"VALUES('"+tipo1+"','"+cidade1+"','"+olocal1+"','"+area1+"','"+obs1+"')");
	}
	public void exclui( String id1 )
	{
		Conexao co = new Conexao();
		co.Comando("DELETE FROM os\n" + 
				"WHERE id = '"+id1+"'");
	}
}
//Já ok 