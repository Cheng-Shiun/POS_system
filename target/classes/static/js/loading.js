function setupTypewriter(t, callback) {

    var HTML = t.innerHTML;
    t.innerHTML = "";

    var cursorPosition = 0,
        tag = "",
        writingTag = false,
        tagOpen = false,
        typeSpeed = 30,
        tempTypeSpeed = 0;

    var type = function() {
      
        if (writingTag === true) {
            tag += HTML[cursorPosition];
        }

        if (HTML[cursorPosition] === "<") {
            tempTypeSpeed = 0;

            if (tagOpen) {
                tagOpen = false;
                writingTag = true;
            } else {
                tag = "";
                tagOpen = true;
                writingTag = true;
                tag += HTML[cursorPosition];
            }

        }

        if (!writingTag && tagOpen) {
            tag.innerHTML += HTML[cursorPosition];
        }

        if (!writingTag && !tagOpen) {

            if (HTML[cursorPosition] === " ") {
                tempTypeSpeed = 0;
            }
            else {
                tempTypeSpeed = (Math.random() * typeSpeed) + 50;
            }

            t.innerHTML += HTML[cursorPosition];

        }
        
        if (writingTag === true && HTML[cursorPosition] === ">") {
            tempTypeSpeed = (Math.random() * typeSpeed) + 50;
            writingTag = false;

            if (tagOpen) {
                var newSpan = document.createElement("span");
                t.appendChild(newSpan);
                newSpan.innerHTML = tag;
                tag = newSpan.firstChild;
            }

        }

        cursorPosition += 1;

        if (cursorPosition < HTML.length - 1) {
            setTimeout(type, tempTypeSpeed);
        }else {

            if (typeof callback === "function") {
                callback();

                // 等待5秒后隐藏所有文字和图片，并显示一段文字
                setTimeout(function() {
                    document.querySelectorAll('.container, .preloader').forEach(el => {
                        el.style.display = 'none';
                    });

                    var newText = document.createElement('p');
                    newText.innerHTML = 'Welcome To 爪蛙';
                    newText.classList.add('new-text'); 
                    document.body.appendChild(newText);

                // 等待1秒后导航到另一个网站或URL
                setTimeout(function() {
                        window.location.assign('index');
                    }, 1000);
                    
                }, 6000);
            }
        }
    };

    return {
        type: type
    };
}

var typewriter = document.getElementById('typewriter');
typewriter = setupTypewriter(typewriter, startAnimations);
typewriter.type();

function startAnimations() {
    document.querySelectorAll('.preloader, .preloader__ring, .preloader__ring:nth-child(even)').forEach(el => {
        el.style.display = "block";
        el.style.animationPlayState = 'running';
    });
}