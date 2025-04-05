
public class EstruturaDeRepeticaoFor {

	public static void main(String[] args) {
		
		System.out.println("Imprimir número de 0 á 10 (Crescente)");
		for (int numero = 0; numero <= 10; numero++) {
			System.out.println("Número atual é: " + numero);
		}
		
		System.out.println("--------------------");

		System.out.println("Imprimir número de 10 á 0 (Decrescente)");
		for (int numero = 10; numero >= 0; numero--) {
			System.out.println("Número atual é: " + numero);
		}
	}

}
