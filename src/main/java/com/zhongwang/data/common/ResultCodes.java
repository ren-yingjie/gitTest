package com.zhongwang.data.common;

/**
 * 返回码枚举
 * @author zhangjp
 * created on 2019年7月2日 下午2:46:27
 */
public enum ResultCodes {
	/*********通用异常*********/
	SUCCESSS(0000, "请求成功"),

	ERROR(9999, "系统繁忙, 请稍后再试", "请求过程出现异常");
	
	private int code;
	
	private String message;
	
	private String explain;

	private ResultCodes(int code, String message) {
		this.code = code;
		this.message = message;
	}
	
	private ResultCodes(int code, String message, String explain) {
		this.code = code;
		this.message = message;
		this.explain = explain;
	}

	public ResultCodes fillArgs(Object...args){
		int code = this.code;
		String message = String.format(this.message, args);
		this.message = message;
		return this;
	}

	public int getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

	public String getExplain() {
		return explain;
	}


}
