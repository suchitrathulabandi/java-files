public class Arrays {
    static void arrays(){
        System.out.println("\n inside arrays");
        int[] scores=new int[4];
        //int[] scores=new int[] {90,70,80,100};
        //int[] scores={90,70,80,100};
        scores[0]=90;
        scores[1]=70;
        scores[2]=80;
        scores[3]=100;
        System.out.println("test 1: " +scores[0]);
        System.out.println("test 2: " +scores[1]);
        System.out.println("final: " +scores[2]);
        System.out.println("project: " +scores[3]);

    }
    public static void main(String[] args){
        arrays();

    }
    
}
