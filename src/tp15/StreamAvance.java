package tp15;

import java.util.*;
import java.util.stream.Collectors;

class PersonneVille {
	String nom;
	int age;
	String ville;

	PersonneVille(String nom, int age, String ville) {
		this.nom = nom;
		this.age = age;
		this.ville = ville;
	}

	String getVille() {
		return ville;
	}

	int getAge() {
		return age;
	}

	String getNom() {
		return nom;
	}

	public String toString() {
		return nom + " (" + age + ") - " + ville;
	}
}

public class StreamAvance {
	public static void main(String[] args) {

		List<PersonneVille> personnes = List.of(new PersonneVille("Jean", 25, "Paris"),
				new PersonneVille("Marie", 30, "Lyon"), new PersonneVille("Paul", 40, "Paris"));

		Map<String, List<PersonneVille>> parVille = personnes.stream()
				.collect(Collectors.groupingBy(PersonneVille::getVille));

		System.out.println(parVille);

		double ageMoyen = personnes.stream().mapToInt(PersonneVille::getAge).average().orElse(0);

		System.out.println(ageMoyen);
	}
}
