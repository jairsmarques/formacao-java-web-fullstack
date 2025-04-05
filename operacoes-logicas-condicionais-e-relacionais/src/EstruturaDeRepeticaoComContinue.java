
public class EstruturaDeRepeticaoComContinue {

	public static void main(String[] args) {

		for (int numero = 0; numero <= 10; numero++) {
			if (numero == 3 || numero == 6 || numero == 9) {
				System.out.println("****** Obaaaa, achei o número " + numero + " ******");
				continue;
			}
			System.out.println("Processando o laço de repetição");
		}

	}

}
