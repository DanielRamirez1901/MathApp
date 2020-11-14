package ui;

import java.util.Scanner;
import model.*;

public class Menu{
	
	private Scanner in;  //numbers
	private Scanner sc;  //text
	private MathApp set;

//=====================================================================================================
	public Menu(){
		
		in = new Scanner(System.in);
		sc = new Scanner(System.in);
		set = new MathApp();
		
	}//End Menu
	
//=====================================================================================================

	public void addSet(){
		
		System.out.print("Nombre del conjunto: ");
		String name = sc.nextLine();
		
		set.addSet(name);
	}//End addSet

//=====================================================================================================

	public void removeSet(){
		System.out.println("Porfavor escriba el nombre del conjunto que desea eliminar");
		System.out.print("Nombre: ");
		String name = sc.nextLine();
		
		set.removeSet(name);
	}//End removeSet

//=====================================================================================================

	public void addElementToSet(){
		int cont = 0;
		int element = 0;
		String name = "";
		
		System.out.println("Porfavor ingrese el nombre del conjunto");
		System.out.print("Nombre: ");
		name = sc.nextLine();
		
		System.out.println("¿Cuantos elementos desea agregar?");
		cont = in.nextInt();
		
		System.out.println("Porfavor digite los elementos");
		
		while(cont > 0){
			
			System.out.print("Elemento: ");
			element = in.nextInt();
			set.addElementToSet(name, element);
			cont--;
		}//End while
		
	}//End addElementToSet
	
//=====================================================================================================

	public void removeElementFromSet(){
		
		System.out.println("Porfavor ingrese el nombre del conjunto");
		System.out.print("Nombre: ");
		String name = sc.nextLine();
		System.out.println("Porfavor digite el elemento que desea eliminar");
		System.out.print("Numero: ");
		int element = in.nextInt();
		
		set.removeElementFromSet(name,element);
	}//End removeElementFromSet
	
//=====================================================================================================

	public void union(){
		
		System.out.println("Porfavor ingrese el nombre del primer conjunto");
		System.out.print("Nombre: ");
		String name1 = sc.nextLine();
		System.out.println("Porfavor ingrese el nombre del segundo conjunto");
		System.out.print("Nombre: ");
		String name2 = sc.nextLine();
		System.out.println("¿Que nombre desea colocarle a este nuevo conjunto union?");
		String newName = sc.nextLine();
		
		set.union(name1, name2, newName);
	}//End union
	
//=====================================================================================================

	public void difference(){
		
		System.out.println("Porfavor ingrese el nombre del primer conjunto");
		System.out.print("Nombre: ");
		String name1 = sc.nextLine();
		System.out.println("Porfavor ingrese el nombre del segundo conjunto");
		System.out.print("Nombre: ");
		String name2 = sc.nextLine();
		System.out.println("¿Que nombre desea colocarle a este nuevo conjunto diferencial?");
		String newName = sc.nextLine();
		
		set.difference(name1, name2, newName);
	}//End difference

//=====================================================================================================

	public void intersection(){
		
		System.out.println("Porfavor ingrese el nombre del primer conjunto");
		System.out.print("Nombre: ");
		String name1 = sc.nextLine();
		System.out.println("Porfavor ingrese el nombre del segundo conjunto");
		System.out.print("Nombre: ");
		String name2 = sc.nextLine();
		System.out.println("¿Que nombre desea colocarle a este nuevo conjunto interseccion?");
		String newName = sc.nextLine();
		
		set.intersection(name1, name2, newName);
	}//End intersection
	
//=====================================================================================================
	
	public void simetryDifference(){
		
		System.out.println("Porfavor ingrese el nombre del primer conjunto");
		System.out.print("Nombre: ");
		String name1 = sc.nextLine();
		System.out.println("Porfavor ingrese el nombre del segundo conjunto");
		System.out.print("Nombre: ");
		String name2 = sc.nextLine();
		System.out.println("¿Que nombre desea colocarle a este nuevo conjunto de diferencia simetrica?");
		String newName = sc.nextLine();
		
		set.simetryDifference(name1, name2, newName);
		
	}//End simetryDifference
	
//=====================================================================================================
	
	public void showInfoSet(){
		
		System.out.println("Porfavor ingrese el nombre del conjunto");
		System.out.print("Nombre: ");
		String name = sc.nextLine();
		
		System.out.print("");
		System.out.println(set.showInfoSet(name));
	}//End showInfoSet
	
//=====================================================================================================

	public void showInfoSets(){
		
		System.out.print("");
		System.out.println(set.showInfoSets());
		
	}//End showInfoSets
	
//=====================================================================================================

	public void startProgram(){
		
		int option = 0; 
		int cont = 0;
		
		while(option != 11){
			System.out.println("");
			System.out.println("A continuacion...selecciona la opcion que desees realizar");
			System.out.println("[1] Agregar nuevo conjunto.");
			
			if(cont > 0){
				System.out.println("[2] Eliminar conjunto.\n" + 
								   "[3] Agregar elemento a conjunto.\n" + 
								   "[4] Eliminar elemento de conjunto.");
				}//End if
			
			if(cont > 1){
				System.out.println("[5] Unir conjuntos.\n" +
							 	   "[6] Diferencia de conjuntos.\n" +
							 	   "[7] Diferencia simetrica de conjuntos.\n" + 
							 	   "[8] Interseccion de conjuntos.\n" +
							 	   "[9] Buscar y mostrar informacion de un conjunto.\n" +
							 	   "[10] Mostrar informacion de todos los conjuntos.\n" + 
							 	   "[11] Salir del programa.");
				}//End id
			
			option = in.nextInt();
			
			switch(option){
				
				case 1:
					System.out.println("Inicializando añadir conjunto...\n");
					addSet();

				break;
				
				case 2:
					System.out.println("Inicializando remover conjunto...\n");
					removeSet();
				
				break;
				
				case 3:
					System.out.println("Inicializando añadir elemento...\n");
					addElementToSet();
				
				break;
				
				case 4:
					System.out.println("Inicializando eliminar elemento...\n");
					removeElementFromSet();
				
				break;
				
				case 5:
					System.out.println("Inicializando unir conjuntos...\n");
					union();
				
				break;
				
				case 6:
					System.out.println("Inicializando diferenciacion de conjuntos...\n");
					difference();
					
				break;
				
				case 7:
					System.out.println("Inicializando diferencia simetrica de conjuntos...\n");

					simetryDifference();
				
				break;
				
				case 8:
					System.out.println("Inicializando interseccion de conjuntos...\n");
					intersection();
				
				break;
				
				case 9:
					System.out.println("Inicializando buscar y mostrar informacion de un conjunto...\n");
					showInfoSet();
				
				break;
				
				case 10:
					System.out.println("Inicializando mostrar la informacion de todos los conjuntos...\n");

					showInfoSets();
				
				break;
				
				case 11:
				
					System.out.println("Gracias por usar nuestro programa ^^");
					System.out.println("Finalizando programa...");

				
				break;
			
				default:
					System.out.println("Porfavor selecciona una de las opciones disponibles");
				break;
			}//End switch
			
			if(option == 1){
				cont++;
			}//end if
		}//End while
	}//End startProgram
	
}//End Menu Class