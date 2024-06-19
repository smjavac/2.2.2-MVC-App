package web.model;

public class Car {
    private String model;
    private String series;

    public Car(String model, String series) {
        this.model = model;
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public String getSeries() {
        return series;
    }

}
