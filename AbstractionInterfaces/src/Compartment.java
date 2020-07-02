
public abstract class Compartment {
abstract void notice();
}
class FirstClass extends Compartment
{
	@Override
	void notice() {
		System.out.println("FirstClass");
		
	}
}
class Luggage extends Compartment
{
	@Override
	void notice() {
		System.out.println("luggage");
		
	}
}
class General extends Compartment
{
	@Override
	void notice() {
		System.out.println("general");
		
	}
}
class Ladies extends Compartment
{
	@Override
	void notice() {
		System.out.println("ladies");
		
	}
}
