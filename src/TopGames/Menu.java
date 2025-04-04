package TopGames;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import TopGames.model.TopJogos;


public class Menu {

	public static void main(String[] args) {
		Scanner lerScanner = new Scanner(System.in);

		int opcao = 0, plataforma = 0;
		String dono = null;
		Queue<String> jogos = new LinkedList<String>();

		TopJogos topJogos = new TopJogos(1, 1, "Henrique", jogos);

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
					plataforma = lerScanner.nextInt();
					lerScanner.skip("\\R?");

				} while (plataforma < 1 && plataforma > 4);

				switch (plataforma) {

				case 1 -> {
					System.out.println("\nVocê escolheu Playstation:");

					System.out.println("\nDigite abaixo seu TOP 5 jogos: ");

					for (int i = 5; i > 0; i--) {
						System.out.println("\nDigite o " + (i) + "º Jogo: ");
						jogos.add(lerScanner.nextLine());
					}

				}
				case 2 -> {
					System.out.println("Você escolheu Xbox");
					System.out.println("\nDigite abaixo seu TOP 5 jogos: ");

					for (int i = 5; i > 0; i--) {
						System.out.println("\nDigite o " + (i) + "º Jogo: ");
						jogos.add(lerScanner.nextLine());
					}

				}
				case 3 -> {
					System.out.println("Você escolheu Nintendo");
					System.out.println("\nDigite abaixo seu TOP 5 jogos: ");

					for (int i = 5; i > 0; i--) {
						System.out.println("\nDigite o " + (i) + "º Jogo: ");
						jogos.add(lerScanner.nextLine());
					}

				}

				case 4 -> {
					System.out.println("Você escolheu PC");

					System.out.println("\nDigite abaixo seu TOP 5 jogos: ");

					for (int i = 5; i > 0; i--) {
						System.out.println("\nDigite o " + (i) + "º Jogo: ");
						jogos.add(lerScanner.nextLine());
					}

				}

				}
				keyPress();
				break;

			case 2:
				System.out.println("Listar todos os TOP 5");
				System.out.println("Top 5 do: " + dono);
				jogos.forEach(System.out::println);
				
				keyPress();
				break;

			case 3:
				System.out.println("Buscar top 5 por numero: ");
				
				keyPress();
				break;

			case 4:
				System.out.println("Atualizar um Top 5");
				
				keyPress();
				break;

			case 5:
				System.out.println("Apagar um Top 5!");
				
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
