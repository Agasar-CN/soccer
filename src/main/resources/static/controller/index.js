//1.$.ajax带json数据的异步请求
var currentPage=1;
var lastPage=1;
var curPageLast=1;
var curPageFirst=1;
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
           showIndex(data);
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
    $("ul").on("click","li.show-article",function () {
        showArticles($(this).text());
    });
    $("ul").on("click","#first-page",function(){
        if(currentPage!=1)
            showArticles(1);
    });
    $("ul").on("click","#last-page",function(){
        if(currentPage!=lastPage)
            showArticles(lastPage);
    });
    $("ul").on("click","#index-start",function(){
        flushLastIndex();
    });
    $("ul").on("click","#index-end",function(){
        flushNextIndex();
    });
});

function showIndex(data) {
    var pages=parseInt((data+5)/6);
    lastPage=pages;
    var temp= pages<4?pages:4;
    curPageLast=temp;
    curPageFirst=1;
    for(var i=temp;i>=1;i--)
        $("#index-start").after(" <li class=show-article><a>"+i+"</a></li>");
    console.log(data);
}
function flushNextIndex() {
    if(curPageLast<lastPage){
        $("li.show-article").remove();
        var temp=lastPage-curPageLast<4?(lastPage-curPageLast):4;
        for(var i=temp;i>=1;i--)
            $("#index-start").after(" <li class=show-article><a>"+(curPageLast+i)+"</a></li>");
        currentPage=curPageLast+1;
        curPageFirst=curPageLast+1;
        curPageLast=curPageLast+temp;
        showArticles(currentPage);
    }
}
function flushLastIndex() {
    if(curPageFirst>1){
        $("li.show-article").remove();
        for(var i=1;i<=4;i++)
            $("#index-start").after(" <li class=show-article><a>"+(curPageFirst-i)+"</a></li>");
        curPageLast=curPageFirst-1;
        currentPage=curPageFirst-1;
        curPageFirst=curPageFirst-4;
        showArticles(currentPage);
    }
}
function showArticles(index){
    var url="/soccer/index/article/"+index;
    currentPage=index;
    $("#current-page").empty();
    $("#current-page").append("<a>当前："+currentPage+"</a>");
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
            console.log(data.length);
        },
        error:function(){
            alert("wrong");
        }
    });
};

