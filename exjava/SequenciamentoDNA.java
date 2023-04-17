public class SequenciamentoDNA{
        public static boolean divideByThree(String dna){
            return dna.length() % 3 == 0;
        }

        public static boolean startWith(String dna){
            return dna.indexOf("ATG") == 0;
        }

        public static boolean endWith(String dna){
            return dna.indexOf("TGA") == dna.length()-3;
        }

        public static String protein(String dna){
            String dnaProtein = "Sem proteina";
            if(divideByThree(dna) && startWith(dna) && endWith(dna)){
                dnaProtein = dna.substring(3, dna.indexOf("TGA"));
            }
            return dnaProtein;
        }

    public static void main(String[] args) {
        String dna1 = "ATGCGATACTGA";
        String dna2 = "ATGCGATAGA";
        String dna3 = "ATGCACTTCTGA";

        System.out.println(protein(dna1));
        System.out.println(protein(dna2));
        System.out.println(protein(dna3));       
    }
}