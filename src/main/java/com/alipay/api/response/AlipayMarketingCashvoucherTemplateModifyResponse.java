package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.cashvoucher.template.modify response.
 * 
 * @author auto create
 * @since 1.0, 2018-09-17 10:53:25
 */
public class AlipayMarketingCashvoucherTemplateModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4333814996881984591L;

	/** 
	 * 模板修改时的状态，I表示草稿状态所有入参都修改了，S表示生效状态仅修改了publish_end_time
	 */
	@ApiField("status")
	private String status;

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
