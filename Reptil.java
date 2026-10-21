package Herança;

public class Reptil extends Animal {
     private String escamas;
     private String tipo;
     private int tamanho;
     public void movimento() {
    	    System.out.println("Rastejando");   
    	 }
     
     public String getEscamas() {
    	    return escamas;
     }
     
     public String getTipo() {
    	    return tipo;
     }
     
     public int getTamanho() {
    	   return tamanho;
     }
     
     public void setEscamas(String escamas) {
    	   this.escamas = escamas;
     }
     
     public void setTipo(String tipo) {
    	  this.tipo = tipo;
     }
     
     public void setTamanho(int tamanho) {
    	 this.tamanho = tamanho;
     }

	 @Override
	 public String toString() {
		return "Reptil [escamas=" + escamas + ", tipo=" + tipo + ", tamanho=" + tamanho + ", nome=" + nome + ", idade="
				+ idade + ", peso=" + peso + ", sexo=" + sexo + ", getEscamas()=" + getEscamas() + ", getTipo()="
				+ getTipo() + ", getTamanho()=" + getTamanho() + "]";
	 }
     
     
}
