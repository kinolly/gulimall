package com.kino.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * spuÍ¼Æ¬
 * 
 * @author lijinyan
 * @email jinyanli97@gmail.com
 * @date 2020-06-11 21:58:33
 */
@Data
@TableName("pms_spu_images")
public class SpuImagesEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * spu_id
	 */
	private Long spuId;
	/**
	 * Í¼Æ¬Ãû
	 */
	private String imgName;
	/**
	 * Í¼Æ¬µØÖ·
	 */
	private String imgUrl;
	/**
	 * Ë³Ðò
	 */
	private Integer imgSort;
	/**
	 * ÊÇ·ñÄ¬ÈÏÍ¼
	 */
	private Integer defaultImg;

}
