import java.util.*;
public class Menu extends MenuComponent{
  public List <MenuComponent> menuComponents;

  public Menu(String description){
    this.description = description;
    this.menuComponents = new ArrayList<>();
  }
  private String description;

  public void add(MenuComponent menuComponent){
    this.menuComponents.add(menuComponent);
  }

  @Override
  public void remove(MenuComponent menuComponent) {
    this.menuComponents.remove(menuComponent);
  }

  @Override
  public MenuComponent getChild(int i) {
    return this.menuComponents.get(i);
  }
  
  @Override
  public String getDescription() {
    // TODO Auto-generated method stub
    return super.getDescription();
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public void print() {
    System.out.println(description);
    java.util.Iterator <MenuComponent> it = menuComponents.iterator();
    while (it.hasNext()) {
      it.next().print();
    }
  }
}
