package olympics;

import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		
                Scanner s = new Scanner (System.in);
                String opcao;
                
		String nomeCliente = null;
                String cpfCliente = null;
                String rgCliente = null;
                String telefoneCliente = null;
                String ruaCliente = null;
                String cidadeCliente = null;
                String estadoCliente = null;
                String cepCliente = null;
                String enderecoCliente = null;
                String emailCliente = null;

		BancoDados bd = new BancoDados();
		
		mensagem();
		
		System.out.print ("\nDigite a opcao desejada: ");
		opcao = s.nextLine().trim();
		
		while (!opcao.equals("S")) {
			if (opcao.equals("1")) {
                            System.out.print("Perfil de Acesso Cliente Selecionado ");
                            System.out.print("Digite seu nome completo:");
			    nomeCliente = s.nextLine().trim();
                            System.out.print("Digite seu CPF (somente número):");
			    cpfCliente = s.nextLine().trim();
                            System.out.print("Digite seu RG (somente número):");
			    rgCliente = s.nextLine().trim();
                            System.out.print("Digite seu Número de Telefone (somente número):");
			    telefoneCliente = s.nextLine().trim();
                            System.out.print("Digite seu Endereco;RUA:");
			    ruaCliente = s.nextLine().trim();
                            System.out.print("CIDADE:");
			    cidadeCliente = s.nextLine().trim();
                            System.out.print("ESTADO");
			    estadoCliente = s.nextLine().trim();
                            System.out.print("CEP");
			    cepCliente = s.nextLine().trim();
                            System.out.print("Digite seu Endereco");
			    enderecoCliente = s.nextLine().trim();
                            System.out.print("Digite se email");
			    emailCliente = s.nextLine().trim();
			    
			    bd.buscaMedalhas(nomeCliente,cpfCliente,rgCliente,telefoneCliente,ruaCliente,cidadeCliente,estadoCliente,cepCliente,enderecoCliente,emailCliente);
			    
			}
			else if (opcao.equals("B")) {
				System.out.print("Perfil de Acesso Cliente Selecionado ");
			    atleta = s.nextLine().trim();
			    
			    bd.buscaJogos(atleta);
				
			}
			else if (opcao.equals("C")) {
				System.out.print("Perfil de Acesso Cliente Selecionado ");
			    ano = Integer.parseInt(s.nextLine().trim());
			    
			    bd.buscaModalidades(ano);
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
                System.out.println("Olá, Seja bem vindo ao aplicativo");
		System.out.println("Escolha seu perfil de acesso da ferramenta ");	
		System.out.println("Digite O número correspondente a opcao desejada: ");
		System.out.println("1: Acesso de Cliente;");
		System.out.println("2: Acesso de Restaurantes;");
		System.out.println("3: Acesso de Entregadores;");

	}

}