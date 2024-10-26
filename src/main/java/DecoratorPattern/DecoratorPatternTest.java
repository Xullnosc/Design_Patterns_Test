package DecoratorPattern;

public class DecoratorPatternTest {
}

interface INotifier {
    public void send();

    String getUsername();
}

class Notifier implements INotifier {
    private String username;

    public Notifier(String username) {
        this.username = username;
    }

    @Override
    public void send() {
        String mail = username + "@gmail.com";
        System.out.println("Send to person with gmail: " + mail);
    }

    @Override
    public String getUsername() {
        return username;
    }
}

abstract class BaseNotifierDecorator implements INotifier {
    private INotifier wrapped;

    public BaseNotifierDecorator(INotifier wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void send() {
        wrapped.send();
    }

    @Override
    public String getUsername() {
        return wrapped.getUsername();
    }
}


class FacebookNotifier extends BaseNotifierDecorator {
    public FacebookNotifier(INotifier wrapped) {
        super(wrapped);
    }

    @Override
    public void send() {
        super.send();
        System.out.println("Sending to Facebook");
    }

    @Override

    public String getUsername() {
        return super.getUsername();
    }
}

class WhatsAppNotifier extends BaseNotifierDecorator {
    public WhatsAppNotifier(INotifier wrapped) {
        super(wrapped);
    }

    @Override
    public void send() {
        super.send();
        System.out.println("Sending to WhatsApp");
    }

    @Override

    public String getUsername() {
        return super.getUsername();
    }


}

