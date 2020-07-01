package com.kino.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kino.common.utils.PageUtils;
import com.kino.gulimall.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * Ö§¸¶ÐÅÏ¢±í
 *
 * @author lijinyan
 * @email jinyanli97@gmail.com
 * @date 2020-06-11 22:23:07
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

