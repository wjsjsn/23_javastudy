package dd.com.ict.edu;

public class Test_enum {
  String name;
  int size;
   
  public static void main(String[] args) {
	  Ex02_enum shoes = new Ex02_enum();
	  shoes.name = "나이키";
	  shoes.size = 270;
	  shoes.type = Type.RUNNING;
	  
	  System.out.println("신발 이름 : " + shoes.name);
	  System.out.println("신발 사이즈 : " + shoes.size);
	  System.out.println("신발 종류 : " + shoes.type);
	  System.out.println("신발 종류 : " + Type.RUNNING);
  }
}
