
public class CondicionalSwitchCase {

	public static void main(String[] args) {

		int numero = 3;
		String diaSemana;

		switch (numero) {
		case 1:
			diaSemana = "Domingo";
			break;
		case 2:
			diaSemana = "Segunda";
			break;
		case 3:
			diaSemana = "Terça";
			break;
		case 4:
			diaSemana = "Quarta";
			break;
		case 5:
			diaSemana = "Quinta";
			break;
		case 6:
			diaSemana = "Sexta";
			break;
		case 7:
			diaSemana = "Sábado";
			break;
		default:
			diaSemana = "Número inválido";
			break;
		}

		System.out.println(diaSemana);
	}

}
