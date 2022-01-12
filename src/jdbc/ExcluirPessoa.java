package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {

	public static void main(String[] args) throws SQLException, IOException {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("C�digo da pessoa a ser exclu�da: ");
		Integer index = Integer.parseInt(entrada.nextLine());
		
		Connection conexao = FabricaConexao.getConexao();
		String sql = "DELETE FROM pessoas WHERE codigo = ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, index);
		
		if(stmt.executeUpdate() > 0) {			
			System.out.println("A pessoa de c�digo " + index + " foi exclu�da.");
		} else {
			System.out.println("Nada aconteceu.");
		}
		
		stmt.close();
		conexao.close();
		entrada.close();
	}
}
