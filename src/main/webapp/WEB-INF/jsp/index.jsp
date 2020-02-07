<%--
  Created by IntelliJ IDEA.
  User: FireCode
  Date: 2020/1/27
  Time: 14:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试抢购商品</title>
    <script type="text/javascript" src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.7.2.min.js"></script>

    <script type="text/javascript" >
        for(var i=1 ;i<=10000;i++){
            var params={
                userId :1,
                productId :1234,
                quantity:1
            };

            $.post("./purchase",params,function (result) {
              /*  alert("购买成功");*/
            })
        }
        alert("购买成功");

    </script>
</head>
<body>
<h1 >开始抢购商品</h1>
<h2>准备好</h2>
</body>
</html>
