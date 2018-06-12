package com.aula114;
import java.util.List;
import com.aula114.Persona;

public interface DAOPers {
  public List<Persona>findAllPersonas();
  public void insert(Persona persona);
}

