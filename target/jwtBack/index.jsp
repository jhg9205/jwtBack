<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<script src="https://code.jquery.com/jquery-3.6.1.js" integrity="sha256-3zlB5s2uwoUzrXK3BT7AX3FyvojsraNFxCc2vC/7pNI=" crossorigin="anonymous"></script>
<script>

    function sendInfo () {
        let jsonObj = {};
        const id = document.getElementById("id").value;
        const pw = document.getElementById("pw").value;
        jsonObj.id = id;
        jsonObj.pw = pw;
        console.log(jsonObj);
        $.ajax({
            type:"POST",
            async: false,
            url: "/login/jwt",
            contentType: 'application/json; charset=utf-8',
            dataType: 'json',
            data : JSON.stringify(jsonObj),
            error: function(e){
                alert(e);
            },
            success: function(data){
                alert(data);
            }
        })
    }


</script>
<body>
<h2>Hello World!</h2>
<div>

    <input type="text" placeholder="아이디를 입력해주세요" id="id"/>
    <input type="password" placeholder="비밀번호를 입력해주세요" id="pw"/>
    <button onclick="sendInfo()">로그인</button>
</div>
</body>
</html>
