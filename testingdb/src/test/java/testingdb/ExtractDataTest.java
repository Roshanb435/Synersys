package testingdb;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.testingdb.ExtractData;

public class ExtractDataTest 
{
	@Test
	public void Check() throws ClassNotFoundException, SQLException 
	{
		ExtractData e= new ExtractData();
		assertTrue(e.getData().size() > 0);

	}

}
