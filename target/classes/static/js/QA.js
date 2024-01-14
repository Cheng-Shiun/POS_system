$(document).ready(function(){
    $(window).scroll(function() {
        //點Top 將頁面滾動到頂部
        // 當滾動位置超過100像素時，顯示箭頭按鈕；否則隱藏
        if ($(this).scrollTop() > 100) {
            $('#scrollToTopBtn').fadeIn();
        } else {
            $('#scrollToTopBtn').fadeOut();
        }
    });
    //將頁面的滾動位置移動到頂部 及 速度設定
    $('#scrollToTopBtn').click(function() {
        $('html, body').animate({ scrollTop: 0 }, 0);
    });
    //初始載入先隱藏a/顯示q
    $('.a1,.a2,.a3,.a4,.a5,.a6').hide();
    $('.q1,.q2,.q3,.q4,.q5,.q6').show();
});

//點擊btn觸發事件
function bA(){
    $('.a1,.a2,.a3,.a4,.a5,.a6').hide();
    $('.q1,.q2,.q3,.q4,.q5,.q6').show();
}
function bD() {
    $('.q1, .q2, .q3, .q4, .q5, .q6, .a1, .a2, .a3, .a4, .a5, .a6').hide();
    $('.q1, .q2').show();
}
function bM() {
    $('.q1, .q2, .q3, .q4, .q5, .q6, .a1, .a2, .a3, .a4, .a5, .a6').hide();
    $('.q3, .q4').show();
}
function bO() {
    $('.q1, .q2, .q3, .q4, .q5, .q6, .a1, .a2, .a3, .a4, .a5, .a6').hide();
    $('.q5, .q6').show();
}

//點擊q1~q6的觸發設定
function showq1(){
    $('.a1').show();
    $('.a2,.a3,.a4,.a5,.a6').hide();
    $('.q1,.q2').show();
}
function showq2(){
    $('.a2').show();
    $('.a1,.a3,.a4,.a5,.a6').hide();
    $('.q1,.q2').show();
}

function showq3(){
    $('.a3').show();
    $('.a1,.a2,.a4,.a5,.a6').hide();
    $('.q3,.q4').show();
}
function showq4() {
    $('.a4').show();
    $('.a1,.a2,.a3,.a5,.a6').hide();
    $('.q3,.q4').show();
}
function showq5(){
    $('.a5').show();
    $('.a1,.a2,.a3,.a4,.a6').hide();
    $('.q5,.q6').show();
}
function showq6(){
    $('.a6').show();
    $('.a1,.a2,.a3,.a4,.a5').hide();
    $('.q5,.q6').show();
}

