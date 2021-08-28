package RepairPhone;

import java.sql.SQLOutput;
class PhoneShop extends Object{
        public String repairPhone(){
            return "Repair Phone" ;
        }
}

class Android extends PhoneShop{

    public String repairPhone() {
        return "Repair Android";
    }
}

class Ios extends PhoneShop{

    public String repairPhone() {
        return "Repair IOS";
    }
}
public class mainrepairphone {
    public static void main(String[] args) {
        PhoneShop android = new Android();
        PhoneShop ios = new Ios();
        displayObject(android);
        displayObject(ios);
    }
    public static void displayObject(PhoneShop obj)
    {
        System.out.println(obj.repairPhone());
    }
}
