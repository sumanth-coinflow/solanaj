package com.paymennt.solanaj.api.rpc.types.TokenAccountData;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
public class TokenAmount {
    @JsonProperty("amount")
    private String amount;
    @JsonProperty("decimals")
    private int decimals;
    @JsonProperty("uiAmount")
    private double uiAmount;
    @JsonProperty("uiAmountString")
    private String uiAmountString;
}
