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


public class TestModifyKeyPairAttribute {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        EcsApi api = new EcsApi(apiClient);
        
        ModifyKeyPairAttributeRequest modifyKeyPairAttributeRequest = new ModifyKeyPairAttributeRequest();
        modifyKeyPairAttributeRequest.setDescription("ssh_key_test_description");
        modifyKeyPairAttributeRequest.setKeyPairName("ssh_key_pair");
        
        try {
            ModifyKeyPairAttributeResponse response = api.modifyKeyPairAttribute(modifyKeyPairAttributeRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}