class TestExercicioUm {
	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			System.out.println(i);
		}
		// Letra a) - > Erro de compilação 
		// Erro ocorre devido variável fora de escopo
		// System.out.println(i);
	}
}

class TestExercicioDois {
	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) 
			System.out.println(i);
		
		// Letra a) - > Erro de compilação 
		// Erro ocorre devido variável fora de escopo
		// System.out.println(i);
	}
}

class TestExercicioTres {
	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			System.out.println(i);
		}
		// Letra c) -> Compila e roda, imprimindo de 0 até 19, e depois 15.
		int i = 15;
		System.out.println(i);
	}
}
	
class TestExercicioQuatro {
	static int x = 15;
	
	public static void main (String[] x) {
		// Letra c) - > O código não compila.
		// Erro ocorre devido atribuição de valor int à variável x, que é um array de String.
		// x = 200;
		// System.out.println(x);
	}
}

class TestExercicioCinco {
	static int i = 3;
	
	public static void main(String[] a) {
		// Letra d) -> Compila e imprime os números de 10 até 99.
		for (new TestExercicioCinco().i = 10; new TestExercicioCinco().i < 100; new TestExercicioCinco().i++) {
			System.out.println(i);
		}
	}
}