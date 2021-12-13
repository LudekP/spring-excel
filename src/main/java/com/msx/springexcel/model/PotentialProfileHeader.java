package com.msx.springexcel.model;

public enum PotentialProfileHeader {

    EXCEL_ROW_ID ("row ID"),
    OFFER_REGION_ID ("Offer Region Id"),
    PRODUCT_LINE_CD ("ProductLine"),
    NW_PRODUCT_CD ("NetworkProduct"),
    BILL_TYPE_CD ("Billing Type"),
    PRICING_CTRY_CD ("Pricing Country"),
    LCL_PRODUCT_CD ("LocalProduct"),
    ORIG_REGION_CD ("O-REGION"),
    ORIG_CTRY_CD ("O-COUNTRY"),
    ORIG_SVC_AREA ("O-SVA"),
    ORIG_ZIP_CD ("O-Zip"),
    DEST_REGION_CD ("D-REGION"),
    DEST_CTRY_CD ("D-COUNTRY"),
    DEST_SVC_AREA ("D-SVA"),
    DEST_ZIP_CD ("D-Zip"),
    SHIP_CNT ("Shipments"),
    AVG_WGHT_KG ("Average weight KG"),
    AVG_WGHT_LB ("Average weight LB"),
    PIECES_PER_SHIP ("Pieces per SHP"),
    CLRNCE_TYPE_CD ("Clearance Type"),
    SURCHARGE_OO_CD ("OO"),
    SURCHARGE_OB_CD ("OB"),
    SURCHARGE_YY_CD ("YY"),
    SURCHARGE_YB_CD ("YB"),
    SURCHARGE_AA_CD ("AA"),
    SURCHARGE_WW_CD ("WW"),
    SURCHARGE_WC_CD ("WC"),
    SURCHARGE_W1_CD ("W1"),
    SURCHARGE_9_CD ("9"),
    SURCHARGE_10_CD ("10");

    private String value;

    PotentialProfileHeader(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }

}
