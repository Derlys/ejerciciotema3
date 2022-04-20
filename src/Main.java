public class Main {
    public static void main(String[] args) {
        int result;
        result = sumar(10,10,30);
        System.out.println(result);

        Coche cochePuertas = new Coche();
        System.out.println(cochePuertas.doors);
        cochePuertas.addDoors();
        System.out.println(cochePuertas.doors);


    }
    public static int sumar ( int num1, int num2, int num3){
        return num1 + num3 + num3;
    }
    private static class Coche{
        int doors = 4;

        public void addDoors(){
            this.doors++;
        }
    }
}


