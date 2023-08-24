/**
 * chatting 구현
 */

 /**document.addEventListener('DOMContentLoaded', () => {
    const msgArea = document.getElementById('msgArea');
    const msgInput = document.getElementById('msg');
    const sendButton = document.getElementById('button-send');
    
    // WebSocket 연결
    const socket = new WebSocket('ws://localhost:8090/chat'); // 서버 주소에 맞게 수정
    
    socket.onopen = (event) => {
        console.log('WebSocket 연결 성공!');
    };
    
    socket.onmessage = (event) => {
        const message = event.data;
        msgArea.innerHTML += '<p>' + message + '</p>';
    };
    
    socket.onclose = (event) => {
        console.log('WebSocket 연결 종료');
    };
    
    // 메시지 전송
    btnSend.addEventListener('click', (e) => {
        const message = msgInput.value;
        socket.send(message);
        msgInput.value = '';
    });
    
    // Enter 키로도 메시지 전송 가능
    msgInput.addEventListener('keyup', (e) => {
        if (e.key === 'Enter') {
            btnSend.click();
        }
    });
});
*/

 