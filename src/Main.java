public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

        int age = 18;
        if (age >= 18) {
            System.out.println("Ты совершеннолетний");
        } else  {
            System.out.println("Ты не достиг совершеннолетия, нужно немного подождать");
        }

        int temperature = 7;
        if (temperature <5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }

        int speed = 70;
        if (speed >60) {
            System.out.println("Если скорость " + speed + " то придётся заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " то можно ездить спокойно");
        }

        int year = 10;
        if (year >=2 && year <=6) {
            System.out.println("Если возраст человека равен " +year + " лет, то ему нужно ходить в детский сад");
        }
        if (year >=7 && year <=17) {
            System.out.println("Если возраст человека равен " +year + " лет, то ему нужно ходить в школу");
        }
        if (year >=18 && year <=24) {
            System.out.println("Если возраст человека равен " +year + " лет, то его место в университете");
        }
        if (year >24) {
            System.out.println("Если возраст человека равен " +year + " лет, то ему пора ходить на работу");
        }

        int yearOne = 12;
        if (yearOne <5) {
            System.out.println("Если возраст ребенка равен " + yearOne + " то он не может кататься на аттракционе");
        }
        if (yearOne >= 5 && yearOne < 14) {
            System.out.println("Если возраст ребенка равен " + yearOne + " то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        }
        if (yearOne >=14) {
            System.out.println("Если возраст ребенка равен " + yearOne + "то он может кататься без сопровождения взрослого");
        }

        int occupiedPlaces = 104;
        if (occupiedPlaces <60) {
            System.out.println("Есть сидячие места");
        }
        if (occupiedPlaces >=60 && occupiedPlaces <102) {
            System.out.println("Есть стоячие места");
        } else {
            System.out.println("Вагон полностью забит");
        }

        int one = 20;
        int two = 7;
        int three = 15;
        if (one >two && one >three) {
            System.out.println("Число one больше остальных");
        }
        else if (two >one && two >three) {
            System.out.println("Число two больше остальных");
        } else {
            System.out.println("Число three больше остальных");
        }
    }

}