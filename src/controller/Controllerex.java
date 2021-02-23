package controller;

import util.ScanUtil;
import util.View;


public class Controllerex {
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
	
	// 회원가입 (관리자, 고객, 식당, 라이더, 배달 대행 업체)
	// 로그인(관리자, 고객, 식당, 라이더, 배달 대행 업체)
	// 1) 관리자 일때 
	// System.out.println("1.회원 정보 조회 \t 2.식당 정보 조회 \t 3. 배달 대행 업체 정보 조회");
	//	1. 회원 정보 조회
	//	1-1. 회원 정보 삭제
	//	2. 식당 정보 조회 
	//	2-1. 식당 정보 삭제
	//	3. 배달 대행 업체 정보 조회
	//	3-1. 배달 대행 업체 정보 삭제
	
	// 2) 고객 일때
	// System.out.println("1. 마이페이지 \t 2. 장바구니 변경 \t 3. 리뷰 작성 \t 4. 사이버 머니 충전");
	//	1. 마이페이지
	//	1-1. 내 정보 조회
	//	1-2. 주문내역 조회
	//	1-3. 리뷰내역 조회
	//	2. 장바구니 변경
	//	2-1. 장바구니 조회
	//	2-2. 장바구니 수정
	//	2-3. 장바구니 삭제
	//	3. 리뷰 작성	
	//	4. 사이버 머니 충전
	
	// 3) 식당 일때
	// System.out.println("1.식당 정보 조회 \t 2. 리뷰 조회  \t 3. 식당 주문 리스트 조회");
	//	1. 식당 정보 조회
	//	1-1. 식당 정보 수정
	//	1-2. 식당 메뉴 수정
	//	2. 리뷰 조회  
	//	3. 식당 주문 리스트 조회
	//	3-1. 주문 접수/취소 선택
	//	3-2. 고객에게 소요시간 전달
	
	// 4) 라이더 일때
	// System.out.println("1.라이더 정보 조회 \t 2. 주문 리스트 조회");
	//	1. 라이더 정보 조회   
	//	1-1. 수정
	//  2. 주문 리스트 조회
	//	2-1. 주문 승인/거절 선택
	//	2-2. 고객과 식당에게 배달 완료 알림
	
	// 5) 배달 대행 업체
	//	1. 라이더 리스트 조회
	//	1-1. 라이더 조회
	//	1-2. 라이더 삭제
}
