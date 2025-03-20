public class DotProductCalculator {
    static int dotProduct(int[] a, int[] b){
        int result=0;

        for(int i=0; i<a.length; i++){
            result=result+a[i]*b[i];
        }
        return result;
    }
    public static void main(String[] args){
        int[] a={2,2,2};
        int[] b={2,2,2};
        int result=dotProduct(a,b);
        System.out.println("dot product:" +result );
    }
    
}
