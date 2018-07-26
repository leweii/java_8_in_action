package learn.example.two.test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.Test;

public class ReduceTest {

    @Test
    public void reduceTest() {
        List<Integer> nums = Arrays.asList(1, 2, 3);

        Integer sum = nums.stream().reduce(0, Integer::sum);
        Optional<Integer> min = nums.stream().reduce(Integer::min);
        min.get();
        
    }

}
