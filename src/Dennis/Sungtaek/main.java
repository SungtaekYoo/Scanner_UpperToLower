package Dennis.Sungtaek;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char input, output;

		System.out.println("���ڸ� �Է��ϼ���.");
		input = sc.next().charAt(0);
		
		if(Character.isUpperCase(input)) {			//input�� Upper���� Ȯ��
			output = Character.toLowerCase(input);
			System.out.println(output);
		}
		
		else if(Character.isLowerCase(input)) {		//input�� Lower���� Ȯ��
			output = Character.toUpperCase(input);
			System.out.println(output);
		}
			
		else
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");  //Upper | Lower�� �ƴϸ� ó��.
		
	}

}