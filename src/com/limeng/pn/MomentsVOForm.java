package com.limeng.pn;

import java.util.List;

public class MomentsVOForm {

	/**
	 * 当前页数
	 */
	private int currentPage = 1;

	/**
	 * 页面显示大小
	 */
	private int pageSize = 10;
	
	private boolean isMyFavorites;
	
	private List<String> types;
	

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public List<String> getTypes() {
		return types;
	}

	public void setTypes(List<String> types) {
		this.types = types;
	}

	public boolean isMyFavorites() {
		return isMyFavorites;
	}

	public void setMyFavorites(boolean isMyFavorites) {
		this.isMyFavorites = isMyFavorites;
	}
	
	
}
