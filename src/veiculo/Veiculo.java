package veiculo;

public class Veiculo {
private String tipo;
private String numerosDeLugares;
 

public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
public String getNumerosDeLugares() {
	return numerosDeLugares;
}
public void setNumerosDeLugares(String numerosDeLugares) {
	this.numerosDeLugares = numerosDeLugares;
}


 public void resultado () {
	 System.out.println(this.tipo + " tem " + this.numerosDeLugares + " lugares ");
 }
}
