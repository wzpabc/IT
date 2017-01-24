package com.tup.mssql.model;

import java.math.BigDecimal;
import java.util.Date;

public class OrderHeader extends OrderHeaderKey {
    private String shmcu;

    private String shco;

    private Integer shan8;

    private Integer shshan;

    private Date shtrdj;

    private Date shdrqj;

    private Date shpddj;

    private String shvr01;

    private String shdel1;

    private String shdel2;

    private String shurcd;

    private Date shurdt;

    private BigDecimal shurat;

    private BigDecimal shurab;

    private String shurrf;

    private Date shupmj;

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

    private Date jdeUpdatedate;

    private Date ktProcessdate;

    private Date ktFaildate;

    private Integer ktRetrytimes;

    private String ktErrorlog;

    private Date fmsProcessDate;

    public String getShmcu() {
        return shmcu;
    }

    public void setShmcu(String shmcu) {
        this.shmcu = shmcu == null ? null : shmcu.trim();
    }

    public String getShco() {
        return shco;
    }

    public void setShco(String shco) {
        this.shco = shco == null ? null : shco.trim();
    }

    public Integer getShan8() {
        return shan8;
    }

    public void setShan8(Integer shan8) {
        this.shan8 = shan8;
    }

    public Integer getShshan() {
        return shshan;
    }

    public void setShshan(Integer shshan) {
        this.shshan = shshan;
    }

    public Date getShtrdj() {
        return shtrdj;
    }

    public void setShtrdj(Date shtrdj) {
        this.shtrdj = shtrdj;
    }

    public Date getShdrqj() {
        return shdrqj;
    }

    public void setShdrqj(Date shdrqj) {
        this.shdrqj = shdrqj;
    }

    public Date getShpddj() {
        return shpddj;
    }

    public void setShpddj(Date shpddj) {
        this.shpddj = shpddj;
    }

    public String getShvr01() {
        return shvr01;
    }

    public void setShvr01(String shvr01) {
        this.shvr01 = shvr01 == null ? null : shvr01.trim();
    }

    public String getShdel1() {
        return shdel1;
    }

    public void setShdel1(String shdel1) {
        this.shdel1 = shdel1 == null ? null : shdel1.trim();
    }

    public String getShdel2() {
        return shdel2;
    }

    public void setShdel2(String shdel2) {
        this.shdel2 = shdel2 == null ? null : shdel2.trim();
    }

    public String getShurcd() {
        return shurcd;
    }

    public void setShurcd(String shurcd) {
        this.shurcd = shurcd == null ? null : shurcd.trim();
    }

    public Date getShurdt() {
        return shurdt;
    }

    public void setShurdt(Date shurdt) {
        this.shurdt = shurdt;
    }

    public BigDecimal getShurat() {
        return shurat;
    }

    public void setShurat(BigDecimal shurat) {
        this.shurat = shurat;
    }

    public BigDecimal getShurab() {
        return shurab;
    }

    public void setShurab(BigDecimal shurab) {
        this.shurab = shurab;
    }

    public String getShurrf() {
        return shurrf;
    }

    public void setShurrf(String shurrf) {
        this.shurrf = shurrf == null ? null : shurrf.trim();
    }

    public Date getShupmj() {
        return shupmj;
    }

    public void setShupmj(Date shupmj) {
        this.shupmj = shupmj;
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

    public Date getJdeUpdatedate() {
        return jdeUpdatedate;
    }

    public void setJdeUpdatedate(Date jdeUpdatedate) {
        this.jdeUpdatedate = jdeUpdatedate;
    }

    public Date getKtProcessdate() {
        return ktProcessdate;
    }

    public void setKtProcessdate(Date ktProcessdate) {
        this.ktProcessdate = ktProcessdate;
    }

    public Date getKtFaildate() {
        return ktFaildate;
    }

    public void setKtFaildate(Date ktFaildate) {
        this.ktFaildate = ktFaildate;
    }

    public Integer getKtRetrytimes() {
        return ktRetrytimes;
    }

    public void setKtRetrytimes(Integer ktRetrytimes) {
        this.ktRetrytimes = ktRetrytimes;
    }

    public String getKtErrorlog() {
        return ktErrorlog;
    }

    public void setKtErrorlog(String ktErrorlog) {
        this.ktErrorlog = ktErrorlog == null ? null : ktErrorlog.trim();
    }

    public Date getFmsProcessDate() {
        return fmsProcessDate;
    }

    public void setFmsProcessDate(Date fmsProcessDate) {
        this.fmsProcessDate = fmsProcessDate;
    }
}