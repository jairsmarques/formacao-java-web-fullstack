
public class EstruturaDeRepeticaoComBreak {

	public static void main(String[] args) {

		for (int numero = 0; numero <= 10; numero++) {
			System.out.println("Numero atual é: " + numero);
			if (numero == 7) {
				System.out.println("Obaaaa, achei o número 7");
				System.out.println("Estou parando de executar....");
				break;
			}
		}

	}

}
