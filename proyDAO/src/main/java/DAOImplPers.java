package com.aula114;
import java.util.ArrayList;
import java.util.List;
import redis.clients.jedis.Jedis;
import com.aula114.Persona;
import com.aula114.DAOPers;

public class DAOImplPers implements DAOPers {
  public List<Persona> findAllPersonas() {
    Jedis conn = new Jedis("localhost");
    List<Persona> result = new ArrayList<Persona>();
    for (String member : conn.lrange("listaPersona",0,-1)){
      result.add(new Persona(member));
    }
    return result;
  }
  public void insert(Persona p) {
    Jedis conn = new Jedis("localhost");
    conn.rpush("listaPersona",p.getDatos());
  }
}
