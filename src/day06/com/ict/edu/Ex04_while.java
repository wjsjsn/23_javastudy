package day06.com.ict.edu;

public class Ex04_while {
	public static void main(String[] args) {

		//1~10 까지 출력
		
		int i = 1;
		while (i < 11) {
			System.out.println("i : "+i);
			i++;
		}
		
	System.out.println("=====================");
	
	i = 1;
   while (true) {
	   if(i>=11) break;
	   System.out.println("i : "+i);
	   i++;
}
   
   System.out.println("=====================");
   //0~10까지 짝수 출력
   
   i = 0;
   while (i<11) {
	if(i%2==0) {
		System.out.println("i = "+i);
	}
	   i ++;
}
   
   //구구단 중 7단 출력
   i = 1;
   System.out.println("7단");
   while (i<10) {
	   System.out.println("7*"+i+"="+ (i*7));
		i++;
}
   System.out.println("=====================");
   
   //1~10까지 누적합 출력
   int sum = 0;
   i = 1; 
   while (i<11) {
	   sum = sum + i;
	   i++; 
}
   System.out.println("누적합 = "+sum);
   
   //0 0 0 0   System.out.println("0 0 0 0");
   //0 0 0 0   System.out.println("0 0 0 0");
   //0 0 0 0   System.out.println("0 0 0 0");
   //0 0 0 0   System.out.println("0 0 0 0");ㅋㅋㅋㅋ
   
   /* i = 1;
      while(i<5){
      System.out.println("0 0 0 0")
      i++;
    
    /* i = 1;
      while(i<17){ 
      System.out.print("0 ");
      if(i%4==0){
        System.out.println()
        }
      i++;
      } */ 
   
    
  System.out.println("==========================="); 
   sum= 0;
  i = 0;
   while (i<4) {
	   sum = sum*i;
	   System.out.print(sum+" "); 
	   System.out.print(sum+" "); 
	   System.out.print(sum+" "); 
	   System.out.println(sum);
	   	   i++;
     }
   
   
	}
}
