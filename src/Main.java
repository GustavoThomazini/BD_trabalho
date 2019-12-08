package olympics;

import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		String opcao = null;
		String atleta = null;
		String modalidade = null;
		String estacao = null;
		String cidade = null;
		
		int ano;
		
		BancoDados bd = new BancoDados();
		
		mensagem();
		
		System.out.print ("\nDigite a opcao desejada: ");
		opcao = s.nextLine().trim();
		
		while (!opcao.equals("S")) {
			if (opcao.equals("A")) {
				System.out.print("Digite o nome do atleta: ");
			    atleta = s.nextLine().trim();
			    
			    bd.buscaMedalhas(atleta);
			    
			}
			else if (opcao.equals("B")) {
				System.out.print("Digite o nome do atleta: ");
			    atleta = s.nextLine().trim();
			    
			    bd.buscaJogos(atleta);
				
			}
			else if (opcao.equals("C")) {
				System.out.print("Digite o ano de realizacao dos jogos: ");
			    ano = Integer.parseInt(s.nextLine().trim());
			    
			    bd.buscaModalidades(ano);
				
			}
			else if (opcao.equals("D")) {
				System.out.print("Digite o ano de realizacao dos jogos: ");
			    ano = Integer.parseInt(s.nextLine().trim());
				System.out.print("Digite o nome da modalidade: ");
			    modalidade = s.nextLine().trim();
			    
			    bd.buscaMedalhistas(ano, modalidade);
			}
			else if (opcao.equals("E")) {
				System.out.print("Digite o ano de realizacao dos jogos: ");
			    ano = Integer.parseInt(s.nextLine().trim());
				System.out.print("Digite a classificacao dos jogos ('Summer' ou 'Winter'): ");
			    estacao = s.nextLine().trim();
				System.out.print("Digite a cidade de realizacao dos jogos: ");
			    cidade = s.nextLine().trim();
				
				bd.cadastraNovaEdicaoJogos (ano, estacao, cidade);
			}
			else {
				System.out.println("Opcao invalida! Sistema finalizando!");
				break;
			}
			
			System.out.println("\n--------------------\n");
			mensagem();
			opcao = s.nextLine().trim();
		}
		
	}
	
	public static void mensagem() {
		System.out.println("Este sistema fornece informações sobre atletas que ");
		System.out.println("participaram dos Jogos Olimpicos da Era Moderna ");
		System.out.println("utilizando um sistema de banco de dados.\n ");
		System.out.println("Digite a letra correspondente a opcao desejada: ");
		System.out.println("A: Busca de medalhas por atleta;");
		System.out.println("B: Busca de olimpiadas disputadas por atleta;");
		System.out.println("C: Busca de modalidades disputadas por edicao de jogos;");
		System.out.println("D: Busca de medalhistas por edicao de jogos e modalidade;");
		System.out.println("E: Cadastro de nova edicao dos Jogos Olimpicos.");
		System.out.println("S: Sair do sistema.");
	}

}


