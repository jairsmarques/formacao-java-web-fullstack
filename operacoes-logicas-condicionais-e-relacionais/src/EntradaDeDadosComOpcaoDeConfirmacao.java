import javax.swing.JOptionPane;

public class EntradaDeDadosComOpcaoDeConfirmacao {

	public static void main(String[] args) {

		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros?");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas?");

		double carroNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoas);

		int divisao = (int) (carroNumero / pessoaNumero);
		int resto = (int) (carroNumero % pessoaNumero);

		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisão?");

		if (resposta == 0) {
			JOptionPane.showInternalMessageDialog(null, "Divisão para pessoas deu " + divisao + " carros");
		} else {
			JOptionPane.showInternalMessageDialog(null, "Não quis ver o resultado da divisão");
		}

		resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resto da divisão?");

		if (resposta == 0) {
			JOptionPane.showInternalMessageDialog(null, "O resto da divisão é " + resto + " carros");
		} else {
			resposta = JOptionPane.showConfirmDialog(null, "Não quis ver o resto da divisão");
		}

		JOptionPane.showInternalMessageDialog(null, "Fim do programa!!!");
	}

}
