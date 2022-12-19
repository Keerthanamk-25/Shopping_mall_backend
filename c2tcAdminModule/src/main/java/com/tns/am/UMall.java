package com.tns.am;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class UMall {

	
		private int id;
		private String mallname;
		private String malladmin;
		private String malllocation;
		private String categories;
		private int shopid;
		
		
		
		public UMall() {
			super();
		}



		public UMall(int id, String mallname, String malladmin, String malllocation, String categories, int shopid) {
			super();
			this.id = id;
			this.mallname = mallname;
			this.malladmin = malladmin;
			this.malllocation = malllocation;
			this.categories = categories;
			this.shopid = shopid;
		}

@Id
@GeneratedValue
		public int getId() {
			return id;
		}



		public void setId(int id) {
			this.id = id;
		}



		public String getMallname() {
			return mallname;
		}



		public void setMallname(String mallname) {
			this.mallname = mallname;
		}



		public String getMalladmin() {
			return malladmin;
		}



		public void setMalladmin(String malladmin) {
			this.malladmin = malladmin;
		}



		public String getMalllocation() {
			return malllocation;
		}



		public void setMalllocation(String malllocation) {
			this.malllocation = malllocation;
		}



		public String getCategories() {
			return categories;
		}



		public void setCategories(String categories) {
			this.categories = categories;
		}



		public int getShopid() {
			return shopid;
		}



		public void setShopid(int shopid) {
			this.shopid = shopid;
		}



		@Override
		public String toString() {
			return "UMall [id=" + id + ", mallname=" + mallname + ", malladmin=" + malladmin + ", malllocation="
					+ malllocation + ", categories=" + categories + ", shopid=" + shopid + "]";
		}
		
		
}
