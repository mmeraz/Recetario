package net.netasystems.recipebook;



public class Ingredients {

		private String description;
		private String quantity;
		private String unity;
		
		public Ingredients() {
		}

	
	public Ingredients(String description, String quantity, String unity) {
		this.description = description;
		this.quantity = quantity;
		this.unity = unity;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public String getQuantity() {
		return quantity;
	}



	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}



	public String getUnity() {
		return unity;
	}



	public void setUnity(String unity) {
		this.unity = unity;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((quantity == null) ? 0 : quantity.hashCode());
		result = prime * result + ((unity == null) ? 0 : unity.hashCode());
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
		Ingredients other = (Ingredients) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (quantity == null) {
			if (other.quantity != null)
				return false;
		} else if (!quantity.equals(other.quantity))
			return false;
		if (unity == null) {
			if (other.unity != null)
				return false;
		} else if (!unity.equals(other.unity))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return  quantity+" "+ unity +" "+ description+"\n" ;
	}


	

	

}

	