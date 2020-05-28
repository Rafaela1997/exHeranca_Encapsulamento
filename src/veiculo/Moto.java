package veiculo;

public class Moto extends Veiculo {
	
	private String cor;

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	public void carro() {
		System.out.println("A moto tem cor "+ getCor());
	}}