package com.jspider.cardekho.entity;

public class Car {
		
		private int id;
		private String name;
		private String brand;
		private String model;
		private String colour;
		private String fueltype;
		private double price;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public String getColour() {
			return colour;
		}
		public void setColour(String colour) {
			this.colour = colour;
		}
		public String getFueltype() {
			return fueltype;
		}
		public void setFueltype(String fueltype) {
			this.fueltype = fueltype;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		@Override
		public String toString() {
			return "Car [id=" + id + ", name=" + name + ", brand=" + brand + ", model=" + model + ", colour=" + colour
					+ ", fueltype=" + fueltype + ", price=" + price + "]";
		}
		
}
		








