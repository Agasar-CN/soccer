package nchu.software.soccer.controller;

import nchu.software.soccer.entity.Announce;
import nchu.software.soccer.entity.Article;
import nchu.software.soccer.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/index")
public class IndexController {
    @Autowired
    IndexService indexService;
    @RequestMapping(value = "/notice",method = RequestMethod.GET)
    public List<Announce> loadNotice(){
        return indexService.selectAnnounceByTime();
    }

    @RequestMapping(value = "/article",method = RequestMethod.GET)
    public int loadArticle(){
        return indexService.countArticleNum();
    }
    @RequestMapping(value = "/article/{index}",method = RequestMethod.GET)
    public List<Article> loadArticlebyIndex(@PathVariable("index") int index){
        return indexService.selectArticleByIndex(index);
    }
}
