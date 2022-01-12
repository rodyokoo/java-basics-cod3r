package excecao.personalizadaA;


@SuppressWarnings("serial")
public class StringVaziaException extends RuntimeException{

	private String nomeDoAtributo;

	public StringVaziaException(String nomeDoAtributo) {
		super();
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMEssage() {
		return String.format("O atributo %s está vazio.", nomeDoAtributo);
	}
}
