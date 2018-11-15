package com.ssm.util;

public class MysqlPageUtils {
	private int page=1;
	private int size=1;
	private int limit;
	
	public MysqlPageUtils(int page,int size){
		this.page = page;
		this.size = size;
		this.limit = (page-1)*size;
	}

	public int getPage() {
		return page;
	}

	public int getSize() {
		return size;
	}

	public int getLimit() {
		return limit;
	}
}
