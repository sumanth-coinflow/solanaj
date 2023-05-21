/************************************************************************ 
 * Copyright PointCheckout, Ltd.
 *
 */
package com.paymennt.solanaj.api.rpc.types;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RpcTransactionConfig {
    private SolanaCommitment commitment;
    private String encoding;
    private Integer maxSupportedTransactionVersion;
    private String transactionDetails;
    private String rewards;
}
