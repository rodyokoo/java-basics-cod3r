package excecao;

public class ChecadaVsNaoChecada {

	public static void main(String[] args) {
		
		try {
			geraErro1();
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		try {
			geraErro2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		System.out.println("fim");
		
	}
	
	static void geraErro1() {
		throw new RuntimeException("Erro #1");
	}
	
	static void geraErro2() throws Exception{
		throw new Exception("Erro #2");
	}
}
