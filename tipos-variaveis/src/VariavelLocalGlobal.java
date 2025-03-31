
public class VariavelLocalGlobal {

	/* Variável Global é acessível a todos e seu valor é compartilhado */
	static int maiorIdadeGlobal = 30;

	public static void main(String[] args) {

		/*
		 * Variável local porque pertence somente a esse método e ovalor fica dentro do
		 * método
		 */
		int maiorIdade = 18;
		System.out.println("Valor da variável local = " + maiorIdade);
		
		System.out.println("Valor da variável Global = " + maiorIdadeGlobal);

		metodo2();

	}

	public static void metodo2() {
		System.out.println("Valor da variável Global = " + maiorIdadeGlobal);
	}

}
