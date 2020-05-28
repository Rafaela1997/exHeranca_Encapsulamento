package veiculo;

public class Carro extends Veiculo {
	private int velocidade;
	
	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}


	public void carro() {
		System.out.println("O carro esta "+ getVelocidade());
}
}
