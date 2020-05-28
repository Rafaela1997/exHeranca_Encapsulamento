package main;

import eletrodomestico.Eletrodomestico;

public class Main_eletro {

	public static void main(String[] args) {
		Eletrodomestico eletrodomestico = new Eletrodomestico();
		eletrodomestico.setModelo("geladeiras");
		eletrodomestico.setFuncao("gelar");
		
		eletrodomestico.imprimir();

	}

}
