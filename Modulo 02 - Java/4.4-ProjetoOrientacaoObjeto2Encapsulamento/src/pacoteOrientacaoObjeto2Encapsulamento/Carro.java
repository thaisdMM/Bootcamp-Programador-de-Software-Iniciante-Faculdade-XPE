package pacoteOrientacaoObjeto2Encapsulamento;

public class Carro {
	
	private int nportas;
	private String marca;
	private String modelo;
	private int nCavalos;
	
	//GET Método para pegar a propriedade NPORTAS, se quiser somente leitura faz só o GET E NAO O SET
	public int getnportas() {
		return nportas;
	}
	//MÉTODO SET para atribuir essa propriedade
	public void setnportas(int nportas) {
		this.nportas = nportas;
		
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getnCavalos() {
		return nCavalos;
	}
	public void setnCavalos(int nCavalos) {
		this.nCavalos = nCavalos;
	}
	
	

}
