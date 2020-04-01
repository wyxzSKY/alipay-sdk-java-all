package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 充享惠卡模板二级项
 *
 * @author auto create
 * @since 1.0, 2020-02-10 17:58:34
 */
public class PayForPrivilegeCardTemplateSecondaryItem extends AlipayObject {

	private static final long serialVersionUID = 3398177554787193128L;

	/**
	 * 唯一表示该区域的key
	 */
	@ApiField("key")
	private String key;

	/**
	 * 二级区块标题
	 */
	@ApiField("label")
	private String label;

	/**
	 * 二级区块值
	 */
	@ApiField("value")
	private String value;

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public String getLabel() {
		return this.label;
	}
	public void setLabel(String label) {
		this.label = label;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}