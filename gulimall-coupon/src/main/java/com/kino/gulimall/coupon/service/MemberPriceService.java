package com.kino.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kino.common.utils.PageUtils;
import com.kino.gulimall.coupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * ÉÌÆ·»áÔ±¼Û¸ñ
 *
 * @author lijinyan
 * @email jinyanli97@gmail.com
 * @date 2020-06-11 21:55:43
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

