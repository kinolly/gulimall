package com.kino.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ÃëÉ±»î¶¯
 * 
 * @author lijinyan
 * @email jinyanli97@gmail.com
 * @date 2020-06-11 21:55:43
 */
@Data
@TableName("sms_seckill_promotion")
public class SeckillPromotionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * »î¶¯±êÌâ
	 */
	private String title;
	/**
	 * ¿ªÊ¼ÈÕÆÚ
	 */
	private Date startTime;
	/**
	 * ½áÊøÈÕÆÚ
	 */
	private Date endTime;
	/**
	 * ÉÏÏÂÏß×´Ì¬
	 */
	private Integer status;
	/**
	 * ´´½¨Ê±¼ä
	 */
	private Date createTime;
	/**
	 * ´´½¨ÈË
	 */
	private Long userId;

}
