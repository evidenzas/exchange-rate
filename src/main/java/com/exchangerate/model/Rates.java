package com.exchangerate.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.math.BigDecimal;

@JsonRootName(value = "rates")
public class Rates implements Serializable {

    @Getter
    @Setter
    @JsonProperty("AED")
    private BigDecimal AED;

    @Getter
    @Setter
    @JsonProperty("AFN")
    private BigDecimal AFN;

    @Getter
    @Setter
    @JsonProperty("ALL")
    private BigDecimal ALL;

    @Getter
    @Setter
    @JsonProperty("AMD")
    private BigDecimal AMD;

    @Getter
    @Setter
    @JsonProperty("ANG")
    private BigDecimal ANG;

    @Getter
    @Setter
    @JsonProperty("AOA")
    private BigDecimal AOA;

    @Getter
    @Setter
    @JsonProperty("ARS")
    private BigDecimal ARS;

    @Getter
    @Setter
    @JsonProperty("AUD")
    private BigDecimal AUD;

    @Getter
    @Setter
    @JsonProperty("AWG")
    private BigDecimal AWG;

    @Getter
    @Setter
    @JsonProperty("AZN")
    private BigDecimal AZN;

    @Getter
    @Setter
    @JsonProperty("BAM")
    private BigDecimal BAM;

    @Getter
    @Setter
    @JsonProperty("BBD")
    private BigDecimal BBD;

    @Getter
    @Setter
    @JsonProperty("BDT")
    private BigDecimal BDT;

    @Getter
    @Setter
    @JsonProperty("BGN")
    private BigDecimal BGN;

    @Getter
    @Setter
    @JsonProperty("BHD")
    private BigDecimal BHD;

    @Getter
    @Setter
    @JsonProperty("BIF")
    private BigDecimal BIF;

    @Getter
    @Setter
    @JsonProperty("BMD")
    private BigDecimal BMD;

    @Getter
    @Setter
    @JsonProperty("BND")
    private BigDecimal BND;

    @Getter
    @Setter
    @JsonProperty("BOB")
    private BigDecimal BOB;

    @Getter
    @Setter
    @JsonProperty("BRL")
    private BigDecimal BRL;

    @Getter
    @Setter
    @JsonProperty("BSD")
    private BigDecimal BSD;

    @Getter
    @Setter
    @JsonProperty("BTC")
    private BigDecimal BTC;

    @Getter
    @Setter
    @JsonProperty("BTN")
    private BigDecimal BTN;

    @Getter
    @Setter
    @JsonProperty("BWP")
    private BigDecimal BWP;

    @Getter
    @Setter
    @JsonProperty("BYN")
    private BigDecimal BYN;

    @Getter
    @Setter
    @JsonProperty("BZD")
    private BigDecimal BZD;

    @Getter
    @Setter
    @JsonProperty("CAD")
    private BigDecimal CAD;

    @Getter
    @Setter
    @JsonProperty("CDF")
    private BigDecimal CDF;

    @Getter
    @Setter
    @JsonProperty("CHF")
    private BigDecimal CHF;

    @Getter
    @Setter
    @JsonProperty("CLF")
    private BigDecimal CLF;

    @Getter
    @Setter
    @JsonProperty("CLP")
    private BigDecimal CLP;

    @Getter
    @Setter
    @JsonProperty("CNH")
    private BigDecimal CNH;

    @Getter
    @Setter
    @JsonProperty("CNY")
    private BigDecimal CNY;

    @Getter
    @Setter
    @JsonProperty("COP")
    private BigDecimal COP;

    @Getter
    @Setter
    @JsonProperty("CRC")
    private BigDecimal CRC;

    @Getter
    @Setter
    @JsonProperty("CUC")
    private BigDecimal CUC;

    @Getter
    @Setter
    @JsonProperty("CUP")
    private BigDecimal CUP;

    @Getter
    @Setter
    @JsonProperty("CVE")
    private BigDecimal CVE;

    @Getter
    @Setter
    @JsonProperty("CZK")
    private BigDecimal CZK;

    @Getter
    @Setter
    @JsonProperty("DJF")
    private BigDecimal DJF;

    @Getter
    @Setter
    @JsonProperty("DKK")
    private BigDecimal DKK;

