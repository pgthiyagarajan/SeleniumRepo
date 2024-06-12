package week3.day1;

public class Elements extends Button{

	public static void main(String[] args) {
		Elements el = new Elements();
		TextField text = new TextField();
        CheckBoxButton check = new CheckBoxButton();
        RadioButton radio = new RadioButton();
        el.click();
        text.getText();
        check.clickCheckButton();
        radio.selectRadioButton();
        el.submit();
	}

}
