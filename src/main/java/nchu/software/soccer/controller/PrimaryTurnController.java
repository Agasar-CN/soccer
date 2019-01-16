package nchu.software.soccer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class PrimaryTurnController {
    //日志输出
    private static final Logger logger=LoggerFactory.getLogger(PrimaryTurnController.class);
    @RequestMapping("/")
    public String host(HttpServletRequest request) {
        logger.info("用户访问:"+request.getSession().getCreationTime());
        return "index.html";
    }
}
