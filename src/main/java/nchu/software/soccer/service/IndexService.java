package nchu.software.soccer.service;

import nchu.software.soccer.entity.Announce;
import nchu.software.soccer.entity.Article;

import java.util.List;

public interface IndexService {
    List<Announce> selectAnnounceByTime();
    List<Article> selectArticleByIndex(int index);
    int countArticleNum();
}
