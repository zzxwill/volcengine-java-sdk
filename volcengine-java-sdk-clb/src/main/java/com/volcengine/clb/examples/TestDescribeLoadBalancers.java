/**
* Example Code generated by Beijing Volcanoengine Technology.
*/
package com.volcengine.clb.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.clb.ClbApi;
import com.volcengine.clb.model.*;

import java.util.*;


public class TestDescribeLoadBalancers {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        ClbApi api = new ClbApi(apiClient);
        
        DescribeLoadBalancersRequest describeLoadBalancersRequest = new DescribeLoadBalancersRequest();
        describeLoadBalancersRequest.setPageNumber(1);
        describeLoadBalancersRequest.setPageSize(10);
        describeLoadBalancersRequest.setVpcId("vpc-13fd2oy7dsiyo3n6nu4ye****");
        
        try {
            DescribeLoadBalancersResponse response = api.describeLoadBalancers(describeLoadBalancersRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}