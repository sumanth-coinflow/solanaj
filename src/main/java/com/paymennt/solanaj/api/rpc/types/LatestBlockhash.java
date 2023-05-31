package com.paymennt.solanaj.api.rpc.types;

public class LatestBlockhash extends RpcResultObject {

    private Value value;

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public String getLatestBlockhash() {
        return getValue().getBlockhash();
    }

    public long getLastValidBlockHeight() {
        return getValue().getLastValidBlockHeight();
    }

    public static class Value {
        private String blockhash;

        private long lastValidBlockHeight;

        public String getBlockhash() {
            return blockhash;
        }

        public long getLastValidBlockHeight() {
            return lastValidBlockHeight;
        }

    }

}
