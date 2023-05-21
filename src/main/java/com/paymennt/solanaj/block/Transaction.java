/************************************************************************ 
 * Copyright PointCheckout, Ltd.
 *
 */
package com.paymennt.solanaj.block;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.paymennt.solanaj.data.AccountMeta;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Transaction {
    private List<AccountMeta> accountKeys;
    private List<String> signatures;
}
