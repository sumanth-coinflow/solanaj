/************************************************************************ 
 * Copyright PointCheckout, Ltd.
 * 
 */
package com.paymennt.solanaj.api.rpc.types;


import com.paymennt.solanaj.data.SolanaTransaction;

import java.util.List;

/**
 * 
 */
public class SolanaBlock extends RpcResultObject {
    private Long blockHeight;
    private String blockTime;
    private String blockhash;
    private Long parentSlot;
    private String previousBlockhash;
    private List<SolanaTransaction> transactions;

    public Long getBlockHeight() {
        return blockHeight;
    }

    public void setBlockHeight(Long blockHeight) {
        this.blockHeight = blockHeight;
    }

    public String getBlockTime() {
        return blockTime;
    }

    public void setBlockTime(String blockTime) {
        this.blockTime = blockTime;
    }

    public String getBlockhash() {
        return blockhash;
    }

    public void setBlockhash(String blockhash) {
        this.blockhash = blockhash;
    }

    public Long getParentSlot() {
        return parentSlot;
    }

    public void setParentSlot(Long parentSlot) {
        this.parentSlot = parentSlot;
    }

    public String getPreviousBlockhash() {
        return previousBlockhash;
    }

    public void setPreviousBlockhash(String previousBlockhash) {
        this.previousBlockhash = previousBlockhash;
    }

    public List<SolanaTransaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<SolanaTransaction> transactions) {
        this.transactions = transactions;
    }
}
