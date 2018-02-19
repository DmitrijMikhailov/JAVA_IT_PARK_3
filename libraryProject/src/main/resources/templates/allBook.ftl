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
    <th scope="col">ID</th>
    <th scope="col">Автор</th>
    <th scope="col">Жанр</th>
    <th scope="col">Название</th>
    <th scope="col">Год Издания</th>
    <th scope="col">Ссылка на книгу</th>
</tr>
     <#list model.books as book>

    </thead>


    <tbody>

    <tr>
        <th scope="row">${book.id}</th>

        <td>${book.autorBook}</td>
        <td>${book.gerne}</td>
        <td>${book.nameBook}</td>
        <td>${book.ageExit}</td>
        <td><a href="/book/${book.id}" class="badge badge-dark" style="
    padding-bottom: 2px;
    padding-top: 2px;
">Ссылка</a></td>
    </tr>
    </#list>
</tbody>
</table>

</body>
</html>