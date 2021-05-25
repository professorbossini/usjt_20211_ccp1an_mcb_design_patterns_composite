import java.util.Map;
import java.util.HashMap;
public class CafeMenu extends Menu{

  private Map <String, MenuItem> itens;

  public CafeMenu(String description){
    super(description);
    this.itens = new HashMap<>();
    this.itens.put(
      "Hambúrguer vegano e batata frita", 
    new MenuItem("Hambúrguer vegano e bata frita", "Hambúrguer vegetariano em pão integral, alface, tomate e batata frita", true, 29.99));
    this.itens.put("Sopa", new MenuItem("Sopa", "Cumbuca de sopa, acompanha salada", false, 23.99));
    this.itens.put("Burrito", new MenuItem("Burrito", "Um burrito grande com feijão, molho e guacamole", true, 24.99));
  }
  
  public Iterator<MenuItem> createIterator() {
    return new CafeMenuIterator(itens);
  }

  @Override
  public void print() {
    Iterator<MenuItem> it = createIterator();
    while (it.hasNext()) {
      it.next().print();
    }
  }
  
}
