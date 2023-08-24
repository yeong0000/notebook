<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>review</title>
    <link
        href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
        rel="stylesheet"
        integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ"
        crossorigin="anonymous">

    </head>
    <body>
        <div class="container-fluid">
            <header class="my-2 p-5 text-center text-bg-dark">
                <h1>리뷰작성페이지</h1>
            </header>

    <main class="my-2">
        <div class="card">
            <form method="post">

        <div class="ReviewWritingPage__Row">
        <strong class="RestaurantSubMessage__RestaurantName">남부</strong>
        <div class="RestaurantSubMessage__SubMessageWrap">
            <span class="RestaurantSubMessage__SubMessage">에 대한 솔직한 리뷰를 써주세요.</span>
        </div>
        <link href="/static/css/star.css" rel="stylesheet" />

        <form class="mb-3" name="myform" id="myform" method="post">
        <fieldset>
        <span class="text-bold"></span> 
        <input type="radio" name="reviewStar" value="5" id="rate1">
            <label for="rate1">★</label> 
        <input type="radio" name="reviewStar" value="4" id="rate2">
            <label for="rate2">★</label> 
        <input type="radio" name="reviewStar" value="3" id="rate3">
            <label for="rate3">★</label> 
        <input type="radio" name="reviewStar" value="2" id="rate4">
            <label for="rate4">★</label> 
        <input type="radio" name="reviewStar" value="1" id="rate5">
            <label for="rate5">★</label>
       </fieldset>
       
      </form>
      <textarea class="ReviewEditor__Editor" maxlength="10000"
       style="overflow: hidden; overflow-wrap: break-word; height: 150px;"
       placeholder="아영님, 주문하신 메뉴는 어떠셨나요? 식당의 분위기와 서비스도 궁금해요!"></textarea>
     </div>

     <p class="ReviewEditor__TextLengthStateBox">
      <span class="ReviewEditor__CurrentTextLength">0</span> <span
       class="ReviewEditor__TextLengthStateDivider">/</span> <span
       class="ReviewEditor__MaxTextLength">10,000</span>
     </p>
   </div>
 </div>

 <div class="ReviewWritingPage__PictureWrap">
  <div class="ReviewPictureCounter"
   style="top: 93px; left: 89px; display: block;">
   <span class="ReviewPictureCounter__CurrentLength">0</span> <span
    class="ReviewPictureCounter__Divider">/</span> <span
    class="ReviewPictureCounter__MaxLength">20</span>
  </div>

  <div class="DraggablePictureContainer">
   <ul class="DraggablePictureContainer__PictureList muuri"
    style="height: 98px;">
    <li
     class="DraggablePictureContainer__PictureItem DraggablePictureContainer__PictureItem--button muuri-item muuri-item-shown dz-clickable"
     style="left: 0px; top: 0px; transform: translateX(0px) translateY(0px); display: block; touch-action: none; user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);">
     <button class="DraggablePictureContainer__AddButton"
      style="opacity: 1; transform: scale(1);">
      <i class="DraggablePictureContainer__AddIcon"></i>
     </button>
    </li>
   </ul>

   <div class="DraggablePictureContainer__GuideLayer">
    <span class="DraggablePictureContainer__GuideMessage">사진을 여기에
     놓으세요.</span>
   </div>
  </div>
 </div>
 </div>
 </div>




 <div class="find-btn">
  <button type="button" class="btn btn-navy navbar-btn find-btn1"
   onclick="location.href='/login'">임시저장</button>
  <button type="button" class="btn btn-navy navbar-btn find-btn1"
   onclick="location.href='/login'">저장</button>
  <button type="button" class="btn btn-grey navbar-btn find-btn1"
   onclick="location.href='/findIdPw'">취소</button>
 </div>
 </form>
 </div>
 </main>


 <script
  src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"
  integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe"
  crossorigin="anonymous">
		
	</script>
 </div>
</body>
</html>