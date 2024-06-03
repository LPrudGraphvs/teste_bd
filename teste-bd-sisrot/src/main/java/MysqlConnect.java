import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConnect {
	
	public void conectar() {
		Connection conn = null;
	    try {
	      // Configure a conex�o com o banco de dados
	      String url = "jdbc:mysql://graphvsvps.ddns.net:13306/lix_desenv";
	      String username = "IvoCoelho";
	      String password = "IvCo@MySQL2024";
	
	      // Conecte-se ao banco de dados
	      conn = DriverManager.getConnection(url, username, password);
	
	      // Imprima uma mensagem de sucesso
	      System.out.println("Conex�o estabelecida com sucesso.");
	      conn.close();
	    } catch (SQLException e) {
	      System.out.println("Ocorreu um erro ao estabelecer a conex�o: " + e.getMessage());
	    } finally {
	      if (conn != null) {
	        try {
	          conn.close();
	        } catch (SQLException e) {
	          System.out.println("Ocorreu um erro ao fechar a conex�o: " + e.getMessage());
	        }
	      }
	    }
    }
}