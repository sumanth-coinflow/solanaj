/************************************************************************ 
 * Copyright PointCheckout, Ltd.
 *
 */
package com.paymennt.solanaj.api.rpc.types;


import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RpcAccountsConfig {

    private SolanaCommitment commitment;

    private Long minContextSlot;

    private String encoding;

}
