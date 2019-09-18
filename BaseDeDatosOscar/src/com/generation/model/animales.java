package com.generation.model;

public class animales {
		private int idAnimales;
		private String nombre;
		private int edad;
		private String habitat;
		
		
		

		public animales() 
		{
			
		}
		
		public animales(int idAnimales, String nombre, int edad, String habitat) {
			super();
			this.idAnimales = idAnimales;
			this.nombre = nombre;
			this.edad = edad;
			this.habitat = habitat;
		}
		
		public int getIdAnimales() {
			return idAnimales;
		}

		public void setIdAnimales(int idAnimales) {
			this.idAnimales = idAnimales;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		public String getHabitat() {
			return habitat;
		}

		public void setHabitat(String habitat) {
			this.habitat = habitat;
		}

		
		
		
		@Override
		public String toString() {
			return "animales [idAnimales=" + idAnimales + ", nombre=" + nombre + ", edad=" + edad + ", habitat="
					+ habitat + ", getIdAnimales()=" + getIdAnimales() + ", getNombre()=" + getNombre() + ", getEdad()="
					+ getEdad() + ", getHabitat()=" + getHabitat() + ", getClass()=" + getClass() + ", hashCode()="
					+ hashCode() + ", toString()=" + super.toString() + "]";
		}
		
		
		
}
