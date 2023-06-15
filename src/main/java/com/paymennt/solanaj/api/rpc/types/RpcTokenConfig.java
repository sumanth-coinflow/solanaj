/************************************************************************ 
 * Copyright PointCheckout, Ltd.
 *
 */
package com.paymennt.solanaj.api.rpc.types;


public class RpcTokenConfig {

    private String programId;


    public RpcTokenConfig(String programId) {
        this.programId = programId;
    }

    public String getProgramId() {
        return programId;
    }

    public void setProgramId(String programId) {
        this.programId = programId;
    }
}
