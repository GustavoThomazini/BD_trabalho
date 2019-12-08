package olympics;

import java.sql.Connection;

public class BancoDados {
	Connection con = null;
	
	public BancoDados() {
		//Neste construtor, escreva o codigo necessário para
		// conexao com o banco de dados do PostgresSQL
	}
	
	public void buscaMedalhas (String atleta) {
		// Dado o nome do atleta, escreva o código que busca
		//   e imprime na tela a lista de medalhas conquistadas 
		//   por esse atleta junto  com as edicoes de jogos 
		//   olimpicos e modalidades em que foram conquistadas.
		
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
