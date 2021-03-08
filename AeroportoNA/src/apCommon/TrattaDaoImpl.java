package apCommon;

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import apCommon.Connessione;

public class TrattaDaoImpl implements TrattaDao {

	private Connection connection;
	private Statement statement;
	
	@Override
	public List<String> getAllCitt�() throws SQLException{
		String query = "SELECT * FROM tratte";
		List<String> list = new ArrayList<String>();
		ResultSet rs = null;
		String citt� = new String();
		try {
			connection = Connessione.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			while(rs.next()) {
				citt�= rs.getString("citt�");
				list.add(citt�);
			}
		} finally {
			Connessione.closeResultSet(rs);
			Connessione.closeStatement(statement);
			Connessione.closeConnection(connection);
		}
		return list;
	}

	//@Override
	//public Tratta getTratta(IDTratta IDtratta) {
		// TODO Auto-generated method stub
		//return null;
	//}

	@Override
	public void updateTratta(Tratta tratta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTratta(Tratta tratta) {
		// TODO Auto-generated method stub
		
	}

}
