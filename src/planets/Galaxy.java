package planets;

public  class Galaxy {
    public static void main(String[] args) {
    Mercury mercury = new Mercury("3","Mercury",3,false,true,false,true,false,5.5);

        System.out.println(mercury);

        Earth earth1 = new Earth("1","Earth",1,false,false,true,true,true ,9.81);

        System.out.println(earth1);

    }
}
