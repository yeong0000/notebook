/**
 * index.js
 */
document.addEventListener('DOMContentLoaded', () => {
    const btnChat = document.querySelector('#btnChat');
    btnChat.addEventListener('click',(e)=>{
        // chat.html로 이동하는 코드
        console.log("chat");
                location.href = '/chat';
    });
    
    const btnRecipe = document.querySelector('#btnRecipe');
    btnRecipe.addEventListener('click', (e)=>{
        // recipe.html 이동
        console.log("recipe");
            location.href = '/recipe';
    });
    
    
    
});
