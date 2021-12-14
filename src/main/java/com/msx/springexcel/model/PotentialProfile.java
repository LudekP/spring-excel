package com.msx.springexcel.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class PotentialProfile {

    private String excelRowId;
    private String offerRegionId;
    private String productLineCd;
    private String nwProductCd;
    private String billTypeCd;
    private String pricingCtryCd;
    private String lclProductCd;
    private String origRegionCd;
    private String origCtryCd;
    private String origSvcArea;
    private String origZipCd;
    private String destRegionCd;
    private String destCtryCd;
    private String destSvcArea;
    private String destZipCd;
    private String shipCnt;
    private String avgWghtKg;
    private String avgWghtLb;
    private String piecesPerShip;
    private String clrnceTypeCd;
    private String surcharge1Cd;
    private String surcharge2Cd;
    private String surcharge3Cd;
    private String surcharge4Cd;
    private String surcharge5Cd;
    private String surcharge6Cd;
    private String surcharge7Cd;
    private String surcharge8Cd;
    private String surcharge9Cd;
    private String surcharge10Cd;

    public void reset() {
        excelRowId = null;
        offerRegionId = null;
        productLineCd = null;
        nwProductCd = null;
        billTypeCd = null;
        pricingCtryCd = null;
        lclProductCd = null;
        origRegionCd = null;
        origCtryCd = null;
        origSvcArea = null;
        origZipCd = null;
        destRegionCd = null;
        destCtryCd = null;
        destSvcArea = null;
        destZipCd = null;
        shipCnt = null;
        avgWghtKg = null;
        avgWghtLb = null;
        piecesPerShip = null;
        clrnceTypeCd = null;
        surcharge1Cd = null;
        surcharge2Cd = null;
        surcharge3Cd = null;
        surcharge4Cd = null;
        surcharge5Cd = null;
        surcharge6Cd = null;
        surcharge7Cd = null;
        surcharge8Cd = null;
        surcharge9Cd = null;
        surcharge10Cd = null;
    }

    public String[] getString() {

        return new String[]{excelRowId,
                offerRegionId,
                productLineCd,
                nwProductCd,
                billTypeCd,
                pricingCtryCd,
                lclProductCd,
                origRegionCd,
                origCtryCd,
                origSvcArea,
                origZipCd,
                destRegionCd,
                destCtryCd,
                destSvcArea,
                destZipCd,
                shipCnt,
                avgWghtKg,
                avgWghtLb,
                piecesPerShip,
                clrnceTypeCd,
                surcharge1Cd,
                surcharge2Cd,
                surcharge3Cd,
                surcharge4Cd,
                surcharge5Cd,
                surcharge6Cd,
                surcharge7Cd,
                surcharge8Cd,
                surcharge9Cd,
                surcharge10Cd
        };

    }

}
