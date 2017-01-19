package com.tup.mssql.model;

public class OrderHeaderKey {
    private String shkcoo;

    private Integer shdoco;

    private String shdcto;

    public String getShkcoo() {
        return shkcoo;
    }

    public void setShkcoo(String shkcoo) {
        this.shkcoo = shkcoo == null ? null : shkcoo.trim();
    }

    public Integer getShdoco() {
        return shdoco;
    }

    public void setShdoco(Integer shdoco) {
        this.shdoco = shdoco;
    }

    public String getShdcto() {
        return shdcto;
    }

    public void setShdcto(String shdcto) {
        this.shdcto = shdcto == null ? null : shdcto.trim();
    }
}