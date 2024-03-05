package hi2;
import java.util.Scanner;

public class hw2 {
	static String fever;
	static String cough;
	static String Lazy;
	static String highbool;
	static String dry;
	static String sweats;
  
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("歡迎使用醫療診斷系統，請依序回答問題");
		System.out.println("========================");
		System.out.println("最近是否有發燒");
		fever =sc.next();
		
		if(fever.toLowerCase().equals("y")) {
		   System.out.println("最近是否咳嗽");
		   cough = sc.next();
			
		   if(cough.toLowerCase().equals("y")) {
		      System.out.println("最近是否疲倦");
			  Lazy=sc.next();
				  if(Lazy.toLowerCase().equals("y")) {
					  System.out.println("可能得感冒");
				  }
				  else {
					   System.out.println("可能得其他症狀");
				  }
		   }else {
			  System.out.println("最近是否高血壓");
			  highbool=sc.next();
				
			  if (highbool.toLowerCase().equals("y")) {
				  System.out.println("最近是否口乾");
				  dry = sc.next();
				   
			      if(dry.toLowerCase().equals("y")) {
					 System.out.println("可能得肝病");
			      }else {
			    	 System.out.println("可能的其他症狀");
			      }
			  }else {
				  System.out.println("最近是否盜汗");
				  sweats=sc.next();
				   
				  if(sweats.toLowerCase().equals("y")) {
					 System.out.println("可能得肺病");
				  }else {
					  System.out.println("可能得其他症狀");
				  }
			    }
		   }
        }else {
        	System.out.println("你很健康");
        }
    }
}
      

		
			
		
		

	