    @Getter
    @Setter
    @JsonProperty("DOP")
    private BigDecimal DOP;

    @Getter
    @Setter
    @JsonProperty("DZD")
    private BigDecimal DZD;

    @Getter
    @Setter
    @JsonProperty("EGP")
    private BigDecimal EGP;

    @Getter
    @Setter
    @JsonProperty("ERN")
    private BigDecimal ERN;

    @Getter
    @Setter
    @JsonProperty("ETB")
    private BigDecimal ETB;

    @Getter
    @Setter
    @JsonProperty("EUR")
    private BigDecimal EUR;

    @Getter
    @Setter
    @JsonProperty("FJD")
    private BigDecimal FJD;

    @Getter
    @Setter
    @JsonProperty("FKP")
    private BigDecimal FKP;

    @Getter
    @Setter
    @JsonProperty("GBP")
    private BigDecimal GBP;

    @Getter
    @Setter
    @JsonProperty("GEL")
    private BigDecimal GEL;

    @Getter
    @Setter
    @JsonProperty("GGP")
    private BigDecimal GGP;

    @Getter
    @Setter
    @JsonProperty("GHS")
    private BigDecimal GHS;

    @Getter
    @Setter
    @JsonProperty("GIP")
    private BigDecimal GIP;

    @Getter
    @Setter
    @JsonProperty("GMD")
    private BigDecimal GMD;

    @Getter
    @Setter
    @JsonProperty("GNF")
    private BigDecimal GNF;

    @Getter
    @Setter
    @JsonProperty("GTQ")
    private BigDecimal GTQ;

    @Getter
    @Setter
    @JsonProperty("GYD")
    private BigDecimal GYD;

    @Getter
    @Setter
    @JsonProperty("HKD")
    private BigDecimal HKD;

    @Getter
    @Setter
    @JsonProperty("HNL")
    private BigDecimal HNL;

    @Getter
    @Setter
    @JsonProperty("HRK")
    private BigDecimal HRK;

    @Getter
    @Setter
    @JsonProperty("HTG")
    private BigDecimal HTG;

    @Getter
    @Setter
    @JsonProperty("HUF")
    private BigDecimal HUF;

    @Getter
    @Setter
    @JsonProperty("IDR")
    private BigDecimal IDR;

    @Getter
    @Setter
    @JsonProperty("ILS")
    private BigDecimal ILS;

    @Getter
    @Setter
    @JsonProperty("IMP")
    private BigDecimal IMP;

    @Getter
    @Setter
    @JsonProperty("INR")
    private BigDecimal INR;

    @Getter
    @Setter
    @JsonProperty("IQD")
    private BigDecimal IQD;

    @Getter
    @Setter
    @JsonProperty("IRR")
    private BigDecimal IRR;

    @Getter
    @Setter
    @JsonProperty("ISK")
    private BigDecimal ISK;

    @Getter
    @Setter
    @JsonProperty("JEP")
    private BigDecimal JEP;

    @Getter
    @Setter
    @JsonProperty("JMD")
    private BigDecimal JMD;

    @Getter
    @Setter
    @JsonProperty("JOD")
    private BigDecimal JOD;

    @Getter
    @Setter
    @JsonProperty("JPY")
    private BigDecimal JPY;

    @Getter
    @Setter
    @JsonProperty("KES")
    private BigDecimal KES;

    @Getter
    @Setter
    @JsonProperty("KGS")
    private BigDecimal KGS;

    @Getter
    @Setter
    @JsonProperty("KHR")
    private BigDecimal KHR;

    @Getter
    @Setter
    @JsonProperty("KMF")
    private BigDecimal KMF;

    @Getter
    @Setter
    @JsonProperty("KPW")
    private BigDecimal KPW;

    @Getter
    @Setter
    @JsonProperty("KRW")
    private BigDecimal KRW;

    @Getter
    @Setter
    @JsonProperty("KWD")
    private BigDecimal KWD;

    @Getter
    @Setter
    @JsonProperty("KYD")
    private BigDecimal KYD;

    @Getter
    @Setter
    @JsonProperty("KZT")
    private BigDecimal KZT;

    @Getter
    @Setter
    @JsonProperty("LAK")
    private BigDecimal LAK;

