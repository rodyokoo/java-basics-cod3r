package jdbc;

public class DAOTeste {

	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		dao.incluir(sql, "Eddie Alen");		
		dao.incluir(sql, "Diego Ferrarezi");
		dao.incluir(sql, "Fernanda Barros");
		
		dao.close();
	}
}
