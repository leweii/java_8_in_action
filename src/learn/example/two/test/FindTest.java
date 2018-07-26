package learn.example.two.test;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class FindTest {

    @Test
    public void findFirstTest() {
        List<Integer> someNumbers = Arrays.asList(1, 2, 1, 2, 1);

        Integer i = someNumbers.stream().findFirst().get();
        System.out.print(i);
    }

    @Test
    public void findAnyTest() {
        List<Integer> someNumbers = Arrays.asList(1, 2, 1, 2, 1);

        Integer i = someNumbers.stream().findAny().get();
        System.out.print(i);
    }
}
