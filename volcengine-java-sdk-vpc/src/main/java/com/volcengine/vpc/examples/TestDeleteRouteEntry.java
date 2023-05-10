/**
* Example Code generated by Beijing Volcanoengine Technology.
*/
package com.volcengine.vpc.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.vpc.VpcApi;
import com.volcengine.vpc.model.*;

import java.util.*;


public class TestDeleteRouteEntry {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        VpcApi api = new VpcApi(apiClient);
        
        DeleteRouteEntryRequest deleteRouteEntryRequest = new DeleteRouteEntryRequest();
        deleteRouteEntryRequest.setRouteEntryId("rte-3tj9gw2pwq3vj0x****");
        
        try {
            DeleteRouteEntryResponse response = api.deleteRouteEntry(deleteRouteEntryRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}