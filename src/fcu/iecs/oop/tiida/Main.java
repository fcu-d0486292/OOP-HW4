package fcu.iecs.oop.tiida;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		NissanTiida car =new NissanTiida();
		Scanner input =new Scanner(System.in);
		int number;
		int i;
		System.out.printf("Please enter a number:");
		number=input.nextInt();
		for(i=0;i<number;i++){
			car.tiida();
			System.out.printf("\n");
		}

	}

}
