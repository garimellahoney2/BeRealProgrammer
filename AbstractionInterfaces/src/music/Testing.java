package music;
abstract class Playable
{
	abstract void play();
}
class Veena extends Playable
{
	void play()
	{
		System.out.println("veena playing");
	}
}
class Saxophone extends Playable
{
	void play()
	{
		System.out.println("saxophoe playing");
	}
}

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Playable[] ab = new Playable[3];
	    ab[0] = new Saxophone();
	    ab[1] = new Veena();
	    //ab[2] = new Piano();
	    if(ab[0] instanceof Saxophone)
	    {
	    	ab[0].play();
	    }
	    if(ab[1] instanceof Veena)
	    {
	    	ab[1].play();
	    }
	}

}
