public class Random {
    public static void main(String[] args) {
        java.util.Random random = new java.util.Random();

        for (int i = 0; i < 10;i++){
            int chance = random.nextInt(100) + 1;
            String item;

            if (chance <= 40){
                item = "Pedang";
            } else if (chance <= 50) {
                item = "Shovel";
            }else {
                item = "Potion";
            }

            System.out.println("Item yang di dapatkan: " + item);
        }
    }
}