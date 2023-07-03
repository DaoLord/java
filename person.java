class person{
    int id;
    String name;
    person(int id, String name){
        this.id= id;
        this.name = name;
    }
}
class emp extends person {
    float salary;
    emp(int id, String name, float salary){
        super(id,name);
        this.salary=salary;
    }
    void display(){
        System.out.println(id+" "+name+" "+salary);
    }
}
class testsuper5 {
    public static void main(String[]args){
        emp e1=new emp(1000,"Bishnau",9874513);
        e1.display();
    }
}