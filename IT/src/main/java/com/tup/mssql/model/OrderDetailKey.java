package com.tup.mssql.model;

import java.math.BigDecimal;

public class OrderDetailKey {
    private String sdkcoo;

    private Long sddoco;

    private String sddcto;

    private BigDecimal sdlnid;

    private String sdmcu;

    public String getSdkcoo() {
        return sdkcoo;
    }

    public void setSdkcoo(String sdkcoo) {
        this.sdkcoo = sdkcoo == null ? null : sdkcoo.trim();
    }

    public Long getSddoco() {
        return sddoco;
    }

    public void setSddoco(Long sddoco) {
        this.sddoco = sddoco;
    }

    public String getSddcto() {
        return sddcto;
    }

    public void setSddcto(String sddcto) {
        this.sddcto = sddcto == null ? null : sddcto.trim();
    }

    public BigDecimal getSdlnid() {
        return sdlnid;
    }

    public void setSdlnid(BigDecimal sdlnid) {
        this.sdlnid = sdlnid;
    }

    public String getSdmcu() {
        return sdmcu;
    }

    public void setSdmcu(String sdmcu) {
        this.sdmcu = sdmcu == null ? null : sdmcu.trim();
    }
}