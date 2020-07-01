package com.kino.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kino.common.utils.PageUtils;
import com.kino.gulimall.product.entity.AttrEntity;
import com.kino.gulimall.product.vo.AttrGroupRelationVo;
import com.kino.gulimall.product.vo.AttrRespVo;
import com.kino.gulimall.product.vo.AttrVo;

import java.util.List;
import java.util.Map;

/**
 * ÉÌÆ·ÊôÐÔ
 *
 * @author lijinyan
 * @email jinyanli97@gmail.com
 * @date 2020-06-11 21:58:33
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveAttr(AttrVo attr);

    PageUtils queryBaseAttrPage(Map<String, Object> params, Long catelogId, String type);

    AttrRespVo getAttrInfo(Long attrId);

    void updateAttr(AttrVo attr);

    List<AttrEntity> getRelationAttr(Long attrGroupId);

    void deleteRelation(AttrGroupRelationVo[] attrGroupRelationVos);

    PageUtils getNoRelationAttr(Map<String, Object> params, Long attrGroupId);
}

