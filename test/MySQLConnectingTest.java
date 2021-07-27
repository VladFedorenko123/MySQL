package src.srccode.test;

import static org.mockito.Mockito.when;

import java.sql.Connection;
import java.sql.Statement;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class MySQLConnectingTest {
	Connection mockConnection = Mockito.mock(Connection.class);
	Statement statement = Mockito.mock(Statement.class);

	@Test
	void testConnectin() {
		try {
			when(mockConnection.createStatement()).thenReturn(statement);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
