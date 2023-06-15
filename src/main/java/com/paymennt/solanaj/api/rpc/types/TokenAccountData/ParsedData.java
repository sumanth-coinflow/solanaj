package com.paymennt.solanaj.api.rpc.types.TokenAccountData;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
public class ParsedData {
    @JsonProperty("info")
    private AccountInfoData infoData;
}
