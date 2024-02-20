package kaupOOP;

public class Person {
    private String name;
    private double height;
    private double weight;
    private double bmi;
    private String bodyMass;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void createHeight() {
        double randomHeight = (double) (Math.random() * 50) + 150;
        this.height = randomHeight;
    }

    public double getHeight() {
        return this.height;
    }

    public void createWeight() {
        double randomWeight = (double) (Math.random() * 69) + 30;
        this.weight = randomWeight;
    }

    public double getWeight() {
        return this.weight;
    }

    public double getBmi() {
        return this.bmi;
    }

    public void createBMI() {
        double heightM = height / 100;
        double bmi = weight / (heightM * heightM);
        this.bmi = bmi;
    }

    public String getBodyMass() {
        return this.bodyMass;
    }

    public void createBodyMass() {
        if (bmi < 18.5) {
            bodyMass = "저체중";
        } else if (bmi < 23) {
            bodyMass = "정상";
        } else if (bmi < 25) {
            bodyMass = "과체중";
        } else {
            bodyMass = "비만";
        }
        this.bodyMass = bodyMass;
    }

}
