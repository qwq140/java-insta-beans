package model;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Image extends BaseTime{
	private long id;
	private String imgUrl;
	private long userId; // DB�� Ÿ���� ��ġ��Ű�� ����
	private String content;
}
