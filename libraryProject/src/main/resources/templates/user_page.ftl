<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<html>
<head>
    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <title>Просмотр пользователя</title>
</head>
<body>

<script>
    <#--Функция принимает на вход два параметра - имя и фамилию -->
    function sendNewNameOrSurName(name, surname) {
        // Оотправляем ajax-запорс на сервер
        $.ajax({
            type: "POST",
            url: "/users/${model.user.id}",
            data: {
                "name": name,
                "surname": surname,
                "email": email,
                "state": state

            },
            error: function (data) {
                alert(data.status)
            },
            success: function (data) {
                alert("Wow!" + data.status)
            }
        });
    }
</script>
<br>
<br>
<div class="container">
    <input type="text" id="name" name="name" value="${model.user.name}"/>
    <input type="text" id="surname" name="surname" value="${model.user.surname}"/>
    <input type="text" id="email" name="email" value="${model.user.email}"/>
    <input type="text" id="state" name="state" value="${model.user.state}"/>
    <button onclick="sendNewNameOrSurName(
        document.getElementById('name').value,
        document.getElementById('surname').value,
        document.getElementById('email').value,
            document.getElementById('state').value)">Отправить</button>
</div>
</body>
</html>