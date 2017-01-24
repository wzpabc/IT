package com.tup.mssql.model;

public class InventoryKey {
    private String liitm;

    private String limcu;

    private String lilocn;

    private String lilotn;

    public String getLiitm() {
        return liitm;
    }

    public void setLiitm(String liitm) {
        this.liitm = liitm == null ? null : liitm.trim();
    }

    public String getLimcu() {
        return limcu;
    }

    public void setLimcu(String limcu) {
        this.limcu = limcu == null ? null : limcu.trim();
    }

    public String getLilocn() {
        return lilocn;
    }

    public void setLilocn(String lilocn) {
        this.lilocn = lilocn == null ? null : lilocn.trim();
    }

    public String getLilotn() {
        return lilotn;
    }

    public void setLilotn(String lilotn) {
        this.lilotn = lilotn == null ? null : lilotn.trim();
    }
}