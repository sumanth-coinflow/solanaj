/************************************************************************ 
 * Copyright PointCheckout, Ltd.
 * 
 */
package com.paymennt.solanaj.api.rpc.types;


import java.util.List;

/**
 * 
 */
public class BlockNumbers extends RpcResultObject {

    /**  */
    private List<Long> value;

    /**
     * 
     *
     * @return 
     */
    public List<Long> getValue() {
        return value;
    }

    /**
     * 
     *
     * @param value 
     */
    public void setValue(List<Long> value) {
        this.value = value;
    }

}
