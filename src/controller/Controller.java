package controller;

import service.RmngService;
import util.ScanUtil;
import util.View;


public class Controller {
	
	public static void main(String[] args) {
		
	}
	
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
			//로그인 시 회원 유형 선택
			case 2: return View.JOIN;
			//회원가입 시 회원 유형 선택
			case 0:
				System.out.println("프로그램이 종료되었습니다.");
				System.exit(0);
				
				
				
			/*
			 * <로그인 화면>
			 * 
			 * 1. 관리자 화면
			 * 	  1-1 ~ 1-4 선택 화면
			 * 1-1. 회원 조회 화면 with 삭제 기능
			 * 1-2. 식당 조회 화면 with 삭제 기능
			 * 1-3. 배달 대행 업체 조회 화면 with 삭제 기능
			 * 1-4. 라이더 조회 화면 with 삭제 기능
			 * 
			 * 2. 고객 화면
			 * 2-1 ~ 2-5 선택 화면
			 * 2-1. 내 정보 조회화면
			 *  2-1-1. 내 정보 수정
			 * 2-2. 식당 목록 조회
			 * 	2-2-1. 식당 선택 후 메뉴 조회
			 * 	2-2-2. 장바구니에 추가 및 삭제
			 *  2-2-3. 사이버 머니 결제 화면
			 *  2-2-4. 리뷰 작성
			 * 2-3. 사이버 머니 충전
			 * 2-4. 나의 주문 내역 조회
			 * 2-5. 리뷰 조회
			 * 
			 * 3. 식당 화면
			 * 3-1 ~ 3-4 선택 화면
			 * 3-1. 내 식당 정보 조회 / 수정
			 * 3-2. 주문 리스트 조회
			 * 	3-2-1. 주문 접수 및 취소 선택
			 * 	3-2-2. 소요 시간 전달
			 * 3-3. 메뉴 추가 및 삭제
			 * 3-4. 리뷰 조회 및 삭제
			 *  
			 * 4. 배달 대행 업체 화면
			 * 4-1. 라이더 리스트 조회 및 삭제
			 * 
			 * 5. 라이더스 화면
			 * 5-1 ~ 5-2 선택 화면
			 * 5-1. 내 정보 조회 및 수정
			 * 5-2. 내 지역 주문 현황 조회
			 * 	5-2-1. 주문 승인 및 거절
			 */
				
				
				
				
		}
		
		return View.HOME;
	}
}































