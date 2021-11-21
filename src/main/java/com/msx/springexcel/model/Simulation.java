package com.msx.springexcel.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@JsonPropertyOrder({"IdTestQuery", "Col_01","Col_02", "Col_03", "Col_04", "Col_05", "Col_06", "Col_07" })
public class Simulation {
    @JsonProperty("IdTestQuery")
    private String IdTestQuery;
    @JsonProperty("Col_01")
    private String Col_01;
    @JsonProperty("Col_02")
    private String Col_02;
    @JsonProperty("Col_03")
    private String Col_03;
    @JsonProperty("Col_04")
    private String Col_04;
    @JsonProperty("Col_05")
    private String Col_05;
    private String Col_06;
    private String Col_07;
    private String Col_08;
    private String Col_09;
    private String Col_10;
    private String Col_11;
    private String Col_12;
    private String Col_13;
    private String Col_14;
    private String Col_15;
    private String Col_16;
    private String Col_17;
    private String Col_18;
    private String Col_19;
    private String Col_20;
    private String Col_21;
    private String Col_22;
    private String Col_23;
    private String Col_24;
    private String Col_25;
    private String Col_26;
    private String Col_27;
    private String Col_28;
    private String Col_29;
    private String Col_30;
    private String Col_01_Target;
    private String Col_02_Target;
    private String Col_03_Target;
    private String Col_04_Target;
    private String Col_05_Target;
    private String Col_06_Target;
    private String Col_07_Target;
    private String Col_08_Target;
    private String Col_09_Target;
    private String Col_10_Target;
    private String Col_11_Target;
    private String Col_12_Target;
    private String Col_13_Target;
    private String Col_14_Target;
    private String Col_15_Target;
    private String Col_16_Target;
    private String Col_17_Target;
    private String Col_18_Target;
    private String Col_19_Target;
    private String Col_20_Target;
    private String Col_21_Target;
    private String Col_22_Target;
    private String Col_23_Target;
    private String Col_24_Target;
    private String Col_25_Target;
    private String Col_26_Target;
    private String Col_27_Target;
    private String Col_28_Target;
    private String Col_29_Target;
    private String Col_30_Target;
}
