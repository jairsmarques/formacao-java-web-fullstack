import javax.swing.JOptionPane;

public class CriandoOpcaoDeConfirmacao {

	public static void main(String[] args) {

		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros?");

		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pesssoas?");

		double carroNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoas);

		int divisao = (int) (carroNumero / pessoaNumero);

		int resto = (int) (carroNumero % pessoaNumero);

		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisão?");

		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, "Divisão por pessoas deu " + divisao);
		} else {
			JOptionPane.showMessageDialog(null, "Não quis ver o resultado da divisão");
		}

		resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resto da divisão?");

		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, " Sobrou  " + resto + " carro(s)");
		} else {
			JOptionPane.showMessageDialog(null, "Não quis ver o resultado do resto da divisão");
		}
		
		JOptionPane.showMessageDialog(null, "Fim do programa!");
	}

}
