public class Formater {

    public String formater(double rubles) {

        String formaterRub = "";



        int formatRubles = (int) Math.floor(rubles);

        if((formatRubles%100) >= 11 && (formatRubles%100) <= 19)
            formaterRub = "рублей";
        else
            switch(formatRubles%10)
            {
                case 1: //System.out.println(formatRubles + " Рубль!\n");
                    formaterRub = "рубль";
                    break;
                case 2:
                case 3:
                case 4: //System.out.println(formatRubles + " Рубля!\n")
                    formaterRub = "рубля";
                    break;
                default: // System.out.println(formatRubles + " Рублей!\n");
                    formaterRub = "рублей";
                    break;
            }


        return formaterRub;
    }

}
