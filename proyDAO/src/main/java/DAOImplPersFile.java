package com.aula114;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import com.aula114.Persona;
import com.aula114.DAOPers;
import java.io.IOException;

public class DAOImplPersFile implements DAOPers {
  public List<Persona> findAllPersonas() {
     List<Persona> result = new ArrayList<>();
     FileReader fileReader = null;
     try {
      File file = new File("/tmp/elFile");
      fileReader = new FileReader(file);
      BufferedReader bufferedReader = new BufferedReader(fileReader);
      String line;
      while ((line = bufferedReader.readLine()) != null) {
           /*int nc=line.indexOf(':');
           if(nc!=-1) {
             String campo1=line.substring(0,nc);
             String campo2_y_3=line.substring(nc+1);
             nc=campo2_y_3.indexOf(':');
             if(nc!=-1) {
              String campo2=campo2_y_3.substring(0,nc);
              String campo3=campo2_y_3.substring(nc+1);
             }

        //     arpersF.add(new Persona(line,line)); 
             */
             result.add(new Persona(line));
      }
     } catch(IOException e) {
         e.printStackTrace();
     } finally {
        try {
         fileReader.close();
        } catch(IOException e) {
         e.printStackTrace();
        }
     }
     return result;
 }

 public void insert(Persona p) {
  BufferedWriter bw=null;
   try {
    File file = new File("/tmp/elFile");
    bw=new BufferedWriter(new FileWriter(file,true));
    bw.write(p.getDatos() + "\n");
   } catch(IOException e) {
      e.printStackTrace();
   } finally {
      try {
       bw.close();
      } catch(IOException e) {
         e.printStackTrace();
      }
   }
 }
}
