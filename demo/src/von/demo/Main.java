package von.demo;

import von.demo.entity.IBehavior;
import von.demo.entity.Pig;
import von.demo.utils.StringUtils;

/**
 * 这是一个简单点的demo，上传到git
 * 
 * @author Koku
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IBehavior pig = new Pig();
		System.out.println(pig.say());
		System.out.println(pig.move());
		System.out.println("ok");
		System.out.println(StringUtils.splitStr("1,2,3,4", ","));
	}
}
