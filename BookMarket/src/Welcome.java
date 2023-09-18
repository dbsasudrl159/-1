import java.util.Scanner;

public class Welcome {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		//Scanner 클래스의 객체 생성
		
		System.out.print("당신의 이름을 입력하세요: ");
		String userName = input.next();		//이름을 String으로 입력 받음, 입력받는 코드
		
		System.out.print("연락처를 입력하세요: ");
		int userMobile = input.nextInt();	//연락처를 int(정수)로 입력받음, 입력받는 코드, 아래 int n과 다름
		
		
		
		// TODO Auto-generated method stub
//		System.out.println("Welcome to Shopping Mall"); 프로젝트 1-1 내용
//		System.out.println("Welcome to Book Market!");	"
		
		
		String greeting = "welcome to Shopping Mall"; //인사말을 문자열 변수에 저장
		String tagline = "Welcome to Book Market!"; // "
		
		System.out.println("*****************************************************");
		System.out.println("\t"+greeting);	//위에서 string으로 변수를 저장한 인사말을 출력
		System.out.println("\t"+tagline); // "
		System.out.println("*****************************************************");
		
		System.out.println("1. 고객 정보 확인하기 \t4. 바구니에 항목 추가하기");
		System.out.println("2. 장바구니 상품 목록 보기 \t5. 장바구니의 항목 수량 줄이기");
		System.out.println("3. 장바구니 비우기    \t6. 장바구니의 항목 삭제하기");
		System.out.println("7. 영수증 표시하기    \t8. 종료");
		System.out.println("*****************************************************");
		
		System.out.print("메뉴 번호를 선택해주세요 "); 
		int n = input.nextInt();	//메뉴 번호 입력, 나중에 조건문과 반복문에 사용됨, 	
		System.out.println(n+"번을 선택했습니다.");	 //입력한 번호를 출력하는 코드
		
	}

}
