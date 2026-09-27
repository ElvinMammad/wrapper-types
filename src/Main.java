import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



//        // Massivin özünə tərsinə mənmsədlməsi

//        int[] arr = {1, 2, 3, 4, 5, 6, 7};
//        int left = 0;
//        int right = arr.length - 1;
//
//        for (; left < right; left++, right--) {
//            int temp = arr[left];
//            arr[left] = arr[right];
//            arr[right] = temp;
//        }
//
//        for (int element : arr) {
//            System.out.println(element);
//        }




//        // == və equals() ilə müqayisə et. Nəticələr niyə fərqlidir?
//
//        Integer a = 127, b = 127; Integer c = 128, d = 128;
//        System.out.println(a==b); //false referansları yoxlayır, ayrı obyektlər olduu ucun refernsları da ayrı olur
//        System.out.println(a.equals(b)); //true dəyəri yoxlayır, eyni dəyər olduqları üçün true veir
//        System.out.println(c==d);//false referansları yoxlayır, ayrı obyektlər olduu ucun refernsları da ayrı olur
//        System.out.println(c.equals(d)); //true dəyəri yoxlayır, eyni dəyər olduqları üçün true veir


//        //2) String inputun polindrome olub olmamasini yoxlayin.
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("sözü daxil edin");
//        String str = scanner.nextLine();
//        String reverse = new StringBuilder(str).reverse().toString();
//        if (str.equals(reverse)){
//            System.out.println(str + " polindromdr");
//        }else {
//            System.out.println("polindrome deyil");
//        }


//        //3) Sətri tərsinə çevir ("hello" → "olleh")
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("sözü daxil edin");
//        String str = scanner.nextLine();
//        String reverse = new StringBuilder(str).reverse().toString();
//        System.out.println(reverse);


//        //4) Anagram yoxlaması ("listen" və "silent")
//        String a = "listen";
//        String b ="silent";
//        char []arr1=a.toCharArray();
//        char []arr2=b.toCharArray();
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
//        if (Arrays.equals(arr1,arr2)){
//            System.out.println("anaqramdır");
//        }else {
//            System.out.println("anaqram deyil");
//        }

//        //5) Sözlərin sırasını tərsinə çevir ("I love Java" → "Java love I")
//        String str = "I love Java";
//        String[] words = str.split(" ");
//        int left = 0;
//        int right = words.length - 1;
//
//        for (; left < right; left++, right--) {
//            String temp = words[left];
//            words[left] = words[right];
//            words[right] = temp;
//        }
//
//        String result = String.join(" ", words);
//        System.out.println(result);


//        //6) Təkrarlanan simvolları tap və say ("programming" → r=2, g=2, m=2)
//        String a = "programming";
//
//        for (int i = 0; i < a.length(); i++) {
//          char currentChar = a.charAt(i);
//            for (int j = 0; j < a.; j++) {
//
//            }
//
//
//
//        }

//        //6. təkrarlanan simvollar
//        int[] counts= new int[128];
//        String input ="ahjabkadnasdjscj767";
//        for (int i = 0; i < input.length(); i++) {
//
//            int currentAscii = input.charAt(i);
//            counts[currentAscii]++;
//
//            }
//        for (int i = 0; i < counts.length; i++) {
//            int count =counts[i];
//            if(count>1){
//                System.out.print((char)i);
//                System.out.print(" ");
//                System.out.print(count);
//                System.out.println();
//            }
//
//        }


        //7) Hər sözün ilk hərfini böyük et ("salam dunya" → "Salam Dunya")

//        String input="hello world";
//        String[] split= input.split(" ");
//       for (String str:split){
//           String result=str.substring(0,1).toUpperCase()+str.substring(1);
//           System.out.println(result);
//
//       }

        //8) Rəqəm yoxlaması alqoritmi

        String input = "347";
        for (int i = 0; i < input.length(); i++) {
            int ascii = input.charAt(i);
            if (ascii<48 || ascii>57){
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");







    }
}