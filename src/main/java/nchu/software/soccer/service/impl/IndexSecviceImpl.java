package nchu.software.soccer.service.impl;

import nchu.software.soccer.dao.IndexDao;
import nchu.software.soccer.entity.Announce;
import nchu.software.soccer.entity.Article;
import nchu.software.soccer.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IndexSecviceImpl implements IndexService {
    @Autowired
    IndexDao indexDao;
    @Override
    public List<Announce> selectAnnounceByTime() {
        return indexDao.selectAnnounceByTime();
    }
    public List<Article> selectArticleByIndex(int index){
        return indexDao.selectArticleByIndex((index-1)*6);
    };
    public int countArticleNum(){
        return indexDao.countArticleNum();
    }
}
