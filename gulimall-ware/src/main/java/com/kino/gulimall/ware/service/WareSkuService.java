package com.kino.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kino.common.utils.PageUtils;
import com.kino.gulimall.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * ÉÌÆ·¿â´æ
 *
 * @author lijinyan
 * @email jinyanli97@gmail.com
 * @date 2020-06-11 22:28:10
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