//設定btn點擊後的顯示效果
// function mouseDownAll(){
//     document.querySelector('.btnAll').style.background='#569c1a';
//     document.querySelector('.btnAll').style.color='#ffffff';
//
//     document.querySelector('.btnDk').style.borderColor='#d0d0d0';
//     document.querySelector('.btnDk').style.background='none';
//     document.querySelector('.btnDk').style.color='#d0d0d0';
//
//     document.querySelector('.btnMb').style.borderColor='#d0d0d0';
//     document.querySelector('.btnMb').style.background='none';
//     document.querySelector('.btnMb').style.color='#d0d0d0';
//
//     document.querySelector('.btnOd').style.borderColor='#d0d0d0';
//     document.querySelector('.btnOd').style.background='none';
//     document.querySelector('.btnOd').style.color='#d0d0d0';
// }
// function mouseDownDk(){
//     document.querySelector('.btnAll').style.borderColor='#d0d0d0';
//     document.querySelector('.btnAll').style.background='none';
//     document.querySelector('.btnAll').style.color='#d0d0d0';
//
//     document.querySelector('.btnDk').style.background='#569c1a';
//     document.querySelector('.btnDk').style.color='#ffffff';
//
//     document.querySelector('.btnMb').style.borderColor='#d0d0d0';
//     document.querySelector('.btnMb').style.background='none';
//     document.querySelector('.btnMb').style.color='#d0d0d0';
//
//     document.querySelector('.btnOd').style.borderColor='#d0d0d0';
//     document.querySelector('.btnOd').style.background='none';
//     document.querySelector('.btnOd').style.color='#d0d0d0';
// }
// function mouseDownMb(){
//     document.querySelector('.btnAll').style.borderColor='#d0d0d0';
//     document.querySelector('.btnAll').style.background='none';
//     document.querySelector('.btnAll').style.color='#d0d0d0';
//
//     document.querySelector('.btnDk').style.borderColor='#d0d0d0';
//     document.querySelector('.btnDk').style.background='none';
//     document.querySelector('.btnDk').style.color='#d0d0d0';
//
//     document.querySelector('.btnMb').style.background='#569c1a';
//     document.querySelector('.btnMb').style.color='#ffffff';
//
//     document.querySelector('.btnOd').style.borderColor='#d0d0d0';
//     document.querySelector('.btnAll').style.background='none';
//     document.querySelector('.btnOd').style.color='#d0d0d0';
// }
// function mouseDownOd(){
//     document.querySelector('.btnAll').style.borderColor='#d0d0d0';
//     document.querySelector('.btnAll').style.background='none';
//     document.querySelector('.btnAll').style.color='#d0d0d0';
//
//     document.querySelector('.btnDk').style.borderColor='#d0d0d0';
//     document.querySelector('.btnDk').style.background='none';
//     document.querySelector('.btnDk').style.color='#d0d0d0';
//
//     document.querySelector('.btnMb').style.borderColor='#d0d0d0';
//     document.querySelector('.btnMb').style.background='none';
//     document.querySelector('.btnMb').style.color='#d0d0d0';
//
//     document.querySelector('.btnOd').style.background='#569c1a';
//     document.querySelector('.btnOd').style.color='#ffffff';
// }

<!--以下 為上面的優化後寫法-->
//設定 指定按鈕 為 被點擊到 狀態
function setButtonStyle(buttonClass) {
    const buttons = ['.btnAll', '.btnDk', '.btnMb', '.btnOd'];

    for (const b of buttons) {     //利用for迴圈判斷每一個按鈕
        const e = document.querySelector(b);    //querySelector()固定寫法, 找符合指定選擇器的第一個元素
                                                                                        //將找到的b ,指派給e
        //若b是buttonClass(表示b在當下是被點擊到的狀態),則buttonClass、background、color就為 前者
        e.style.borderColor = b === buttonClass ? '#569c1a' : '#d0d0d0';
        e.style.background = b === buttonClass ? '#569c1a' : 'none';
        e.style.color = b === buttonClass ? '#ffffff' : '#d0d0d0';
    }
}

//重設所有按鈕的樣式
function resetButtonStyles() {
    const buttons = ['.btnAll', '.btnDk', '.btnMb', '.btnOd'];

    for (const bt of buttons) {     //利用for迴圈判斷每一個按鈕
        const el = document.querySelector(bt);    //querySelector()固定寫法, 找符合指定選擇器的第一個元素
                                                                                            //將找到的bt ,指派給el
        //將指派給el的 buttonClass、background、color設定如下
        el.style.borderColor = '#d0d0d0';
        el.style.background = 'none';
        el.style.color = '#d0d0d0';
    }
}
//"全部問題" 按鈕被按下時的動作 (先reset 再set 注意按下的先後順序)
function mouseDownAll() {
    resetButtonStyles();
    setButtonStyle('.btnAll');
}
//"飲品相關" 按鈕被按下時的動作 (先reset 再set 注意按下的先後順序)
function mouseDownDk() {
    resetButtonStyles();
    setButtonStyle('.btnDk');
}
//"品牌會員" 按鈕被按下時的動作 (先reset 再set 注意按下的先後順序)
function mouseDownMb() {
    resetButtonStyles();
    setButtonStyle('.btnMb');
}
//"網路訂餐" 按鈕被按下時的動作 (先reset 再set 注意按下的先後順序)
function mouseDownOd() {
    resetButtonStyles();
    setButtonStyle('.btnOd');
}
