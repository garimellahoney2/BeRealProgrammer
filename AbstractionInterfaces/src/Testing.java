abstract class Instrument
{
	abstract void play();
}
class Piano extends Instrument
{
	void play()
	{
		System.out.println("Piano playing");
	}
}
class Guitar extends Instrument
{
	void play()
	{
		System.out.println("Guitar playing");
	}
}
class Tabla extends Instrument
{
	void play()
	{
		System.out.println("tabla playing");
	}
}
public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instrument[] ab = new Instrument[3];
	    ab[0] = new Tabla();
	    ab[1] = new Guitar();
	    ab[2] = new Piano();
	    if(ab[0] instanceof Tabla)
	    {
	    	System.out.println("HI");
	    }
	}

}
