package com.cwj.cwjpicturebackend.model.dto.picture;

import lombok.Data;

/**
 * 批量导入图片请求
 */
@Data
public class PictureUploadByBatchRequest {  
  
    /**  
     * 搜索词  
     */  
    private String searchText;  
  
    /**  
     * 抓取数量  
     */  
    private Integer count = 10;

    /**
     * 名称前缀
     */
    private String namePrefix;
}
