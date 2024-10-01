
public class EstruturaRepeticaoForComContinue {

	public static void main(String[] args) {

		for (int numero = 0; numero <= 10; numero++) {

			if (numero == 3 || numero == 6 || numero == 9) {
				System.out.println("Obaaaa, encontrei o número " + numero);
				continue;
			}
			System.out.println("Numero atual é :  " + numero);
		}
	}

}
