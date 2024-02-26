import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String str[] = {"Как", "здорово", "Как", "здорово", "учиться", "!"};
        int[] chin = {5, 6, 5, 8, 6};
        defDouble(str);

    }

    public static void defDouble(String[] strn) {
        for (int i = 0; i < strn.length - 1; i++) {
            if (strn[i].equals(""))
                continue;
            else
                for (int j = i + 1; j < strn.length; j++) {
                    if (strn[i].equals(strn[j]))
                        strn[j] = "";

                }

        }
        String st = "";
        for (String str:strn) {
            st += str;
        }
        System.out.println(st);

            }
                   }

