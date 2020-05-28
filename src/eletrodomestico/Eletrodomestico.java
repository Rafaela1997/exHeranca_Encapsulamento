package eletrodomestico;

public class Eletrodomestico {
	private String modelo;
	private String funcao;
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public void imprimir () {
		System.out.println( this.modelo + " tem como função "+ this.funcao);
	}
}
