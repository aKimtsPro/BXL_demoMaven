import org.junit.jupiter.api.Assertions;

public class TestClass {


    void test(){
        // seulement accessible ici car scope test pour junit5
        Assertions.assertTrue(true);
    }
}
