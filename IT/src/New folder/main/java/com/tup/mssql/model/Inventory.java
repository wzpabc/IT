package com.tup.mssql.model;

import java.math.BigDecimal;
import java.util.Date;

public class Inventory extends InventoryKey {
    private String lipbin;

    private String liglpt;

    private BigDecimal lipqoh;

    private BigDecimal lipbck;

    private BigDecimal lipreq;

    private BigDecimal liqwbo;

    private BigDecimal lihcom;

    private BigDecimal lipcom;

    private BigDecimal lifcom;

    private BigDecimal lifun1;

    private BigDecimal liqowo;

    private BigDecimal liqttr;

    private String lilots;

    private Date lilrcj;

    private BigDecimal liot1p;

    private BigDecimal liot2p;

    private BigDecimal liot1a;

    private BigDecimal liqtin;

    private BigDecimal liqto1;

    private BigDecimal liqto2;

    private BigDecimal liqonl;

    private BigDecimal liqtri;

    private BigDecimal liqtro;

    private Date lincdj;

    private BigDecimal liqty1;

    private BigDecimal liqty2;

    private Long licsid;

    private String liurcd;

    private Date liurdt;

    private BigDecimal liurat;

    private Long liurab;

    private String liurrf;

    private String liuser;

    private Date liupmj;

    private Date jdeUpdatedate;

    private Date ktProcessdate;

    private Date ktFaildate;

    private Integer ktRetrytimes;

    private String ktErrorlog;

    private Date fmsProcessDate;

    public String getLipbin() {
        return lipbin;
    }

    public void setLipbin(String lipbin) {
        this.lipbin = lipbin == null ? null : lipbin.trim();
    }

    public String getLiglpt() {
        return liglpt;
    }

    public void setLiglpt(String liglpt) {
        this.liglpt = liglpt == null ? null : liglpt.trim();
    }

    public BigDecimal getLipqoh() {
        return lipqoh;
    }

    public void setLipqoh(BigDecimal lipqoh) {
        this.lipqoh = lipqoh;
    }

    public BigDecimal getLipbck() {
        return lipbck;
    }

    public void setLipbck(BigDecimal lipbck) {
        this.lipbck = lipbck;
    }

    public BigDecimal getLipreq() {
        return lipreq;
    }

    public void setLipreq(BigDecimal lipreq) {
        this.lipreq = lipreq;
    }

    public BigDecimal getLiqwbo() {
        return liqwbo;
    }

    public void setLiqwbo(BigDecimal liqwbo) {
        this.liqwbo = liqwbo;
    }

    public BigDecimal getLihcom() {
        return lihcom;
    }

    public void setLihcom(BigDecimal lihcom) {
        this.lihcom = lihcom;
    }

    public BigDecimal getLipcom() {
        return lipcom;
    }

    public void setLipcom(BigDecimal lipcom) {
        this.lipcom = lipcom;
    }

    public BigDecimal getLifcom() {
        return lifcom;
    }

    public void setLifcom(BigDecimal lifcom) {
        this.lifcom = lifcom;
    }

    public BigDecimal getLifun1() {
        return lifun1;
    }

    public void setLifun1(BigDecimal lifun1) {
        this.lifun1 = lifun1;
    }

    public BigDecimal getLiqowo() {
        return liqowo;
    }

    public void setLiqowo(BigDecimal liqowo) {
        this.liqowo = liqowo;
    }

    public BigDecimal getLiqttr() {
        return liqttr;
    }

    public void setLiqttr(BigDecimal liqttr) {
        this.liqttr = liqttr;
    }

    public String getLilots() {
        return lilots;
    }

    public void setLilots(String lilots) {
        this.lilots = lilots == null ? null : lilots.trim();
    }

    public Date getLilrcj() {
        return lilrcj;
    }

    public void setLilrcj(Date lilrcj) {
        this.lilrcj = lilrcj;
    }

    public BigDecimal getLiot1p() {
        return liot1p;
    }

    public void setLiot1p(BigDecimal liot1p) {
        this.liot1p = liot1p;
    }

    public BigDecimal getLiot2p() {
        return liot2p;
    }

    public void setLiot2p(BigDecimal liot2p) {
        this.liot2p = liot2p;
    }

    public BigDecimal getLiot1a() {
        return liot1a;
    }

    public void setLiot1a(BigDecimal liot1a) {
        this.liot1a = liot1a;
    }

    public BigDecimal getLiqtin() {
        return liqtin;
    }

    public void setLiqtin(BigDecimal liqtin) {
        this.liqtin = liqtin;
    }

    public BigDecimal getLiqto1() {
        return liqto1;
    }

    public void setLiqto1(BigDecimal liqto1) {
        this.liqto1 = liqto1;
    }

    public BigDecimal getLiqto2() {
        return liqto2;
    }

    public void setLiqto2(BigDecimal liqto2) {
        this.liqto2 = liqto2;
    }

    public BigDecimal getLiqonl() {
        return liqonl;
    }

    public void setLiqonl(BigDecimal liqonl) {
        this.liqonl = liqonl;
    }

    public BigDecimal getLiqtri() {
        return liqtri;
    }

    public void setLiqtri(BigDecimal liqtri) {
        this.liqtri = liqtri;
    }

    public BigDecimal getLiqtro() {
        return liqtro;
    }

    public void setLiqtro(BigDecimal liqtro) {
        this.liqtro = liqtro;
    }

    public Date getLincdj() {
        return lincdj;
    }

    public void setLincdj(Date lincdj) {
        this.lincdj = lincdj;
    }

    public BigDecimal getLiqty1() {
        return liqty1;
    }

    public void setLiqty1(BigDecimal liqty1) {
        this.liqty1 = liqty1;
    }

    public BigDecimal getLiqty2() {
        return liqty2;
    }

    public void setLiqty2(BigDecimal liqty2) {
        this.liqty2 = liqty2;
    }

    public Long getLicsid() {
        return licsid;
    }

    public void setLicsid(Long licsid) {
        this.licsid = licsid;
    }

    public String getLiurcd() {
        return liurcd;
    }

    public void setLiurcd(String liurcd) {
        this.liurcd = liurcd == null ? null : liurcd.trim();
    }

    public Date getLiurdt() {
        return liurdt;
    }

    public void setLiurdt(Date liurdt) {
        this.liurdt = liurdt;
    }

    public BigDecimal getLiurat() {
        return liurat;
    }

    public void setLiurat(BigDecimal liurat) {
        this.liurat = liurat;
    }

    public Long getLiurab() {
        return liurab;
    }

    public void setLiurab(Long liurab) {
        this.liurab = liurab;
    }

    public String getLiurrf() {
        return liurrf;
    }

    public void setLiurrf(String liurrf) {
        this.liurrf = liurrf == null ? null : liurrf.trim();
    }

    public String getLiuser() {
        return liuser;
    }

    public void setLiuser(String liuser) {
        this.liuser = liuser == null ? null : liuser.trim();
    }

    public Date getLiupmj() {
        return liupmj;
    }

    public void setLiupmj(Date liupmj) {
        this.liupmj = liupmj;
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