package pl.infoshare.repeat678.zad3;

public class DoctorService {

    private Lekarz lekarz;

    public DoctorService(Lekarz lekarz) {
        this.lekarz = lekarz;
    }

    public Pacjent callNextPacjent(){
        return lekarz.getKolejka().poll();
    }

    public Pacjent whosNext(){
        return lekarz.getKolejka().peek();
    }

    public int getNumberOfPacjentsInQieie(){
        return lekarz.getKolejka().size;
    }

    public void addPacjentToDoctorsQueue(Pacjent pacjent){
        lekarz.getKolejka().add(pacjent);
    }
}
