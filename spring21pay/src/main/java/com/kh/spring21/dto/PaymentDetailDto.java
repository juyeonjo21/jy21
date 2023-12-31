package com.kh.spring21.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class PaymentDetailDto {
	private int paymentDetailNo;//하위 결제번호
	private int paymentDetailOrigin;//상위 결제번호
	private int paymentDetailProduct; //구매 상품번호
	private String paymentDetailProductName; //구매 상품명
	private int paymentDetailProductPrice;//구매 상품가격
	private int paymentDetailProductQty;//구매 상품수량
	private String paymentDetailStatus;//구매 상품상태(완료/취소)
	
	//가상의 메소드 생성(이미 취소됐다면)
	public boolean isCanceled() {
		return paymentDetailStatus.equals("취소");
	}

}
