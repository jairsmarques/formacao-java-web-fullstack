import javax.swing.JOptionPane;

public class Confirmacao {

	public static void main(String[] args) {

		// Entrada de dados(Solicita que o usuário digite algo)
		String carros = JOptionPane.showInputDialog("Informa a quantidade de carros?");
		String pessoas = JOptionPane.showInputDialog("Informa a quantidade de pessoas?");

		double carroNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoas);

		int divisao = (int) (carroNumero / pessoaNumero);
		int resto = (int) (carroNumero % pessoaNumero);

		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisão?");

		if (resposta == 0) {
			JOptionPane.showInternalMessageDialog(null, "Divisão para pessoas deu " + divisao);
		} else {
			System.out.println("Não quiz ver o resultado da divisão!");
		}

		resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o RESTO da divisão?");

		if (resposta == 0) {
			JOptionPane.showInternalMessageDialog(null, "Divisão para pessoas é " + resto);
		} else {
			System.out.println("Não quiz ver o resto da divisão!");
		}
	}

}