    @Getter
    @Setter
    @JsonProperty("LBP")
    private BigDecimal LBP;

    @Getter
    @Setter
    @JsonProperty("LKR")
    private BigDecimal LKR;

    @Getter
    @Setter
    @JsonProperty("LRD")
    private BigDecimal LRD;

    @Getter
    @Setter
    @JsonProperty("LSL")
    private BigDecimal LSL;

    @Getter
    @Setter
    @JsonProperty("LYD")
    private BigDecimal LYD;

    @Getter
    @Setter
    @JsonProperty("MAD")
    private BigDecimal MAD;

    @Getter
    @Setter
    @JsonProperty("MDL")
    private BigDecimal MDL;

    @Getter
    @Setter
    @JsonProperty("MGA")
    private BigDecimal MGA;

    @Getter
    @Setter
    @JsonProperty("MKD")
    private BigDecimal MKD;

    @Getter
    @Setter
    @JsonProperty("MMK")
    private BigDecimal MMK;

    @Getter
    @Setter
    @JsonProperty("MNT")
    private BigDecimal MNT;

    @Getter
    @Setter
    @JsonProperty("MOP")
    private BigDecimal MOP;

    @Getter
    @Setter
    @JsonProperty("MRO")
    private BigDecimal MRO;

    @Getter
    @Setter
    @JsonProperty("MRU")
    private BigDecimal MRU;

    @Getter
    @Setter
    @JsonProperty("MUR")
    private BigDecimal MUR;

    @Getter
    @Setter
    @JsonProperty("MVR")
    private BigDecimal MVR;

    @Getter
    @Setter
    @JsonProperty("MWK")
    private BigDecimal MWK;

    @Getter
    @Setter
    @JsonProperty("MXN")
    private BigDecimal MXN;

    @Getter
    @Setter
    @JsonProperty("MYR")
    private BigDecimal MYR;

    @Getter
    @Setter
    @JsonProperty("MZN")
    private BigDecimal MZN;

    @Getter
    @Setter
    @JsonProperty("NAD")
    private BigDecimal NAD;

    @Getter
    @Setter
    @JsonProperty("NGN")
    private BigDecimal NGN;

    @Getter
    @Setter
    @JsonProperty("NIO")
    private BigDecimal NIO;

    @Getter
    @Setter
    @JsonProperty("NOK")
    private BigDecimal NOK;

    @Getter
    @Setter
    @JsonProperty("NPR")
    private BigDecimal NPR;

    @Getter
    @Setter
    @JsonProperty("NZD")
    private BigDecimal NZD;

    @Getter
    @Setter
    @JsonProperty("OMR")
    private BigDecimal OMR;

    @Getter
    @Setter
    @JsonProperty("PAB")
    private BigDecimal PAB;

    @Getter
    @Setter
    @JsonProperty("PEN")
    private BigDecimal PEN;

    @Getter
    @Setter
    @JsonProperty("PGK")
    private BigDecimal PGK;

    @Getter
    @Setter
    @JsonProperty("PHP")
    private BigDecimal PHP;

    @Getter
    @Setter
    @JsonProperty("PKR")
    private BigDecimal PKR;

    @Getter
    @Setter
    @JsonProperty("PLN")
    private BigDecimal PLN;

    @Getter
    @Setter
    @JsonProperty("PYG")
    private BigDecimal PYG;

    @Getter
    @Setter
    @JsonProperty("QAR")
    private BigDecimal QAR;

    @Getter
    @Setter
    @JsonProperty("RON")
    private BigDecimal RON;

    @Getter
    @Setter
    @JsonProperty("RSD")
    private BigDecimal RSD;

    @Getter
    @Setter
    @JsonProperty("RUB")
    private BigDecimal RUB;

    @Getter
    @Setter
    @JsonProperty("RWF")
    private BigDecimal RWF;

    @Getter
    @Setter
    @JsonProperty("SAR")
    private BigDecimal SAR;

    @Getter
    @Setter
    @JsonProperty("SBD")
    private BigDecimal SBD;

    @Getter
    @Setter
    @JsonProperty("SCR")
    private BigDecimal SCR;

    @Getter
    @Setter
    @JsonProperty("SDG")
    private BigDecimal SDG;

