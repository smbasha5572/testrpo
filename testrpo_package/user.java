package testrpo_package;

interface user {
	void dvd();

	void tv();

	void hometheater();

}

class Samsung implements user {
	public void dvd() {
		System.out.println("samsung dvd");
	}

	public void tv() {
		System.out.println("samsung tv");
	}

	public void hometheater() {
		System.out.println("samsung thearter");
	}
}

class Panosonic implements user {
	public void dvd() {
		System.out.println("panosinc dvd");
	}

	public void tv() {
		System.out.println(" panosonic tv");
	}

	public void hometheater() {
		System.out.println("panosinic thearter");
	}
}
public class user
{
public static void main (String args[])
{
  user e1=new Samsung();
 user e2=new Panosonic();

e1.dvd(); e1.tv(); e1.hometheater();
}
}