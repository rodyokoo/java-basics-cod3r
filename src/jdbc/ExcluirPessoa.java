package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {

	public static void main(String[] args) throws SQLException, IOException {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Código da pessoa a ser excluída: ");
		Integer index = Integer.parseInt(entrada.nextLine());
		
		Connection conexao = FabricaConexao.getConexao();
		String sql = "DELETE FROM pessoas WHERE codigo = ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, index);
		
		if(stmt.executeUpdate() > 0) {			
			System.out.println("A pessoa de código " + index + " foi excluída.");
		} else {
			System.out.println("Nada aconteceu.");
		}
		
		stmt.close();
		conexao.close();
		entrada.close();
	}
}
