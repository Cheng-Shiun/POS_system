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
    // 初始隱藏中部和南部區域
    $('.cArea').hide();
    $('.sArea').hide();

    // 顯示北部區域
    showNorth();

    // 按鈕點擊事件
    $('#btnNorth').click(function () {
        showNorth();
    });

    $('#btnCentral').click(function () {
        showCentral();
    });

    $('#btnSouth').click(function () {
        showSouth();
    });
});

function showNorth() {
    // 隱藏所有區域
    $('.cArea').hide();
    $('.sArea').hide();
    // 顯示北部區域
    $('.nArea').show();
}

function showCentral() {
    // 隱藏所有區域
    $('.nArea').hide();
    $('.sArea').hide();
    // 顯示中部區域
    $('.cArea').show();
}

function showSouth() {
    // 隱藏所有區域
    $('.nArea').hide();
    $('.cArea').hide();
    // 顯示南部區域
    $('.sArea').show();
}