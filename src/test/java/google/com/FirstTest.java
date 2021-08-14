package google.com;

import org.junit.jupiter.api.*;

public class FirstTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("this is beforAll message");
    }

    @BeforeEach
    void setUp() {
        System.out.println("this is introduction");
    }

    @AfterEach
    void tearDown() {
        System.out.println("this is conclusion");
    }

    @Test
    void firstTest() {
        System.out.println("some test here!");
        Assertions.assertTrue(true);

    }

    @Test
    void secondTest() {
        System.out.println("another test here!!!");
        Assertions.assertTrue(true);

    }
}
