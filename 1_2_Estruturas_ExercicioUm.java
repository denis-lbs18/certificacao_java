import java.util.*;
import java.io.*;

// Letra f) -> Roda e não imprime nada
class D {
	public static void main(String[]args) {
		ArrayList < String > existing = new ArrayList < String > ();
		for (String arg: args) {
			if (new E().exists(arg))
				existing.add(arg);
		}
	}
}

class E {
	public boolean exists(String name) {
		File f = new File(name);
		return f.exists();
	}
}
