package TestPatterns.AbstractFactory;

public class Application {
    private final Button button;
    private final CheckBox checkBox;

    private Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkBox = factory.createCheckBox();
    }

    public void paint(){
        button.paint();
        checkBox.paint();
    }

    public static Application configureApplication(String system){
        GUIFactory factory;
        if(system.contains("mac")){
            factory=new MacOSFactory();
        }else {
            factory=new WindowsFactory();
        }
        return new Application(factory);
    }
}
