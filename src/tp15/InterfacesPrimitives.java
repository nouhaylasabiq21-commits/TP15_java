package tp15;

import java.util.function.*;

public class InterfacesPrimitives {
	public static void main(String[] args) {

		IntPredicate estPair = n -> n % 2 == 0;
		System.out.println(estPair.test(5));
		System.out.println(estPair.test(6));

		IntConsumer afficher = n -> System.out.println("Nombre: " + n);
		afficher.accept(10);

		IntFunction<String> convertir = n -> "Valeur: " + n;
		System.out.println(convertir.apply(100));

		IntSupplier de = () -> (int) (Math.random() * 6) + 1;
		System.out.println("Dé: " + de.getAsInt());
	}
}
