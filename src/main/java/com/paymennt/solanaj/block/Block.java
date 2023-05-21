/************************************************************************ 
 * Copyright PointCheckout, Ltd.
 * 
 */
package com.paymennt.solanaj.block;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.paymennt.solanaj.api.rpc.types.ConfirmedTransaction;
import com.paymennt.solanaj.api.rpc.types.RpcResultObject;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
public class Block extends RpcResultObject {
    private Long blockHeight;
    private Instant blockTime;
    private String blockhash;
    private Long parentSlot;
    private String previousBlockhash;
    private List<ConfirmedTransaction> transactions;
}
