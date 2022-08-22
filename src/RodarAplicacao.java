
public class RodarAplicacao {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		
		carro1.setCor("azul");
		carro1.setModelo("BMW série 3");
		carro1.setCapacidadeTanque(59);
		
		System.out.println(carro1.getModelo());
		System.out.println(carro1.getCor());
		System.out.println(carro1.getCapacidadeTanque());
		//System.out.println(carro1.totalValorTanque( valorCombustivel: 6.39));
		
		//Carro carro2 = new Carro( cor: "cinza", modelo "Mercedes-Benz Classe C", capacidadeTanque:66);
		
		System.out.println(carro1.getModelo());
		System.out.println(carro1.getCor());
		System.out.println(carro1.getCapacidadeTanque());
		//System.out.println(carro1.totalValorTanque( valorCombustivel 6.46));
		
	}
}
