package apCommon;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public interface TrattaDao {
	
	
	public List<String> getAllCitt�() throws SQLException;
	public Tratta getTratta(IDTratta IDtratta);
	public void updateTratta(Tratta tratta);
	public void deleteTratta(Tratta tratta);
	
	
}
