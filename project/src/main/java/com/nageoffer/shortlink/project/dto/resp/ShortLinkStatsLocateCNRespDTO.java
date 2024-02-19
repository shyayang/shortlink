package com.nageoffer.shortlink.project.dto.resp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ShortLinkStatsLocateCNRespDTO {

    /*
     * 分组信息
     * */
    private Integer cnt;

    /**
     * 原始链接
     */
    private String locate;

    /**
     * 短链接
     */
    private double ratio;
}
