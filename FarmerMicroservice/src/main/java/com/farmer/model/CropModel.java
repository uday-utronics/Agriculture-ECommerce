package com.farmer.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Crops")
public class CropModel {

	/*
	 * enum cType{ fruit,vegetable }
	 */
	private String farmerId;
	@Id
	private String cropId;
	private String cropName;
	private String cropLocation;
	private double cropQty;
	private String cropType;
	
	
	
	
	public CropModel() {
		super();
	}
	
	public CropModel(String farmerId, String cropId, String cropName, String cropLocation, double cropQty,
			String cropType) {
		super();
		this.farmerId = farmerId;
		this.cropId = cropId;
		this.cropName = cropName;
		this.cropLocation = cropLocation;
		this.cropQty = cropQty;
		this.cropType = cropType;
	}
	public String getCropId() {
		return cropId;
	}
	public void setCropId(String cropId) {
		this.cropId = cropId;
	}
	public String getFarmerId() {
		return farmerId;
	}
	public void setFarmerId(String farmerId) {
		this.farmerId = farmerId;
	}
	public String getCropName() {
		return cropName;
	}
	public void setCropName(String cropName) {
		this.cropName = cropName;
	}
	public String getCropLocation() {
		return cropLocation;
	}
	public void setCropLocation(String cropLocation) {
		this.cropLocation = cropLocation;
	}
	public double getCropQty() {
		return cropQty;
	}
	public void setCropQty(double cropQty) {
		this.cropQty = cropQty;
	}
	public String getCropType() {
		return cropType;
	}
	public void setCropType(String cropType) {
		this.cropType = cropType;
	}
	
	
}
