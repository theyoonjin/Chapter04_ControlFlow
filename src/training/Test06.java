package training;

public class Test06 {
	public static void main(String[] args) {
//		�� ���� '���� ���밪'�� ����Ͽ� ����ϴ� �޼ҵ带
//		�ۼ��ϰ� ���� �ڵ� �ۼ�
//		�޼��� �̸� : abs
		
		abs(3, 7);
		abs(-5, -3);
		abs(4, -3);
	}
	
	public static void abs(int i, int j) {
		if(i > j) {
			System.out.println(i - j);
		}else {
			System.out.println(j - i);
		}
	}
}