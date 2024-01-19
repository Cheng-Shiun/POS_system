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



$(document).ready(function() {
    // 當輸入框失去焦點時觸發
    $("input[name='phone']").blur(function() {
        checkPhone();
    });
});


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



//檢查電話號碼 是否與DB的資料重覆
function checkPhone() {
    var phone = $("input[name='phone']").val();  //取得input[name='phone' 輸入值 並回傳

    // 檢查是否輸入了有效的電話號碼和是否為非空
    if (isValidPhoneNumber(phone)) {
        console.log("Phone sent to backend: " + phone);
        // 發送 Http 請求
        $.ajax({
            type: "POST",
            url: "/franchise/checkPhoneNumber",
            data: { phone: phone },
            success: function(response) {
                if (response) {
                    $("#phoneStatus").text("電話號碼已被使用,請重新輸入!");
                    $("#phoneStatus").css({"color": "#f00", "font-weight": "600"});
                } else {
                    $("#phoneStatus").text("該電話號碼可以使用");
                    $("#phoneStatus").css({"color": "#0e8719", "font-weight": "600"});
                }
            },
            error: function(error) {
                console.log("Error checking phone number: " + error);
            }
        });
    } else {
        // 如果電話號碼無效或為空，清除狀態
        $("#phoneStatus").text("請正確輸入手機或市話(含區碼)");
        $("#phoneStatus").css({"color": "#f00", "font-weight": "600"});
    }
}
function isValidPhoneNumber(phoneNumber) {
    // 使用正則表達式檢查電話號碼是否為有效格式-不能為空值、只包含數字、長度要9碼或10碼、號碼一定是0開始
    return phoneNumber !== null && phoneNumber.match(/^0\d{0,9}$/) && phoneNumber.length >=9 && phoneNumber.length<=10;
}

// //blur時 若姓名未填寫跳出訊息
// function validateName(){
//     var nampInput = document.getElementById('name');
//     var nameError=document.getElementById('nameError');
//     var nameValue = nampInput.value.trim();
//     if(nameValue ===''){
//         nameError.textContent='姓名未填寫喔!!';
//         $("#nameError").css({'color':'#f00','font-weight':'600'});
//     }else{
//         nameError.textContent=''; //有填寫後就清空提示訊息
//     }
// }
// //blur時 若地址未填寫跳出訊息
// function validateAddr(){
//     var addInput = document.getElementById('address');
//     var addError = document.getElementById("addrError");
//     var addrValue = addInput.value.trim();
//     if(addrValue ===''){
//         addError.textContent='地址未填寫喔!!';
//         $("#addrError").css({'color':'#f00','font-weight':'600'})
//     }else{
//         addError.textContent=''; //有填寫後就清空提示訊息
//     }
// }

//在input後顯示 訊息
// 將上面兩個方法做整合 因為這裡帶3個參數,html的name與address的方法,也要改成 validateInput(inputId, errorId, errorMessage)
// function checkInput(inputId, errorId, errorMessage) {
//     var input = document.getElementById(inputId); //宣告var input -- 輸入的值
//     var error = document.getElementById(errorId); //宣告var error -- 沒有輸入內容 跳Error
//     var value = input.value.trim();     //輸入框 的值 .trim()去除前後空白
//
//     if (value === '') {
//         error.textContent = errorMessage; //若輸入框 的值為 空 跳出errorMessage
//         $("#" + errorId).css({ 'color': '#f00', 'font-weight': '600' });
//     } else {
//         error.textContent = ''; // 有填寫後就清空error的提示訊息
//     }
// }
//
// //呼叫 checkInput
// checkInput('name', 'nameError', '姓名未填寫喔!!');
// checkInput('address', 'addrError', '地址未填寫喔!!');



//用sweetAlert2 來取代傳統Alert的跳出視窗
function checkInput(inputId, errorId, errorMessage) {
    var input = document.getElementById(inputId);
    var error = document.getElementById(errorId);
    var value = input.value.trim();

    if (value === '') {
        // 使用 SweetAlert2 顯示錯誤訊息
        Swal.fire({
            icon: 'error',
            title: 'Oops...',
            text: errorMessage,
        });
        // 同時設定錯誤訊息到 error 元素 //如果輸入正確，則不會在 input 的框後面跳出 errorMessage
        // error.textContent = errorMessage;
        // $("#" + errorId).css({ 'color': '#f00', 'font-weight': '600' });
    } else {
        error.textContent = ''; // 有填寫後就清空提示訊息
    }
}

// 呼叫 checkInput
checkInput('name', 'nameError', '姓名未填寫喔!!');
checkInput('address', 'addrError', '地址未填寫喔!!');
