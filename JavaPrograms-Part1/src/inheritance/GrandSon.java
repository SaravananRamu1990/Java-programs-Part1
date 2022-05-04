package inheritance;

public class GrandSon extends Father {
	public void job() {
		System.out.println("i am an automation testing engineer");
	}

	public static void main(String[] args) {
		GrandSon grandson = new GrandSon();
		grandson.job();
		grandson.earning();
		grandson.walk();
		grandson.style();
	}
}
