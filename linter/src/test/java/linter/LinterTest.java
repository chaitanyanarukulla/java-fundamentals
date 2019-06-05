package linter;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.FileNotFoundException;


public class LinterTest {

    @Test
    public void trst_return_Number_Of_Errors() {
        int ERROR_NUMBER = 46;
        assertEquals("testing to make sure on # of error number is 46", ERROR_NUMBER, Linter.linterSemicolon("resources/gates.js"));
    }

    @Test
    public void test_throw_An_Error_For_Wrong_FilePath() {
        assertEquals("testing to make sure error is thrown for file not found", -1, Linter.linterSemicolon("fishsticks"));
    }

}