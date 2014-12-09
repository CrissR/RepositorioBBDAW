package controlador;

import modelo.Cuenta;

public class Principal {

	public static void main(String[] args) {
		Cuenta cuenta1=new Cuenta("Fernando Ortiz",1,2000F);
		Cuenta cuentaJesus=new Cuenta("Jesus",2,200F);
		cuenta1.reintegro(100F);
		System.out.println("Su saldo Sr. Ortiz: "+cuenta1.getSaldo());
		cuenta1.transferencia(cuentaJesus, 200F);
		System.out.println("Su saldo Sr. Ortiz: "+cuenta1.getSaldo());
		System.out.println("Su saldo Sr. Jesus: "+cuentaJesus.getSaldo());
		
		
	}

}
