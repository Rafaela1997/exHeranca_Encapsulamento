package main;

import aeronave.Aeronave;

public class main {

	public static void main(String[] args) {
		
		Aeronave aeronave = new Aeronave();
		aeronave.setModelo("Blackbird");
		aeronave.setAceleracao("3.700");
		
		aeronave.andar();
	}
	

}
