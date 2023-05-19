/************************************************************************ 
 * Copyright PointCheckout, Ltd.
 * 
 */
package com.paymennt.solanaj.api.rpc.types;


/**
 * 
 */
public class RpcTransactionConfig {

    /**  */
    private SolanaCommitment commitment;
    private String encoding;
    private String maxSupportedTransactionVersion;
    private String transactionDetails;
    private String rewards;

    public RpcTransactionConfig(SolanaCommitment commitment, String encoding, String maxSupportedTransactionVersion, String transactionDetails, String rewards) {
        this.commitment = commitment;
        this.encoding = encoding;
        this.maxSupportedTransactionVersion = maxSupportedTransactionVersion;
        this.transactionDetails = transactionDetails;
        this.rewards = rewards;
    }

    /**
     *
     *
     * @param commitment
     */
    public RpcTransactionConfig(SolanaCommitment commitment) {
        this.commitment = commitment;
    }

    /**
     * 
     *
     * @return 
     */
    public SolanaCommitment getCommitment() {
        return commitment;
    }

    /**
     * 
     *
     * @param commitment 
     */
    public void setCommitment(SolanaCommitment commitment) {
        this.commitment = commitment;
    }

}
