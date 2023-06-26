/************************************************************************ 
 * Copyright PointCheckout, Ltd.
 *
 */
package com.paymennt.solanaj.block;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class TransactionData {
    private Meta meta;
    private Transaction transaction;
}
