package com.tcs.certificacion.tuya.RetoLinkedin.models;

public class DatosIngreso {

	 private String usuario;
	  private String contrasena;
	  

	    public DatosIngreso(String usuario, String contrasena) {
	        this.usuario = usuario;
	        this.contrasena = contrasena;
	    }


	    public String getUsuario() {

	        return usuario;
	    }

	    public String getContrasena()
	    {

	        return contrasena;
	    }
}