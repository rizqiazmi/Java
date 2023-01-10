package programmer.zaman.now.data;

public enum Level {
    STANDARD("Standard Level"),
    PREMIUM("Premium Lelvel"),
    VIP("VIP Level");

    private String description;

    Level(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
