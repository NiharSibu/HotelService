package com.mindtree.HotelManagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BookingDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="BOOKING_ID")
	private int BookingId;
	@Column(name="CUSTOMER_ID")
	private int customerId;
	@Column(name="CUSTOMER_NAME")
	private String customerName;
	@Column(name="HOTEL_NAME")
	private String hotelName;
	@Column(name="ROOM_ID")
	private int roomID;
	@Column(name="ROOM_TYPE")
	private String roomType;
	@Column(name = "DATE")
	private String date;
	@Column(name = "ROOM_PRICE")
	private String roomPrice;
	
	public BookingDetails() {
		super();
	}
	public BookingDetails(int bookingId, int customerId, String customerName, String hotelName, int roomID,
			String roomType, String date,String roomPrice) {
		super();
		BookingId = bookingId;
		this.customerId = customerId;
		this.customerName = customerName;
		this.hotelName = hotelName;
		this.roomID = roomID;
		this.roomType = roomType;
		this.date = date;
		this.roomPrice=roomPrice;
	}
	
	public int getBookingId() {
		return BookingId;
	}
	public void setBookingId(int bookingId) {
		BookingId = bookingId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public int getRoomID() {
		return roomID;
	}
	public void setRoomID(int roomID) {
		this.roomID = roomID;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	

	public String getRoomPrice() {
		return roomPrice;
	}
	public void setRoomPrice(String roomPrice) {
		this.roomPrice = roomPrice;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + BookingId;
		result = prime * result + customerId;
		result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((hotelName == null) ? 0 : hotelName.hashCode());
		result = prime * result + roomID;
		result = prime * result + ((roomPrice == null) ? 0 : roomPrice.hashCode());
		result = prime * result + ((roomType == null) ? 0 : roomType.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookingDetails other = (BookingDetails) obj;
		if (BookingId != other.BookingId)
			return false;
		if (customerId != other.customerId)
			return false;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (hotelName == null) {
			if (other.hotelName != null)
				return false;
		} else if (!hotelName.equals(other.hotelName))
			return false;
		if (roomID != other.roomID)
			return false;
		if (roomPrice == null) {
			if (other.roomPrice != null)
				return false;
		} else if (!roomPrice.equals(other.roomPrice))
			return false;
		if (roomType == null) {
			if (other.roomType != null)
				return false;
		} else if (!roomType.equals(other.roomType))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "BookingDetails [BookingId=" + BookingId + ", customerId=" + customerId + ", customerName="
				+ customerName + ", hotelName=" + hotelName + ", roomID=" + roomID + ", roomType=" + roomType
				+ ", date=" + date + ", roomPrice=" + roomPrice + "]";
	}

	
		
}
