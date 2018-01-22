package lessonFifth;

/**
 * Created by Hillel8 on 06.12.2017.
 */
public class BreakAndContinue {
        public static void main(String[] args) {
            int x[] = {2, 43, 6, 6, 7, 89};
            int result = 0;

            for (int i = 0; i < x.length; i++) {
                if (x[i] == 5) {
                    result = x[i];
                    break;
                }
            }
            System.out.println(result);

            for(int i=0; i<x.length; i++){
                if(x[i]%2 !=0){
                    continue;
                }
                System.out.print(x[i]+" ");
            }
        }

    }

