package day02.com.ict.edu;

class Ex06{
  public static void main(String[] args){
  String name = "ȫ�浿";
  int age = 17;
  System.out.println(name);

  name = "1000";
  age = 1000;
  System.out.println(name+50);
  System.out.println(age+50);
  
   int su1 = 20;
   int su2 = 4;
   System.out.println(su1+su2);              
   System.out.println("���:"+su1+su2);   // �տ������� ���ż� su1,su2�� ���� ������ "���:204"��� ���� ����
   
   //�ذ���
   System.out.println("���:"+(su1+su2));  
   int su3 = su1 + su2;
   System.out.println("���:"+su3);           // ������ �� �� �� ��� �װ� ��ħ
    }
}