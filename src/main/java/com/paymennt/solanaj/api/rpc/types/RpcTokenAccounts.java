/************************************************************************ 
 * Copyright PointCheckout, Ltd.
 *
 */
package com.paymennt.solanaj.api.rpc.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.paymennt.solanaj.api.rpc.types.TokenAccountData.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
public class RpcTokenAccounts extends RpcResultObject {

    @JsonProperty("value")
    private List<TokenAccount> accounts;

    @NoArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    @Getter
    public static class TokenAccount {
        @JsonProperty("pubkey")
        private String publicKey;
        @JsonProperty("account")
        private AccountInfo accountInfo;

        @NoArgsConstructor
        @JsonIgnoreProperties(ignoreUnknown = true)
        @Getter
        public static class AccountInfo {
            @JsonProperty("data")
            private Data data;
        }
    }

}
