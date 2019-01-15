//1.$.ajax带json数据的异步请求
$(document).ready(function(){
       $.ajax({
            url:'/soccer/index/notice',
            type:'get',
            dataType:'json',
            success:function(data){
                for(var i=0;i<data.length;i++){
                    $("#notice").append("<li class=\"notice-list\">\n" +
                        "                        <a href=\"#\">\n" +
                        "                            <span class=\"notice-content\">"+data[i].announceTitle+"</span>\n" +
                        "                        </a>\n" +
                        "                    </li>");
                }
                console.log(data.length);
            },
            error:function(){
                alert("wrong");
            }
       });
    $.ajax({
        url:'/soccer/index/article',
        type:'get',
        dataType:'json',
        success:function(data){
            var pages=(data+5)/6;
            for(var i=1;i<=pages;i++){
                $("#index").append(" <li class=show-article><a>"+i+"</a></li>");
                if(i==6){
                    $("#index").append(" <li><a>"+">>"+"</a></li>");
                    break;
                }
            }
            console.log(data);
        },
        error:function(){
            alert("wrong");
        }
    });
    $.ajax({
        url:'/soccer/index/article/1',
        type:'get',
        dataType:'json',
        success:function(data){
            $("#articles").empty();
            for(var i=0;i<data.length;i++){
                $("#articles").append("<li>\n" +
                    "                                    <a href=\"#\">\n" +
                    "                                        <div class=\"news-pic\">\n" +
                    "                                            <img src=\"images/scrollImg1.jpg\" class=\"news-img\">\n" +
                    "                                            <p class=\"news-explain\">\n" +
                    "                                                <span>"+data[0].articleTitle+"</span>\n" +
                    "                                                <span>"+data[0].articleTime+"</span>\n" +
                    "                                            </p>\n" +
                    "                                        </div>\n" +
                    "                                    </a>\n" +
                    "                                </li>")
                if(i==5)
                    break;
            }
            console.log(data);
        },
        error:function(){
            alert("wrong");
        }
    });
    $("ul").on("click","li.show-article",function(){
        var url="/soccer/index/article/"+this.innerText;
        $.ajax({
            url:url,
            type:'get',
            dataType:'json',
            success:function(data){
                    $("#articles").empty();
                for(var i=0;i<data.length;i++){
                    $("#articles").append("<li>\n" +
                        "                                    <a href=\"#\">\n" +
                        "                                        <div class=\"news-pic\">\n" +
                        "                                            <img src=\"images/scrollImg1.jpg\" class=\"news-img\">\n" +
                        "                                            <p class=\"news-explain\">\n" +
                        "                                                <span>"+data[0].articleTitle+"</span>\n" +
                        "                                                <span>"+data[0].articleTime+"</span>\n" +
                        "                                            </p>\n" +
                        "                                        </div>\n" +
                        "                                    </a>\n" +
                        "                                </li>")
                    if(i==5)
                        break;
                }
                console.log(data);
            },
            error:function(){
                alert("wrong");
            }
        });
    });
});

