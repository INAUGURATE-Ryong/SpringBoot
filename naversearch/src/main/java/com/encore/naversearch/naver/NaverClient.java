package com.encore.naversearch.naver;

import com.encore.naversearch.naver.dto.SearchImageReq;
import com.encore.naversearch.naver.dto.SearchImageRes;
import com.encore.naversearch.naver.dto.SearchLocalReq;
import com.encore.naversearch.naver.dto.SearchLocalRes;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Component
public class NaverClient {

    @Value("${naver.client.id}")
    private String naverClientId;

    @Value("${naver.client.secret}")
    private String naverClientSecret;

    @Value("${naver.url.local}")
    private String naverLocalSearchUrl;

    @Value("${naver.url.image}")
    private String naverImageSearchUrl;

    public SearchLocalRes searchLocalRes(SearchLocalReq searchLocalReq) {
        // 체인 방식
        var uri = UriComponentsBuilder.fromUriString(naverLocalSearchUrl)
                .queryParams(searchLocalReq.toMultiValueMap())
                .build()
                .encode()
                .toUri();

        var headers = new HttpHeaders();
        headers.set("X-Naver-Client-Id", naverClientId);
        headers.set("X-NAVER-Client-Secret", naverClientSecret);
        headers.setContentType(MediaType.APPLICATION_JSON);     // 전송 타입 지정 - JSON

        var httpEntity = new HttpEntity<>(headers);
        var responseType = new ParameterizedTypeReference<SearchLocalRes>(){};

        var responseEntity = new RestTemplate().exchange(
                uri, HttpMethod.GET, httpEntity, responseType
        );

        return responseEntity.getBody();
    }

    public SearchImageRes searchImageRes(SearchImageReq searchImageReq) {
        // 체인 방식
        var uri = UriComponentsBuilder.fromUriString(naverImageSearchUrl)
                .queryParams(searchImageReq.toMultiValueMap())
                .build()
                .encode()
                .toUri();

        var headers = new HttpHeaders();
        headers.set("X-Naver-Client-Id", naverClientId);
        headers.set("X-NAVER-Client-Secret", naverClientSecret);
        headers.setContentType(MediaType.APPLICATION_JSON);     // 전송 타입 지정 - JSON

        var httpEntity = new HttpEntity<>(headers);
        var responseType = new ParameterizedTypeReference<SearchImageRes>(){};

        var responseEntity = new RestTemplate().exchange(
                uri, HttpMethod.GET, httpEntity, responseType
        );

        return responseEntity.getBody();
    }
}
