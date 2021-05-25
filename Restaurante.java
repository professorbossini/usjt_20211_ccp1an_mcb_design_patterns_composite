public class Restaurante {
  public static void main(String[] args) {
    PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu("Panquecas");
    CafeMenu cafeMenu = new CafeMenu("Cafe");
    DinerMenu dinerMenu = new DinerMenu("Jantar");
    Menu geral = new Menu("Geral");
    geral.add(pancakeHouseMenu);
    geral.add(cafeMenu);
    geral.add(dinerMenu);
    Garconete garconete = new Garconete(geral);
    garconete.printMenu();
  }
}
