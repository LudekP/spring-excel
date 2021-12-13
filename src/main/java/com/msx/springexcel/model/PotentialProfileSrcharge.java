package com.msx.springexcel.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PotentialProfileSrcharge {

    @JsonProperty("surchg_cd")
    private String surchgCd;

    private BigDecimal pct;

}
