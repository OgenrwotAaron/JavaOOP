class Product{

    //Attributes
    int id;
    String name;
    int price;

    //Constructor
    Product(int id,String name,int price){
        this.id=id;
        this.name=name;
        this.price=price;
        System.out.println(">> Product Constructed");
    }

    void save(){
        System.out.println("-------Product ID: "+id+"-----");

        System.out.println("Name:\t"+name);
        System.out.println("Price:\t"+price);

        System.out.println("---------------");
    }
}

class Mobile extends Product{
    String os;
    int ram;
    int storge;

    Mobile(int id,String name,int price,String os,int ram,int storage){
        super(id,name,price);
        this.id=id;
        this.name=name;
        this.price=price;
        this.os=os;
        this.ram=ram;
        this.storge=storage;
        System.out.println(name+" phone added");
    }

    void save(){
        System.out.println("-------Product ID: "+id+"-----");

        System.out.println("Name:\t"+name);
        System.out.println("Price:\t"+price);
        System.out.println("OS:\t"+os);
        System.out.println("RAM:\t"+ram);
        System.out.println("Storage:\t"+storge);

        System.out.println("---------------");
    }
}

class Inheritance{
    public static void main(String[] args) {
        Product product=new Product(1,"Android",5000);
        product.save();
        Mobile mobile = new Mobile(2,"Huawei",6000,"Android",8,16);
        mobile.save();

        //mobile.setProduct(1,"Iphone",700000,"Apple",8,128);
        //mobile.showProduct();
    }
}