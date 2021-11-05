package design_patterns.state_pattern;

public class Silent implements MobileAlertState {

    @Override
    public void alert(AlertStateContext ctx) {
        System.out.println("silent...");
    }
}
