//滑鼠移入/移出到h2事件
$(function (){
    $("h2").hover(
        function (){
            $(this).css('text-shadow',	'0px 5px 25px #74DC60');
            $(this).css('color','#CCD90D');
        },
        function (){
            $(this).css('text-shadow',	'0px 0px 0px ');
            $(this).css('color','#000000')
         }
    );
});

//Top指標
$(window).scroll(function() {
    // 當滾動位置超過100像素時，顯示箭頭按鈕；否則隱藏
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


// 頁面載入時執行
$(document).ready(function () {
    // 初始化右邊下拉選單
    rightDropdown();

    // 地區選擇改變 而觸發的事件
    $("#countrySelect").change(function () {
        // 依新選的地區重新填充右邊下拉選單-->回到初始化
        rightDropdown();
    });
});

// 初始化頁面
window.onload = function() {
    rightDropdown();
};

function rightDropdown() {
    var countrySelect = document.getElementById('countrySelect');
    var regionsSelect = document.getElementById('regionsSelect');

    // 清空右邊下拉選單的內容
    regionsSelect.innerHTML = '';

    // 根據選擇的地區動態生成選項
    var selectedCountry = countrySelect.value;
    var regionOptions;

    switch (selectedCountry) {
        case '台灣':
            regionOptions = ['北部地區', '中部地區', '南部地區', '離島部地區'];
            break;
        case '日本':
            regionOptions = ['北海道地區', '關東地區', '東北地區', '近畿地區'];
            break;
        case '中國':
            regionOptions = ['北京地區', '上海地區', '廣東地區', '四川地區', '重慶地區'];
            break;
        default:
            regionOptions = [];
    }


    // 將動態生成的選項加入右邊下拉選單
    regionOptions.forEach(function (region) {
        var option = document.createElement('option');
        option.value = region;
        option.text = region;
        regionsSelect.add(option);
    });
}