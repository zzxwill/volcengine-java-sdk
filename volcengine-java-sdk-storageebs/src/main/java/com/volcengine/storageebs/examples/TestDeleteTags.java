/**
* Example Code generated by Beijing Volcanoengine Technology.
*/
package com.volcengine.storageebs.examples;

import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.storageebs.StorageEbsApi;
import com.volcengine.storageebs.model.*;
import java.util.*;


public class TestDeleteTags {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "cn-beijing";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        StorageEbsApi api = new StorageEbsApi(apiClient);
        
        DeleteTagsRequest deleteTagsRequest = new DeleteTagsRequest();
        deleteTagsRequest.setResourceIds(Arrays.asList("vol-76pwr6rilv8lzwxv*****", "vol-76pwr6rilv8lzwxv****"));
        deleteTagsRequest.setResourceType("volume");
        deleteTagsRequest.setTagKeys(Arrays.asList("tag"));
        
        try {
            DeleteTagsResponse response = api.deleteTags(deleteTagsRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}