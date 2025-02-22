
public class VariavelLocalGlobal {
	
	//Variável Global é acessível a todos e o seu valor é compartilhado
	static int maiorIdadeGlobal = 30;

	public static void main(String[] args) {
		
		// variável local pertence somente a esse método e o valor fica dentro do método
		int maiorIdade = 18;

		System.out.println("Valor da variável local = " + maiorIdade);
		System.out.println("Valor da variável Global = " + maiorIdadeGlobal);
		metodo2();
	}
	
	public static void metodo2() {
		System.out.println("Valor da variável global = " + maiorIdadeGlobal);
	}

}
