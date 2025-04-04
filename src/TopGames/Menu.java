package TopGames;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import TopGames.controller.TopGamesController;
import TopGames.model.Top5;
import TopGames.model.TopJogos;



public class Menu {

	public static void main(String[] args) {
		
		TopGamesController top5 = new TopGamesController();
		
		Queue<String> jogos = new LinkedList<>();
		
		Scanner lerScanner = new Scanner(System.in);

		int opcao = 0, plataforma = 0, numero;
		String console, dono;
		
	


		while (true) {
			System.out.println("******************************************************");
			System.out.println("                                                     ");
			System.out.println("                  TOP 5 GAMES                        ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar um Top 5                       ");
			System.out.println("            2 - Listar todos os TOP 5                ");
			System.out.println("            3 - Buscar TOP 5 por Numero              ");
			System.out.println("            4 - Atualizar um TOP 5                   ");
			System.out.println("            5 - Apagar um TOP 5                      ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			try {
				opcao = lerScanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Escolha uma opção entre 1 e 6:");
				lerScanner.nextLine();
				opcao = 0;
			}

			if (opcao == 6) {
				System.out.println(" Muito Obrigado e até a proxima!");
				sobre();
				lerScanner.close();
				System.exit(0);
			}

			switch (opcao) {

			case 1:
				System.out.println("Criar um Top 5\n\n");

				System.out.println("Digite Seu Nome: \n");
				lerScanner.skip("\\R?");
				dono = lerScanner.nextLine();

				do {
					System.out.println("\nSeja bem vindo " + dono + " agora escolha sua Plataforma: \n");
					
					
					System.out.println("1 - PlayStation");
					System.out.println("2 - X-Box");
					System.out.println("3 - Nintendo");
					System.out.println("4 - PC");
					
					try {
					plataforma = lerScanner.nextInt();
					lerScanner.skip("\\R?");
					if(plataforma < 1 || plataforma > 4) {
						System.out.println("Opção Inválida, escolha um numero entre 1 e 4...");
					}
					}catch(InputMismatchException e) {
						System.out.println("\nNada de letras, digite apenas números (de 1 a 4)");
						lerScanner.nextLine();
						plataforma = 0;
						
					}
					

				} while (plataforma < 1 || plataforma > 4);
				
				

				
				switch (plataforma) {

				case 1 -> {
					System.out.println("\nVocê escolheu Playstation:");
					System.out.println("\nDigite abaixo seu TOP 5 jogos: ");

					for (int i = 5; i > 0; i--) {
						System.out.println("\nDigite o " + (i) + "º Jogo: ");
						jogos.add(lerScanner.nextLine());
					}
					top5.cadastrar(new TopJogos(top5.gerarNumero(), plataforma, dono, jogos));

				}
				
				case 2 -> {
					System.out.println("Você escolheu Xbox");
					
					jogos = new LinkedList<>();
					System.out.println("\nDigite abaixo seu TOP 5 jogos: ");

					for (int i = 5; i > 0; i--) {
						System.out.println("\nDigite o " + (i) + "º Jogo: ");
						jogos.add(lerScanner.nextLine());
					}
					top5.cadastrar(new TopJogos(top5.gerarNumero(), plataforma, dono, jogos));

				}
				case 3 -> {
					System.out.println("Você escolheu Nintendo");
					
					jogos = new LinkedList<>();
					System.out.println("\nDigite abaixo seu TOP 5 jogos: ");

					for (int i = 5; i > 0; i--) {
						System.out.println("\nDigite o " + (i) + "º Jogo: ");
						jogos.add(lerScanner.nextLine());
					}
					top5.cadastrar(new TopJogos(top5.gerarNumero(), plataforma, dono, jogos));

				}

				case 4 -> {
					System.out.println("Você escolheu PC");
					jogos = new LinkedList<>();
					System.out.println("\nDigite abaixo seu TOP 5 jogos: ");

					for (int i = 5; i > 0; i--) {
						System.out.println("\nDigite o " + (i) + "º Jogo: ");
						jogos.add(lerScanner.nextLine());
					}
					top5.cadastrar(new TopJogos(top5.gerarNumero(), plataforma, dono, jogos));

				}

				}
				keyPress();
				break;

			case 2:
				System.out.println("Listar todos os TOP 5");
				top5.ListarTodos();
				
				
				
				keyPress();
				break;

			case 3:
				System.out.println("Buscar top 5 por numero: ");
				
				System.out.println("Digite o número do Top 5:");
				numero = lerScanner.nextInt();
				
				top5.procurarPorNumero(numero);
				
				keyPress();
				break;

			case 4:
				System.out.println("Atualizar um Top 5");
				
				System.out.println("Digite o numero do Top5: ");
				numero = lerScanner.nextInt();
				
				var buscaTop5 = top5.buscarNaCollection(numero);
				plataforma = buscaTop5.getPlataforma();
				if (buscaTop5 !=null) {
					
					
					System.out.println("Digite Seu Nome: \n");
					lerScanner.skip("\\R?");
					dono = lerScanner.nextLine();

					do {
						System.out.println("\nSeja bem vindo " + dono + " agora escolha sua Plataforma: \n");
						System.out.println("1 - PlayStation");
						System.out.println("2 - X-Box");
						System.out.println("3 - Nintendo");
						System.out.println("4 - PC");
						plataforma = lerScanner.nextInt();
						lerScanner.skip("\\R?");

					} while (plataforma < 1 || plataforma > 4);

					
					switch (plataforma) {

					case 1 -> {
						System.out.println("\nVocê escolheu Playstation:");
						jogos = new LinkedList<>();
						System.out.println("\nDigite abaixo seu TOP 5 jogos: ");

						for (int i = 5; i > 0; i--) {
							System.out.println("\nDigite o " + (i) + "º Jogo: ");
							jogos.add(lerScanner.nextLine());
						}
						top5.atualizar(new TopJogos(numero, plataforma, dono, jogos));

					}
					
					case 2 -> {
						System.out.println("Você escolheu Xbox");
						
						jogos = new LinkedList<>();
						System.out.println("\nDigite abaixo seu TOP 5 jogos: ");

						for (int i = 5; i > 0; i--) {
							System.out.println("\nDigite o " + (i) + "º Jogo: ");
							jogos.add(lerScanner.nextLine());
						}
						top5.atualizar(new TopJogos(numero, plataforma, dono, jogos));

					}
					case 3 -> {
						System.out.println("Você escolheu Nintendo");
						
						jogos = new LinkedList<>();
						System.out.println("\nDigite abaixo seu TOP 5 jogos: ");

						for (int i = 5; i > 0; i--) {
							System.out.println("\nDigite o " + (i) + "º Jogo: ");
							jogos.add(lerScanner.nextLine());
						}
						top5.atualizar(new TopJogos(numero, plataforma, dono, jogos));

					}

					case 4 -> {
						System.out.println("Você escolheu PC");
						jogos = new LinkedList<>();
						System.out.println("\nDigite abaixo seu TOP 5 jogos: ");

						for (int i = 5; i > 0; i--) {
							System.out.println("\nDigite o " + (i) + "º Jogo: ");
							jogos.add(lerScanner.nextLine());
						}
						top5.atualizar(new TopJogos(numero, plataforma, dono, jogos));

					}

				
					}
					
				}
				
				keyPress();
				break;

			case 5:
				System.out.println("Apagar um Top 5!");
				
				System.out.println("Digite o número do Top 5 que deseja Apagar: ");
				numero = lerScanner.nextInt();
				top5.deletar(numero);
				
				keyPress();
				break;

			default:
				System.out.println("\nOpção Inválida");
				
				keyPress();
				break;
			}
		}
	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Rodrigo Henrique ");
		System.out.println("Rodrigo Henrique - rodrigos2@genstudents.org");
		System.out.println("https://github.com/RodrigoHenrikeH");
		System.out.println("*********************************************************");

	}
	
	public static void keyPress() {
		try {
			System.out.println("\n\nPressione Enter para Continuar...");
			System.in.read();
		} catch (IOException e) {
			System.out.println("Você não pressionou enter, vamos tentar de novo!");
		}
	}

}
