package homework1;

public class HotDrink {
    private int name;
    private String kind;
    private int volume;

    public HotDrink(int name, String kind, int volume) {
        this.name = name;
        this.kind = kind;
        this.volume = volume;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
