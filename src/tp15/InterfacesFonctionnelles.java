package tp15;

import java.util.function.*;

public class InterfacesFonctionnelles {
	public static void main(String[] args) {

		Predicate<String> estVide = s -> s.isEmpty();
		System.out.println(estVide.test(""));
		System.out.println(estVide.test("Bonjour"));

		Consumer<String> afficher = s -> System.out.println("Affichage: " + s);
		afficher.accept("Hello");

		Function<String, Integer> longueur = s -> s.length();
		System.out.println(longueur.apply("Lambda"));

		Supplier<Double> aleatoire = () -> Math.random();
		System.out.println(aleatoire.get());
	}
}
