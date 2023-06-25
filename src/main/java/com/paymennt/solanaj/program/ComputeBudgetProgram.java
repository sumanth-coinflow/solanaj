package com.paymennt.solanaj.program;

import com.paymennt.solanaj.data.AccountMeta;
import com.paymennt.solanaj.data.SolanaPublicKey;
import com.paymennt.solanaj.data.SolanaTransactionInstruction;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

public class ComputeBudgetProgram {

    public static final SolanaPublicKey PROGRAM_ID = new SolanaPublicKey("ComputeBudget111111111111111111111111111111");

    private static final int REQUEST_UNITS_METHOD_ID = 0;
    private static final int REQUEST_HEAP_FRAME_METHOD_ID = 1;
    private static final int SET_COMPUTE_UNIT_LIMIT_METHOD_ID = 2;
    private static final int SET_COMPUTE_UNIT_PRICE_METHOD_ID = 3;

    public static SolanaTransactionInstruction requestUnits(int units) {
        final List<AccountMeta> keys = new ArrayList<>();

        byte[] transactionData = encodeRequestUnitsInstructionData(units);

        return new SolanaTransactionInstruction(PROGRAM_ID, keys, transactionData);
    }

    public static SolanaTransactionInstruction requestHeapFrame(int bytes) {
        final List<AccountMeta> keys = new ArrayList<>();

        byte[] transactionData = encodeRequestHeapFrameInstructionData(bytes);

        return new SolanaTransactionInstruction(PROGRAM_ID, keys, transactionData);
    }

    public static SolanaTransactionInstruction setComputeUnitLimit(int units) {
        final List<AccountMeta> keys = new ArrayList<>();

        byte[] transactionData = encodeSetComputeUnitLimitInstructionData(units);

        return new SolanaTransactionInstruction(PROGRAM_ID, keys, transactionData);
    }

    public static SolanaTransactionInstruction setComputeUnitPrice(long microLamports) {
        final List<AccountMeta> keys = new ArrayList<>();

        byte[] transactionData = encodeSetComputeUnitPriceInstructionData(microLamports);

        return new SolanaTransactionInstruction(PROGRAM_ID, keys, transactionData);
    }

    private static byte[] encodeRequestUnitsInstructionData(int units) {
        ByteBuffer result = ByteBuffer.allocate(5);
        result.order(ByteOrder.LITTLE_ENDIAN);

        result.put((byte) REQUEST_UNITS_METHOD_ID);
        result.putInt(units);

        return result.array();
    }

    private static byte[] encodeRequestHeapFrameInstructionData(int bytes) {
        ByteBuffer result = ByteBuffer.allocate(5);
        result.order(ByteOrder.LITTLE_ENDIAN);

        result.put((byte) REQUEST_HEAP_FRAME_METHOD_ID);
        result.putInt(bytes);

        return result.array();
    }

    private static byte[] encodeSetComputeUnitLimitInstructionData(int units) {
        ByteBuffer result = ByteBuffer.allocate(5);
        result.order(ByteOrder.LITTLE_ENDIAN);

        result.put((byte) SET_COMPUTE_UNIT_LIMIT_METHOD_ID);
        result.putInt(units);

        return result.array();
    }

    private static byte[] encodeSetComputeUnitPriceInstructionData(long microLamports) {
        ByteBuffer result = ByteBuffer.allocate(9);
        result.order(ByteOrder.LITTLE_ENDIAN);

        result.put((byte) SET_COMPUTE_UNIT_PRICE_METHOD_ID);
        result.putLong(microLamports);

        return result.array();
    }
}
