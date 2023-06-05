package jdbc.com.ict.edu3;

import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("선택하세요");
		System.out.println("1. 테이블 전체 데이터 보기");
		System.out.println("2. 테이블 특정 데이터 보기");
		System.out.println("3. 테이블 데이터 삽입");
		System.out.println("4. 테이블 데이터 삭제");
		System.out.println("5. 테이블 데이터 수정");
		System.out.print(">>>>>>>>>>>>>>> ");

		int menu = scan.nextInt();
		switch (menu) {
		case 1:
			DAO.getInstance().getSelectAll();
			break;
		case 2:
			System.out.print("고객아이디 : ");
			String c_id = scan.next();
			DAO.getInstance().getSelectOne(c_id);
			break;
		case 3:
			System.out.println("삽입 정보를 입력하세요");
			System.out.print("고객아이디 : ");
			String c_id2 = scan.next();
			System.out.print("고객이름 : ");
			String c_name = scan.next();
			System.out.print("나이 : ");
			String c_age = scan.next();
			System.out.print("등급 : ");
			String c_rank = scan.next();
			System.out.print("직업 : ");
			String c_job = scan.next();
			System.out.print("적립금 : ");
			String c_point = scan.next();

			DAO.getInstance().getInsert(c_id2, c_name, c_age, c_rank, c_job, c_point);
			break;
		case 4:
			System.out.print("삭제할 고객아이디 : ");
			String c_id3 = scan.next();
			DAO.getInstance().getDelete(c_id3);
			break;
		case 5:
			System.out.println("수정할 정보를 입력하세요");
			System.out.print("고객아이디 : ");
			String c_id4 = scan.next();
			System.out.print("고객이름 : ");
			String c_name2 = scan.next();
			System.out.print("나이 : ");
			String c_age2 = scan.next();
			System.out.print("등급 : ");
			String c_rank2 = scan.next();
			System.out.print("직업 : ");
			String c_job2 = scan.next();
			System.out.print("적립금 : ");
			String c_point2 = scan.next();

			DAO.getInstance().getUpdate(c_id4, c_name2, c_age2, c_rank2, c_job2, c_point2);
			break;

		default:
			System.out.println("잘못 입력하셨습니다"); break;

		}
	}
}
