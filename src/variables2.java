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
        byte age = 67;
        short height = 569;
        int distance = 27289;
        long budget = 987678965549L;
        float temperature = 27.3f;
        double _F = 9.80665;
        char g = '&';
        boolean retirementAge = age < 60;
        System.out.println( retirementAge);

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

        System.out.println("Задача 7");
        byte totalLoseWeight = 7;
        float loseWeight1 = 0.25f;
        double days1 = totalLoseWeight / loseWeight1;
        System.out.println( days1 + "  дней уйдёт на похудение, если спортсмен будет терять каждый день по " + loseWeight1 + " кг.");
        float loseWeight2 = 0.5f;
        double days2 = totalLoseWeight / loseWeight2;
        System.out.println( days2 + "  дней уйдёт на похудение, если спортсмен будет терять каждый день по " + loseWeight2 + " кг.");
        double averageDay = (days1 + days2) / 2;
        System.out.println( averageDay + " в среднем дней потребуется чтобы добиться результата похудения.");

        System.out.println("Задача 8");
        int payMasha = 67760;
        int payDenis = 83690;
        int payKristina = 76230;
        double payMashaRisen = payMasha * 0.1;
        double payDenisRisen = payDenis * 0.1;
        double payKristinaRisen = payKristina * 0.1;
        System.out.println("Маша теперь получает " + (payMasha+payMashaRisen) + " рублей. Годовой доход вырос на "+ (payMashaRisen * 12) + " рублей");
        System.out.println("Денис теперь получает " + (payDenis+payDenisRisen) + " рублей. Годовой доход вырос на "+ (payDenisRisen * 12) + " рублей");
        System.out.println("Кристина теперь получает " + (payKristina+payKristinaRisen) + " рублей. Годовой доход вырос на "+ (payKristinaRisen * 12) + " рублей");



    }

}