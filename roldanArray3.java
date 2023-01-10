import java.util.Scanner;
public class roldanArray3 {
    public static void main(String[] args) {
    
        final int N_ALUMNES = 3;
        int [] notes = new int[N_ALUMNES];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < N_ALUMNES; i++){
            notes[i]=scanner.nextInt();
        }
        for(int i = 0; i < N_ALUMNES; i++){
            System.out.println(i+1 + " notes: " + notes[i]);
        }
    }
}