//Q.1:
interface lamda{
	int test(int a,int b);
}
public class Calculator {
	public static void main(String[] args) {
		lamda add=(a,b)->(a+b);
		lamda difference=(a,b)->(a-b);
		lamda product=(a,b)->(a*b);
		lamda safeDivision=(a,b)->{
			try {
				if(b==0) {
					throw new ArithmeticException();
				}
				else {
					return a/b;
				}
			}
			catch(ArithmeticException e) {
				System.out.println("We cannot divide with zero");
			}
			return 0;
		};
		System.out.println(add.test(50,20));
		System.out.println(difference.test(50,20));
		System.out.println(product.test(50,20));
		System.out.println(safeDivision.test(50,20));
	}
}
