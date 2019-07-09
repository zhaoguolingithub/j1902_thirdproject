package com.qf.j1902.pojo;

public class Carbrand {
    private Integer brandid;

    private String brandname;

    private String otherbrandname;

    private String englishbrandname;

    private Integer countryid;

    private String logourl;

    private String logomeaning;

    private String firstchar;

    private String nameallspell;

    private String introduction;

    private String salestatus;

    private String isenabled;

    private String isremoved;

    private String createbrandtime;

    private String updatebrandtime;

    private String syncbrandtime;

    public Integer getBrandid() {
        return brandid;
    }

    public void setBrandid(Integer brandid) {
        this.brandid = brandid;
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname == null ? null : brandname.trim();
    }

    public String getOtherbrandname() {
        return otherbrandname;
    }

    public void setOtherbrandname(String otherbrandname) {
        this.otherbrandname = otherbrandname == null ? null : otherbrandname.trim();
    }

    public String getEnglishbrandname() {
        return englishbrandname;
    }

    public void setEnglishbrandname(String englishbrandname) {
        this.englishbrandname = englishbrandname == null ? null : englishbrandname.trim();
    }

    public Integer getCountryid() {
        return countryid;
    }

    public void setCountryid(Integer countryid) {
        this.countryid = countryid;
    }

    public String getLogourl() {
        return logourl;
    }

    public void setLogourl(String logourl) {
        this.logourl = logourl == null ? null : logourl.trim();
    }

    public String getLogomeaning() {
        return logomeaning;
    }

    public void setLogomeaning(String logomeaning) {
        this.logomeaning = logomeaning == null ? null : logomeaning.trim();
    }

    public String getFirstchar() {
        return firstchar;
    }

    public void setFirstchar(String firstchar) {
        this.firstchar = firstchar == null ? null : firstchar.trim();
    }

    public String getNameallspell() {
        return nameallspell;
    }

    public void setNameallspell(String nameallspell) {
        this.nameallspell = nameallspell == null ? null : nameallspell.trim();
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public String getSalestatus() {
        return salestatus;
    }

    public void setSalestatus(String salestatus) {
        this.salestatus = salestatus == null ? null : salestatus.trim();
    }

    public String getIsenabled() {
        return isenabled;
    }

    public void setIsenabled(String isenabled) {
        this.isenabled = isenabled == null ? null : isenabled.trim();
    }

    public String getIsremoved() {
        return isremoved;
    }

    public void setIsremoved(String isremoved) {
        this.isremoved = isremoved == null ? null : isremoved.trim();
    }

    public String getCreatebrandtime() {
        return createbrandtime;
    }

    public void setCreatebrandtime(String createbrandtime) {
        this.createbrandtime = createbrandtime == null ? null : createbrandtime.trim();
    }

    public String getUpdatebrandtime() {
        return updatebrandtime;
    }

    public void setUpdatebrandtime(String updatebrandtime) {
        this.updatebrandtime = updatebrandtime == null ? null : updatebrandtime.trim();
    }

    public String getSyncbrandtime() {
        return syncbrandtime;
    }

    public void setSyncbrandtime(String syncbrandtime) {
        this.syncbrandtime = syncbrandtime == null ? null : syncbrandtime.trim();
    }
}