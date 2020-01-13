package com.zhongwang.data.common;

import com.alibaba.fastjson.JSON;

import java.util.UUID;

/**
 * 接口统一返回结果
 * @author zhangjp
 * created on 2019年7月2日 下午2:31:39
 */
public class ApiResult {

	private int code;
	
	private String msg;
	
	private Object data;
	
	private String requestId = UUID.randomUUID().toString().replaceAll("-", "");;
	
	public ApiResult() {}
	
	/**
	 * 判断请求是否成功
	 * @author zhangjp
	 * created on 2019年7月2日 下午2:49:19
	 * @return
	 */
	public boolean success() {
		return this.code == ResultCodes.SUCCESSS.getCode();
	}

	public ApiResult(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}
	
	public ApiResult(Object data) {
		this.code = ResultCodes.SUCCESSS.getCode();
		this.msg = ResultCodes.SUCCESSS.getMessage();
		this.data = data;
	}
	public ApiResult(Object data,int code) {
		this.code = code;
		this.msg = ResultCodes.SUCCESSS.getMessage();
		this.data = data;
	}
	public ApiResult(ResultCodes codeMsg){
		this.code = codeMsg.getCode();
		this.msg = codeMsg.getMessage();
		this.data = null;
	}

	public static ApiResult success(Object data){
		return new ApiResult(data);
	}
	public static ApiResult SUCCESS(Object data,int code){
		return new ApiResult(data,code);
	}

	public static ApiResult ERROR(String msg,Object data,int code){
		return new ApiResult(msg,data,code);
	}
	public ApiResult(String msg,Object data,int code) {
		this.code = code;
		this.msg = msg;
		this.data = data;
	}
	public static ApiResult error(ResultCodes codeMsg){
		if (codeMsg == null) {
			return null;
		}
		return new ApiResult(codeMsg);
	}


	public void setCode(int code) {
		this.code = code;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public int getCode() {
		return code;
	}
	public String getMsg() {
		return msg;
	}
	public Object getData() {
		return data;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("ApiResult {");
		builder.append("code=").append(code)
		.append(", msg=").append(msg)
		.append(", data=").append(data)
		.append(", requestId=").append(requestId)
		.append("}");
		return builder.toString();
	}
	
	public String toJSONString() {
		return JSON.toJSONString(this);
	}
	
}
