package chapter5;

public class ch7 {
	public static void main(String[] args) {
		double fee = 10000;
		double total = 0;
		for(int i = 0; i < 10; i++)
		{
			fee = fee + 0.05 * fee;
		} 
		total = fee;
		System.out.println("ʮ���Ժ��ѧ��Ϊ��" + fee);
		for(int i = 0; i < 4; i++)
		{
			fee += 0.05 * fee;
			total += fee;
			
		}
		System.out.println("����֮�����ѧ��Ϊ��" + total);
			
		
	}

}
