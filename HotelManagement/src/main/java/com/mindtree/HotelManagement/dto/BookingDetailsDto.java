package com.mindtree.HotelManagement.dto;

public class BookingDetailsDto {
	
	private int BookingId;
	private int customerId;
	private String customerName;
	private String hotelName;
	private int roomID;
	private String roomType;
	private String date;
	private String roomPrise;
	
	
	
	public BookingDetailsDto() {
		super();
	}

	public BookingDetailsDto(int bookingId, int customerId, String customerName, String hotelName, int roomID,
			String roomType, String date,String roomPrise) {
		super();
		BookingId = bookingId;
		this.customerId = customerId;
		this.customerName = customerName;
		this.hotelName = hotelName;
		this.roomID = roomID;
		this.roomType = roomType;
		this.date = date;
		this.roomPrise=roomPrise;
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

	public String getRoomPrise() {
		return roomPrise;
	}

	public void setRoomPrise(String roomPrise) {
		this.roomPrise = roomPrise;
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
		BookingDetailsDto other = (BookingDetailsDto) obj;
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
		if (roomType == null) {
			if (other.roomType != null)
				return false;
		} else if (!roomType.equals(other.roomType))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BookingDetailsDto [BookingId=" + BookingId + ", customerId=" + customerId + ", customerName="
				+ customerName + ", hotelName=" + hotelName + ", roomID=" + roomID + ", roomType=" + roomType
				+ ", date=" + date + "]";
	}
	
}
