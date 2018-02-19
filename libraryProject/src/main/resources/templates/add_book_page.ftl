<#ftl encoding='UTF-8'>

<html>
<head>

    <title>Добавить новую книгу</title>

<#--<#include 'common/header.ftl'/>-->
    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script type="text/javascript" src="/js/main.js"></script>
</head>
<body>
        <#include 'common/header.ftl'/>

<br>
<br>

<br>
<div class="container">
<input type="text" class="form-control col-md-4" name="nameBook" placeholder="Название Книги"/>
<br>
<input type="text" class="form-control col-md-4" name="autorBook" placeholder="Автор Книги"/>
<br>
<input type="text" class="form-control col-md-4" name="gerne" placeholder="Жанр"/>
<br>
<input type="number" class="form-control col-md-4" name="ageExit" placeholder="Год выхода книги"/>
<br>
    <#--<input type="text" class="form-control col-md-6    " name="descriptionBook" placeholder="Описание книги"/>-->
    <textarea class="form-control col-md-6" name="descriptionBook" rows="3" placeholder="Описание книги"></textarea>
<br>
<br>
    <div class="custom-file">
        <input type="file" class="custom-file-input col-md-2" id="fileInput">
        <label class="custom-file-label col-md-6" for="fileInput">Choose file</label>

    </div>

    <br>
<button class="btn btn-outline-dark" name="uploadButton" onclick="
    uploadFile(
    document.getElementById('fileInput')['files'][0])" style="margin-top: 10px;  ">Загрузить
</button>

</div>
</body>

</html>