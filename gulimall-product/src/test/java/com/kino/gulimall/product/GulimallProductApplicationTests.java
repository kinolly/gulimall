package com.kino.gulimall.product;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.kino.gulimall.product.entity.BrandEntity;
import com.kino.gulimall.product.service.BrandService;
import com.kino.gulimall.product.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
@Slf4j
@SpringBootTest
class GulimallProductApplicationTests {
    @Autowired
    BrandService brandService;
    @Autowired
    CategoryService categoryService;

    @Test
    public void test(){
        Long[] catelogPath = categoryService.findCatelogPath(225L);
        log.info("完整路径：{}", Arrays.asList(catelogPath));
    }


//    @Test
//    public void testUpload() throws FileNotFoundException {
//        // Endpoint以杭州为例，其它Region请按实际情况填写。
////        String endpoint = "oss-cn-beijing.aliyuncs.com";
////// 云账号AccessKey有所有API访问权限，建议遵循阿里云安全最佳实践，创建并使用RAM子账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建。
////        String accessKeyId = "LTAI4GBqCvWZDstxwMc9kcsT";
////        String accessKeySecret = "xc8kzajBua24Y7yOyEU2DkpiEcDuwp";
////
////// 创建OSSClient实例。
////        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
//
//// 上传文件流。
//        InputStream inputStream = new FileInputStream("/Users/kinolly/Desktop/WindmillStarTrails.jpg");
//        ossClient.putObject("kino-gulimall", "123.jpg", inputStream);
//
//// 关闭OSSClient。
//        ossClient.shutdown();
//        System.out.println("success.....");
//    }

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(1L);
        brandEntity.setDescript("垃圾华为");
//        brandEntity.setName("wa为");
//        brandService.save(brandEntity);
//        System.out.println("success");
        brandService.updateById(brandEntity);
        List<BrandEntity> brand_id = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        brand_id.forEach(System.out::println);
    }

}
