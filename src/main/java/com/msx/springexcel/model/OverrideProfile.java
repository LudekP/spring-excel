package com.msx.springexcel.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Setter
public class OverrideProfile {

    @JsonProperty("record_id")
    private String recordId;
    @JsonProperty("override_flg")
    private String overrideFlg;
    @JsonProperty("pricing_ctry_cd_sim")
    private String pricingCtryCdSim;
    @JsonProperty("product_line_cd_sim")
    private String productLineCdSim;
    @JsonProperty("product_cluster_cd_sim")
    private String productClusterCdSim;
    @JsonProperty("nw_product_cd_sim")
    private String nwProductCdSim;
    @JsonProperty("lcl_product_cd_sim")
    private String lclProductCdSim;
    @JsonProperty("orig_region_cd_sim")
    private String origRegionCdSim;
    @JsonProperty("orig_ctry_cd_sim")
    private String origCtryCdSim;
    @JsonProperty("orig_svc_area_cd_sim")
    private String origSvcAreaCdSim;
    @JsonProperty("orig_zip_cd_sim")
    private String origZipCdSim;
    @JsonProperty("dest_region_cd_sim")
    private String destRegionCdSim;
    @JsonProperty("dest_ctry_cd_sim")
    private String destCtryCdSim;
    @JsonProperty("dest_svc_area_cd_sim")
    private String destSvcAreaCdSim;
    @JsonProperty("dest_zip_cd_sim")
    private String destZipCdSim;
    @JsonProperty("dom_int_cd_sim")
    private String domIntCdSim;
    @JsonProperty("ship_dt_sim")
    private LocalDate shipDtSim;
    @JsonProperty("ship_cnt_sim")
    private Double shipCntSim;
    @JsonProperty("ship_wght_kg_sim")
    private Double shipWghtKgSim;
    @JsonProperty("ship_wght_lb_sim")
    private Double shipWghtLbSim;
    @JsonProperty("pieces_cnt_sim")
    private Double piecesCntSim;
    @JsonProperty("bill_type_cd_sim")
    private String billTypeCdSim;
    @JsonProperty("spot_rt_flg_sim")
    private String spotRtFlgSim;
    @JsonProperty("congested_sector_sim")
    private Double congestedSectorSim;
    @JsonProperty("key_acct_support_flg_sim")
    private String keyAcctSupportFlgSim;
    @JsonProperty("piece_type_cd_sim")
    private String pieceTypeCdSim;
    @JsonProperty("pu_operator_type_cd_sim")
    private String puOperatorTypeCdSim;
    @JsonProperty("dl_operator_type_cd_sim")
    private String dlOperatorTypeCdSim;
    @JsonProperty("pu_vehicle_type_cd_sim")
    private String puVehicleTypeCdSim;
    @JsonProperty("dl_vehicle_type_cd_sim")
    private String dlVehicleTypeCdSim;
    @JsonProperty("pu_density_band_cd_sim")
    private String puDensityBandCdSim;
    @JsonProperty("dl_density_band_cd_sim")
    private String dlDensityBandCdSim;
    @JsonProperty("pu_stop_sim")
    private Double puStopSim;
    @JsonProperty("dl_stop_sim")
    private Double dlStopSim;
    @JsonProperty("clrnce_type_cd_sim")
    private String clrnceTypeCdSim;
    @JsonProperty("data_entry_type_cd_sim")
    private String dataEntryTypeCdSim;
    @JsonProperty("dclbl_type_cd_sim")
    private String dclblTypeCdSim;
    @JsonProperty("direct_cost_sim")
    private Double directCostSim;
    @JsonProperty("indirect_cost_sim")
    private Double indirectCostSim;
    @JsonProperty("total_cost_sim")
    private Double totalCostSim;
    @JsonProperty("gp2_sim")
    private Double gp2Sim;
    @JsonProperty("pickup_sim")
    private Double pickupSim;
    @JsonProperty("delivery_sim")
    private Double deliverySim;
    @JsonProperty("tha1200_ob_sim")
    private Double tha1200ObSim;
    @JsonProperty("tha1200_ib_sim")
    private Double tha1200IbSim;
    @JsonProperty("tha1200_entry_sim")
    private Double tha1200EntrySim;
    @JsonProperty("terminal_handling_sim")
    private Double terminalHandlingSim;
    @JsonProperty("gtw1500_ob_sim")
    private Double gtw1500ObSim;
    @JsonProperty("gtw1500_ib_sim")
    private Double gtw1500IbSim;
    @JsonProperty("gateway_sim")
    private Double gatewaySim;
    @JsonProperty("dlh1390_ob_sim")
    private Double dlh1390ObSim;
    @JsonProperty("dlh1300_ilh1400_sim")
    private Double dlh1300Ilh1400Sim;
    @JsonProperty("dlh1390_ib_sim")
    private Double dlh1390IbSim;
    @JsonProperty("linehaul_sim")
    private Double linehaulSim;
    @JsonProperty("hub_sim")
    private Double hubSim;
    @JsonProperty("cms1700_ob_sim")
    private Double cms1700ObSim;
    @JsonProperty("cms1700_ib_sim")
    private Double cms1700IbSim;
    @JsonProperty("customs_sim")
    private Double customsSim;
    @JsonProperty("csc2100_booking_sim")
    private Double csc2100BookingSim;
    @JsonProperty("csc2100_claims_sim")
    private Double csc2100ClaimsSim;
    @JsonProperty("csc2190_other_sim")
    private Double csc2190OtherSim;
    @JsonProperty("csc2100_ecom_sim")
    private Double csc2100EcomSim;
    @JsonProperty("csc2100_kas_sim")
    private Double csc2100KasSim;
    @JsonProperty("customer_service_sim")
    private Double customerServiceSim;
    @JsonProperty("csa2300_credcontrol_sim")
    private Double csa2300CredControlSim;
    @JsonProperty("csa2300_billing_sim")
    private Double csa2300BillingSim;
    @JsonProperty("csa2390_admin_sim")
    private Double csa2390AdminSim;
    @JsonProperty("customer_accounting_sim")
    private Double customerAccountingSim;
    @JsonProperty("odi1800_ob_sim")
    private Double odi1800ObSim;
    @JsonProperty("odi1800_ib_sim")
    private Double odi1800IbSim;
    @JsonProperty("other_direct_sim")
    private Double otherDirectSim;
    @JsonProperty("extra_basket_1_sim")
    private Double extraBasket1Sim;
    @JsonProperty("extra_basket_2_sim")
    private Double extraBasket2Sim;
    @JsonProperty("extra_basket_3_sim")
    private Double extraBasket3Sim;
    @JsonProperty("extra_basket_4_sim")
    private Double extraBasket4Sim;
    @JsonProperty("extra_basket_5_sim")
    private Double extraBasket5Sim;
    @JsonProperty("extra_basket_type_1_sim")
    private String extraBasketType1Sim;
    @JsonProperty("extra_basket_type_2_sim")
    private String extraBasketType2Sim;
    @JsonProperty("extra_basket_type_3_sim")
    private String extraBasketType3Sim;
    @JsonProperty("extra_basket_type_4_sim")
    private String extraBasketType4Sim;
    @JsonProperty("extra_basket_type_5_sim")
    private String extraBasketType5Sim;

}