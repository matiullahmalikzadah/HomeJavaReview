package Class10;

public class PhoneTester {
    public static void main(String[] args) {

        Phone Iphone=new Phone();
        Iphone.make="iphone";
        Iphone.model="promax13";
        Iphone.price=2000;
        Iphone.OS="IOS 15";
        Iphone.call();
        Iphone.send();

        Phone pixelObj=new Phone();
        pixelObj.make="Google";
        pixelObj.model="12";
        pixelObj.price=3000;
        pixelObj.OS="IOS 10";
        pixelObj.call();
        pixelObj.send();

        Phone SamsungObj=new Phone();
        SamsungObj.make="Samsung";
        SamsungObj.model="15";
        SamsungObj.price=3050;
        SamsungObj.OS="Android 10";
        SamsungObj.call();
        SamsungObj.send();







    }
}
