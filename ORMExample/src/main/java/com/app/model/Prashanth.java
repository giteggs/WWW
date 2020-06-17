package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="pradetails")
public class Prashanth {

 
		@Id
		@Column(name="prsid")
		private int prsId;
		@Column(name="prname")
		private String prName;
		@Column(name="prsalary")
		private Double prSalary;
		@Column(name="prdd")
		private String prAdd;
		public Prashanth() {
			super();
		}
		public int getPrsId() {
			return prsId;
		}
		public void setPrsId(int prsId) {
			this.prsId = prsId;
		}
		public String getPrName() {
			return prName;
		}
		public void setPrName(String prName) {
			this.prName = prName;
		}
		public Double getPrSalary() {
			return prSalary;
		}
		public void setPrSalary(Double prSalary) {
			this.prSalary = prSalary;
		}
		public String getPrAdd() {
			return prAdd;
		}
		public void setPrAdd(String prAdd) {
			this.prAdd = prAdd;
		}
		@Override
		public String toString() {
			return "Prashanth [prsId=" + prsId + ", prName=" + prName + ", prSalary=" + prSalary + ", prAdd=" + prAdd
					+ "]";
		
		 
			 

	}
		public Prashanth(int prsId, String prName, Double prSalary, String prAdd) {
			super();
			this.prsId = prsId;
			this.prName = prName;
			this.prSalary = prSalary;
			this.prAdd = prAdd;
		}




}
