public class human {
    int yearOfBirth;
    String name;
    String town;
    String gender;
    human(String gender, String name,int yearOfBirth, String town) {
        this.name=name;
        this.yearOfBirth = yearOfBirth;
        this.town = town;
        this.gender = gender;
    }
    @Override
    public String toString() {
        if (gender=="муж") {
            return "Привет! Меня зовут " + this.name + ". Я из города "+ this.town + ". Я родился в " + this.yearOfBirth + " году. Будем знакомы!";
        } else {
            return "Привет! Меня зовут " + this.name + ". Я из города "+ this.town + ". Я родилась в " + this.yearOfBirth + " году. Будем знакомы!";
        }
    }
}



