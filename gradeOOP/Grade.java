package gradeOOP;

public class Grade {
    private String name;
    private int languageScore;
    private int englishScore;
    private int mathScore;
    private int avg;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void createLanguageScore() {
        this.languageScore = (int) (Math.random() * 100);
    }

    public int getLanguageScore() {
        return this.languageScore;
    }

    public void createEnglishScore() {
        this.englishScore = (int) (Math.random() * 100);
    }

    public int getEnglishScore() {
        return this.englishScore;
    }

    public void createMathScore() {
        this.mathScore = (int) (Math.random() * 100);
    }

    public int getMathScore() {
        return this.mathScore;
    }

    public void createAvg() {
        this.avg = (languageScore + englishScore + mathScore) / 3;
    }

    public int getAvg() {
        return this.avg;
    }

}
