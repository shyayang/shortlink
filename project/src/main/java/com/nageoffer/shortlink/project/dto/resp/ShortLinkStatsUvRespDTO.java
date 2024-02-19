package com.nageoffer.shortlink.project.dto.resp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ShortLinkStatsUvRespDTO {
    /*
     * 分组信息
     * */
    private String uvType;

    /**
     * 原始链接
     */
    private Integer cnt;

    /**
     * 短链接
     */
    private double ratio;
}
