package zadaca.novembar152014;

public class SferaPiramida {
	public static void main(String[] args) {
		int stranica = (int) (Math.random() * 50 + 1);
		/*
		 * pretpostavimo da je piramida pravilna cetverostranicna, tj da su joj
		 * stranice cetiri jednakostranicna trougla,
		 */
		int visinaTrougla = (int) (Math.sqrt(3) / 2 * stranica);
		int visinaPiramide = (int) (visinaTrougla * visinaTrougla - (stranica / 2)
				* (stranica / 2));
		int povrsinaPiramide = (int) (stranica * stranica + 2 * (stranica * visinaTrougla));
		int zapreminaPiramide = (int) ((stranica * stranica) * visinaPiramide);
		System.out.println("Na osnovu duzine stranice  " + stranica
				+ "  i visine jednakostranicnog trougla " + visinaTrougla
				+ "  povrsina piramide je : " + povrsinaPiramide);
		System.out.println("Na osnovu duzine stranice  " + stranica
				+ "  i visine piramide  " + visinaPiramide
				+ " zapremina piramide je : " + zapreminaPiramide);
		/*
		 * pretpostvavimo da je varijabla koju smo definisali kao "stranica"
		 * ustvari i poluprecnik sfere pa cemo izracunati sljedece
		 */
		int povrsinaSfere = (int) (4 * stranica * Math.PI);
		int zapreminaSfere = (int) (4 / 3 * (stranica ^ 3) * Math.PI);
		System.out.println("Na osnovu poluprecnika  " + stranica
				+ " povrsina sfere je: " + povrsinaSfere);
		System.out.println("Na osnovu poluprecnika  " + stranica
				+ " zapremina sfere je: " + zapreminaSfere);
	}
}
