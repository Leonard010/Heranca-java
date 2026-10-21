package Herança;

public class Main {
   public static void main(String[] args) {
	Animal a = new Animal();
	a.setNome("Joel");
	a.setIdade(12);
	a.setPeso(6);
	a.setSexo("M");
	a.setTipo("Mámifero");
	
	System.out.print(a.toString());
	
	Mamifero m = new Mamifero();
	m.setNome("Max");
	m.setIdade(10);
	m.setPeso(8);
	m.setSexo("F");
	m.setTipo("Cachorro");
	m.setAmamenta("Não");
	m.setPelos("Sim");
	m.setTemperatura(14);
	m.andar();
	
	System.out.print(m.toString());
	
	Aves v = new Aves();
	v.setBico("Longo");
	v.setEnvergaduraAsas(50);
	v.setIdade(7);
	v.setNome("Joly");
	v.setPenas("Brancas");
	v.setPeso(3);
	v.setPodeVoar(true);
	v.setSexo("M");
	v.setTipo("Papagaio");
	
	System.out.print(v.toString());
	
	Reptil r = new Reptil();
	r.setEscamas("Verdes");
	r.setIdade(30);
	r.setNome("Ollie");
	r.setPeso(5);
	r.setSexo("F");
	r.setTamanho(10);
	r.setTipo("Anaconda");
	r.movimento();
	
	System.out.print(r.toString());
  }
}