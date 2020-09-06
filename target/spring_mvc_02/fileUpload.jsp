<%--
  Created by IntelliJ IDEA.
  User: echo lovely
  Date: 2020/9/5
  Time: 19:37
  文件上传测试 demo
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>File Upload Demo..</title>
</head>
<body>

    <form method="post" enctype="multipart/form-data" action="fileUpload1">
        name: <input type="text" name="name" /> <br/>
        file: <input type="file" name="fileUpload" /> <br/>
        <input type="submit" value="upload">
    </form>

    <br/>

    多文件上传：

    <form method="post" enctype="multipart/form-data" action="fileUpload2">
        file1 <input type="file" name="uploadFiles"> <br/>
        file2 <input type="file" name="uploadFiles"> <br/>
        <input type="submit" value="upload">
    </form>

</body>
</html>
