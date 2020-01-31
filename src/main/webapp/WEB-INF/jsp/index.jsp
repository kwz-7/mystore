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
    <script type="text/javascript" src="https://code.jquery.com/j.query-3.2.1.min.js"></script>

    <script type="text/javascript" >
        var params={
            userId :1,
            productId :1,
            quantity:3
        };
        $.post("./purchase",params,function (result) {
            alert(result.message);
        })

    </script>
</head>
<body>
<h1 >开始抢购商品</h1>
<h2>准备好</h2>
</body>
</html>
