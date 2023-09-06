
import com.kodilla.stream.UsersManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsersMenagerTest {
    private UsersManager usersManager;

    @BeforeEach
    public void setUp() {
        usersManager = new UsersManager();
    }

    @Test
    public void TestFilterChemistGroupUsernames() {
        List<String> usersManager = UsersManager.filterChemistGroupUsernames();
        assertEquals(2, usersManager.size());
    }


    @Test
    public void TestFilterAgeGroup(){
        List<String> usersManager = UsersManager.filterAgeGroup();
        assertEquals(1, usersManager.size());
    }

    @Test
    public void TestFilterByName(){
        List<String> userManager = UsersManager.filterByName();
        assertEquals(1, userManager.size());
    }
}