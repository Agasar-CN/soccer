package nchu.software.soccer.entity;

import java.util.Date;

public class Announce {
    private Integer pkAnnounceId;
    private Integer fkAnnounceAnty;
    private String announceTitle;
    private Date announceDate;
    private String announceContent;

    public Integer getPkAnnounceId() {
        return pkAnnounceId;
    }

    public void setPkAnnounceId(Integer pkAnnounceId) {
        this.pkAnnounceId = pkAnnounceId;
    }

    public Integer getFkAnnounceAnty() {
        return fkAnnounceAnty;
    }

    public void setFkAnnounceAnty(Integer fkAnnounceAnty) {
        this.fkAnnounceAnty = fkAnnounceAnty;
    }

    public String getAnnounceTitle() {
        return announceTitle;
    }

    public void setAnnounceTitle(String announceTitle) {
        this.announceTitle = announceTitle;
    }

    public Date getAnnounceDate() {
        return announceDate;
    }

    public void setAnnounceDate(Date announceDate) {
        this.announceDate = announceDate;
    }

    public String getAnnounceContent() {
        return announceContent;
    }

    public void setAnnounceContent(String announceContent) {
        this.announceContent = announceContent;
    }
}
