package com.paymennt.solanaj;

import lombok.Builder;


@Builder
public class Cluster {

    private String url;
    private String apiKey;

    private String joiner;

    public Cluster(String url, String apiKey, String joiner) {
        this.url = url;
        this.apiKey = apiKey;
        this.joiner = joiner;
    }

    public String getUrl() {
        return url;
    }

    public String getApiKey() {
        return apiKey;
    }

    public String getEndpoint() {
        if (apiKey == null || joiner == null) {
            return url;
        } else {
            return url + joiner + apiKey;
        }
    }
}
