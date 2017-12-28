package Dennis.Sungtaek;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char input, output;

		System.out.println("문자를 입력하세요.");
		input = sc.next().charAt(0);
		
		if(Character.isUpperCase(input)) {
			output = Character.toLowerCase(input);
			System.out.println(output);
		}
		
		else if(Character.isLowerCase(input)) {
			output = Character.toUpperCase(input);
			System.out.println(output);
		}
			
		else
			System.out.println("잘못 입력하셨습니다.");
		
	}

}