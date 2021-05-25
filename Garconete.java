import java.util.Arrays;
import java.util.List;

public class Garconete {

  private MenuComponent menuComponent;

  public Garconete (MenuComponent menuComponent) {
    this.menuComponent = menuComponent;
  }

  public void printMenu(){
    menuComponent.print();
  }


  // private List <Menu> menus;

  // public Garconete(Menu... menus) {
  //   this.menus = Arrays.asList(menus);
  // } 
  
  // public void printMenu (Iterator <MenuItem> iterator){
  //   while (iterator.hasNext()){
  //     System.out.println(iterator.next());
  //   }
  // }

  // public void printMenu(){
  //   java.util.Iterator<Menu> iterator = menus.iterator();
  //   while (iterator.hasNext()){
  //     printMenu(iterator.next().createIterator());
  //   }
  // }

}
