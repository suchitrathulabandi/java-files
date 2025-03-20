public class MatrixAddition {
    static int addMatrix(int[] a, int[] b){
        int result=0;

        for(int i=0; i<a.length; i++){
            result=result+(a[i]+b[i]);
        }
        return result;
    }
    public static void main(String[] args){
        int[]a={2,2,3};
        int[]b={3,25,2};
        int result=addMatrix(a,b);
        System.out.println("Matrix addition:" +result);
    }
    
}
