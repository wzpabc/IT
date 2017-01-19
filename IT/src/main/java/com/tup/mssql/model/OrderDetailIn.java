package com.tup.mssql.model;

import java.math.BigDecimal;
import java.util.Date;

public class OrderDetailIn {
    private String id;

    private String headerid;

    private String szkcoo;

    private String szdcto;

    private BigDecimal szlnid;

    private String szmcu;

    private String stmcu;

    private String szco;

    private Integer szan8;

    private Integer szshan;

    private Date sztrdj;

    private Date szdrqj;

    private Date szpddj;

    private Integer szdrqt;

    private String szvr01;

    private String szvr02;

    private String szglc;

    private String szurcd;

    private Date szurdt;

    private BigDecimal szurat;

    private Integer szurab;

    private String szurrf;

    private String szasn;

    private String szeuse;

    private String szlitm;

    private String szprov;

    private BigDecimal szuprc;

    private BigDecimal szaexp;

    private BigDecimal szuorg;

    private String szrcd;

    private String szuom;

    private String jdeStatus;

    private Date jdeInsertdate;

    private Date jdeUpdatedate;

    private Long jdeOrdernumber;

    private String jdeProccesslog;

    private Date ktProcessdate;

    private Long szdoco;

    private Integer ediflag;

    private String szekco;

    private Long szedoc;

    private String szedct;

    private String szedbt;

    private Date fmsProcessDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getHeaderid() {
        return headerid;
    }

    public void setHeaderid(String headerid) {
        this.headerid = headerid == null ? null : headerid.trim();
    }

    public String getSzkcoo() {
        return szkcoo;
    }

    public void setSzkcoo(String szkcoo) {
        this.szkcoo = szkcoo == null ? null : szkcoo.trim();
    }

    public String getSzdcto() {
        return szdcto;
    }

    public void setSzdcto(String szdcto) {
        this.szdcto = szdcto == null ? null : szdcto.trim();
    }

    public BigDecimal getSzlnid() {
        return szlnid;
    }

    public void setSzlnid(BigDecimal szlnid) {
        this.szlnid = szlnid;
    }

    public String getSzmcu() {
        return szmcu;
    }

    public void setSzmcu(String szmcu) {
        this.szmcu = szmcu == null ? null : szmcu.trim();
    }

    public String getStmcu() {
        return stmcu;
    }

    public void setStmcu(String stmcu) {
        this.stmcu = stmcu == null ? null : stmcu.trim();
    }

    public String getSzco() {
        return szco;
    }

    public void setSzco(String szco) {
        this.szco = szco == null ? null : szco.trim();
    }

    public Integer getSzan8() {
        return szan8;
    }

    public void setSzan8(Integer szan8) {
        this.szan8 = szan8;
    }

    public Integer getSzshan() {
        return szshan;
    }

    public void setSzshan(Integer szshan) {
        this.szshan = szshan;
    }

    public Date getSztrdj() {
        return sztrdj;
    }

    public void setSztrdj(Date sztrdj) {
        this.sztrdj = sztrdj;
    }

    public Date getSzdrqj() {
        return szdrqj;
    }

    public void setSzdrqj(Date szdrqj) {
        this.szdrqj = szdrqj;
    }

    public Date getSzpddj() {
        return szpddj;
    }

    public void setSzpddj(Date szpddj) {
        this.szpddj = szpddj;
    }

    public Integer getSzdrqt() {
        return szdrqt;
    }

    public void setSzdrqt(Integer szdrqt) {
        this.szdrqt = szdrqt;
    }

    public String getSzvr01() {
        return szvr01;
    }

    public void setSzvr01(String szvr01) {
        this.szvr01 = szvr01 == null ? null : szvr01.trim();
    }

    public String getSzvr02() {
        return szvr02;
    }

    public void setSzvr02(String szvr02) {
        this.szvr02 = szvr02 == null ? null : szvr02.trim();
    }

    public String getSzglc() {
        return szglc;
    }

    public void setSzglc(String szglc) {
        this.szglc = szglc == null ? null : szglc.trim();
    }

    public String getSzurcd() {
        return szurcd;
    }

    public void setSzurcd(String szurcd) {
        this.szurcd = szurcd == null ? null : szurcd.trim();
    }

    public Date getSzurdt() {
        return szurdt;
    }

    public void setSzurdt(Date szurdt) {
        this.szurdt = szurdt;
    }

    public BigDecimal getSzurat() {
        return szurat;
    }

    public void setSzurat(BigDecimal szurat) {
        this.szurat = szurat;
    }

    public Integer getSzurab() {
        return szurab;
    }

    public void setSzurab(Integer szurab) {
        this.szurab = szurab;
    }

    public String getSzurrf() {
        return szurrf;
    }

    public void setSzurrf(String szurrf) {
        this.szurrf = szurrf == null ? null : szurrf.trim();
    }

    public String getSzasn() {
        return szasn;
    }

    public void setSzasn(String szasn) {
        this.szasn = szasn == null ? null : szasn.trim();
    }

    public String getSzeuse() {
        return szeuse;
    }

    public void setSzeuse(String szeuse) {
        this.szeuse = szeuse == null ? null : szeuse.trim();
    }

    public String getSzlitm() {
        return szlitm;
    }

    public void setSzlitm(String szlitm) {
        this.szlitm = szlitm == null ? null : szlitm.trim();
    }

    public String getSzprov() {
        return szprov;
    }

    public void setSzprov(String szprov) {
        this.szprov = szprov == null ? null : szprov.trim();
    }

    public BigDecimal getSzuprc() {
        return szuprc;
    }

    public void setSzuprc(BigDecimal szuprc) {
        this.szuprc = szuprc;
    }

    public BigDecimal getSzaexp() {
        return szaexp;
    }

    public void setSzaexp(BigDecimal szaexp) {
        this.szaexp = szaexp;
    }

    public BigDecimal getSzuorg() {
        return szuorg;
    }

    public void setSzuorg(BigDecimal szuorg) {
        this.szuorg = szuorg;
    }

    public String getSzrcd() {
        return szrcd;
    }

    public void setSzrcd(String szrcd) {
        this.szrcd = szrcd == null ? null : szrcd.trim();
    }

    public String getSzuom() {
        return szuom;
    }

    public void setSzuom(String szuom) {
        this.szuom = szuom == null ? null : szuom.trim();
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

    public Long getSzdoco() {
        return szdoco;
    }

    public void setSzdoco(Long szdoco) {
        this.szdoco = szdoco;
    }

    public Integer getEdiflag() {
        return ediflag;
    }

    public void setEdiflag(Integer ediflag) {
        this.ediflag = ediflag;
    }

    public String getSzekco() {
        return szekco;
    }

    public void setSzekco(String szekco) {
        this.szekco = szekco == null ? null : szekco.trim();
    }

    public Long getSzedoc() {
        return szedoc;
    }

    public void setSzedoc(Long szedoc) {
        this.szedoc = szedoc;
    }

    public String getSzedct() {
        return szedct;
    }

    public void setSzedct(String szedct) {
        this.szedct = szedct == null ? null : szedct.trim();
    }

    public String getSzedbt() {
        return szedbt;
    }

    public void setSzedbt(String szedbt) {
        this.szedbt = szedbt == null ? null : szedbt.trim();
    }

    public Date getFmsProcessDate() {
        return fmsProcessDate;
    }

    public void setFmsProcessDate(Date fmsProcessDate) {
        this.fmsProcessDate = fmsProcessDate;
    }
}