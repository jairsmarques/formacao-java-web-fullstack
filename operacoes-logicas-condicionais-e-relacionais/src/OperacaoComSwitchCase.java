
public class OperacaoComSwitchCase {

	public static void main(String[] args) {

		int dia = 3;
		String diaDaSemana;

		/* SWITCH CASE: Operações exatas */

		switch (dia) {
		case 1:
			diaDaSemana = "Domingo";
			break;
		case 2:
			diaDaSemana = "Segunda";
			break;
		case 3:
			diaDaSemana = "Terça";
			break;
		case 4:
			diaDaSemana = "Quarta";
			break;
		case 5:
			diaDaSemana = "Quinta";
			break;
		case 6:
			diaDaSemana = "Sexta";
			break;
		case 7:
			diaDaSemana = "Sábado";
			break;
		default:
			diaDaSemana = "Outro dia qualquer";
			break;
		}

		System.out.println(diaDaSemana);

	}

}
