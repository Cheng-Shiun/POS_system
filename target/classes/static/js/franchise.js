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
    x.style.background="#d7d5cd";
}
function blurName(y){
    y.style.background="#fff";
}


function checkPhone() {
    var phone = $(".inputinfo[name='phone']").val();    // 取得輸入的號碼
    var phoneStatus = $(".inputinfo[name='phone']").next("#phoneStatus");


    // 檢查是否未輸入電話號碼
    if (phone.trim() === "") {
        phoneStatus.text("請輸入電話號碼");
        phoneStatus.css("color", "red");
        return;
    }

    // 發送AJAX(Http)請求
    $.ajax({
        type: "POST",
        url: "/checkPhone",
        data: { phone: phone },
        success: function(response) {
            console.log("Server response:", response);
            // 從controller來 傳相對的訊息
            if (response === "Duplicate phone number") {
                phoneStatus.text("電話號碼已被使用,請重新輸入!");
                phoneStatus.css("color", "red");
            } else{
                phoneStatus.text("號碼可用");
                phoneStatus.css("color", "green");
            }
        },
        error: function(xhr) {
            console.error("Error checking phone:", xhr.responseText);
        }
    });
}



$(document).ready(function() {
    // 當輸入框失去焦點時觸發
    $("input[name='phone']").blur(function() {
        checkPhone();
    });
});

function checkPhone() {
    var phone = $("input[name='phone']").val();

    // 檢查號碼是否未輸入
    if (phone === null || phone.trim() === "") {
        $("#phoneStatus").text("號碼還沒輸入喔~");
    } else {
        // 透過 AJAX 呼叫後端端點檢查號碼是否重複
        $.ajax({
            type: "POST",
            url: "/checkPhone",
            data: { phone: phone },
            success: function(response) {
                // 根據後端回應更新介面
                if (response === "Duplicate phone number") {
                    $("#phoneStatus").text("重複號碼，請重新輸入");
                } else {
                    $("#phoneStatus").text("號碼可使用");
                }
            },
            error: function(error) {
                console.log(error);
            }
        });
    }
}




//阻止在任何 input 按Enter後就送出表單
document.addEventListener("DOMContentLoaded",function (){
    //取得每個 input/textarea
    var inputElements = document.querySelectorAll('input','textarea');
    //加入keydown事件 監聽
    inputElements.forEach(function (element){
        element.addEventListener("keydown",function (e){
            if(e.key === "Enter"){
                e.preventDefault();
            }
        });
    });
});