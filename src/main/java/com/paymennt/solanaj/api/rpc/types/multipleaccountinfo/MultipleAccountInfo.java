package com.paymennt.solanaj.api.rpc.types.multipleaccountinfo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.paymennt.solanaj.api.rpc.types.RpcResultObject;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
public class MultipleAccountInfo extends RpcResultObject {
    @JsonProperty("value")
    private List<AccountInfo> value;
}
