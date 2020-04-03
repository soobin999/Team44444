<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript"
	src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
<script type="text/javascript"
	src="https://service.iamport.kr/js/iamport.payment-1.1.2.js"></script>

<script type="text/javascript">
	var IMP = window.IMP;
	IMP.init("imp90900653");
	
	function requestPay() {
		var data = new Array();
		$.each($('td'),function(item,value){
			data.push($(this).val());
		});
		var now = new Date();
		var nowTime = now.getFullYear();
		nowTime += '-' + (now.getMonth() + 1) ;
		nowTime += '-' + now.getDate();
		
		IMP.request_pay({
			pg : 'card', 
			pay_method : "${pay.paymentMethod}", 
			merchant_uid : 'merchant_' + new Date().getTime(),
			name : $('#buyerName').text(),
			amount : ( ($('#totalAmount').text()) /2 ) ,
			buyer_email : $('#buyerEmail').text() , 
			buyer_name : $('#buyerName').text(), 
			buyer_tel : $('#payment.buyerTel').text(), 
			buyer_addr : $('#payment.buyerAddr').text(), 
			buyer_postcode : $('#payment.buyerPostcode').text(), 
		}, function(rsp) {
			if (rsp.success) {
				$.ajax({
					url : '/paymentComplete' , 
					method: 'POST' ,
					dataType: 'JSON',
					data : {
						'customer.customerID' : 'a',
						'paymentMethod' : '${pay.paymentMethod}',
						'reservationStartDate' : $('#reservationStartDate').text(),
						'reservationFinishDate' : $('#reservationFinishDate').text(), 
						'reservationDate' : nowTime,
						'imp_uid' : rsp.imp_uid,
						'merchant_uid' : rsp.merchant_uid,
						'totalAmount' : $('#totalAmount').text(), 
						'room.roomTypeTable.roomType' : 'suite room'
					},
					success : function(){
						alert("결제가 완료되었습니다.홈으로 이동합니다.");
						location.href = "/index";
						},
						error : function(){
							alert('ajax 실패')
						}
						
					})
			} else {
				alert("결제에 실패하였습니다. 에러 내용: " + rsp.error_msg);
			}
		});
	}
</script>

<title>Home</title>

</head>
<body>
	<h2>결제확인</h2>
	<table border=1>
		<thead>
			<tr>
				<th>결제수단</th>
				<th>예약하실객실</th>
				<th>체크인날짜</th>
				<th>체크아웃날짜</th>
				<th>총금액</th>
				<th>구매자 이메일</th>
				<th>구매자 이름</th>
				<th>구매자 전화번호</th>
				<th>구매자 주소</th>
				<th>우편번호</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td id="pg">${payment.pg}</td>
				<td id="buyerName">${payment.buyerName}</td>
				<td id="reservationStartDate">${reser.reservationStartDate}</td>
				<td id="reservationFinishDate">${reser.reservationFinishDate}</td>
				<td id="totalAmount">${reser.totalAmount}</td>
				<td id="buyerEmail">${payment.buyerEmail}</td>
				<td id="buyerName">${payment.buyerName}</td>
				<td id="buyerTel">${payment.buyerTel}</td>
				<td id="buyerAddr">${payment.buyerAddr}</td>
				<td id="buyerPostcode">${payment.buyerPostcode}</td>
			</tr>
		</tbody>
	</table>
	지금 결제하시는 금액은 예약금으로 나머지는 현장에서 결제하시면 됩니다.
	<button onclick="requestPay()">결제하기</button>
</body>
</html>