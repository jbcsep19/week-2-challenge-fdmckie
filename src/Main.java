import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> RiceList = new ArrayList<>();
        ArrayList<String> MeatList = new ArrayList<>();
        ArrayList<String> BeansList = new ArrayList<>();
        ArrayList<String> SalsaList = new ArrayList<>();
        ArrayList<String> VeggiesList = new ArrayList<>();
        ArrayList<String> BurritoOrder = new ArrayList<>();

        Random riceNumber = new Random();
        Random meatNumber = new Random();
        Random beansNumber = new Random();
        Random salsaNumber = new Random();
        Random veggiesNumber = new Random();

        for (int i = 0 ; i <= 9 ; i++){


            int randomRice = riceNumber.nextInt(3);
            int randomMeat = meatNumber.nextInt(6);
            int randomBeans = beansNumber.nextInt(3);
            int randomSalsa = salsaNumber.nextInt(4);
            int randomVeggies = veggiesNumber.nextInt(3);


            if (randomRice == 0) {
                RiceList.add("White Rice");
            }
            else if (randomRice == 1) {
                RiceList.add("Brown Rice");
            }
            else if (randomRice == 2) {
                RiceList.add("No Rice");
            }

            if (randomMeat == 0) {
                MeatList.add("Chicken");
            }
            else if (randomMeat == 1) {
                MeatList.add("Steak");
            }
            else if (randomMeat == 2) {
                MeatList.add("Carnidas");
            }
            else if (randomMeat == 3) {
                MeatList.add("Chorizo");
            }
            else if (randomMeat == 4) {
                MeatList.add("Sofritas");
            }
            else if (randomMeat == 5) {
                MeatList.add("Veggies");
            }

            if (randomBeans == 0) {
                BeansList.add("Pinto Beans");
            }
            else if (randomBeans == 1) {
                BeansList.add("Black Beans");
            }
            else if (randomBeans == 2) {
                BeansList.add("No Beans");
            }

            if (randomSalsa == 0) {
                SalsaList.add("Mild Salsa");
            }
            else if (randomSalsa == 1) {
                SalsaList.add("Medium Salsa");
            }
            else if (randomSalsa == 2) {
                SalsaList.add("Hot Salsa");
            }
            else if (randomSalsa == 3) {
                SalsaList.add("No Salsa");
            }

            if (randomVeggies == 0 ) {
                VeggiesList.add("lettuce");
            }
            else if (randomVeggies == 1) {
                VeggiesList.add("Fajita Veggies");
            }
            else if (randomVeggies == 2) {
                VeggiesList.add("No Veggies");
            }

            BurritoOrder.add(RiceList.get(i) + ", " + MeatList.get(i) + ", " + BeansList.get(i) + ", " + SalsaList.get(i) + ", " + VeggiesList.get(i));


        }


        for (int i = 0; i <= 9; i++) {
            System.out.println("Burrito # " + (i + 1) + " Order: " + BurritoOrder.get(i));
        }









    }

}


