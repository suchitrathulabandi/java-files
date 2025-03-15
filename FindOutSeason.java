class FindOutSeason {
    static String getSeason(int month){
       String season;
        switch (month) {

            case 1: season="spring";
                   break;
            case 2: season="spring";
                   break;
            case 3: season="spring";
                   break;
            case 4: season="summer";
                   break;
            case 5: season="summer";
                   break;
            case 6: season="summer";
                   break;
            case 7: season="rainy";
                   break;
            case 8: season="rainy";
                   break;
            case 9: season="rainy";
                   break;
            case 10: season="winter";
                    break;
            case 11: season="winter";
                    break;
            case 12: season="winter";
                    break;
            default: season="unknown";
                    break;

        }
        return season;
    }
    public static void main(String[] args){
        String season = getSeason(8);
        System.out.println(season);
    }
}       

    

