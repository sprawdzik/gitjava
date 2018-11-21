package pl.infoshare.twelve;

public class Krzeslo {

    int ileNog;
    String material;

    public Krzeslo(int ileNog, String material) {
        this.ileNog = ileNog;
        this.material = material;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Krzeslo krzeslo = (Krzeslo) o;

        if (ileNog != krzeslo.ileNog) return false;
        return material != null ? material.equals(krzeslo.material) : krzeslo.material == null;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
