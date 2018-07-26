package learn.example.two.test;

import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.Test;

public class FlatStreamTest {

	@Test
	public void flatStreamTest() {
		String[] arrayOfWords = { "Good", "Morning" };
		Stream.of(arrayOfWords).map(w -> w.split("")).flatMap(Arrays::stream).forEach(System.out::print);

		Integer[][] intArrays = { { 1, 2, 3 }, { 3, 2, 4 } };
		Stream.of(intArrays).flatMap(Arrays::stream).forEach(System.out::println);
	}

	@Test
	public void flatMapTest() {
		Integer[] intArrays = { 1, 2, 3 };
		Integer[] intArrays2 = { 1, 2, 3 };
		Stream.of(intArrays).flatMap(i -> Stream.of(intArrays2).map(j -> new int[i][j])).forEach(System.out::println);
	}
}
