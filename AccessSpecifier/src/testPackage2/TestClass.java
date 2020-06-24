package testPackage2;

import testPackage.*;
public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Foundation f = new Foundation();
System.out.println(f.var4);
	}
class TestingProtected extends Foundation//even if it is public we can access 
//by this i understoop more scope should be consider only in 
{
	
	TestingProtected s1 = new TestingProtected();
	int val = s1.var2;
	//int val2 = s1.var100;
	//int val2 = s1.val;
}

}
