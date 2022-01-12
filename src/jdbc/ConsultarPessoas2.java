package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoas2 {

	public static void main(String[] args) throws SQLException, IOException {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Fa�a sua consulta no banco de dados: ");		
		String consulta = entrada.nextLine();
		
		Connection conexao = FabricaConexao.getConexao();
		String sql = "SELECT * FROM pessoas WHERE nome LIKE ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, "%" + consulta + "%");
		ResultSet resultado = stmt.executeQuery();
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		while(resultado.next()) {
			pessoas.add(new Pessoa(resultado.getInt("codigo"), resultado.getString("nome")));
		}
		
		for(Pessoa p: pessoas) {
			System.out.println(p.getCodigo() + " - " + p.getNome());
		}
		
		stmt.close();
		conexao.close();
		entrada.close();
	}
}
