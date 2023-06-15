package com.paymennt.solanaj.api.rpc.types.TokenAccountData;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
public class Data {
    @JsonProperty("parsed")
    private ParsedData parsedData;
}
