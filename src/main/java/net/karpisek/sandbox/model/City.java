package net.karpisek.sandbox.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "cities")
@Entity
public class City {

    @Id
    private String geonameid;

    private String name;
    private String country; 
    private String subcountry;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getSubcountry() {
		return subcountry;
	}
	public void setSubcountry(String subcountry) {
		this.subcountry = subcountry;
	}
	public String getGeonameid() {
		return geonameid;
	}
	@Override
	public String toString() {
		return "City [name=" + name + ", country=" + country + ", subcountry=" + subcountry
				+ ", geonameid=" + geonameid + "]";
	}

}