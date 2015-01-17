package von.demo;

import von.demo.entity.IBehavior;
import von.demo.entity.Pig;

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
	}
}
