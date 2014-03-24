
public class JrYeti extends Yeti{

	public static void goDown(int howMany){
		for (int i = 0; i < howMany; i++) {
			goDown();
		}
	}
	
	public static void move(int howMany){
		for (int i = 0; i < howMany; i++) {
			move();
		}
	}
	
	public static void dropBoulder(int howMany){
		for (int i = 0; i < howMany; i++) {
			dropBoulder();
		}
	}
}
