const processing = document.querySelector('.processing-bar');
setTimeout(()=> {
    processing.style.opacity =1;
    processing.style.width =processing.
    getAttribute('data-bar')+'%';
},500)