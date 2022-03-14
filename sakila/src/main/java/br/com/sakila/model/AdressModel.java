package br.com.sakila.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "address",schema = "sakila")
public class AdressModel implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "address_id")
	private Integer AddressId;
	@Column(name = "district")
	private String District;
	@Column(name = "city_id")
	private String CityId;
	@Column(name = "last_update")
	private Date LastUpdate;
	
	public Integer getAddressId() {
		return AddressId;
	}
	public void setAddressId(Integer addressId) {
		AddressId = addressId;
	}
	public String getDistrict() {
		return District;
	}
	public void setDistrict(String district) {
		District = district;
	}
	public String getCityId() {
		return CityId;
	}
	public void setCityId(String cityId) {
		CityId = cityId;
	}
	public Date getLastUpdate() {
		return LastUpdate;
	}
	public void setLastUpdate(Date lastUpdate) {
		LastUpdate = lastUpdate;
	}
	
	

}
