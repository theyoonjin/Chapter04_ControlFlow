package method;

import java.util.Scanner;

public class ControlFlow {
	public static void main(String[] args) {
//			"오버로딩"		
		showDisplay();
		Scanner scan = new Scanner(System.in);
		
		int i = add(3, 5);
		System.out.println(i);
	}	
	private static void	showDisplay() {
		System.out.println("-------MENU-------");
		System.out.println();
		System.out.println("1.계좌등록	 2.입금 3. 출금 4. 종료\n");
		System.out.println();

		
	}





	public static int add(int i, int j) {
		return i + j;
	}
	
	public static void add(double d, double e) {
		System.out.println(d + e);

	}

}