package com.exchangerate.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


public class UpdatedRatesPojo implements Serializable {

    @Getter
    @Setter
    Motd MotdObject;

    @Getter
    @Setter
    private boolean success;

    @Getter
    @Setter
    private String base;

    @Getter
    @Setter
    private String date;

    @Getter
    @Setter
    @JsonProperty("rates")
    Rates RatesObject;
}

class Motd {

    @Getter
    @Setter
    private String msg;

    @Getter
    @Setter
    private String url;
}

