import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTests {

    @Test

    public void test() {
        MovieManager manager = new MovieManager();

        manager.add("Film1");
        manager.add("Film3");

        String[] expected = { "Film1", "Film3"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test

    public void test2() {
        MovieManager manager = new MovieManager();

        manager.add("Film1");
        manager.add("Film2");
        manager.add("Film3");

        String[] expected = { "Film1", "Film2", "Film3"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test

    public void test3() {
        MovieManager manager = new MovieManager();

        manager.add("Film3");

        String[] expected = {"Film3"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
}
