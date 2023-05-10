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


public class TestCreateSubnet {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        VpcApi api = new VpcApi(apiClient);
        
        CreateSubnetRequest createSubnetRequest = new CreateSubnetRequest();
        createSubnetRequest.setCidrBlock("172.XX.XX.0/24");
        createSubnetRequest.setVpcId("vpc-257gqcdfvx6n****");
        createSubnetRequest.setZoneId("cn-beijing-a");
        
        try {
            CreateSubnetResponse response = api.createSubnet(createSubnetRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}