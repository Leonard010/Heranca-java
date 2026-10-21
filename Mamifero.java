package Herança;

public class Mamifero extends Animal {
	private String pelos;
	private String amamenta;
	private int temperatura;
	public void andar() {
		System.out.println("Andando");
	}
	
	public String getPelos() {
		   return pelos;
	   }
	
	public String getAmamenta() {
		return amamenta;
	}
	
	public int getTemperatura() {
		return temperatura;
	}
	
	public void setPelos(String pelos) {
		this.pelos = pelos;
	}
	
	public void setAmamenta(String amamenta) {
		this.amamenta = amamenta;
	}
	
	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	@Override
	public String toString() {
		return "Mámifero [pelos=" + pelos + ", amamenta=" + amamenta + ", temperatura=" + temperatura + ", nome=" + nome
				+ ", tipo=" + tipo + ", idade=" + idade + ", peso=" + peso + ", sexo=" + sexo + ", getPelos()="
				+ getPelos() + ", getAmamenta()=" + getAmamenta() + ", getTemperatura()=" + getTemperatura() + "]";
	}
    
	
	
}

   
