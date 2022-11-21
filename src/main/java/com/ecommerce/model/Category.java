package com.ecommerce.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {
	
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int catid;
		private String catname;
		

		
		
		public int getCatid() {
			return catid;
		}
		public void setCatid(int catid) {
			this.catid = catid;
		}
		public String getCatname() {
			return catname;
		}
		public void setCatname(String catname) {
			this.catname = catname;
		}
		
			
		
		
}
