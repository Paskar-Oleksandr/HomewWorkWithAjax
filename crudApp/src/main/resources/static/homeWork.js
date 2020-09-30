


$(document).ready(function() {
    $.ajax({
        url: "http://localhost:8080/homework"
    }).then(function(data, status, jqxhr) {
        $('.id').append(data.id);
        $('.firstName').append(data.content());
        $('.lastName').append(data.content());
        $('.email').append(data.content());
        console.log(jqxhr);
    });
});


