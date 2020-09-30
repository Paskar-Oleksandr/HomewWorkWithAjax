


$(document).ready(function() {
    $.ajax({
        url: "http://localhost:8080/homework"
    }).then(function(data, status, jqxhr) {
        $('.id').append(data.id);
        $('.firstName').append(data.firstName);
        $('.lastName').append(data.lastName);
        $('.email').append(data.email);
        console.log(jqxhr);
    });
});


