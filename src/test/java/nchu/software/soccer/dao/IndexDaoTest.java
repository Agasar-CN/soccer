package nchu.software.soccer.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class IndexDaoTest {

    @Autowired
    IndexDao indexDao;
    @Test
    public void selectAnnounceByTime() {
        indexDao.selectAnnounceByTime();
    }

    @Test
    public void selectArticleByIndex() {
        indexDao.selectArticleByIndex(0);
    }

    @Test
    public void countArticleNum() {
        indexDao.countArticleNum();
    }
}