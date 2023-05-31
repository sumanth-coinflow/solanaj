package com.paymennt.solanaj.block;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.paymennt.solanaj.data.AccountMeta;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Message {
    private List<AccountMeta> accountKeys;
    private Object addressTableLookups;
    private List<ParsedInstruction> instructions;
    private String recentBlockhash;
}
