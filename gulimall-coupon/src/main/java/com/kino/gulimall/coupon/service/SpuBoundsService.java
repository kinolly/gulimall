package com.kino.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kino.common.utils.PageUtils;
import com.kino.gulimall.coupon.entity.SpuBoundsEntity;

import java.util.Map;

/**
 * ÉÌÆ·spu»ý·ÖÉèÖÃ
 *
 * @author lijinyan
 * @email jinyanli97@gmail.com
 * @date 2020-06-11 21:55:43
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

