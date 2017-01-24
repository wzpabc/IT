package com.tup.mssql.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OrderHeaderIn implements Serializable {
    private String id;

    private String sykcoo;

    private String sydcto;

    private String symcu;

    private String syco;

    private Integer syan8;

    private Integer syshan;

    private Date sytrdj;

    private Date sydrqj;

    private Date sypddj;

    private Integer sydrqt;

    private String syvr01;

    private String sydel1;

    private String sydel2;

    private String syurcd;

    private Date syurdt;

    private BigDecimal syurat;

    private Integer syurab;

    private String syurrf;

    private String samlnm;

    private String saadd1;

    private String saadd2;

    private String saadd3;

    private String saadd4;

    private String shmlnm;

    private String shadd1;

    private String shadd2;

    private String shadd3;

    private String shadd4;

    private String jdeStatus;

    private Date jdeInsertdate;

    private Date jdeUpdatedate;

    private Long jdeOrdernumber;

    private String jdeProccesslog;

    private Date ktProcessdate;

    private Long sydoco;

    private Integer ediflag;

    private String syekco;

    private Long syedoc;

    private String syedct;

    private String syedbt;

    private Date fmsProcessDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getSykcoo() {
        return sykcoo;
    }

    public void setSykcoo(String sykcoo) {
        this.sykcoo = sykcoo == null ? null : sykcoo.trim();
    }

    public String getSydcto() {
        return sydcto;
    }

    public void setSydcto(String sydcto) {
        this.sydcto = sydcto == null ? null : sydcto.trim();
    }

    public String getSymcu() {
        return symcu;
    }

    public void setSymcu(String symcu) {
        this.symcu = symcu == null ? null : symcu.trim();
    }

    public String getSyco() {
        return syco;
    }

    public void setSyco(String syco) {
        this.syco = syco == null ? null : syco.trim();
    }

    public Integer getSyan8() {
        return syan8;
    }

    public void setSyan8(Integer syan8) {
        this.syan8 = syan8;
    }

    public Integer getSyshan() {
        return syshan;
    }

    public void setSyshan(Integer syshan) {
        this.syshan = syshan;
    }

    public Date getSytrdj() {
        return sytrdj;
    }

    public void setSytrdj(Date sytrdj) {
        this.sytrdj = sytrdj;
    }

    public Date getSydrqj() {
        return sydrqj;
    }

    public void setSydrqj(Date sydrqj) {
        this.sydrqj = sydrqj;
    }

    public Date getSypddj() {
        return sypddj;
    }

    public void setSypddj(Date sypddj) {
        this.sypddj = sypddj;
    }

    public Integer getSydrqt() {
        return sydrqt;
    }

    public void setSydrqt(Integer sydrqt) {
        this.sydrqt = sydrqt;
    }

    public String getSyvr01() {
        return syvr01;
    }

    public void setSyvr01(String syvr01) {
        this.syvr01 = syvr01 == null ? null : syvr01.trim();
    }

    public String getSydel1() {
        return sydel1;
    }

    public void setSydel1(String sydel1) {
        this.sydel1 = sydel1 == null ? null : sydel1.trim();
    }

    public String getSydel2() {
        return sydel2;
    }

    public void setSydel2(String sydel2) {
        this.sydel2 = sydel2 == null ? null : sydel2.trim();
    }

    public String getSyurcd() {
        return syurcd;
    }

    public void setSyurcd(String syurcd) {
        this.syurcd = syurcd == null ? null : syurcd.trim();
    }

    public Date getSyurdt() {
        return syurdt;
    }

    public void setSyurdt(Date syurdt) {
        this.syurdt = syurdt;
    }

    public BigDecimal getSyurat() {
        return syurat;
    }

    public void setSyurat(BigDecimal syurat) {
        this.syurat = syurat;
    }

    public Integer getSyurab() {
        return syurab;
    }

    public void setSyurab(Integer syurab) {
        this.syurab = syurab;
    }

    public String getSyurrf() {
        return syurrf;
    }

    public void setSyurrf(String syurrf) {
        this.syurrf = syurrf == null ? null : syurrf.trim();
    }

    public String getSamlnm() {
        return samlnm;
    }

    public void setSamlnm(String samlnm) {
        this.samlnm = samlnm == null ? null : samlnm.trim();
    }

    public String getSaadd1() {
        return saadd1;
    }

    public void setSaadd1(String saadd1) {
        this.saadd1 = saadd1 == null ? null : saadd1.trim();
    }

    public String getSaadd2() {
        return saadd2;
    }

    public void setSaadd2(String saadd2) {
        this.saadd2 = saadd2 == null ? null : saadd2.trim();
    }

    public String getSaadd3() {
        return saadd3;
    }

    public void setSaadd3(String saadd3) {
        this.saadd3 = saadd3 == null ? null : saadd3.trim();
    }

    public String getSaadd4() {
        return saadd4;
    }

    public void setSaadd4(String saadd4) {
        this.saadd4 = saadd4 == null ? null : saadd4.trim();
    }

    public String getShmlnm() {
        return shmlnm;
    }

    public void setShmlnm(String shmlnm) {
        this.shmlnm = shmlnm == null ? null : shmlnm.trim();
    }

    public String getShadd1() {
        return shadd1;
    }

    public void setShadd1(String shadd1) {
        this.shadd1 = shadd1 == null ? null : shadd1.trim();
    }

    public String getShadd2() {
        return shadd2;
    }

    public void setShadd2(String shadd2) {
        this.shadd2 = shadd2 == null ? null : shadd2.trim();
    }

    public String getShadd3() {
        return shadd3;
    }

    public void setShadd3(String shadd3) {
        this.shadd3 = shadd3 == null ? null : shadd3.trim();
    }

    public String getShadd4() {
        return shadd4;
    }

    public void setShadd4(String shadd4) {
        this.shadd4 = shadd4 == null ? null : shadd4.trim();
    }

    public String getJdeStatus() {
        return jdeStatus;
    }

    public void setJdeStatus(String jdeStatus) {
        this.jdeStatus = jdeStatus == null ? null : jdeStatus.trim();
    }

    public Date getJdeInsertdate() {
        return jdeInsertdate;
    }

    public void setJdeInsertdate(Date jdeInsertdate) {
        this.jdeInsertdate = jdeInsertdate;
    }

    public Date getJdeUpdatedate() {
        return jdeUpdatedate;
    }

    public void setJdeUpdatedate(Date jdeUpdatedate) {
        this.jdeUpdatedate = jdeUpdatedate;
    }

    public Long getJdeOrdernumber() {
        return jdeOrdernumber;
    }

    public void setJdeOrdernumber(Long jdeOrdernumber) {
        this.jdeOrdernumber = jdeOrdernumber;
    }

    public String getJdeProccesslog() {
        return jdeProccesslog;
    }

    public void setJdeProccesslog(String jdeProccesslog) {
        this.jdeProccesslog = jdeProccesslog == null ? null : jdeProccesslog.trim();
    }

    public Date getKtProcessdate() {
        return ktProcessdate;
    }

    public void setKtProcessdate(Date ktProcessdate) {
        this.ktProcessdate = ktProcessdate;
    }

    public Long getSydoco() {
        return sydoco;
    }

    public void setSydoco(Long sydoco) {
        this.sydoco = sydoco;
    }

    public Integer getEdiflag() {
        return ediflag;
    }

    public void setEdiflag(Integer ediflag) {
        this.ediflag = ediflag;
    }

    public String getSyekco() {
        return syekco;
    }

    public void setSyekco(String syekco) {
        this.syekco = syekco == null ? null : syekco.trim();
    }

    public Long getSyedoc() {
        return syedoc;
    }

    public void setSyedoc(Long syedoc) {
        this.syedoc = syedoc;
    }

    public String getSyedct() {
        return syedct;
    }

    public void setSyedct(String syedct) {
        this.syedct = syedct == null ? null : syedct.trim();
    }

    public String getSyedbt() {
        return syedbt;
    }

    public void setSyedbt(String syedbt) {
        this.syedbt = syedbt == null ? null : syedbt.trim();
    }

    public Date getFmsProcessDate() {
        return fmsProcessDate;
    }

    public void setFmsProcessDate(Date fmsProcessDate) {
        this.fmsProcessDate = fmsProcessDate;
    }
}