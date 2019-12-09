package Projeto_BD;
import java.sql.*;
import java.sql.Connection;
 
public class BancoDados {
Connection con = null;
 
public BancoDados() throws SQLException {
            con = DriverManager.getConnection("jdbc:postgresql://localhost/olympics", "postgres", "ufabc");
            System.out.println("Consequi fazer a conexao");
            
//Neste construtor, escreva o codigo necessário para
// conexao com o banco de dados do PostgresSQL
}
public void buscaMedalhas (String atleta) throws SQLException {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM ATLETA");
            String coluna1, coluna2, coluna3;
while (rs.next()){
    coluna1 = rs.getString(1);
    System.out.println(coluna1);
    coluna2 = rs.getString(2);
    System.out.println(coluna2);
    coluna3 = rs.getString(3);
    System.out.println(coluna3);
}
}
	public void buscaJogos (String atleta) {
		// Dado o nome do atleta, escreva o código que busca
		//   e imprime as edicoes de jogos olimpicos disputados
		//   por esse atleta.
	}

	public void buscaModalidades (int ano) {
		// Dado o ano de realizacao dos jogos, escreva o codigo que busca
		//   as modalidades disputadas nos jogos olimpicos
		//   do ano dado como parametro
	}

	public void buscaMedalhistas (int ano, String modalidade) {
		// Dado o ano de realizacao dos jogos e o nome da modalidade, 
		//   escreva o codigo que busca
		//   e imprime na tela os medalhistas (ouro, prata e
		//   bronze) da modalidade dada como parâmetro disputada
		//   no ano que também é dado como parâmetro
	}

	public void cadastraNovaEdicaoJogos (int ano, String estacao, String cidade) {
		// Insere uma nova informacao no banco de dados, referente
		//   a uma nova edicao de Jogos Olimpicos. A insercao dessas informacoes
		//   deve ser realizada na tabela "Jogos" do seu banco de dados.
		//   Tenha o cuidado de buscar o "id" correto para nao violar a restricao de
		//   chave primaria da tabela. Sugiro buscar o maior id da tabela e adicionar 1.
	}

}
