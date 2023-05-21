package com.paymennt.solanaj.block;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class TokenBalance {
    private int accountIndex;
    private String mint;
    private String owner;
    private String programId;
    private UiTokenAmount uiTokenAmount;
}