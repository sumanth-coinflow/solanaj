package com.paymennt.solanaj.api.rpc.types.multipleaccountinfo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
public class AccountInfo {
    private List<String> data = null;
    private boolean executable;
    private long lamports;
    private String owner;
    private long rentEpoch;
}
