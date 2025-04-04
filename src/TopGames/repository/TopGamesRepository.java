package TopGames.repository;

import TopGames.model.Top5;

public interface TopGamesRepository {

	
	public void procurarPorNumero(int numero);
	public void ListarTodos();
	public void cadastrar();
	public void atualizar();
	public void deletar();
	
}
