
class Box
{
	int length;
	int width;
	int height;
	Box(int height,int width,int length)
	{
		this.length = length;
		this.width = width;
		this.height = height;
	}
	int volume()
	{
		return length*width*height;
	}
}
public class Testing {
public static void main(String[] args) {
	Box b = new Box(5,10,11);
	System.out.println(b.volume());
}
}
