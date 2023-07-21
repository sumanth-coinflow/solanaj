package com.paymennt.solanaj.utils;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.paymennt.solanaj.api.rpc.types.TokenAccountData.TokenAmount;
import com.paymennt.solanaj.block.ParsedInstruction;
import com.paymennt.solanaj.block.ParsedInstructionData;
import com.paymennt.solanaj.block.ParsedInstructionInfo;
import com.paymennt.solanaj.program.SystemProgram;
import com.paymennt.solanaj.program.TokenProgram;

import java.io.IOException;
import java.util.Set;

public class ParsedInstructionDeserializer extends JsonDeserializer<ParsedInstruction> {
    private final Set<String> supportedTypes = Set.of("transfer", "transfer_many", "transfer_checked", "initialize_account3");

    @Override
    public ParsedInstruction deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
            throws IOException {
        JsonNode node = jsonParser.getCodec().readTree(jsonParser);

        String programId = node.has("programId") ? node.get("programId").asText() : null;
        String program = node.has("program") ? node.get("program").asText() : null;

        if (programId == null || program == null || (!SystemProgram.PROGRAM_ID.toString().equalsIgnoreCase(programId) && !TokenProgram.PROGRAM_ID.toString().equalsIgnoreCase(programId) && !TokenProgram.ASSOCIATED_TOKEN_PROGRAM_ID.toString().equalsIgnoreCase(programId))) {
            return null;
        }

        ParsedInstructionData parsed = null;
        if (node.has("parsed")) {
            JsonNode parsedNode = node.get("parsed");
            ParsedInstructionInfo info = null;
            String type = parsedNode.has("type") ? parsedNode.get("type").asText() : null;
            if (parsedNode.has("info") && supportedTypes.contains(type)) {
                JsonNode infoNode = parsedNode.get("info");
                String destination = infoNode.has("destination") ? infoNode.get("destination").asText() : null;
                long lamports = infoNode.has("lamports") ? infoNode.get("lamports").asLong() : 0L;
                long amount = infoNode.has("amount") ? infoNode.get("amount").asLong() : 0L;
                String authority = infoNode.has("authority") ? infoNode.get("authority").asText() : null;
                String source = infoNode.has("source") ? infoNode.get("source").asText() : null;
                String mint = infoNode.has("mint") ? infoNode.get("mint").asText() : SystemProgram.PROGRAM_ID.toString();
                String owner = infoNode.has("owner") ? infoNode.get("owner").asText() : null;
                String newAccount = infoNode.has("newAccount") ? infoNode.get("newAccount").asText() : null;
                String account = infoNode.has("account") ? infoNode.get("account").asText() : null;
                String wallet = infoNode.has("wallet") ? infoNode.get("wallet").asText() : null;
                TokenAmount tokenAmount = null;
                if (parsedNode.has("tokenAmount")) {
                    JsonNode tokenAmountNode = parsedNode.get("tokenAmount");
                    String tAmount = tokenAmountNode.has("amount") ? tokenAmountNode.get("amount").asText() : null;
                    int decimals = tokenAmountNode.has("decimals") ? tokenAmountNode.get("decimals").asInt() : 0;
                    double uiAmount = tokenAmountNode.has("uiAmount") ? tokenAmountNode.get("uiAmount").asDouble() : 0;
                    String uiAmountString = tokenAmountNode.has("uiAmountString") ? tokenAmountNode.get("uiAmountString").asText() : null;
                    tokenAmount = new TokenAmount(tAmount, decimals, uiAmount, uiAmountString);
                }
                info = new ParsedInstructionInfo(destination, lamports, amount, authority, source, mint, tokenAmount, owner, newAccount, account, wallet);
            }
            parsed = new ParsedInstructionData(info, type);
        }

        return new ParsedInstruction(parsed, program, programId);
    }
}
