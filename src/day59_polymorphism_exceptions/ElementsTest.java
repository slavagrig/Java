package day59_polymorphism_exceptions;

public class ElementsTest {
    public static void main(String[] args) {
        Link link = new Link();
        link.click();
        link.sendKeys("hi");
        link.getText();

        WebElement loginLink = new Link();
        loginLink.click();
        String txt = loginLink.getText();
        System.out.println("txt = " + txt);

        WebElement username = new InputField();
        username.sendKeys("wooden spoon");
        username.click();

        InputField inp = new InputField();
        inp.getValue();

        WebElementUtil.clickElement(loginLink);
        WebElementUtil.clickElement(username);

        WebElement login = WebElementUtil.getLinkWithText("login");
        login.click();
    }
}
