import java.util.*;

class New{
	public static void main(String[] arg){
		Scanner scan = new Scanner(System.in);
		double a,b,res;
		char choice,ch;
		do{
			System.out.println("Enter two numbers");
			a = scan.nextInt();
			b = scan.nextInt();
			System.out.println("1. Add");
			System.out.println("2. Sub");
			System.out.println("3. Exit");
			choice = scan.next().charAt(0);
			switch(choice){
				case '1': System.out.println(a+b);
					  break;
				case '2' : System.out.println(a-b);
					   break;
				case '3': System.exit(0);
					  break;
				default : System.out.println("Invalid choice");
					  break;
			}
		}while(choice != 3);
	}
}
