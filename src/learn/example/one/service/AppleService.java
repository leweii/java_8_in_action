package learn.example.one.service;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import learn.example.one.object.Apple;

public class AppleService {

	public List<Apple> filterByAction(List<Apple> orgApples, Predicate<Apple> predicate) {
		return orgApples.stream().filter(predicate).collect(Collectors.toList());
	}

	public void iteratorAllApples(List<Apple> apples, Consumer<Apple> consumer) {
		apples.stream().forEach(consumer);
	}

	public <R> List<R> mapApples(List<Apple> allApples, Function<Apple, R> function) {
		return allApples.stream().map(function).collect(Collectors.toList());
	}
}
