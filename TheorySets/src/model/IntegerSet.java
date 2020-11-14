package model;

import java.util.ArrayList;

public class IntegerSet {
		
	//Attributes
	private String name;
	private int cardinality;
	private ArrayList<Integer> elements;
	
//====================================================================================
	
	public IntegerSet(String name) {
		this.name = name;
		this.cardinality = 0;
		this.elements = new ArrayList<>();
	}//End integerSet

//====================================================================================
	
	public IntegerSet(){
		 this.name = new String();
		 this.cardinality = 0;
		 this.elements = new ArrayList<>();
	}//End IntegerSet

//====================================================================================
	
	//Setters and Getters
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCardinality() {
		return cardinality;
	}

	public void setCardinality(int cardinality) {
		this.cardinality = cardinality;
	}

	public ArrayList<Integer> getElements() {
		return elements;
	}

	public void setElements(ArrayList<Integer> elements) {
		this.elements = elements;
	}
	
	//End Setters and Getters
	
//====================================================================================
	
	public String addElement(int element){
		
		String msg = "Elemento ya existente en el conjunto.";
		
		if(!elements.contains(element)){
			elements.add(element);
			msg = "Elemento creado exitosamente.";
			
		}//End if
		return msg;
	}//End addElement
	
//====================================================================================
	
	public String removeElement(int element){
		
		String msg = "No se encontro ese elemento.";
		
		for(int i = 0; i < elements.size(); i++){
			if(elements.get(i) == element){
				elements.remove(i);
				msg = "Se ha removido el elemento.";
				
			}//End if
		}//End for
		return msg;
	}//End removeElement
	 
//====================================================================================
	
	public IntegerSet union(IntegerSet set, String newName){
		
		IntegerSet newObject = new IntegerSet(newName);
		
		newObject.getElements().addAll(elements);
		newObject.getElements().addAll(set.getElements());

		for(int i = 0; i < newObject.getElements().size(); i++){
			for(int j = 0 ; j < newObject.getElements().size(); j++) {
				if(newObject.getElements().get(i).equals(newObject.getElements().get(j))){
					newObject.getElements().remove(j);
					
				}//End if
			}//End for	
		}//End for		
		return newObject;
	}//End union
	
//====================================================================================
	
	public IntegerSet intersection(IntegerSet set, String newName){
		
		IntegerSet newObject = new IntegerSet(newName);
		
			for(int i = 0; i < elements.size() ; i++){
				for(int j = 0 ; j < set.getElements().size(); j++){
					if(elements.get(i).equals(set.getElements().get(j))){
					newObject.addElement(elements.get(i));
					
				}//End if
			}//End for	
		}//End for
		return newObject;
	}//End intersection
	
//====================================================================================

	
	public IntegerSet difference(IntegerSet set, String newName){
		
			IntegerSet newDifference = new IntegerSet(newName);	
			int aux = 0;
				
			for(int i = 0; i < elements.size() ; i++){	
				aux = 0;
				for(int j = 0 ; j < set.getElements().size(); j++){	
					if(!elements.get(i).equals(set.getElements().get(j))){
						aux++;
					}//End if
					if(aux == set.getElements().size()){
						newDifference.addElement(elements.get(i));
					
				}//End if
			}//End for	
		}//End for
		return newDifference;
	}//End difference

//====================================================================================

	public IntegerSet simetryDifference(IntegerSet set, String newName){
	
		IntegerSet newIntegerSet = new IntegerSet(newName);
		int aux = 0;
	
			for(int i = 0; i < elements.size() ; i++){
				aux = 0;
				for(int j = 0 ; j < set.getElements().size(); j++){	
					if(!elements.get(i).equals(set.getElements().get(j))){
						aux++;
					}//End if
					if(aux == set.getElements().size()){
						newIntegerSet.addElement(elements.get(i));
					}//End if
				}//End for
			}//End for
			
			for(int i = 0; i < set.getElements().size(); i++){
				aux = 0;
				for(int j = 0 ; j < elements.size(); j++){
					if(!set.getElements().get(i).equals(elements.get(j))){
						aux++;
					}//End if
					if(aux == elements.size()){
						newIntegerSet.addElement(set.getElements().get(i));
						
				}//End if
			}//End for	
		}//End for
	return newIntegerSet;
	}//End simetryDifference

//====================================================================================
	
	private String values(){
		String msg= "";
		
		for(int i = 0 ; i < elements.size() ; i++){
			msg += elements.get(i) + ", ";
		}//End for
		if(msg.length() >= 3){
			msg = "{" + msg.substring(0, msg.length() - 2) + "}";
		}//End if
		return msg;
	}//End values

//====================================================================================
	
	public String showContent(){
		String msg = "";
		
		msg += "============CONJUNTO============" + "\n";
		msg += "==Nombre: " + name + "\n";
		msg += "==Elementos: " + getCardinality() + "\n";
		msg += "==Valores: " + values() + "\n\n";
		msg += "================================" + "\n";
		return msg;
	}//End showContent
	
}//End IntegerSet Class
