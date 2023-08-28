public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Lada",2021,new Engine("21214",113),
                new Transmission("Forward",3),new Wheels("Pirelly",17,4),
                new Body("универсал",1200.));

//        Car car2 = new Car("Siber",2010,new Engine("Chrysler",143),
//                new Transmission("Forward",3),new Wheels("Continental",16,5),
//                new Body("седан",1200.));

        Car car2 = new Car();
        System.out.println(car1);
        System.out.println(car2);
    }
}