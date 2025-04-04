package TopGames.model;

import java.util.Queue;





public abstract class Top5 {

	private int numero;
	private int plataforma;
	private String dono;
	private Queue<String> jogos;

	public Top5(int numero, int plataforma, String dono, Queue<String> jogos) {
        this.numero = numero; 
        this.plataforma = plataforma;
        this.dono = dono;
        this.jogos = jogos;
    }

	public int getNumero() {
		return  numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(int plataforma) {
		this.plataforma = plataforma;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public Queue<String> getJogos() {
		return jogos;
	}

	public void setJogos(Queue<String> jogos) {
		this.jogos = jogos;
	}

	public void visualizar() {

		String plataforma = "";

		switch (this.plataforma) {
		case 1:
			plataforma = "PlayStation";
			break;

		case 2:
			plataforma = "X-box";
			break;

		case 3:
			plataforma = "Nintendo";
			break;

		case 4:
			plataforma = "PC";
			break;
		}

		System.out.println("\n\n***********************************************************");
		System.out.println("TOP 5 DO USUÁRIO: " + this.numero);
		System.out.println("***********************************************************");
		System.out.println("Nome do Usuário: " + this.dono);
		System.out.println("Plataforma escolhida : " + plataforma);
		System.out.println("Jogos selecionados: "+ getJogos());
	}

}
