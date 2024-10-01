
public class EstruturaRepeticaoForComBreak {

	public static void main(String[] args) {

		for (int numero = 0; numero <= 10; numero++)
			if (numero == 7) {
				System.out.println("Obaaaa, encontrei o número 7 ");
				System.out.println("Estou parando de executar....");
				break;
			}
	}

}
