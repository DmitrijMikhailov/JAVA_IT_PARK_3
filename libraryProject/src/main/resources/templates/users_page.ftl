<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<html>
<head>
    <title>News- Регистрация</title>
</head>
<body>
<#include 'common/header.ftl'/>
<table class="table table-hover">
    <thead>
    <tr>
        <th>ID</th>
        <th>Имя</th>
        <th>Дата регистрации</th>
        <th>Состояние</th>
        <th>Ссылка на профиль</th>
    </tr>
    <#list model.users as user>
     </thead>
    <tr>
        <td>${user.id}</td>
        <td>${user.name}</td>
        <td>${user.registrationTime}</td>
        <td>${user.state}</td>
        <td><a href="/users/${user.id}" class="badge badge-dark" style="
    padding-bottom: 2px;
    padding-top: 2px;
">Ссылка</a></td>
    </tr>
    </#list>
</table>
</body>
</html>