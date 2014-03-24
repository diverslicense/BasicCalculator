public class MissYeti extends JrYeti{
	public static String boulder = "*";

	public static void setBoulder(String bldr) {
		boulder = bldr;
	}

	public static void pickNewBoulder(String newBoulder) {
		setBoulder(newBoulder);
	}
	public static void dropBoulder() {
		System.out.print(boulder);
	}
	
	public static void dropBoulder(int howMany){
		for (int i = 0; i < howMany; i++) {
			dropBoulder();
		}
	}
	
}

