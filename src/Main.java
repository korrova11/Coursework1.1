public class Main {
    public static void main(String[] args) {

        String str[] = {"Как", "здорово", "Как", "здорово", "учиться", "!"};
        defDouble(str);
    }
    public static void defDouble(String []strn) {
        for (int i= 0; i < strn.length -1 ;i ++) {
            if (strn[i].equals(""))
                continue;
            else
                for (int j = 0; j < strn.length ; j++) {
                    if (strn[i].equals(strn[j]))
                        strn[j] = "";

                }
        }
        System.out.println(strn[0] +strn[1]);
        System.out.println("привет");

    }
    }




