import java.util.Scanner;

public class Welcome {
	static final int NUM_BOOK = 3;
	static final int NUM_ITEM = 7;

	public static void main(String[] args) {
		String[][]mBook= new String[NUM_BOOK][NUM_ITEM];
		Scanner input = new Scanner(System.in);		//Scanner 클래스의 객체 생성
		System.out.print("당신의 이름을 입력하세요: ");
		String userName = input.next();		//이름을 String으로 입력 받음, 입력받는 코드
		
		
		
		System.out.print("연락처를 입력하세요: ");
		int userMobile = input.nextInt();	//연락처를 int(정수)로 입력받음, 입력받는 코드, 아래 int n과 다름
		
		String greeting = "welcome to Shopping Mall"; //인사말을 문자열 변수에 저장
		String tagline = "Welcome to Book Market!"; // "
		
		boolean quit = false;
		
		while(!quit) {	
			System.out.println("\n*****************************************************");
			System.out.println("\t"+greeting);	//위에서 string으로 변수를 저장한 인사말을 출력
			System.out.println("\t"+tagline); // "
			
			menuIntroduction();
			
			System.out.print("\n메뉴 번호를 선택해주세요: "); 
		
			int n = input.nextInt();	//메뉴 번호 입력, 나중에 조건문과 반복문에 사용됨, 	
			//System.out.println(n+"번을 선택했습니다.");	 //입력한 번호를 출력하는 코드
			
			if (n <1 || n>8) {
				System.out.println("1부터 8까지의 숫자를 입력하세요. ");
			}
			else {
				switch(n){
					case 1:
						menuGuestInfo(userName, userMobile);
						break;
					case 2:
						menuCartItemList();
						break;
					case 3:
						menuCartClear();
						break;
					case 4:
						menuCartAddItem(mBook);
						break;
					case 5:
						menuCartRemoveItemCount();
						break;
					case 6:
						menuCartRemoveItem();
						break;
					case 7:
						menuCartBill();
						break;
					case 8:
						menuExit();
						quit =true;
						break;
				}			
			}
		}
	}
	
	public static void menuIntroduction() {
		System.out.println("*****************************************************");
		System.out.println("1. 고객 정보 확인하기 \t4. 바구니에 항목 추가하기");
		System.out.println("2. 장바구니 상품 목록 보기 \t5. 장바구니의 항목 수량 줄이기");
		System.out.println("3. 장바구니 비우기    \t6. 장바구니의 항목 삭제하기");
		System.out.println("7. 영수증 표시하기    \t8. 종료");
		System.out.println("*****************************************************");
	}
	public static void menuGuestInfo(String name, int Mobile){
		System.out.println("\n현재 고객 정보: ");
		System.out.println("이름: "+name + " "+ "연락처: "+Mobile);
	}
	
	public static void menuCartItemList() {
		System.out.println("\n2. 장바구니 상품 목록 보기: ");
	}
	
	public static void menuCartClear() {
		System.out.println("\n3. 장바구니 비우기: ");
	}
	
	public static void menuCartAddItem(String[][] book) {
		BookList(book);
		for (int i = 0; i < NUM_BOOK; i++) {
			for(int j = 0; j < NUM_ITEM; j++)
				System.out.print(book[i][j]+"|");
			System.out.println("");
		}
		
		boolean quit = false;
		
		while (!quit) {
			System.out.print("\n장바구니에 추가할 도서의 ID를 입력하세요:");
			
			Scanner input =new Scanner(System.in);
			String str = input.nextLine();
			
			boolean flag = false;
			int numId = -1;
			
			for(int i =0; i < NUM_BOOK; i++) {
				if(str.equals(book[i][0])) {
					numId = i;
					flag = true;
					break;
				}
			}
			
			if(flag) {
				System.out.println("\n장바구니에 추가하시겠습니까? Y | N ");
				str = input.nextLine();
				
				if(str.toUpperCase().equals("Y")) {
					System.out.println(book[numId][0]+ "도서가 장바구니에 추가되었습니다.");
				}
				quit =true;
			}
			else
				System.out.println("\n다시 입력해 주세요");
		}
	}
	
	public static void menuCartRemoveItemCount() {
		System.out.println("\n5. 장바구니의 항목 줄이기");
	}
	
	public static void menuCartRemoveItem() {
		System.out.println("\n6. 장바구니의 항목 삭제하기 ");
	}
	
	public static void menuCartBill() {
		System.out.println("\n7. 영수증 표시하기");
	}
	
	public static void menuExit() {
		System.out.println("\n8. 종료");
	}
	
	public static void BookList(String[][]book) {
		
		book[0][0] ="ISBN1234";
		book[0][1] ="쉽게 배우는 JSP 웹 프로그래밍";
		book[0][2] ="27000";	
		book[0][3] ="송미영";
		book[0][4] ="단계별로 쇼핑몰을 구현하며 배우는 JSP 웹 프로그래밍";
		book[0][5] ="IT전문서";
		book[0][6] ="2018/10/08";
		
		book[1][0] ="ISBN1235";
		book[1][1] ="안드로이드 프로그래밍";
		book[1][2] ="33000";
		book[1][3] ="우재남";
		book[1][4] ="실습 단계별 명쾌한 멘토링!";
		book[1][5] ="IT전문서";
		book[1][6] ="2022/01/22";
		
		book[2][0] ="ISBN1236";
		book[2][1] ="스크래치";
		book[2][2] ="22000";
		book[2][3] ="고광일";
		book[2][4] ="컴퓨터 사고력을 키우는 블록 코딩";
		book[2][5] ="컴퓨터 입문";
		book[2][6] ="2019/06/10";
	}
										
}
