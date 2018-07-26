package learn.example.one.test;

import org.junit.Test;

import learn.example.one.util.AppleUtil;

public class FilterAppleTest {

	@Test
	public void PredicateTest() {
		AppleUtil.filterRedApples(AppleUtil.getAllApples());
	}

	@Test
	public void consumerTest() {
		AppleUtil.printAppleInComplexWay(AppleUtil.filterHeavyApples(AppleUtil.getAllApples()));
		AppleUtil.printAppleInSimpleWay(AppleUtil.filterHeavyApples(AppleUtil.getAllApples()));
	}

	@Test
	public void functionTest() {
		AppleUtil.mapAppleToColor(AppleUtil.getAllApples()).stream().forEach(System.out::println);
		AppleUtil.mapAppleToWeight(AppleUtil.getAllApples()).stream().forEach(System.out::println);
	}

}
