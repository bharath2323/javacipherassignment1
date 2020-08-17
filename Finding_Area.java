//Q.2: 
import java.util.Scanner;

class Rectangle{
	int height;
	int width;
	void display(int width,int height) {
		System.out.println(width+" "+height);
	}
}
class Finding_Area extends Rectangle{
	void read_inputs() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		width= sc.nextInt();
		height=sc.nextInt();
	}
	void display() {
		System.out.println(width*height);
	}
	public static void main(String[] args) {
		Finding_Area obj = new Finding_Area();
		obj.read_inputs();
		obj.display(obj.width,obj.height);
		obj.display();
	}
}
