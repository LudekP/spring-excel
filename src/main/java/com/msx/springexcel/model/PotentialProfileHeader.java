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
    OFFER_REGION_ID ("OO"),
    OFFER_REGION_ID ("OB"),
    OFFER_REGION_ID ("YY"),
    OFFER_REGION_ID ("YB"),
    OFFER_REGION_ID ("AA"),
    OFFER_REGION_ID ("WW"),
    OFFER_REGION_ID ("WC"),
    OFFER_REGION_ID ("W1"),
    OFFER_REGION_ID ("9"),
    OFFER_REGION_ID ("10");
    
    private String value;

    PotentialProfileHeader(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }

}
