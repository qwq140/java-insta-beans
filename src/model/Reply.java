package model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Reply extends BaseTime{
	private long id;
	private String content;
	private long userId;
	private long imageId;
}
