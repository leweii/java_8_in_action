package learn.example.one.util;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import learn.example.one.object.Apple;
import learn.example.one.service.AppleService;

public class AppleUtil {

	private static final Integer WEIGHT_LINE = 100;
	private static final String COLOR_RED = "RED";
	private static final String COLOR_YELLOW = "YELLOW";
	private static AppleService appleService = new AppleService();

	// Predicate examples
	public static List<Apple> filterRedApples(List<Apple> allApples) {
		return appleService.filterByAction(allApples, (Apple a) -> COLOR_RED.equals(a.getColor()));
	}

	public static List<Apple> filterYellowApples(List<Apple> allApples) {
		return appleService.filterByAction(allApples, (Apple a) -> COLOR_YELLOW.equals(a.getColor()));
	}

	public static List<Apple> filterHeavyApples(List<Apple> allApples) {
		return appleService.filterByAction(allApples, (Apple a) -> a.getWeight() > WEIGHT_LINE);
	}

	public static List<Apple> filterRedAndHeavyApples(List<Apple> allApples) {
		return appleService.filterByAction(allApples,
				(Apple a) -> "RED".equals(a.getColor()) && a.getWeight() > WEIGHT_LINE);
	}

	// Consumer examples
	public static void printAppleInSimpleWay(List<Apple> allApples) {
		appleService.iteratorAllApples(allApples,
				(Apple a) -> System.out.print(a.getWeight() + ", " + a.getColor() + ". "));
	}

	public static void printAppleInComplexWay(List<Apple> allApples) {
		appleService.iteratorAllApples(allApples, (Apple a) -> {
			System.out.println("weight, " + a.getWeight());
			System.out.println("color, " + a.getColor());
		});
	}

	// Function example
	public static List<Integer> mapAppleToWeight(List<Apple> allApples) {
		Function<Apple, Integer> f = (Apple a) -> a.getWeight();
		return appleService.mapApples(allApples, f);
	}

	public static List<String> mapAppleToColor(List<Apple> allApples) {
		return appleService.mapApples(allApples, (Apple a) -> a.getColor());
	}

	public static List<Apple> getAllApples() {
		List<Apple> allApples = new ArrayList<Apple>();
		allApples.add(new Apple(100, COLOR_YELLOW));
		allApples.add(new Apple(25, COLOR_RED));
		allApples.add(new Apple(70, COLOR_RED));
		allApples.add(new Apple(70, COLOR_RED));
		allApples.add(new Apple(150, COLOR_YELLOW));
		allApples.add(new Apple(70, COLOR_RED));
		allApples.add(new Apple(180, COLOR_RED));
		allApples.add(new Apple(70, COLOR_RED));
		return allApples;
	}

}
