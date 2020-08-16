import java.util.*;
class Rectangle{
	int width;
	int height;
	public void display(){
		System.out.println(width +" "+height);
	}
}
class RectangleArea extends Rectangle{
	public void display(){
		System.out.println(width * height);
	}
	public void read_input(){
		System.out.println("Enter width and Height");
		Scanner sc = new Scanner(System.in);

		String s[] = sc.nextLine().split(" ");
		int w = Integer.parseInt(s[0]);
		int h = Integer.parseInt(s[1]);

		height = h;
		width = w;

		super.display();
	}
}
class Main{
	public static void main(String[] args) {
		RectangleArea r = new RectangleArea();
		r.read_input();
		r.display();

	}
}

