package day08.com.ict.edu;

import java.util.Iterator;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		/*
		 * 원하는 회수를 입력 받고 숫자를 입력 받아서 입력 받은 숫자가 홀수 인지, 짝수인지 판별하는 코딩
		 * System.out.print("횟수 : "); int su = scan.nextInt(); for (int i = 0; i < su;
		 * i++) {
		 * 
		 * System.out.print("숫자를 입력하시오 >>>"); int num = scan.nextInt();
		 * 
		 * if (num%2==0) { System.out.print(num +"는 짝수입니다."); } else {
		 * System.out.print(num + "는 홀수입니다."); } System.out.println(); }
		 */

		/*
		 * 이름, 국어, 영어, 수학를 입력 받아서 총점, 평균, 학점을 구하고 이름, 총점, 평균, 학점을 출력하는 코딩 (평균은 소숫점
		 * 첫째자리까지 구하자) String name = ""; int kor = 0; int eng = 0; int math = 0; int sum
		 * = 0; double avg = 0.0; String hak = "";
		 * 
		 * System.out.print("이름 : "); name = scan.next(); System.out.print("국어 점수 : ");
		 * kor = scan.nextInt(); System.out.print("영어 점수 : "); eng = scan.nextInt();
		 * System.out.print("수학 점수 : "); math = scan.nextInt();
		 * 
		 * sum = kor + eng + math; avg = (int)(sum/3.0*10)/10.0;
		 * 
		 * if (avg >= 90) { hak = "A학점"; } else if(avg >=80){ hak = "B학점"; }else if(avg
		 * >= 70) { hak = "C학점"; }else { hak = "F학점"; }
		 * System.out.println("이름 : "+name); System.out.println("총점 : "+sum);
		 * System.out.println("평균 : "+avg); System.out.println("학점 : "+hak);
		 */

		/*
		 * 첫번째 숫자 받기 두번째 숫자 받기 연산자 받기("1 => + \n 2 => - \n 3 => * \n 4 =>  / \n>>>>   ")
		 * double d = 0; double su1 = 0; double su2 = 0; int p1 = 0;
		 * System.out.print("첫 번째 숫자 : "); su1 = scan.nextInt();
		 * System.out.print("두 번째 숫자 : "); su2 = scan.nextInt();
		 * System.out.print(" 1 => + \n 2 => - \n 3 => * \n 4 =>  / \n>>>>   "); p1 =
		 * scan.nextInt();
		 * 
		 * if (p1==1) { d = (int)(su1 + su2); } else if(p1==2){ d = (int)(su1 - su2) ;
		 * }else if(p1==3) { d = (int)(su1 * su2) ; }else if(p1 == 4) { d = (int)(su1 /
		 * su2 *10)/10.0; } System.out.println(d);
		 */

		/*
		 * 근무시간이 8시간까지는 시간당 9620 8시간 초과하면 시간당 1.5배 현재 근무시간 10시간 얼마? int time = 8; int
		 * dan = 9620; int over = 10; int money = 0; if (over>time) { money = (int)((dan
		 * * time) + ((over-time) * dan * 1.5)); } else { money = dan * over; }
		 * System.out.println(money);
		 */

		/*
		 * menu 1- 카페모카 3500, 2 - 카페라떼 4000, 3 - 아메리카노 3000, 4 - 과일주스 3500 친구와 함께 2잔을
		 * 10000 내고 먹었다. 선택한 메뉴와 잔돈을 출력하자 (단, 부가세 10%는 포함) (친구와 같은 음료을 먹어야 한다.)
		 * System.out.print(); String drink = ""; int input = 10000; int output = 0; int
		 * vat = 0; int su = 2; int dan = 0; int num = 0; int total = 0;
		 * 
		 * System.out.print("메뉴선택 \n1.카페모카(3500)\n2.카페라떼(4000)"+
		 * "\n3.아메리카노(3000)\n4.과일주스(3500)\n>>>>>>>>>>>>>"); num = scan.nextInt(); if
		 * (num==1) { drink = "카페모카"; dan = 3500; }else if (num==2) { drink = "카페라떼";
		 * dan = 4000; }else if (num==3) { drink = "아메리카노"; dan = 3000; }else if
		 * (num==4) { drink = "과일주스"; dan = 3500; } total = dan * su ; vat =
		 * (int)(total*0.1); output = input - (total+vat) ; System.out.print(output +
		 * "원");
		 */

		/*
		 * 나라를 입력하면 수도가 출력 한국 - 서울, 중국 - 베이징, 일본 - 도쿄, 미국 - 워싱턴, 나머지 - 데이터 없음
		 * switch~case 사용
		 * 
		 * String sudo = "";
		 * 
		 * System.out.print("나라 이름 : "); String name = scan.next(); switch (name) { case
		 * "한국" : sudo = "서울" ; break; case "중국" : sudo = "베이징" ; break; case "일본" :
		 * sudo = "도쿄" ; break; case "미국" : sudo = "워싱턴" ; break; default : sudo =
		 * "데이터 없음"; break; } System.out.println(sudo);
		 */

		/*
		 * 1~10까지 출력(6일 때 break 사용) for (int i = 1; i < 11; i++) { if (i==6) { break; }
		 * System.out.println(i); }
		 */

		/*
		 * 1~10까지 출력(6일 때 continue 사용)
		 * 
		 * for (int i = 1; i < 11; i++) { if (i==6) { continue; } System.out.println(i);
		 * }
		 */

		/*
		 * 0~10까지 홀수만 출력(continue 사용)
		 * 
		 * for (int i = 0; i < 11; i++) { if (i%2==0) { continue; }
		 * System.out.println(i); }
		 */

		/*
		 * 0~10까지 출력(do while 사용) int a1 = 0; do { System.out.println(a1); a1++; } while
		 * (a1<11);
		 */

		/*
		 * 0~10까지 홀수만 출력(do while 사용) int a1 = 0; do { if (a1%2==1) {
		 * System.out.println(a1); } a1++; } while (a1<11);
		 */

		/*
		 * 7단 출력(do while 사용) int i = 1; do { System.out.println("7 * "+ i+" = "+(7*i)
		 * ); i++; } while (i<10);
		 */

		/*
		 * 0~10까지 홀수의 누적합 int i = 0; int sum = 0; for ( i = 0; i < 11; i++) { if
		 * (i%2==1) { sum = sum + i; } } System.out.println(sum);
		 */

		/*
		 * 구구단(while문 사용) int i = 1; while (i<10) { System.out.println(i + "단"); int j =
		 * 1; while (j<10) { System.out.println(i +" * "+j+" = "+(i*j)); j++; } i++; }
		 */

		/*
		 * 1. if-else문 농구공 5개씩 한 박스에 들어간다 40개면 8상자, 26개면 6상자이다 int k1 = 127개 몇 상자가 필요한가?
		 * int ball = 5; int k1 = 127; int box = k1 / ball; if (box == 0) { box = box ;
		 * } else { box = box + 1; } System.out.println(box);
		 */

		/*
		 * 4. 1 + (-2) + 3 + (-4) + 5 + (-6) + 7 + (-8) + 9 + (-10) for문을 이용한 누적합 int i
		 * = 1; int sum = 0; for ( i = 1; i < 11; i++) { if (i%2==0) { sum = sum -i; }
		 * else { sum = sum + i; } } System.out.println(sum);
		 */

		/*
		 * 5. 4번문제처럼 계속 더했을 때 , 몇 까지 더해야 총합이 100이상이 되는지 구하시오 int i = 0; int sum = 0; for
		 * ( i = 0; i < 5000; i++) { if (i%2==0) { sum = sum - i ; } else { sum = sum +
		 * i ; } if (sum >= 100) break; } System.out.println(i);
		 */

		/*
		 * 구구단(2~9단) int i = 1; while (i<10) { System.out.println(i+"단"); int j = 1;
		 * while (j < 10) { System.out.println(i + " * "+ j + " = " + (i*j)); j++; }
		 * i++; }
		 */

		/*
		 * 0~10까지 짝수의 누적합 int i = 0; int sum = 0; for ( i = 0; i < 11; i++) { if
		 * (i%2==0) { sum = sum + i ; } } System.out.println(sum);
		 */

		/*
		  int k1이 1이면 카페모카, 2이면 카페라떼, 3이면 아메리카노, 4이면 과일주스를 출력
		   int k1 = 3; 
		   String drink = ""; 
		   switch (k1) { 
		   case 1: drink = "카페모카"; break; 
		   case 2: drink = "카페라떼"; break; 
		   case 3: drink = "아메리카노"; break; 
		   case 4: drink = "과일주스"; break; 
		 }
		  System.out.println(drink);
		 */

		/*
		 
		 번호,총점,평균,학점,순위 주어진 정보를 가지고 순위 구하고 순위 기준으로 오름차순 후 출력 
		  int[] p1 = { 1, 270, 90,'A', 1 }; 
		  int[] p2 = { 2, 210, 70, 'C', 1 }; 
		  int[] p3 = { 3, 180, 60, 'F', 1 }; 
		  int[] p4 = { 4, 300, 100, 'A', 1 }; 
		  int[] p5 = { 5, 285, 95, 'A', 1 };
		  
		  int[][] arr = new int[5][5];
		  
		   arr[0] = p1;
		   arr[1] = p2;
		   arr[2] = p3;
		   arr[3] = p4;
		   arr[4] = p5;
		   
		   for (int i = 0; i < arr.length; i++) {
		   for (int j = 0; j < arr.length; j++) {
			if (arr[i][1] < arr[j][1]) {
				arr[i][4]++;
			}
		}
		   }
		   int[]tmp = new int[5];
		   for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i][4] > arr[j][4]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		 System.out.println("번호\t총점\t평균\t학점\t순위");
		   for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i][0]+"\t");
			System.out.print(arr[i][1]+"\t");
			System.out.print(arr[i][2]+"\t");
			System.out.print(arr[i][3]+"\t");
			System.out.println(arr[i][4]);
		}
		   System.out.println();
		 */
		   
		/*
		 * 번호, 국어, 영어, 수학 점수 받아서 총점, 평균, 학점, 순위 구하고 순위 기준으로 오름차순 정렬 후 출력
		System.out.print("학생 수 :");
		int su = scan.nextInt();
		double[][] arr = new double[su][8];

		for (int i = 0; i < arr.length; i++) {
			double[] p = new double[8];
			System.out.print("번호 : ");
			p[0] = scan.nextInt();
			System.out.print("국어 점수 : ");
			p[1] = scan.nextInt();
			System.out.print("영어 점수 : ");
			p[2] = scan.nextInt();
			System.out.print("수학 : ");
			p[3] = scan.nextInt();

			p[4] = p[1] + p[2] + p[3];
			p[5] = (int)(p[4] / 3.0 * 10) / 10.0;

			if (p[5] >= 90) {
				p[6] = 'A';
			} else if (p[5] >= 80) {
				p[6] = 'B';
			} else if (p[5] >= 70) {
				p[6] = 'C';
			} else {
				p[6] = 'F';
			}
			p[7] = 1;
			arr[i] = p;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][4] < arr[j][4]) {
					arr[i][7]++;
				}
			}
		}
		double[] tmp = new double[8];
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
			}
		}
		System.out.println("번호\t총점\t평균\t학점\t순위");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (j == 1 || j == 2 | j == 3) {
					continue;
				} else if (j == 5) {
					System.out.print(arr[i][j] +"\t");
				} else if (j == 6) {
					System.out.print((char) (arr[i][j])+"\t");
				} else {
					System.out.print((int) (arr[i][j])+"\t");
				}
			}
			System.out.println();
		}
		 */

	}
}