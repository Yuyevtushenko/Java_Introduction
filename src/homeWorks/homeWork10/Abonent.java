package homeWorks.homeWork10;

public class Abonent {
    private int inn;
    private String lastname;
    private String name;
    private String fathersNAme;
    private String adress;
    private long numberOfCard;
    private int debet;
    private int credit;
    private int timeInterCountries;
    private int timeIntercities;
    private final int allowTime = 240;
    Abonent[] abonents = new Abonent[5];

    public Abonent() {
    }

    public Abonent(int inn, String lastname, String name, String fathersNAme, String adress, long numberOfCard, int debet, int credit, int timeInterCountries, int timeIntercities) {
        this.inn = inn;
        this.lastname = lastname;
        this.name = name;
        this.fathersNAme = fathersNAme;
        this.adress = adress;
        this.numberOfCard = numberOfCard;
        this.debet = debet;
        this.credit = credit;
        this.timeInterCountries = timeInterCountries;
        this.timeIntercities = timeIntercities;
    }

    public int getInn() {
        return inn;
    }

    public void setInn(int inn) {
        this.inn = inn;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFathersNAme() {
        return fathersNAme;
    }

    public void setFathersNAme(String fathersNAme) {
        this.fathersNAme = fathersNAme;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public long getNumberOfCard() {
        return numberOfCard;
    }

    public void setNumberOfCard(long numberOfCard) {
        this.numberOfCard = numberOfCard;
    }

    public void setNumberOfCard(int numberOfCard) {
        this.numberOfCard = numberOfCard;
    }

    public int getDebet() {
        return debet;
    }

    public void setDebet(int debet) {
        this.debet = debet;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getTimeInterCountries() {
        return timeInterCountries;
    }

    public void setTimeInterCountries(int timeInterCountries) {
        this.timeInterCountries = timeInterCountries;
    }

    public int getTimeIntercities() {
        return timeIntercities;
    }

    public void setTimeIntercities(int timeIntercities) {
        this.timeIntercities = timeIntercities;
    }

    public int getAllowTime() {
        return allowTime;
    }

    public Abonent[] getAbonents() {
        return abonents;
    }

    public void setAbonents(Abonent[] abonents) {
        this.abonents = abonents;
    }

    @Override
    public String toString() {
        return "Abonent{" +
                "inn=" + inn +
                ", lastname='" + lastname + '\'' +
                ", name='" + name + '\'' +
                ", fathersNAme='" + fathersNAme + '\'' +
                ", adress='" + adress + '\'' +
                ", numberOfCard=" + numberOfCard +
                ", debet=" + debet +
                ", credit=" + credit +
                ", timeInterCountries=" + timeInterCountries +
                ", timeIntercities=" + timeIntercities +
                '}';
    }

    public void printAbout(){
        System.out.println(toString());
    }

    public void printAboutAll(){
        System.out.println();
        System.out.println("нформация о всех абонентах: ");
        for(int i=0; i<abonents.length; i++){
            abonents[i].printAbout();
        }
    }

    public void moreThanAllow(){
        System.out.println();
        System.out.println("Кто использовал больше положенного времени:");
        for(int i=0; i<abonents.length; i++){
            if(abonents[i].getTimeIntercities()>getAllowTime()){
                abonents[i].printAbout();
            }
        }
    }

    public void whoUsedIntercities(){
        System.out.println();
        System.out.println("Кто использовал из абонентов междугороднюю связь: ");
        for(int i=0; i<abonents.length; i++){
            if(abonents[i].getTimeInterCountries()>0){
                abonents[i].printAbout();
            }
        }
    }
    public void sortByalphabet() throws ArrayIndexOutOfBoundsException{
        System.out.println();
        System.out.println("Сортировка по алфавиту: ");
        for (int i =0; i<abonents.length-1; i++) {
            for (int j = abonents.length-1; j > i; j--) {
                if (abonents[j].getLastname().compareToIgnoreCase(abonents[j - 1].getLastname()) < 0) {
                    Abonent temp;
                    temp = abonents[j];
                    abonents[j]=abonents[j - 1];
                    abonents[j - 1]=temp;
                }

            }
        }
        for (int i=0; i<abonents.length; i++){
            abonents[i].printAbout();
        }
    }
}



