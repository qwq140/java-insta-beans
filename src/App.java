import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Map;

import model.Member;

public class App {
	
	
	
	public static void main(String[] args) {
		// 1. DB에서 값 가져오기
		Repository r1 = new Repository();
		Map<String, Object> m1 = r1.getRepo();
		
		
		// 2. 파싱하기 (단점 : 순서와 개수를 맞춰야함) - 생성자 오버로딩을 많이 해야함 - 단점을 해결하기 위해 빌더패턴을 사용
//		Member member = new Member(
//				(Integer)m1.get("id"),
//				(String)m1.get("username"),
//				(String)m1.get("password"),
//				(String)m1.get("userImg"),
//				(String)m1.get("email"),
//				(Timestamp)m1.get("createDate"),
//				(Timestamp)m1.get("updateDate")		
//		);
		
//		System.out.println(member);
		
//		Member member2 = Member.builder()
//				.id(2)
//				.username("cos")
//				.password("1234")
//				.email("cos@nate.com")
//				.createDate(Timestamp.valueOf(LocalDateTime.now()))
//				.updateDate(Timestamp.valueOf(LocalDateTime.now()));
		
		Member member3 = Member.builder()
				.id(2)
				.username("cos")
				.email("cos@nate.com")
				.build();
		
		System.out.println(member3);
		
		
	}
}
