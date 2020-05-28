package main;

import veiculo.Carro;
import veiculo.Moto;

public class Main_veiculo {

	public static void main(String[] args) {
		
			Carro carro = new Carro();
			
			carro.setNumerosDeLugares("5");
			carro.setTipo("carros");
			carro.setVelocidade(120);
			
			carro.resultado();
				
			if (120 > 70) {
				System.out.print("O carro capotou");
			}
				
			System.out.print("\n------------------------------------------\n");
			
			
			Moto moto = new Moto();
			
			moto.setNumerosDeLugares("2");
			moto.setTipo("motos");
			moto.setCor("vermelha");
			
			moto.resultado();
			
			
			}}
			
	

			

