/**
* Example Code generated by Beijing Volcanoengine Technology.
*/
package com.volcengine.ecs.examples;

import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.ecs.EcsApi;
import com.volcengine.ecs.model.*;
import java.util.*;


public class TestDescribeTags {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "cn-beijing";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        EcsApi api = new EcsApi(apiClient);
        
        TagFilterForDescribeTagsInput reqTagFilters = new TagFilterForDescribeTagsInput();
        reqTagFilters.setKey("k1");
        reqTagFilters.setValues(Arrays.asList("v1", "v2"));
        
        DescribeTagsRequest describeTagsRequest = new DescribeTagsRequest();
        describeTagsRequest.setResourceIds(Arrays.asList("i-l8u0p77yseabkpak****", "i-l8u0p7xyseabkbak****"));
        describeTagsRequest.setResourceType("instance");
        describeTagsRequest.setTagFilters(Arrays.asList(reqTagFilters));
        
        try {
            DescribeTagsResponse response = api.describeTags(describeTagsRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}