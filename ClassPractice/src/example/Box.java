package example;

public class Box {
	double height;
	double width;
	double length;
	Box(double h, double w, double l){
		height=h;
		width=w;
		length=l;
	}
	double volume() {
	return height*width*length;

}
}
class BoxDemo{
	public static void main(String args[]) {
		Box ob1=new Box(10,20,30);
		Box ob2=new Box(1,2,3);
		double volume1,volume2;
		volume1=ob1.volume();
		volume2=ob2.volume();
		System.out.println(" volume of first box "+volume1);
		System.out.print("volume of second box "+volume2);
	}
}

