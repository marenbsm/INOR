import java.util.Arrays;
import java.util.Random;

public class Tekster{
    public static void main(String[] args){
        // Agnes i senga
        String agnes = "Agnes i senga";
        System.out.println("---\nOriginal  : "+agnes);
        System.out.println("Reversert : "+SnuTekst(agnes)+"\n---");

        String storinf1000 = "INF1000";
        String liteninf1000 = "inf1000";

        System.out.println("Tester om '"+storinf1000+"' er lik '"+liteninf1000+"'.");
        System.out.println("Testen returnerer : "+SammenligneTekst(storinf1000, liteninf1000)+"\n---");

        String masseinf = "INF1100 INF1000 INF1010";

        String nyVariabel = ApekattMetoden(storinf1000, masseinf);
        System.out.println ("---\n"+nyVariabel+"\n---");

        String espen = "Espen Askeladd";
	System.out.println ("\n---\n"+Ladden(espen)+"\n---");

    }
    // metode for aa snu en string.
    // http://stackoverflow.com/questions/7569335/reverse-a-string-in-java
    // endret litt, bla annet variabel navn for aa fa den til aa gi mer mening for meg og en feilretting
    static String SnuTekst(String i){
        char[] cArray = i.toCharArray();
        int begin = 0;
        int end = (cArray.length)-1; // rettet lengde paa array.
        char temp;
        while (end>begin){
            temp = cArray[begin];
            cArray[begin] = cArray[end];
            cArray[end] = temp;
            end--;
            begin++;
        }
        return new String(cArray);
    }

    static boolean SammenligneTekst(String i, String j){
        boolean a = i.equals(j);
        return a;

    }


    static String ApekattMetoden(String i, String j){ // minste arrayet forst
        Random generateRandom = new Random ();
        char [] iArray = i.toCharArray();
        char [] jArray = j.toCharArray();
        char [] newArray = new char [iArray.length];
        int y = 0;
        while (!(Arrays.equals(iArray,newArray))){
            for (int t = 0; t < iArray.length; t++){
                int jRandom = generateRandom.nextInt(jArray.length);
                newArray[t] = jArray[jRandom];
            }
            y++;
        }
        System.out.println("\n---\n"+y+" forsoek med hjelp av apekatter.\n---\n");
        return new String (newArray);
    }

    static String Ladden(String i){
        char[] iLadden = i.toCharArray();
        for (int t = 0; t < iLadden.length; t++){
	    if (iLadden[t] == 'a'){
                iLadden[t] = 'A';
            }
        }
	return new String (iLadden);
    }
}
