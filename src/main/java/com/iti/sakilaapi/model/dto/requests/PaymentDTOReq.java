package com.iti.sakilaapi.model.dto.requests;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;

@Data
@NoArgsConstructor
@XmlRootElement
public class PaymentDTOReq implements Serializable {
    private String customerFirstName;
    private String staffFirstName;
    private Integer rentalId;
    private BigDecimal amount;
    private Instant paymentDate;
    private Instant lastUpdate;
}
