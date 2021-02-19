package controller;

import util.ScanUtil;
import util.View;


public class Controller {
	public static void main(String[] args) {
		
	}
	
	public void addCart(){} // 장바구니 추가
	
	public void admin(){
		// 회원 조회 및 삭제
		// 식당 조회 및 삭제
		// 배달 대행 업체 정보 조회
	} 
	
	private void start() {

	}

	private int home() {
		System.out.println("--------------------------------------");
		System.out.println("------------- 자바의 민족 ----------------");
		System.out.println("1.로그인\t2.회원가입\t0.프로그램 종료");
		System.out.println("--------------------------------------");
		System.out.print("번호 입력>");
		
		int input = ScanUtil.nextInt();
		
		switch (input) {
			case 1: return View.LOGIN;
			case 2: return View.JOIN;
			case 0:
				System.out.println("프로그램이 종료되었습니다.");
				System.exit(0);
		}
		
		return View.HOME;
	}
}
