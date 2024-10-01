import javax.swing.JOptionPane;

public class EntradaDeDados {

	public static void main(String[] args) {
		
		// Entrada de dados(Solicita que o usuário digite algo)
		String carros = JOptionPane.showInputDialog("Informa a quantidade de carros?"); 
		String pessoas = JOptionPane.showInputDialog("Informa a quantidade de pessoas?"); 
		
		double carroNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoas);
		
		int divisao = (int) (carroNumero / pessoaNumero);
		int resto = (int)(carroNumero % pessoaNumero);
				
		JOptionPane.showInternalMessageDialog(null, "Divisão para pessoas deu " + divisao + " carros e sobrou "
				+ resto + " carro(s).");
	}

}
