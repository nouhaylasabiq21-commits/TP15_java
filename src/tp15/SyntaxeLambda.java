package tp15;

import java.util.function.*;

public class SyntaxeLambda {
	public static void main(String[] args) {

		Runnable r = () -> System.out.println("Hello");
		r.run();

		Consumer<String> c1 = s -> System.out.println(s);
		Consumer<String> c2 = (String s) -> System.out.println(s);

		BiFunction<String, String, String> concat = (a, b) -> a + b;

		BiFunction<Integer, Integer, Integer> max = (a, b) -> {
			if (a > b)
				return a;
			else
				return b;
		};

		c1.accept("Lambda simple");
		c2.accept("Lambda typée");
		System.out.println(concat.apply("Hello ", "World"));
		System.out.println(max.apply(10, 5));
	}
}
