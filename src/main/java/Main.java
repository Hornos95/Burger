public class Main {
    public static void main(String[] args) {
        Burger burger = new Burger();
        burger.name = "Чизбургер";
        burger.picture = "https://img2.freepng.ru/20180409/biq/kisspng-cheeseburger" +
                         "-hamburger-chicken-fingers-chicken-san-chese-5acb233ee65db9" +
                         ".4199963715232622709436.jpg";
        burger.composition = "Пряный горчичный соус, кетчуп," +
                             " сочные стрипсы в оригинальной" +
                             " панировке, лук, сыр Чеддер, " +
                             "огурцы на пшеничной булочке с " +
                             "кукурузной посыпкой.";

        burger.weight = 167;
        burger.nutritionalValue=237;
        burger.protein=13.2;
        burger.fat=8.6;
        burger.carbohydrates=26.6;
        System.out.println(burger.name);
        System.out.println(burger.picture);
        System.out.println(burger.weight+" Г");
        System.out.println(burger.composition);
        System.out.println(burger.nutritionalValue+" Ккал");
        System.out.println(burger.protein+" Г  "+burger.fat+" Г  "+burger.carbohydrates+" Г");

    }
}
