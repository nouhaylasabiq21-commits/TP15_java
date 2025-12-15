package tp15;

import java.util.*;
import java.util.stream.Collectors;

public class StreamBasics {
	public static void main(String[] args) {

		List<String> noms = Arrays.asList("Jean", "Pierre", "Marie", "Paul");

		List<String> p = noms.stream().filter(n -> n.startsWith("P")).collect(Collectors.toList());

		System.out.println(p);

		noms.stream().map(String::toUpperCase).forEach(System.out::println);

		long count = noms.stream().filter(n -> n.length() > 4).count();

		System.out.println(count);
	}
}
