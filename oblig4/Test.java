class Test{
    public static void main(String[]args){
	Elbil testkjerre = new Elbil ("AB 12345", 10);
	System.out.println(testkjerre.bilnummer()+" "+testkjerre.batteri()+"kW");
	testkjerre.bilnummer("BA 54321");
	testkjerre.batteri(20);
	System.out.println(testkjerre.bilnummer()+" "+testkjerre.batteri()+"kW");
	
    }
}
