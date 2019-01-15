package nchu.software.soccer.entity;

import java.util.Date;

public class Article {
    private int pkArticleID;
    private int fk_ArticleUser;
    private String articleTitle;
    private String articleUrl;
    private String articleContent;
    private Date articleTime;
    private String articleIp;
    private int articleClick;
    private int articleFavour;
    private int articleUp;

    public int getPkArticleID() {
        return pkArticleID;
    }

    public void setPkArticleID(int pkArticleID) {
        this.pkArticleID = pkArticleID;
    }

    public int getFk_ArticleUser() {
        return fk_ArticleUser;
    }

    public void setFk_ArticleUser(int fk_ArticleUser) {
        this.fk_ArticleUser = fk_ArticleUser;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleUrl() {
        return articleUrl;
    }

    public void setArticleUrl(String articleUrl) {
        this.articleUrl = articleUrl;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    public Date getArticleTime() {
        return articleTime;
    }

    public void setArticleTime(Date articleTime) {
        this.articleTime = articleTime;
    }

    public String getArticleIp() {
        return articleIp;
    }

    public void setArticleIp(String articleIp) {
        this.articleIp = articleIp;
    }

    public int getArticleClick() {
        return articleClick;
    }

    public void setArticleClick(int articleClick) {
        this.articleClick = articleClick;
    }

    public int getArticleFavour() {
        return articleFavour;
    }

    public void setArticleFavour(int articleFavour) {
        this.articleFavour = articleFavour;
    }

    public int getArticleUp() {
        return articleUp;
    }

    public void setArticleUp(int articleUp) {
        this.articleUp = articleUp;
    }
}
