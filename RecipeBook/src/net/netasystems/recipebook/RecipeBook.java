package net.netasystems.recipebook;

import java.util.ArrayList;
import java.util.List;

public class RecipeBook {
	
	private String name;
	private List<Recipe> recipeList;
	private int idRecipeBook;
	private static int counterRecipeBook;
	
	
	public RecipeBook(String name) {
		this.name = name;
		recipeList = new ArrayList();
	}
	
	public RecipeBook(String name, List<Recipe> rl) {
		super();
		this.idRecipeBook = ++counterRecipeBook;
		this.name = name;
		this.recipeList = rl;
	}
	
	public void addRecipe(Recipe r) {
		if(r == null) {
			System.out.println("No hay receta para agregar");
		}else {
			recipeList.add(r);
		}
	}
	
	public void removeRecipe(Recipe r) {
		for(Recipe r1: recipeList) {
			r.getName().equals(r1);
		}
		
		recipeList.remove(r);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Recipe> getRecipeList() {
		return recipeList;
	}

	public void setRecipeList(List<Recipe> recipeList) {
		this.recipeList = recipeList;
	}

	public int getIdRecipeBook() {
		return idRecipeBook;
	}

	public void setIdRecipeBook(int idRecipeBook) {
		this.idRecipeBook = idRecipeBook;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idRecipeBook;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((recipeList == null) ? 0 : recipeList.hashCode());
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
		RecipeBook other = (RecipeBook) obj;
		if (idRecipeBook != other.idRecipeBook)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (recipeList == null) {
			if (other.recipeList != null)
				return false;
		} else if (!recipeList.equals(other.recipeList))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Recetario: " + name +"\n" + recipeList+"\n\n";
	}

}
