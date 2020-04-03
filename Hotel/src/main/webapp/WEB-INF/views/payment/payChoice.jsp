<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript"
	src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
</head>
<body>
	
	<form action='payment' method='post' name='paychoice'>
	주문내역:<input type='text' name='name' required> <br>
	결제금액:<input type='number' name='totalAmount' required> <br>
			<h1>구매자 확인</h1>
		이름:<input type='text' name='buyerName' required> <br>
		전화번호: <input type='text' name='buyerTel' required><br> 
		주소:<input type='text' name='buyerAddr' required><br>
		이메일:<input type='text' name='buyerEmail' required><br>
		우편번호:<input type='text' name='buyerPostcode' required><br>
		
		<select name='pg'>
			<option value='samsung'>삼성페이</option>
			<option value='card' selected>신용카드</option>
			<option value='trans'>실시간계좌이체</option>
			<option value='vbank'>가상계좌</option>
			<option value='phone'>휴대폰소액결제</option>
		</select> 
		
		<select name='paymentMethod'>
			<option value='kakao'>카카오페이</option>
			<option value='html5_inicis' selected>이니시스(웹표준결제)</option>
			<option value='nice'>나이스페이</option>
			<option value='jtnet'>제이티넷</option>
			<option value='uplus'>LG유플러스</option>
			<option value='danal'>다날</option>
			<option value='payco'>페이코</option>
			<option value='syrup'>시럽페이</option>
			<option value='paypal'>페이팔</option>
		</select>

		<button type="submit">결제하기</button>
		<input type='hidden' name='reservationStartDate' value='${reser.reservationStartDate}'>
		<input type='hidden' name='reservationFinishDate' value='${reser.reservationFinishDate}'><br>
	</form>

</body>
</html>