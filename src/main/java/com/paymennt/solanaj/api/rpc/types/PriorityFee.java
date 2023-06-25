package com.paymennt.solanaj.api.rpc.types;

import java.util.List;

public class PriorityFee extends RpcResultObject {

    private List<Fee> fees;

    public List<Fee> getFees() {
        return fees;
    }

    public void setFees(List<Fee> value) {
        this.fees = value;
    }

    public static class Fee {
        public long getSlot() {
            return slot;
        }

        public void setSlot(long slot) {
            this.slot = slot;
        }

        public long getPrioritizationFee() {
            return prioritizationFee;
        }

        public void setPrioritizationFee(long prioritizationFee) {
            this.prioritizationFee = prioritizationFee;
        }

        private long slot;
        private long prioritizationFee;
    }

}
