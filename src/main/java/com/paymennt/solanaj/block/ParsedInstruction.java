package com.paymennt.solanaj.block;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.paymennt.solanaj.utils.ParsedInstructionDeserializer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
@JsonDeserialize(using = ParsedInstructionDeserializer.class)
public class ParsedInstruction {
    private ParsedInstructionData parsed;
    private String program;
    private String programId;
}

