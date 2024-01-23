package org.example;

public class ClientTest {
    public static void main(String[] args) {
        ShopFacade.getInstance().buyProductByCashWithFreeShipping("kien@gmail.com");
        ShopFacade.getInstance().buyProductByPaypalWithStandardShipping("abc@gmail.com", "0123456789");
    }
}