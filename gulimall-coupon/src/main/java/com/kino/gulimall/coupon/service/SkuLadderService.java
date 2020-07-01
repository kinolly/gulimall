package com.kino.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kino.common.utils.PageUtils;
import com.kino.gulimall.coupon.entity.SkuLadderEntity;

import java.util.Map;

/**
 * ÉÌÆ·½×ÌÝ¼Û¸ñ
 *
 * @author lijinyan
 * @email jinyanli97@gmail.com
 * @date 2020-06-11 21:55:44
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

