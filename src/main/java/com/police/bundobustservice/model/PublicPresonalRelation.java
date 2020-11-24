package com.police.bundobustservice.model;

public class PublicPresonalRelation {

	
	private Boolean high;
	private Boolean normal;
	private Boolean low;
	public Boolean getHigh() {
		return high;
	}
	public void setHigh(Boolean high) {
		this.high = high;
	}
	public Boolean getNormal() {
		return normal;
	}
	public void setNormal(Boolean normal) {
		this.normal = normal;
	}
	public Boolean getLow() {
		return low;
	}
	public void setLow(Boolean low) {
		this.low = low;
	}
	@Override
	public String toString() {
		return "PublicPresonalRelation [high=" + high + ", normal=" + normal + ", low=" + low + "]";
	}
	
}
