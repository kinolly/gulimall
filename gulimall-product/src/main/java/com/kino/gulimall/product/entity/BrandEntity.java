package com.kino.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

import com.kino.common.valid.AddGroup;
import com.kino.common.valid.ListValue;
import com.kino.common.valid.UpdateGroup;
import com.kino.common.valid.UpdateStatusGroup;
import lombok.Data;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.*;

/**
 * Æ·ÅÆ
 *
 * @author lijinyan
 * @email jinyanli97@gmail.com
 * @date 2020-06-11 21:58:32
 */
@Data
@TableName("pms_brand")
public class BrandEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * Æ·ÅÆid
     */
    @NotNull(message = "修改必须指定品牌ID", groups = {UpdateGroup.class})
    @Null(message = "新增不能指定ID", groups = {AddGroup.class})
    @TableId
    private Long brandId;
    /**
     * Æ·ÅÆÃû
     */
    @NotBlank(message = "品牌名必须提交", groups = {AddGroup.class, UpdateGroup.class})
    private String name;
    /**
     * Æ·ÅÆlogoµØÖ·
     */
    @NotEmpty(groups = {AddGroup.class})
    @URL(message = "logo必须是一个合法的url地址", groups = {AddGroup.class, UpdateGroup.class})
    private String logo;
    /**
     * ½éÉÜ
     */
    private String descript;
    /**
     * ÏÔÊ¾×´Ì¬[0-²»ÏÔÊ¾£»1-ÏÔÊ¾]
     */
    @NotNull(groups = {UpdateStatusGroup.class})
    @ListValue(vals = {0, 1},groups = {AddGroup.class, UpdateStatusGroup.class},message = "必须提交指定的值")
    private Integer showStatus;
    /**
     * ¼ìË÷Ê××ÖÄ¸
     */
    @NotEmpty(groups = {AddGroup.class})
    @Pattern(regexp = "^[a-zA-Z]$", message = "检索首字母必须是一个字母", groups = {AddGroup.class, UpdateGroup.class})
    private String firstLetter;
    /**
     * ÅÅÐò
     */
    @NotNull(groups = {AddGroup.class})
    @Min(value = 0, message = "排序必须大于等于0", groups = {AddGroup.class, UpdateGroup.class})
    private Integer sort;

}
