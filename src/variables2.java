public class variables2 {
    public static void main(String[] args) {
        //Задание 4

        System.out.println("Задача 1");
        int q = 32768;
        System.out.println("Значение переменной q c типом int = " + q);
        byte w = -127;
        System.out.println("Значение переменной w c типом byte = " + w);
        short e = 1500;
        System.out.println("Значение переменной e c типом short = " + e);
        long r = 9L;
        System.out.println("Значение переменной r c типом long = " + r);
        float pi = 3.14f;
        System.out.println("Значение переменной pi c типом float = " + pi);
        double ww = 3.265844862;
        System.out.println("Значение переменной ww c типом int = " + ww);

        System.out.println("Задача 2");
        System.out.println("Задача 3");
        short teacherLP = 23;
        short teacherAS = 27;
        short teacherEA = 30;
        int totalStudents = teacherLP + teacherEA + teacherAS;
        int totalPapers = 480;
        System.out.println("На каждого ученика расситано " + totalPapers / totalStudents + " листов бумаги.");
        System.out.println("Задача 4");
        byte output2Minutes = 16;
        int outputMinute = output2Minutes / 2;
        int output20Minutes = outputMinute * 20;
        System.out.println("За 20 минут машина произвела бутылок " + output20Minutes + " штук");
        int outputDay = outputMinute * 60 * 24;
        System.out.println("За сутки машина произвела бутылок " + outputDay + " штук");
        int output3Day = outputDay * 3;
        System.out.println("За 3 суток машина произвела бутылок " + output3Day + " штук");
        int outputMonth = outputDay * 30;
        System.out.println("За месяц машина произвела бутылок " + outputMonth + " штук");
        System.out.println("Задача 5");
        int totalPaintsTins = 120;
        int oneClassWightTins = 2;
        int oneClassBrownTins = 4;
        int classesAtSchool = totalPaintsTins / (oneClassWightTins + oneClassBrownTins);
        int wightTins = classesAtSchool * oneClassWightTins;
        int brownTins = classesAtSchool * oneClassBrownTins;
        System.out.println("В школе, где " + classesAtSchool + " классов, нужно " + wightTins + " банок белой красски и " + brownTins+ " банок коричневой краски.");

        System.out.println("Задача 6");
        byte banana = 80;
        short milk = 105;
        byte iceCream = 100;
        byte egg = 70;
        double cocktail = banana * 5 + milk * 2 + iceCream * 2 + egg * 4;
        System.out.println( "Вес спорт-завтрака " + cocktail / 1000 + " кг.");


    }

}