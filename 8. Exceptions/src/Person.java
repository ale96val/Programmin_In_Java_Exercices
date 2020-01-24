public class Person<Int> {  //Class to register people.

    String name;
    String second2name;
    Integer age;
    Integer telephone;

    //Main constructor.
    public Person(String name, String second2name, Integer age, Integer telephone) throws Exceptions {

        if (age >= 0) {
            this.age = age;
        } else {
            throw new Exceptions("Invalid Age.");
        }

        this.name = name;

        this.second2name = second2name;

        if (telephone.toString().length() > 9) {
            throw new Exceptions("Invalid telephone.");
        } else {
            this.telephone = telephone;
        }
    }

    //Getters and Setters.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecond2name() {
        return second2name;
    }

    public void setSecond2name(String second2name) {
        this.second2name = second2name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) throws Exceptions {
        if(age>=0) {
            this.age = age;
        }else{
            throw new Exceptions("Invalid Age");
        }
    }

    public Integer getTelephone() {
        return telephone;
    }

    public void setTelephone(Integer telephone) throws Exceptions {
        if (telephone.toString().length() > 9) {
            throw new Exceptions("Invalid Telephone.");
        } else {
            this.telephone = telephone;
        }
    }

    //ToString.
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", second2name='" + second2name + '\'' +
                ", age=" + age +
                ", telephone=" + telephone +
                '}';
    }
}
