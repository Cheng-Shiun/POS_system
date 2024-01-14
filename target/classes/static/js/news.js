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

//button觸發
$(document).ready(function () {
    // 初始隱藏優惠活動和最新上市
    $('#newActivity').hide();
    $('#newProduct').hide();

    // 顯示新店開幕
    showOpen();

    // 按鈕點擊事件
    $('#btnOpen').click(function () {
        showOpen();
    });

    $('#btnActivity').click(function () {
        showActivity();
    });

    $('#btnProduct').click(function () {
        showProduct();
    });
});

function showOpen() {
    // 初始隱藏優惠活動和最新上市
    $('#newActivity').hide();
    $('#newProduct').hide();

    // 顯示新店開幕
    $('#newOpen').show();
}

function showActivity() {
    // 隱藏所有區域
    $('#newOpen').hide();
    $('#newProduct').hide();
    // 顯示中部區域
    $('#newActivity').show();
}

function showProduct() {
    // 隱藏所有區域
    $('#newOpen').hide();
    $('#newActivity').hide();
    // 顯示南部區域
    $('#newProduct').show();
}