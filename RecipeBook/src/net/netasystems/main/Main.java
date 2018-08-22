package net.netasystems.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import net.netasystems.recipebook.*;
import net.netasystems.recipebook.Process;

public class Main {
	public static void main(String[] args) {
		List<Ingredients> ingredientList = new ArrayList();
		Ingredients i1 = new Ingredients();
		i1.setDescription("azucar");
		i1.setQuantity("5");
		i1.setUnity("cdas");
		
		Ingredients i2 = new Ingredients();
		i2.setDescription("huevo");
		i2.setQuantity("2");
		i2.setUnity("Pzas");
		
		List <String> pasosLlenos = new ArrayList<String>();
		
		List<Process> processList = new LinkedList();
		
		Process p1 = new Process();
		Process pasos = new Process();
		pasos.addProcess("paso uno");	
		p1.addProcess("Empezamos .....");
		
		Recipe r = new Recipe("Dulce de leche", "Angel");
		r.addIngredients(i1);
		r.addProcess(pasos);
		
		Recipe r2 = new Recipe("Chiles rellenos","Miguel");
		r2.addIngredients(i2);
		r2.addProcess(p1);
		
		
		List <RecipeBook> recipeB = new ArrayList();
		RecipeBook rb = new RecipeBook("Cocina casera");
		
		rb.addRecipe(r);
		rb.addRecipe(r2);
		System.out.println(rb);
		
		rb.removeRecipe(r);
		
		System.out.println("##################################");
		System.out.println("Despues del metodo remove");
		System.out.println(rb);
		
		
		
		

		

	
			
			
		}

		
	

}
