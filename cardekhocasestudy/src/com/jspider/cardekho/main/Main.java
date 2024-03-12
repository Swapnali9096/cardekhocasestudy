package com.jspider.cardekho.main;

import java.util.Scanner;

import com.jspider.cardekho.operation.Operation;

public class Main {
	



static boolean loop=true;
		static Operation op=new Operation();

		public static void main(String[] args) {
			while(loop) {
				mainMenu();
			}
		}
			
			public static void mainMenu()  {
			System.out.println("--------------MAIN MENU---------------\n"
					+"1. View all cars\n"
					+"2. Search cars\n"
					+"3. Add cars\n"
					+"4. Remove cars\n"
					+"5. Edit cars\n"
					+"6. Exit");
			Scanner sc=new Scanner(System.in);
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("--------View all cars-------\n");
				op.viewAllCars();
				break;
			case 2:
				System.out.println("---------Search cars-------\n"
						+"1. Search by car id\n"
						+"2. Search by name\n"
						+"3. Search by brand\n"
						+"4. Search by model\n"
						+ "5. Search by colour\n"
						+ "6. Search by fueltype\n"
						+ "7. Search by price");
				
				int choice1=sc.nextInt();
				switch(choice1) {
				case 1:
					System.out.println("Search By Cars Id");
					op.searchByCarId(sc);
					break;
				case 2:
					System.out.println("Search By Car Name");
					op.searchByCarName(sc);
					break;
				case 3:
					System.out.println("Search By Brand Name");
					op.searchByCarBrand(sc);
					break;
				case 4:
					System.out.println("Search Model Name");
					op.searchByCarModel(sc);
					break;
				case 5:
					System.out.println("Search By Colour ");
					op.searchByCarColour(sc);
					break;
				case 6:
					System.out.println("Search By Fueltype");
					op.searchByCarFueltype(sc);
					break;
				case 7:
					System.out.println("Search By Price");
					op.searchByCarPrice(sc);
					break;

				default:
					System.out.println("Invalid Choice. Please try again!!!");
					break;

				}
				mainMenu();
				
				break;
			case 3:
				System.out.println("------Add Cars------\n");
				op.addCar(sc);
				
				break;
			case 4:
				System.out.println("-----Remove Cars-----\n");
				op.removeCar(sc);
				break;
			case 5:
				System.out.println("-----Edit Cars-----\n");
				op.editCar(sc);
				break;
			case 6:
				System.out.println("Thank You!!");
				loop=false;
				break;
			default:
				System.out.println("Invalid Choice. Please try again!");
				break;
		
			}
			}


		}




