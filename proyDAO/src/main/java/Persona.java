package com.aula114;
import java.io.IOException;
import redis.clients.jedis.Jedis;
public class Persona {
  private String nombre;
  private String apellido;
  private String email;
  public Persona(String n, String a, String e) {
     nombre=n;
     apellido=a;
     email=e;
  }
  public Persona() {nombre="nnnn"; apellido="dddd"; email="eee";};
  public Persona(String line) {
    String campo;
    int nc=line.indexOf(':');
    if(nc!=-1) {
      nombre=line.substring(0,nc);
      campo=line.substring(nc+1);
      nc=campo.indexOf(':');
      apellido=campo.substring(0,nc);
      email=campo.substring(nc+1);
    }
  }
  public void setNombre(String n) {
     nombre=n;
  }
  public void setApellido(String d) {
     apellido=d;
  }
  public String getApellido() {
     return apellido;
  }
  public void setEmail(String e) {
     email=e;
  }
  public String getEmail() {
     return email;
  }
  public String getNombre() {
     return nombre;
  }
  public String getDatos() {
     return nombre + ":" + apellido + ":" + email;
  }
  @Override
  public boolean equals(Object obj) {
    return (this.nombre.equals(((Persona)obj).nombre) &&
            this.apellido.equals(((Persona)obj).apellido));
  }
} 
