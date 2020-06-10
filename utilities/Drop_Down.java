package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {
	public static Select dropdownutilities(WebElement ele,String Value ){
		Select obj1= new Select(ele);
		obj1.selectByValue(Value);
		return obj1;
	}

}
