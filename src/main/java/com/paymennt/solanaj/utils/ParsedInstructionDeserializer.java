package com.paymennt.solanaj.utils;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.paymennt.solanaj.block.ParsedInstruction;
import com.paymennt.solanaj.block.ParsedInstructionData;
import com.paymennt.solanaj.block.ParsedInstructionInfo;
import com.paymennt.solanaj.program.SystemProgram;
import com.paymennt.solanaj.program.TokenProgram;

import java.io.IOException;

public class ParsedInstructionDeserializer extends JsonDeserializer<ParsedInstruction> {

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
            if (parsedNode.has("info")) {
                JsonNode infoNode = parsedNode.get("info");
                String destination = infoNode.has("destination") ? infoNode.get("destination").asText() : null;
                long lamports = infoNode.has("lamports") ? infoNode.get("lamports").asLong() : 0L;
                long amount = infoNode.has("amount") ? infoNode.get("amount").asLong() : 0L;
                String authority = infoNode.has("authority") ? infoNode.get("authority").asText() : null;
                String source = infoNode.has("source") ? infoNode.get("source").asText() : null;
                info = new ParsedInstructionInfo(destination, lamports, amount, authority, source);
            }
            String type = parsedNode.has("type") ? parsedNode.get("type").asText() : null;
            parsed = new ParsedInstructionData(info, type);
        }

        return new ParsedInstruction(parsed, program, programId);
    }
}
