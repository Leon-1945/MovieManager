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
    @Test
    public void test4() {
        MovieManager manager = new MovieManager(11);

        manager.add("Film1");
        manager.add("Film2");
        manager.add("Film3");
        manager.add("Film4");
        manager.add("Film5");
        manager.add("Film6");
        manager.add("Film7");
        manager.add("Film8");
        manager.add("Film9");
        manager.add("Film10");
        manager.add("Film11");


        String[] expected = {"Film11","Film10","Film9","Film8","Film7","Film6","Film5","Film4","Film3","Film2","Film1"};
        String[] actual = manager.findlast();

        Assertions.assertArrayEquals(actual, expected);
    }
    @Test
    public void test5() {
        MovieManager manager = new MovieManager(9);

        manager.add("Film1");
        manager.add("Film2");
        manager.add("Film3");
        manager.add("Film4");
        manager.add("Film5");
        manager.add("Film6");
        manager.add("Film7");
        manager.add("Film8");
        manager.add("Film9");
        manager.add("Film10");




        String[] expected = {"Film10","Film9","Film8","Film7","Film6","Film5","Film4","Film3","Film2"};
        String[] actual = manager.findlast();

        Assertions.assertArrayEquals(actual, expected);
    }
    @Test
    public void test6() {
        MovieManager manager = new MovieManager(9);

        manager.add("Film1");
        manager.add("Film2");
        manager.add("Film3");
        manager.add("Film4");
        manager.add("Film5");
        manager.add("Film6");
        manager.add("Film7");
        manager.add("Film8");




        String[] expected = {"Film8","Film7","Film6","Film5","Film4","Film3","Film2","Film1"};
        String[] actual = manager.findlast();

        Assertions.assertArrayEquals(actual, expected);
    }
}
