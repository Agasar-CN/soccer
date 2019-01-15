package nchu.software.soccer.dao;

import nchu.software.soccer.entity.Announce;
import nchu.software.soccer.entity.Article;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface IndexDao {
    //选取要展示的的公告
    @Select("SELECT * FROM announce ORDER BY announce_date DESC LIMIT 0,10;")
    List<Announce> selectAnnounceByTime();

    @Select("SELECT * From article ORDER BY article_time DESC LIMIT ${index},6;")
    List<Article> selectArticleByIndex(@Param("index")int index);

    @Select("SELECT count(*) From article")
    int countArticleNum();
}
