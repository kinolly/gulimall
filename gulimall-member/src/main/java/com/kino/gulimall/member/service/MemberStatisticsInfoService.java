package com.kino.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kino.common.utils.PageUtils;
import com.kino.gulimall.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * »áÔ±Í³¼ÆÐÅÏ¢
 *
 * @author lijinyan
 * @email jinyanli97@gmail.com
 * @date 2020-06-11 22:12:48
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

