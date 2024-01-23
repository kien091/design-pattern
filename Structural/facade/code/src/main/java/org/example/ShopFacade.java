package org.example;

public class ShopFacade {
    private static ShopFacade instance;

    private final AccountService accountService;
    private final PaymentService paymentService;
    private final ShippingService shippingService;
    private final EmailService emailService;
    private final SmsService smsService;

    private ShopFacade()
    {
        accountService = new AccountService();
        paymentService = new PaymentService();
        shippingService = new ShippingService();
        emailService = new EmailService();
        smsService = new SmsService();
    }

    public static ShopFacade getInstance()
    {
        if (instance == null)
            instance = new ShopFacade();
        return instance;
    }

    public void buyProductByCashWithFreeShipping(String email)
    {
        accountService.getAccount(email);
        paymentService.paymentByCash();
        shippingService.freeShipping();
        emailService.sendEmail(email);
        System.out.println("Done\n");
    }

    public void buyProductByPaypalWithStandardShipping(String email, String mobilePhone)
    {
        accountService.getAccount(email);
        paymentService.paymentByPaypal();
        shippingService.standardShipping();
        emailService.sendEmail(email);
        smsService.sendSMS(mobilePhone);
        System.out.println("Done\n");
    }
}
