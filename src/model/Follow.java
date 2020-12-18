package model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Follow extends BaseTime{
	private long id;
	private long toUserId; //fk �ȷο� ���� ���
	private long fromUserId; // fk �ȷο� �ϴ� ���
}
