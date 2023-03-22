package test;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MainApplication {
	private static Guest guest = new Guest();
	private static GuestInfoDto dto = new GuestInfoDto();
	private static DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("yyyy. MM. dd");
	
	public static void main(String[] args) {
		while(true) {
			Scanner scanner = new Scanner(System.in);
			Guest guest = new Guest();
			System.out.print("이름 : ");
			dto.setName(scanner.nextLine());
			System.out.print("성별 : ");
			dto.setGender(scanner.nextLine());
			System.out.print("주소 : ");
			dto.setAddress(scanner.nextLine());
			System.out.print("전화번호 : ");
			dto.setPhoneNumber(scanner.nextLine());
			System.out.print("마케팅 수신 여부(Yes/No) : ");
			dto.setMarketingCheck(scanner.nextLine());
			System.out.print("개인정보 수집 동의 여부(Yes/No) : ");
			dto.setConsentCollectInfo(scanner.nextLine());
			
			if(dto.validate()) {
				System.out.println("모두입력 해주세요.");
				continue;
			}
			System.out.println(dto.toString());
		}
	}
}
