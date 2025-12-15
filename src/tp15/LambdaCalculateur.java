package tp15;

@FunctionalInterface
interface Calculateur {
	int calculer(int a, int b);
}

public class LambdaCalculateur {
	public static void main(String[] args) {

		Calculateur addition = new Calculateur() {
			@Override
			public int calculer(int a, int b) {
				return a + b;
			}
		};

		Calculateur additionLambda = (a, b) -> a + b;

		System.out.println("Addition classique : " + addition.calculer(5, 3));
		System.out.println("Addition lambda : " + additionLambda.calculer(5, 3));
	}
}
