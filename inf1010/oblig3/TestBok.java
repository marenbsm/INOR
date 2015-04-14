public class TestBok{
    public static void main(String[]args){
	Bok bok1 = new Bok("Herman", "Erik");
	System.out.println("Tester tittel bok1:  OK : "+test(bok1.tittel(),"Herman"));
	System.out.println("Tester eier bok1: OK : "+test(bok1.eier(),"Erik"));
	System.out.println("Tester laaner bok1: OK : "+test(bok1.laaner(),null));
	Bok bok2 = new Bok("Sult", "Per", "Ole");
	System.out.println("Tester tittel bok2:  OK : "+test(bok2.tittel(),"Sult"));
	System.out.println("Tester eier bok2: OK : "+test(bok2.eier(),"Per"));
	System.out.println("Tester laaner bok2: OK : "+test(bok2.laaner(),"Ole"));
	System.out.println("Per laaner bok1. OK : "+bok1.laanUt("Per"));
	System.out.println("- sjekker laaner. OK : "+test(bok1.laaner(),"Per"));
	System.out.println("- sjekker om utlaant. OK: "+bok1.utlaant());
	System.out.println("Forsoker aa laane bok1 til Ole. OK : "+test(bok1.laanUt("Ole"),false));
	System.out.println("Sjekker at Per fortsatt staar som laaner . OK : "+test(bok1.laaner(),"Per"));
	System.out.println("Per leverer bok1 tilbake. OK : "+bok1.leverTilbake());
	System.out.println("Vi leverer bok1 tilbake en gang til. OK : "+test(bok1.leverTilbake(), false));

    }

    public static boolean test (Object testVerdi, Object forventetVerdi){
	return (testVerdi==forventetVerdi);
    }
}
