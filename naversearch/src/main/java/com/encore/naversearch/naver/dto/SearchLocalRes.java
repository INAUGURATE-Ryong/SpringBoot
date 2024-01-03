package com.encore.naversearch.naver.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/*
    지역 검색 응답 dto
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchLocalRes {
    private String lastBuildDate;

    private int total;

    private int start;

    private int display;

    private String category;

    private List<SearchLocalItem> items;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class SearchLocalItem {
        private String title;
        private String link;
        private String description;
        private String telehpone;
        private String address;
        private String readAddress;
        private int mapx;
        private int mapy;
    }
}
