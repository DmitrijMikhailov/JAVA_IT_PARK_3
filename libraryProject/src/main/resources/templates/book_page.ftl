<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>


<html>
<head>
    <link rel="stylesheet" href="/css/style.css">
    <#include 'common/header.ftl'/>
    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <title>Просмотр книги</title>
</head>
<body>

<div class="container col-md-6">
    <br>
    <h1>${model.book.nameBook}</h1>
    <h3>${model.book.autorBook}</h3>
    <h6>Год издания: ${model.book.ageExit}</h6>
    <p>Описание книги: </p>
    <p>${model.book.descriptionBook}</p>
    <br>
    <a href="/files/${model.book.storageName}" class="btn btn-outline-dark" role="button" aria-pressed="true">Download book</a>
    <br>
    <br>

    <#--<a href="#" class="btn btn-secondary btn-lg active" role="button" aria-pressed="true">Add book</a>-->
</div>

    </body>


</html>