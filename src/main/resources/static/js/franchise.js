

//Top指標
$(window).scroll(function() {
    // 當滾動位置超過100像素時，顯示TOP按鈕；否則隱藏
    if ($(this).scrollTop() > 100) {
        $('#scrollToTopBtn').fadeIn();
    } else {
        $('#scrollToTopBtn').fadeOut();
    }
});

//點Top時，使用動畫效果將頁面滾動到頂部
function scrollToTop() {
    //將頁面的滾動位置移動到頂部 及 速度設定
    $('html, body').animate({scrollTop : 0}, 0);
}

function scrollToTop() {
    //將頁面的滾動位置移動到頂部 及 速度設定
    $('html, body').animate({ scrollTop: 0 }, 0);
}

function focusName(x){
    x.style.background="#f0e19e";
}
function blurName(y){
    y.style.background="#fff";
}

// function checkPhone() {
//     var phone = $("input[name='phone']").val();
//
//     //發送Http請求
//     $.ajax({
//         type: "POST",
//         url: "/franchise/checkPhoneNumber",
//         data: { phone: phone },              //傳遞要發送到後端的數據 phone
//         success: function(response) {  //response 是從後端回傳數據
//             if (response.exists) {
//                 $("#phoneStatus").text("電話號碼已被使用,請重新輸入!");
//             } else {
//                 $("#phoneStatus").text("電話號碼可以使用");
//             }
//         },
//         error: function(error) {
//             console.log("Error checking phone number: " + error);
//         }
//     });
// }

function checkPhone() {
    console.log("Checking phone...");
    var phone = $("input[name='phone']").val();

    // 檢查是否輸入了有效的電話號碼和是否為非空
    if (isValidPhoneNumber(phone)) {
        // 發送 Http 請求
        $.ajax({
            type: "POST",
            url: "/franchise/checkPhoneNumber",
            data: { phone: phone },
            success: function(response) {
                if (response.exists) {
                    $("#phoneStatus").text("該電話號碼已存在");
                } else {
                    $("#phoneStatus").text("該電話號碼可以使用");
                }
            },
            error: function(error) {
                console.log("Error checking phone number: " + error);
            }
        });
    } else {
        // 如果電話號碼無效或為空，清除狀態
        $("#phoneStatus").text("");
    }
}

function isValidPhoneNumber(phoneNumber) {
    // 使用正則表達式檢查電話號碼是否為有效格式（只包含數字）
    return phoneNumber !== null && phoneNumber.match(/^\d+$/);
}

