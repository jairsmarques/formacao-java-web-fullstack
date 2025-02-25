
public class EstruturaDeRepeticaoForComContinue {

	public static void main(String[] args) {
	
		for (int numero = 0; numero <= 10; numero++) {
			System.out.println("Número atual é: " + numero);
			if (numero == 3 || numero == 6 || numero == 9) {
				System.out.println("----------------------------");
				System.out.println("Obaaa, encontrei o número " + numero);
				System.out.println("Vou continuar executando...");
				continue;
			}	
		}
	}
}
