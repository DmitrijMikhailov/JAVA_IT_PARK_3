function uploadFile(file) {

    var formData = new FormData();
    formData.append("file", file);
    formData.append("nameBook", $('input[name="nameBook"]').val());
    formData.append("autorBook", $('input[name="autorBook"]').val());
    formData.append("gerne", $('input[name="gerne"]').val());
    formData.append("ageExit", $('input[name="ageExit"]').val());
    formData.append("descriptionBook", $('textarea[name="descriptionBook"]').val());

    $.ajax({
        type: "POST",
        url: "/files",
        data: formData,
        contentType: false,
        processData: false,
        success: function (data) {
            alert(data);
        },
        error: function (data) {
            alert(data.status);
        }
    })
}


$(document).ready(function () {

    $("#btnSubmit").click(function (event) {

        //stop submit the form, we will post it manually.
        event.preventDefault();

        fire_ajax_submit();

    });

});

function fire_ajax_submit() {

    // Get form
    var form = $('#fileUploadForm')[0];

    var data = new FormData(form);

    data.append("CustomField", "This is some extra data, testing");

    $("#btnSubmit").prop("disabled", true);

    $.ajax({
        type: "POST",
        enctype: 'multipart/form-data',
        url: "/api/upload/multi",
        data: data,
        //http://api.jquery.com/jQuery.ajax/
        //https://developer.mozilla.org/en-US/docs/Web/API/FormData/Using_FormData_Objects
        processData: false, //prevent jQuery from automatically transforming the data into a query string
        contentType: false,
        cache: false,
        timeout: 600000,
        success: function (data) {

            $("#result").text(data);
            console.log("SUCCESS : ", data);
            $("#btnSubmit").prop("disabled", false);

        },
        error: function (e) {

            $("#result").text(e.responseText);
            console.log("ERROR : ", e);
            $("#btnSubmit").prop("disabled", false);

        }
    });

}