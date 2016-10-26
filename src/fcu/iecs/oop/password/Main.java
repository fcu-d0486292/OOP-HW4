package fcu.iecs.oop.password;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		PasswordEncorder x=new PasswordEncorder();
		Scanner input = new Scanner(System.in);
		String str;
		while(true){
			System.out.printf("Please enter a password: ");
			str=input.next();
			if(str=="exit")break;
			str=x.encode(str);
			System.out.printf("%s\n",str);
		}

	}

}
