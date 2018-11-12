package pl.infoshare.repeat678;

import pl.infoshare.repeat678.zad3.DoctorService;
import pl.infoshare.repeat678.zad3.Lekarz;
import pl.infoshare.repeat678.zad3.Pacjent;

public class Zad3Main {

    public static void main(String[] args){
        Pacjent p1 = new Pacjent("Jan1","Kowalski","Odra1");
        Pacjent p2 = new Pacjent("Jan2","Kowalski","Odra2");
        Pacjent p3 = new Pacjent("Jan3","Kowalski","Odra3");
        Pacjent p4 = new Pacjent("Jan4","Kowalski","Odra4");
        Pacjent p5 = new Pacjent("Jan5","Kowalski","Odra5");

        Lekarz lekarz = new Lekarz("Dr","House");

//        DoctorService service = new DoctorService(lekarz);
//        service.addPacjentToDoctorsQueue(p1);
//        service.addPacjentToDoctorsQueue(p2);
//        service.addPacjentToDoctorsQueue(p3);
//        service.addPacjentToDoctorsQueue(p4);
//        service.addPacjentToDoctorsQueue(p5);
//
//        System.out.println("Zaczynam przyjmowac");
//        System.out.println("Na kolonoskopie: " + service.callNextPacjent());
//        System.out.println("Nastepny do badania: " + service.whosNext());
//        System.out.println("Pozostalo ppacjentow: " + service.getNumberOfPacjentsInQieie());
    }

}
