package com.paymennt.solanaj.block;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Meta {
    private int computeUnitsConsumed;
    private Object err;
    private long fee;
    private List<Object> innerInstructions;
    private List<Long> postBalances;
    private List<Long> preBalances;
    private List<TokenBalance> postTokenBalances;
    private List<TokenBalance> preTokenBalances;
}
