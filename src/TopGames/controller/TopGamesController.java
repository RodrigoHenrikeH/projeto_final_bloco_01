package TopGames.controller;

import java.util.ArrayList;
import TopGames.model.Top5;
import TopGames.repository.TopGamesRepository;

public class TopGamesController implements TopGamesRepository {

	private ArrayList<Top5> listaTop5 = new ArrayList<Top5>();
	int numero = 0;

	@Override
	public void procurarPorNumero(int numero) {
		var top5 = buscarNaCollection(numero);

		if (top5 != null)
			top5.visualizar();
		else {
			System.out.println("O Top 5 numero: " + numero + " não existe!");
		}

	}

	@Override
	public void ListarTodos() {
		for (var top5 : listaTop5) {
			top5.visualizar();
		}
		if (listaTop5.isEmpty()) {
			System.out.println("Ainda não há nenhum TOP 5 criado, seja você o primeiro!");
		}
	}

	@Override
	public void cadastrar(Top5 top5) {
		listaTop5.add(top5);
		System.out.println("\nO Top 5 número: " + top5.getNumero() + " Foi criado com sucesso!");
	}

	@Override
	public void atualizar(Top5 top5) {
		var buscaTop5 = buscarNaCollection(top5.getNumero());
		if (buscaTop5 != null) {
			listaTop5.set(listaTop5.indexOf(buscaTop5), top5);
			System.out.println("\nO Top5 numero: " + numero + " foi atualizado com sucesso!");
		} else
			System.out.println("\nO Top 5 numero: " + top5.getNumero() + " não existe!");

	}

	@Override
	public void deletar(int numero) {
		var top5 = buscarNaCollection(numero);

		if (top5 != null) {
			if (listaTop5.remove(top5) == true) {
				System.out.println("O Top 5 numero: " + numero + " foi deletado com sucesso!");
			} else
				System.out.println("\nO Top 5 numero: " + numero + " não existe!");

		}

	}

	public int gerarNumero() {
		return ++numero;
	}

	public Top5 buscarNaCollection(int numero) {
		for (var top5 : listaTop5) {
			if (top5.getNumero() == numero) {
				return top5;
			}
		}

		return null;

	}
}
