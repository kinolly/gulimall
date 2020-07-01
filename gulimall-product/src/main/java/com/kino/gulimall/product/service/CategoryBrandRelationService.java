package com.kino.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kino.common.utils.PageUtils;
import com.kino.gulimall.product.entity.BrandEntity;
import com.kino.gulimall.product.entity.CategoryBrandRelationEntity;

import java.util.List;
import java.util.Map;

/**
 * Æ·ÅÆ·ÖÀà¹ØÁª
 *
 * @author lijinyan
 * @email jinyanli97@gmail.com
 * @date 2020-06-11 21:58:32
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveDetail(CategoryBrandRelationEntity categoryBrandRelation);

    void updateBrand(Long brandId, String name);

    void updateCategory(Long catId, String name);

    List<BrandEntity> getBrandsBycatId(Long catId);
}

