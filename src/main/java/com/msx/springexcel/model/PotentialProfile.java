package com.msx.springexcel.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PotentialProfile {

    @JsonProperty("excel_row_id")
    private String excelRowId;

    @JsonProperty("product_line_cd")
    private String productLineCd;

    @JsonProperty("nw_product_cd")
    private String nwProductCd;

    @JsonProperty("bill_type_cd")
    private String billTypeCd;

    @JsonProperty("pricing_ctry_cd")
    private String pricingCtryCd;

    @JsonProperty("lcl_product_cd")
    private String lclProductCd;

    @JsonProperty("orig_region_cd")
    private String origRegionCd;

    @JsonProperty("orig_ctry_cd")
    private String origCtryCd;

    @JsonProperty("orig_svc_area")
    private String origSvcArea;

    @JsonProperty("orig_zip_cd")
    private String origZipCd;

    @JsonProperty("dest_region_cd")
    private String destRegionCd;

    @JsonProperty("dest_ctry_cd")
    private String destCtryCd;

    @JsonProperty("dest_svc_area")
    private String destSvcArea;

    @JsonProperty("dest_zip_cd")
    private String destZipCd;

    @JsonProperty("ship_cnt")
    private BigDecimal shipCnt;

    @JsonProperty("avg_wght_kg")
    private BigDecimal avgWghtKg;

    @JsonProperty("avg_wght_lb")
    private BigDecimal avgWghtLb;

    @JsonProperty("pieces_per_ship")
    private BigDecimal piecesPerShip;

    @JsonProperty("clrnce_type_cd")
    private String clrnceTypeCd;

    @JsonProperty("surchg_cd_list")
    private List<PotentialProfileSrcharge> surchgCdList;

}
