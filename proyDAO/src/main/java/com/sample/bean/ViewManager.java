package com.sample.bean;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import com.sample.model.Property;
@ManagedBean
@ViewScoped
public class ViewManager implements Serializable {
ArrayList<Property> cacheList = new ArrayList ();
private Property item = new Property();
public void add() {
cacheList.add(item);
item = new Property();
}
public List getCacheList() {
return cacheList;
}
public Property getItem() {
return item;
}
}

