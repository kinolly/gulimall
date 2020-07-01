package com.kino.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kino.common.utils.PageUtils;
import com.kino.gulimall.member.entity.MemberReceiveAddressEntity;

import java.util.Map;

/**
 * »áÔ±ÊÕ»õµØÖ·
 *
 * @author lijinyan
 * @email jinyanli97@gmail.com
 * @date 2020-06-11 22:12:48
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

