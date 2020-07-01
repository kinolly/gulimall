package com.kino.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ×¨ÌâÉÌÆ·
 * 
 * @author lijinyan
 * @email jinyanli97@gmail.com
 * @date 2020-06-11 21:55:43
 */
@Data
@TableName("sms_home_subject_spu")
public class HomeSubjectSpuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ×¨ÌâÃû×Ö
	 */
	private String name;
	/**
	 * ×¨Ìâid
	 */
	private Long subjectId;
	/**
	 * spu_id
	 */
	private Long spuId;
	/**
	 * ÅÅÐò
	 */
	private Integer sort;

}
