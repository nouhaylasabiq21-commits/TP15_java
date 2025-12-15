package tp15;

import java.util.*;
import java.util.function.*;

public class ReferencesMethodes {
	public static void main(String[] args) {

		Function<String, Integer> parser = Integer::parseInt;
		System.out.println(parser.apply("123"));

		Consumer<String> printer = System.out::println;
		printer.accept("Hello");

		BiFunction<String, String, Boolean> comp = String::equalsIgnoreCase;
		System.out.println(comp.apply("java", "JAVA"));

		Supplier<List<String>> listFactory = ArrayList::new;
		System.out.println(listFactory.get());

		Function<Integer, String[]> arrayCreator = String[]::new;
		System.out.println(arrayCreator.apply(5).length);
	}
}
