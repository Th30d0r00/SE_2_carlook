package org.hbrs.se2.demo.registration;

public class UserDTO {

	private String name;
	private String userID;
	private String password;
	private String gebDatum;
	private String address;
	private String country;



	private UserDTO(UserBuilder userBuilder) {
		this.name = userBuilder.name;
		this.userID = userBuilder.userID;
		this.password = userBuilder.password;
		this.gebDatum = userBuilder.gebDatum;
		this.address = userBuilder.address;
		this.country = userBuilder.country;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGebDatum() {
		return gebDatum;
	}
	public void setGebDatum(String gebDatum) {
		this.gebDatum = gebDatum;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "UserDTO [name=" + name + ", userID=" + userID + ", password=" + password + ", gebDatum=" + gebDatum
				+ ", [opt] address=" + address + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserDTO other = (UserDTO) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (gebDatum == null) {
			if (other.gebDatum != null)
				return false;
		} else if (!gebDatum.equals(other.gebDatum))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (userID == null) {
			if (other.userID != null)
				return false;
		} else if (!userID.equals(other.userID))
			return false;
		return true;
	}

	public static class UserBuilder {

		private String name;
		private String userID;
		private String password;
		private String gebDatum;
		private String address;
		private String country;

		//Pflicht Attribute
		public UserBuilder(String name, String userID, String password, String gebDatum, String address) {
			this.name = name;
			this.userID =
			this.password = password;
			this.gebDatum = gebDatum;
			this.address = address;
		}

		//Optionale Attribute
		public UserBuilder Country(String country) {
			this.country = country;
			return this;
		}

		public UserDTO build() {
			return new UserDTO(this);
		}
	}

}
