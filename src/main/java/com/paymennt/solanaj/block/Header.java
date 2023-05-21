package com.paymennt.solanaj.block;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Header {
    private Integer numReadonlySignedAccounts;
    private Integer numReadonlyUnsignedAccounts;
    private Integer numRequiredSignatures;
}

