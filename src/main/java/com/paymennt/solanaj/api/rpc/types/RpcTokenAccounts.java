/************************************************************************ 
 * Copyright PointCheckout, Ltd.
 *
 */
package com.paymennt.solanaj.api.rpc.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
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

            @NoArgsConstructor
            @JsonIgnoreProperties(ignoreUnknown = true)
            @Getter
            public static class Data {
                @JsonProperty("parsed")
                private ParsedData parsedData;

                @NoArgsConstructor
                @JsonIgnoreProperties(ignoreUnknown = true)
                @Getter
                public static class ParsedData {
                    @JsonProperty("info")
                    private AccountInfoData infoData;

                    @JsonIgnoreProperties(ignoreUnknown = true)
                    @Getter
                    public static class AccountInfoData {
                        @JsonProperty("tokenAmount")
                        private TokenAmount tokenAmount;
                        @JsonProperty("mint")
                        private String mint;
                        @JsonProperty("owner")
                        private String owner;
                    }
                }
            }
        }
    }

    @NoArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class TokenAmount {
        @JsonProperty("amount")
        private String amount;
        @JsonProperty("decimals")
        private int decimals;
        @JsonProperty("uiAmount")
        private double uiAmount;
        @JsonProperty("uiAmountString")
        private String uiAmountString;
    }
}
