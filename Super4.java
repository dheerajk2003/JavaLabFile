class Parent{
    public int a = 10;
    public void print(){
        System.out.println(a + " from super class");
    }
}

class Sub extends Parent{
    public void print(){
        System.out.println(super.a + " from sub class");
        super.print();
    }
}

class Super4 extends Parent{
    public static void main(String args[]){
        Sub s = new Sub();
        s.print();
    }
}