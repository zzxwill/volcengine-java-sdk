package com.volcengine.ark.runtime.service;


import java.time.Duration;


/**
 * The interface ark service.
 */
public abstract class ArkBaseService {

    static final String BASE_URL = "https://ark.cn-beijing.volces.com";
    static final Duration DEFAULT_TIMEOUT = Duration.ofSeconds(60);
    String apiKey = "";
    String ak = "";
    String sk = "";

}
