public class human {
    int yearOfBirth;
    String name;
    String town;
    String gender;
    String jobTitle;

    human(String gender, String name,String town, int yearOfBirth, String jobTitle) {
        this.gender = gender;
        this.name=name;
        this.town = town;
        this.yearOfBirth = yearOfBirth;
        this.jobTitle = jobTitle;
    }
    @Override
    public String toString() {
        if (gender=="муж") {
            return "Привет! Меня зовут " + this.name + ". Я из города "+
                    this.town + ". Я родился в " + this.yearOfBirth +
                    " году. Я работаю на должности "+this.jobTitle+". Будем знакомы!";
        } else {
            return "Привет! Меня зовут " + this.name + ". Я из города "+
                    this.town + ". Я родилась в " + this.yearOfBirth +
                    " году. Я работаю на должности "+this.jobTitle+". Будем знакомы!";
        }
    }
}



