package com.kino.gulimall.product.vo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class AttrVo {
    @TableId
    private Long attrId;
    /**
     * ÊôÐÔÃû
     */
    private String attrName;
    /**
     * ÊÇ·ñÐèÒª¼ìË÷[0-²»ÐèÒª£¬1-ÐèÒª]
     */
    private Integer searchType;
    /**
     * ÊôÐÔÍ¼±ê
     */
    private String icon;
    /**
     * ¿ÉÑ¡ÖµÁÐ±í[ÓÃ¶ººÅ·Ö¸ô]
     */
    private String valueSelect;
    /**
     * ÊôÐÔÀàÐÍ[0-ÏúÊÛÊôÐÔ£¬1-»ù±¾ÊôÐÔ£¬2-¼ÈÊÇÏúÊÛÊôÐÔÓÖÊÇ»ù±¾ÊôÐÔ]
     */
    private Integer attrType;
    /**
     * ÆôÓÃ×´Ì¬[0 - ½ûÓÃ£¬1 - ÆôÓÃ]
     */
    private Long enable;
    /**
     * ËùÊô·ÖÀà
     */
    private Long catelogId;
    /**
     * ¿ìËÙÕ¹Ê¾¡¾ÊÇ·ñÕ¹Ê¾ÔÚ½éÉÜÉÏ£»0-·ñ 1-ÊÇ¡¿£¬ÔÚskuÖÐÈÔÈ»¿ÉÒÔµ÷Õû
     */
    private Integer showDesc;

    private Long attrGroupId;
}
