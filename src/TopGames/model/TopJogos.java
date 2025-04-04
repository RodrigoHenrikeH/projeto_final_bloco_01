package TopGames.model;

import java.util.Queue;

public class TopJogos extends Top5 {

	private Queue<String> topJogos;

	public TopJogos(int numero, int plataforma, String dono, Queue<String> jogos) {
		super(numero, plataforma, dono, jogos);
		this.topJogos = jogos;
	}

	public Queue<String> getTopJogos() {
		return topJogos;
	}

	public void setTopJogos(Queue<String> topJogos) {
		this.topJogos = topJogos;
	}

	@Override
	public void visualizar() {
		super.visualizar();
	}
}