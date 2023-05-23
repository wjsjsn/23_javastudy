package day02.com.ict.edu;

class Ex05{
   public static void main(String[] args){
   int kor = 90;
   int eng = 80;
   int math = 80;
   
   //����
   int sum = kor + eng + math;
   System.out.println(sum);
   
   //���(�Ҽ��� x)
   int avg = sum / 3; 
   System.out.println(avg);
  
    //���(�Ҽ��� ���� ���� x ==>>������ ����� ��ü�� int�� ������ 83�� �Ѿ)
   double avg2 = sum / 3;
   double avg3 = (double)(sum / 3); 

    //���(�Ҽ��� o ==>>sum�� �����ϸ� double�� ��ȯ=>�Ҽ��� ����)
   double avg4 = (double)(sum)/3; 
   double avg5 = sum/3.0;
   
   System.out.println(avg2);
   System.out.println(avg3);
   System.out.println(avg4);
   System.out.println(avg5);

   //���(�Ҽ��� ��°�ڸ�����==>>���ϴ� �Ҽ��� ��ŭ *10,100... =>int�� ��ȯ=>���Ѹ�ŭ �ٽ� double�� ���� )
   double avg6 = (int)(avg5*100)/100.0;
   System.out.println(avg6);

   //1472 ������ ���� ==>>1470
     int num1 = 1472;
     int num2 = (num1/10)*10;
     System.out.println(num2);


 

   
  }
}