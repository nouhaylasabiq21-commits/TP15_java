package tp15;

import java.util.*;

class Personne {
	String prenom;
	String nom;
	int age;

	Personne(String p, String n, int a) {
		prenom = p;
		nom = n;
		age = a;
	}

	String getNom() {
		return nom;
	}

	String getPrenom() {
		return prenom;
	}

	int getAge() {
		return age;
	}

	public String toString() {
		return prenom + " " + nom + " (" + age + ")";
	}
}

public class ComparateurCompose {
	public static void main(String[] args) {

		List<Personne> personnes = List.of(new Personne("rami", "safi", 30), new Personne("safi", "rami", 25),
				new Personne("safi", "safi", 20));

		Comparator<Personne> comp = Comparator.comparing(Personne::getNom).thenComparing(Personne::getPrenom)
				.thenComparingInt(Personne::getAge);

		personnes.stream().sorted(comp).forEach(System.out::println);
	}
}
