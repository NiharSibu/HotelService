package com.mindtree.HotelManagement.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class RoomDto {
	
	private int roomId;
	private String type;
	private String price;
	@JsonIgnoreProperties("rooms")
	private HotelDto hotel;
	
	public RoomDto() {
		super();
	}
	public RoomDto(int roomId, String type, String price, HotelDto hotel) {
		super();
		this.roomId = roomId;
		this.type = type;
		this.price = price;
		this.hotel = hotel;
	}
	public int getRoomId() {
		return roomId;
	}
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public HotelDto getHotel() {
		return hotel;
	}
	public void setHotel(HotelDto hotel) {
		this.hotel = hotel;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + roomId;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		RoomDto other = (RoomDto) obj;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (roomId != other.roomId)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	
	
}
