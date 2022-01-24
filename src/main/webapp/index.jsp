<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html>
<head>
    <title>欢迎信息系统</title>
</head>
<body>
<h2>新增个人信息</h2>
    <form action="/student/save">
        姓名<input type="text" name="name" /><br>
        性别<input type="radio" name ="sex"  value="0"/>男
            <input type="radio" name ="sex"  value="1"/>女<br>
        年龄<input type="text" name="age"/><br>
        籍贯<input type="text" name="birthPlace"/><br>
        学校<input type="text" name="gruateSchool"/><br>
        爱好<input type="text" name="bobby"/><br>
        <button type="submit">保存文件</button>
    </form>
    <form action="/student/test">
         <button type="submit">请求test</button>
    </form>
</body>
</html>
