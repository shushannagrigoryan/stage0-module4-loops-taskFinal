package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int n = 1;
        for(int i = 1; i<=cathetusLength; i++){
            for(int j = 0; j< cathetusLength-i ; j++){
                System.out.print(" ");
            }
            n = i;
            while(n >=1){
                System.out.print(n);
                n--;
            }
            n = 2;
            while(n <=i){
                //n++;
                System.out.print(n);
                n++;
            }
            for(int j = 0; j< cathetusLength-i ; j++){
                System.out.print(" ");
            }
            System.out.println("");

        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
