package com.iti.sakilaapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.Instant;

/**
 * A DTO for the {@link com.iti.sakilaapi.entity.Actor} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class ActorDto implements Serializable {
    private Integer id;
    private String firstName;
    private String lastName;
    private Instant lastUpdate;
}