import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Map;

import model.Member;

public class App {
	
	
	
	public static void main(String[] args) {
		// 1. DB���� �� ��������
		Repository r1 = new Repository();
		Map<String, Object> m1 = r1.getRepo();
		
		
		// 2. �Ľ��ϱ� (���� : ������ ������ �������) - ������ �����ε��� ���� �ؾ��� - ������ �ذ��ϱ� ���� ���������� ���
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
