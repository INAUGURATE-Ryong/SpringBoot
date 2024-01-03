package com.encore.naversearch;

import com.encore.naversearch.naver.NaverClient;
import com.encore.naversearch.naver.dto.SearchImageReq;
import com.encore.naversearch.naver.dto.SearchLocalReq;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class NaverClientTest {

    @Autowired
    private NaverClient naverClient;

    @Test
    public void searchLocalTest() {
        var search = new SearchLocalReq();
        search.setQuery("갈비집");

        var result = naverClient.searchLocalRes(search);
        System.out.println(result);
    }

    @Test
    public void searchImageTest() {
        var search = new SearchImageReq();
        search.setQuery("갈비집");

        var result = naverClient.searchImageRes(search);
        System.out.println(result);
    }
}