    @Getter
    @Setter
    @JsonProperty("SEK")
    private BigDecimal SEK;

    @Getter
    @Setter
    @JsonProperty("SGD")
    private BigDecimal SGD;

    @Getter
    @Setter
    @JsonProperty("SHP")
    private BigDecimal SHP;

    @Getter
    @Setter
    @JsonProperty("SLL")
    private BigDecimal SLL;

    @Getter
    @Setter
    @JsonProperty("SOS")
    private BigDecimal SOS;

    @Getter
    @Setter
    @JsonProperty("SRD")
    private BigDecimal SRD;

    @Getter
    @Setter
    @JsonProperty("SSP")
    private BigDecimal SSP;

    @Getter
    @Setter
    @JsonProperty("STD")
    private BigDecimal STD;

    @Getter
    @Setter
    @JsonProperty("STN")
    private BigDecimal STN;

    @Getter
    @Setter
    @JsonProperty("SVC")
    private BigDecimal SVC;

    @Getter
    @Setter
    @JsonProperty("SYP")
    private BigDecimal SYP;

    @Getter
    @Setter
    @JsonProperty("SZL")
    private BigDecimal SZL;

    @Getter
    @Setter
    @JsonProperty("THB")
    private BigDecimal THB;

    @Getter
    @Setter
    @JsonProperty("TJS")
    private BigDecimal TJS;

    @Getter
    @Setter
    @JsonProperty("TMT")
    private BigDecimal TMT;

    @Getter
    @Setter
    @JsonProperty("TND")
    private BigDecimal TND;

    @Getter
    @Setter
    @JsonProperty("TOP")
    private BigDecimal TOP;

    @Getter
    @Setter
    @JsonProperty("TRY")
    private BigDecimal TRY;

    @Getter
    @Setter
    @JsonProperty("TTD")
    private BigDecimal TTD;

    @Getter
    @Setter
    @JsonProperty("TWD")
    private BigDecimal TWD;

    @Getter
    @Setter
    @JsonProperty("TZS")
    private BigDecimal TZS;

    @Getter
    @Setter
    @JsonProperty("UAH")
    private BigDecimal UAH;

    @Getter
    @Setter
    @JsonProperty("UGX")
    private BigDecimal UGX;

    @Getter
    @Setter
    @JsonProperty("USD")
    private BigDecimal USD;

    @Getter
    @Setter
    @JsonProperty("UYU")
    private BigDecimal UYU;

    @Getter
    @Setter
    @JsonProperty("UZS")
    private BigDecimal UZS;

    @Getter
    @Setter
    @JsonProperty("VES")
    private BigDecimal VES;

    @Getter
    @Setter
    @JsonProperty("VND")
    private BigDecimal VND;

    @Getter
    @Setter
    @JsonProperty("VUV")
    private BigDecimal VUV;

    @Getter
    @Setter
    @JsonProperty("WST")
    private BigDecimal WST;

    @Getter
    @Setter
    @JsonProperty("XAF")
    private BigDecimal XAF;

    @Getter
    @Setter
    @JsonProperty("XAG")
    private BigDecimal XAG;

    @Getter
    @Setter
    @JsonProperty("XAU")
    private BigDecimal XAU;

    @Getter
    @Setter
    @JsonProperty("XCD")
    private BigDecimal XCD;

    @Getter
    @Setter
    @JsonProperty("XDR")
    private BigDecimal XDR;

    @Getter
    @Setter
    @JsonProperty("XOF")
    private BigDecimal XOF;

    @Getter
    @Setter
    @JsonProperty("XPD")
    private BigDecimal XPD;

    @Getter
    @Setter
    @JsonProperty("XPF")
    private BigDecimal XPF;

    @Getter
    @Setter
    @JsonProperty("XPT")
    private BigDecimal XPT;

    @Getter
    @Setter
    @JsonProperty("YER")
    private BigDecimal YER;

    @Getter
    @Setter
    @JsonProperty("ZAR")
    private BigDecimal ZAR;

    @Getter
    @Setter
    @JsonProperty("ZMW")
    private BigDecimal ZMW;

    @Getter
    @Setter
    @JsonProperty("ZWL")
    private BigDecimal ZWL;

    public Field[] getFields() {
        return this.getClass().getDeclaredFields();
    }

}
