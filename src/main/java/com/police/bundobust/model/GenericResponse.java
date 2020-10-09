package com.police.bundobust.model;

import java.util.UUID;

public class GenericResponse<T> {
	
	private String requestId=UUID.randomUUID().toString();
	private T data;
	private String msg;
	public String getRequestId() {
		return requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "GenericResponse [requestId=" + requestId + ", data=" + data + ", msg=" + msg + "]";
	}
	

}
