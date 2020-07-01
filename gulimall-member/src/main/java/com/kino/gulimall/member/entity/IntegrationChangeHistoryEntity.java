package com.kino.gulimall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * »ý·Ö±ä»¯ÀúÊ·¼ÇÂ¼
 * 
 * @author lijinyan
 * @email jinyanli97@gmail.com
 * @date 2020-06-11 22:12:48
 */
@Data
@TableName("ums_integration_change_history")
public class IntegrationChangeHistoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * member_id
	 */
	private Long memberId;
	/**
	 * create_time
	 */
	private Date createTime;
	/**
	 * ±ä»¯µÄÖµ
	 */
	private Integer changeCount;
	/**
	 * ±¸×¢
	 */
	private String note;
	/**
	 * À´Ô´[0->¹ºÎï£»1->¹ÜÀíÔ±ÐÞ¸Ä;2->»î¶¯]
	 */
	private Integer sourceTyoe;

}
