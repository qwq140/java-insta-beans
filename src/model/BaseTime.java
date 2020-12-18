package model;

import java.sql.Timestamp;

import lombok.Data;

@Data
public abstract class BaseTime {
	private Timestamp createDate;
	private Timestamp updateDate;
}
