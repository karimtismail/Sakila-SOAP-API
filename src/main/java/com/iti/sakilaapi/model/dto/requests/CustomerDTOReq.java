package com.iti.sakilaapi.model.dto.requests;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.Instant;

@Data
@NoArgsConstructor
@XmlRootElement
public class CustomerDTOReq implements Serializable {
    private Integer store_ID;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private Instant createDate;
    private Instant lastUpdate;
}
