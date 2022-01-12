package excecao.personalizadaB;


@SuppressWarnings("serial")
public class StringVaziaException extends Exception{

	private String nomeDoAtributo;

	public StringVaziaException(String nomeDoAtributo) {
		super();
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMEssage() {
		return String.format("O atributo %s está vazio.", nomeDoAtributo);
	}
}
