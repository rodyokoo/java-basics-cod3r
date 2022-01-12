package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AtualizarPessoaPorId {

	public static void main(String[] args) throws SQLException, IOException {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Código da pessoa a ser atualizada: ");
		Integer index = Integer.parseInt(entrada.nextLine());
		
		System.out.println("Nome atualizado: ");
		String name = entrada.nextLine();
		
		Connection conexao = FabricaConexao.getConexao();
		String sql = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, name);
		stmt.setInt(2, index);
		
		stmt.execute();
		System.out.println("Nome do código " + index + " atualizado com sucesso!");
		
		stmt.close();
		conexao.close();
		entrada.close();
	}
}
