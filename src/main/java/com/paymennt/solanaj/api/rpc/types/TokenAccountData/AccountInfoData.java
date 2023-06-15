package com.paymennt.solanaj.api.rpc.types.TokenAccountData;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
public class AccountInfoData {
    @JsonProperty("tokenAmount")
    private TokenAmount tokenAmount;
    @JsonProperty("mint")
    private String mint;
    @JsonProperty("owner")
    private String owner;
}
