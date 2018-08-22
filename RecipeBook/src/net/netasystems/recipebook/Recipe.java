package net.netasystems.recipebook;

import java.util.ArrayList;
import java.util.List;

public class Recipe {

	private String name;
	private String author;
	private List<Process> process;
	private List<Ingredients> ingredients;
	private int idRecipe;
	private static int counterRecipe;
	private List<String> step;
	
	
	public Recipe(String name, String author) {
		this.name = name;
		this.author = author;
		ingredients = new ArrayList();
		process = new ArrayList();
	}
	
	public Recipe(String name, String author,List<Process> p,List<Ingredients> i) {
		super();
		this.idRecipe = ++counterRecipe;
		this.name = name;
		this.author = author;
		this.process = p;
		this.ingredients = i;
	}

	public void addIngredients(Ingredients i) {
		if(i == null){
			System.out.println("No hay ingredientes ingreselos");
		}else {
		ingredients.add(i);
		}
	}
	
	public void addProcess(Process p) {
		if(p==null) {
			System.out.println("tu pasos no se encontraron...");
		}else {
		process.add(p);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public List<Process> getProcess() {
		return process;
	}

	public void setProcess(List<Process> process) {
		this.process = process;
	}

	public List<Ingredients> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<Ingredients> ingredients) {
		this.ingredients = ingredients;
	}

	
	public List<String> getStep() {
		return step;
	}

	public void setStep(List<String> step) {
		this.step = step;
	}

	public int getIdRecipe() {
		return idRecipe;
	}

	public void setIdRecipe(int idRecipe) {
		this.idRecipe = idRecipe;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + idRecipe;
		result = prime * result + ((ingredients == null) ? 0 : ingredients.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((process == null) ? 0 : process.hashCode());
		result = prime * result + ((step == null) ? 0 : step.hashCode());
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
		Recipe other = (Recipe) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (idRecipe != other.idRecipe)
			return false;
		if (ingredients == null) {
			if (other.ingredients != null)
				return false;
		} else if (!ingredients.equals(other.ingredients))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (process == null) {
			if (other.process != null)
				return false;
		} else if (!process.equals(other.process))
			return false;
		if (step == null) {
			if (other.step != null)
				return false;
		} else if (!step.equals(other.step))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Nombre de la receta: "+name + "\n autor: " + author+"\n" +"Ingredientes \n"+ ingredients +"\n" + process+"\n\n";
	}




	
	
	
}
