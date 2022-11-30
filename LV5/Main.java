public class Main
{
	public static void main(String[] args) {
		
		Radnik ra = new Radnik();
		ra.placa();
		System.out.println();
		
		Ivica iv = new Ivica();
		iv.placa();
		iv.hours();
		iv.str();
		System.out.println();
		
		Juraj ju = new Juraj();
		ju.placa();
		ju.callDate();
	}
}
