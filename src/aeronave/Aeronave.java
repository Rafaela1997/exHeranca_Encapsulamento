package aeronave;

public class Aeronave {

	private String modelo;
	private String aceleracao;
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getAceleracao() {
		return aceleracao;
	}
	public void setAceleracao(String aceleracao) {
		this.aceleracao = aceleracao;
	}
	
	public void andar() {
		System.out.println("A aeronave modelo "+ this.modelo + " tem uma velocidade de "+ this.aceleracao
				+ " Km/h");
	}
}
