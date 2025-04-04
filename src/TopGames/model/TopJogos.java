package TopGames.model;

import java.util.Queue;

public class TopJogos extends Top5 {
	
	private Queue<String> topJogos;
	public TopJogos(int numero2, int plataforma2, String dono2, Queue<String> jogos) {
		super(numero2, plataforma2, dono2, jogos);
		this.topJogos = topJogos;
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
			System.out.println("O Top 5 Jogos são: " + this.topJogos);
		}
	  }
