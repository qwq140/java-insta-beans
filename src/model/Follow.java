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
	private long toUserId; //fk 팔로우 당한 사람
	private long fromUserId; // fk 팔로우 하는 사람
}
