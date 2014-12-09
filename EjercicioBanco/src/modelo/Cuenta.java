package modelo;

public class Cuenta {

	private String titular;
	private long ncta;
	private float saldo;

	public Cuenta(String titular, long ncta) { 	// constructor se llama como la va a funcionar cuando se le cree un objeto,
												// pidiendo lo del paréntesis, que almacena esa infomcion
		this.titular = titular;					
		this.ncta = ncta;
		this.saldo = 0.0F;
	}

	public Cuenta(String titular, long ncta, float saldo) {
		this.titular = titular;
		this.ncta = ncta;
		this.saldo = saldo;
	}

// los getters y los setter son la única forma de acceder a ellos desde otro
// lado, ya que al ser privado no se puede manejar desde fuera
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public long getNcta() {
		return ncta;
	}

	public void setNcta(long ncta) {
		this.ncta = ncta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

// creacion de métodos en los paréntesis es una información sobre la que
// tiene que pasar cuando se llame al método
	public void ingreso(float cantidad) {
		saldo = saldo + cantidad;
	}

	public void reintegro(float cantidad) {
		if (saldo >= cantidad)
			saldo = saldo - cantidad;
		else
			System.out.println("No hay saldo suficiente");
	}

	public void transferencia(Cuenta acreedora, float cantidad) {
		if (saldo >= cantidad) {
			saldo = saldo - cantidad;
			acreedora.ingreso(cantidad); 			// como ya teniamos un método creado, se le ha llamado
		} else
			System.out.println("No hay saldo suficiente");
	}
}
