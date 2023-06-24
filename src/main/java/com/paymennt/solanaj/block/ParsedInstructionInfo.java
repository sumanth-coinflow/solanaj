package com.paymennt.solanaj.block;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.paymennt.solanaj.api.rpc.types.TokenAccountData.TokenAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
public class ParsedInstructionInfo {
    private String destination;
    private long lamports;
    private long amount;
    private String authority;
    private String source;
    private String mint;
    private TokenAmount tokenAmount;
    private String owner;
    private String newAccount;
    private String account;
    private String wallet;

}

