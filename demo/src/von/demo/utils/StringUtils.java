package von.demo.utils;

/**
 * 字符串工具类
 * 
 * @author Koku
 * 
 */
public class StringUtils {

	/**
	 * 拆分字符串
	 * 
	 * @param str
	 *            源串
	 * @param spliter
	 *            分隔符
	 * @return 分割后的数组
	 */
	public static String[] splitStr(String str, String spliter) {
		if (null != str && null != spliter) {
			return str.split(spliter);
		} else {
			return null;
		}
	}
}
