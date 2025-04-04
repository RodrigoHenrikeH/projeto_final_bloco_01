package TopGames.repository;

import TopGames.model.Top5;

public interface TopGamesRepository {

	public void procurarPorNumero(int numero);

	public void ListarTodos();

	public void cadastrar(Top5 top5);

	public void atualizar(Top5 top5);

	public void deletar(int numero);

}
