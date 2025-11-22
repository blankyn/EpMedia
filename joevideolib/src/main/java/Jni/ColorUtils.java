package Jni;


/**
 * Copyright (C), 1999-2023
 * <p>
 * @author qfmeng6@163.com
 * @date 2025/11/22 13:58
 * <p>
 * @description: 颜色格式转换的类
 * <p>
 * @version:
 * @revise:
 *
 */
public class ColorUtils {

	/**
	 * 加载所有相关链接库
	 */
	static {
		System.loadLibrary("colorutils");
	}

	public static native byte[] rgb2yuvfloat(byte[] rgbs, int size, int width, int height);
}
