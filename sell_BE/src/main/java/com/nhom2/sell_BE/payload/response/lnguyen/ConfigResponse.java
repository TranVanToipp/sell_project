package com.nhom2.sell_BE.payload.response.lnguyen;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConfigResponse {

    private String configId;

    private String screen;

    private String operatingSys;

    private String frontCamera;

    private String rearCamera;

    private String chip;

    private String ram;

    private String sim;

    private String pin;
}
