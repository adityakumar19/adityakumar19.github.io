// After opening navbar the section should rotate by 10deg and perspective 50rem
document.querySelector('.menu').addEventListener('click',()=>{
    document.querySelectorAll('.target').forEach((item)=>{
        item.classList.toggle('change');
    });
});


// After clicking on section the navbar should close
document.querySelectorAll('.wrapper').forEach((item)=>{
    item.addEventListener('click',()=>{
        document.querySelectorAll('.target').forEach((item)=>{
            item.classList.remove("change");
        });
    });
});

//To play the videos
const videos = document.querySelectorAll('.video');

videos.forEach((video)=>{
    video.addEventListener('mouseover' , ()=>{
        video.play();
    });

    video.addEventListener('mouseout' , ()=>{
        video.pause();
    });
});