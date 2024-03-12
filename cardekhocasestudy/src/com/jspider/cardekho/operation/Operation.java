package com.jspider.cardekho.operation;

import java.util.ArrayList;
import java.util.Scanner;

import com.jspider.cardekho.entity.Car;

public class Operation {


	private ArrayList<Car> cars = new ArrayList<>();

	public void viewAllCars() {
		for (Car car : cars) {
			System.out.println(car);
		}
	}

	public void searchByCarId(Scanner sc) {
		System.out.println("search by id method ");
		boolean flag=false;
		for (Car car : cars) {
			int id = sc.nextInt();
			if (car.getId() == id) {
				System.out.println(car);
				flag=true;
				break;
			}
			} 
		if(!flag) {
				System.out.println("car not found");
			
		}
	}

	public void searchByCarName(Scanner sc) {
		System.out.println("search by name method ");
		
		for (Car car : cars) {
			String name = sc.next();
			if (car.getName()==name) {
				System.out.println(car);
				break;
			} else {
				System.out.println("car not found");
			}
		}

	}

	public void searchByCarBrand(Scanner sc) {
		System.out.println("search by brand method ");
		for (Car car : cars) {
			String brand = sc.next();
			if (car.getBrand()==brand) {
				System.out.println(car);
				break;

			} else {
				System.out.println("car not found");
			}
		}

	}

	public void searchByCarModel(Scanner sc) {
		System.out.println("search by model method ");
		for (Car car : cars) {
			String model = sc.next();
			if (car.getModel()==model) {
				System.out.println(car);
				break;

			} else {
				System.out.println("car not found");
			}
		}

	}

	public void searchByCarColour(Scanner sc) {
		System.out.println("search by colour method ");
		for (Car car : cars) {
			String colour = sc.next();
			if (car.getColour()==colour) {
				System.out.println(car);
				break;

			} else {
				System.out.println("car not found");
			}
		}

	}

	public void searchByCarFueltype(Scanner sc) {
		System.out.println("search by fueltype method ");
		for (Car car : cars) {
			String fueltype = sc.next();
			if (car.getFueltype()==fueltype) {
				System.out.println(car);
				break;

			} else {
				System.out.println("car not found");
			}
		}

	}

	public void searchByCarPrice(Scanner sc) {
		System.out.println("search by price method ");
		for (Car car : cars) {
			double price = sc.nextDouble();
			if (car.getPrice()==price) {
				System.out.println(car);
				break;

			} else {
				System.out.println("car not found");
			}
		}

	}

	public void addCar(Scanner sc) {
		System.out.println("How many cars you want to add");
		int choice = sc.nextInt();
		for (int i = 1; i <= choice; i++) {
			Car car = new Car();
			System.out.println("Enter Id:");
			car.setId(sc.nextInt());
			System.out.println("Enter name:");
			car.setName(sc.next());
			System.out.println("Enter Brand:");
			car.setBrand(sc.next());
			System.out.println("Enter Model:");
			car.setModel(sc.next());
			System.out.println("Enter Colour");
			car.setColour(sc.next());
			System.out.println("Enter Fueltype:");
			car.setFueltype(sc.next());
			System.out.println("Enter Price:");
			car.setPrice(sc.nextDouble());
			cars.add(car);
			System.out.println("car added");

		}
	}

	public void removeCar(Scanner sc) {
		viewAllCars();
		System.out.println("How many cars you want to remove");
		System.out.println("Enter car id you want to delete:");
		int id = sc.nextInt();

		for (Car car:cars) {
             if(car.getId()==id) {


			cars.remove(car);
			break;
			}
			System.out.println("car removed successfully");
		}


	}

	public void editCar(Scanner sc) {
		viewAllCars();
		System.out.println("edit car details");

		for (Car car:cars) {
			System.out.println("Enter Id:");
              car.setId(sc.nextInt());
  			System.out.println("Enter name:");
  			car.setName(sc.next());
  			System.out.println("Enter Brand:");
  			car.setBrand(sc.next());
  			System.out.println("Enter Model:");
  			car.setModel(sc.next());
  			System.out.println("Enter Colour");
  			car.setColour(sc.next());
  			System.out.println("Enter Fueltype:");
  			car.setFueltype(sc.next());
  			System.out.println("Enter Price:");
  			car.setPrice(sc.nextDouble());


             }
	}

}
