package tp15;

import java.util.function.IntUnaryOperator;

public class CaptureLambda {

	private int valeur = 100;

	public static void main(String[] args) {
		int facteur = 10;

		IntUnaryOperator mult = n -> n * facteur;
		System.out.println(mult.applyAsInt(5));

		new CaptureLambda().demoThis();
	}

	private void demoThis() {
		Runnable r = () -> System.out.println(this.valeur);
		r.run();
	}
}
