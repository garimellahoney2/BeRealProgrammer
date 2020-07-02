import java.util.Random;

public class TestComapartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random rad = new Random();
Compartment c[] = new Compartment[4];
for(int i =0;i<4;i++)
{
	switch(rad.nextInt(4))
	{
	case 0: c[i] = new FirstClass();
	break;
	case 1: c[i] = new Luggage();
	break;
	case 2: c[i] = new Ladies();
	break;
	default: c[i] = new General();
	}
}
for(int i =0;i<4;i++)
{
c[i].notice();
}
	}
}
