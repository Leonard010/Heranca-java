package Herança;

public class Aves extends Animal{
     public String bico;
     public String penas;
     public boolean podeVoar;
     public int envergaduraAsas;
     
     public String getBico() {
    	   return bico;
     }
     
     public String getPenas() {
    	   return penas;
     }
     
     public boolean getPodeVoar() {
    	   return podeVoar;
     }
     
     public int getEnvergaduraAsas() {
    	   return envergaduraAsas;
     }
     
     public void setPenas(String penas) {
    	   this.penas = penas;
     }
     
     public void setBico(String bico) {
    	   this.bico = bico;
     }
     
     public void setPodeVoar(boolean podeVoar) {
    	   this.podeVoar = podeVoar;
     }
     
     public void setEnvergaduraAsas(int envergaduraAsas) {
    	   this.envergaduraAsas = envergaduraAsas;
     }

	 @Override
	 public String toString() {
		return "Aves [bico=" + bico + ", penas=" + penas + ", podeVoar=" + podeVoar + ", envergaduraAsas="
				+ envergaduraAsas + ", nome=" + nome + ", tipo=" + tipo + ", idade=" + idade + ", peso=" + peso
				+ ", sexo=" + sexo + ", getBico()=" + getBico() + ", getPenas()=" + getPenas() + ", getPodeVoar()="
				+ getPodeVoar() + ", getEnvergaduraAsas()=" + getEnvergaduraAsas() + "]";
	 }
     
     
}
