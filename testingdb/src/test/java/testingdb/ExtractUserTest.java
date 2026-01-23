package testingdb;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.sql.SQLException;
import org.junit.jupiter.api.Test;
import com.testingdb.ExtractUser;

public class ExtractUserTest {

    @Test
    void namePresent() throws SQLException, ClassNotFoundException {
        ExtractUser e = new ExtractUser();
        assertTrue(e.nameExists("roshan"));
    }

  
}
