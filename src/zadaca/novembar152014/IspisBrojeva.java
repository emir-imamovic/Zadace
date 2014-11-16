package zadaca.novembar152014;

public class IspisBrojeva {
	public static void main(String[] args) {
		int brojcicNeki = (int) (10000 + Math.random() * (100000 - 10000));
		/*
		 * program ce ispisivati brojeve izmedju 10 i 100 hiljada ukljucujuci i
		 * te brojeve, unazad i svaki broj posebno u jednoj liniji koda.
		 * samo komentar da se vidi da je nesto promjenjeno
		 * Hoce li 100 000 biti ukljucen ? I hoce li program raditi za taj broj ?
		 */
		System.out.println("Inicijalni broj:  " + brojcicNeki);
		System.out.println("Zadnja cifra je:  " + brojcicNeki % 10);
		brojcicNeki /= 10;
		System.out.println("Predzadnja cifra je:  " + brojcicNeki % 10);
		brojcicNeki /= 10;
		System.out.println("Cifra prije nje je:  " + brojcicNeki % 10);
		brojcicNeki /= 10;
		System.out.println("Cifra prije ove je:  " + brojcicNeki % 10);
		brojcicNeki /= 10;
		System.out.println("Prva cifra je:  " + brojcicNeki % 10);

	}
}
