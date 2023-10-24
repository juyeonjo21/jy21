package com.kh.spring21.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//카카오페이 준비
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class KakaoPayReadyRequestVO {
	private String partnerOrderId;
	private String partnerUserId;
	private String itemName;
	private int itemPrice;

}
