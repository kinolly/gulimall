package com.kino.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ÃëÉ±»î¶¯³¡´Î
 * 
 * @author lijinyan
 * @email jinyanli97@gmail.com
 * @date 2020-06-11 21:55:43
 */
@Data
@TableName("sms_seckill_session")
public class SeckillSessionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ³¡´ÎÃû³Æ
	 */
	private String name;
	/**
	 * Ã¿ÈÕ¿ªÊ¼Ê±¼ä
	 */
	private Date startTime;
	/**
	 * Ã¿ÈÕ½áÊøÊ±¼ä
	 */
	private Date endTime;
	/**
	 * ÆôÓÃ×´Ì¬
	 */
	private Integer status;
	/**
	 * ´´½¨Ê±¼ä
	 */
	private Date createTime;

}
