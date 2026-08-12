class MyBook {
    String title,author;
    double price;
    MyBook(){
        title="unknown";
        author="not assigned";
        price=0.0;
    }
    MyBook(String t,String a,double p){
        title=t;
        author=a;
        price=p;
    }
    void displayDetails(){
        System.out.println("title"+title+"\nauthor="+author+"\nprice="+price);
    }
}
public class Book {

    public static void main(String[] args){
        MyBook b1=new MyBook();
        MyBook b2=new MyBook("Harry","JK",99);
        b1.displayDetails();
        b2.displayDetails();
    }
}
