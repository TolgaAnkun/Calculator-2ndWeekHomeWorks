
public class Main {

	public static void main(String[] args) {

		DortIslem dortIslem = new DortIslem();

		int sonuc = dortIslem.Topla(20, 10);
		System.out.println(sonuc);
		
		
		int sonuc2 = dortIslem.Cıkar(20, 10);
		System.out.println(sonuc2);
		
		
		int sonuc3 = dortIslem.Bol(20, 10);
		System.out.println(sonuc3);
		
		int sonuc4 = dortIslem.Carp(20, 10);
		System.out.println(sonuc4);

	}

}
