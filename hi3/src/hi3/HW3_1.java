package hi3;
import java.util.Scanner;

public class HW3_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idx = 0;
		System.out.printf("enter the num:");
		int num = sc.nextInt();
		int arr[] = new int[num];
		
		for (int i=0; i<num; i++) {
			arr[i] = sc.nextInt();
		}
		
		idx =num -1;
		
		while(idx>=0) {
			System.out.printf("%d\n" ,arr[idx]);
			idx--;
		}
        
	}

}
