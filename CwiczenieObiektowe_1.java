class CwiczenieObiektowe_1 {
    public static void main(String[]args){
        System.out.println("Zad1");
        MojeDane md = new MojeDane("Alan","Gala","2PTN");
        System.out.println(md.imie + "\n" + md.nazwisko + "\n" + md.klasa);
        System.out.println("Zad2");
        Logowanie log = new Logowanie("komputer", "740agd");
        System.out.println(log.toString());
        System.out.println("Zad3");
    }

}