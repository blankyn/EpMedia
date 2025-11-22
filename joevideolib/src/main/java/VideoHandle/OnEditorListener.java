package VideoHandle;



/**
 * Copyright (C), 1999-2023
 * <p>
 * @author qfmeng6@163.com
 * @date 2025/11/22 14:03
 * <p>
 * @description: 执行完成/错误 时的回调接口
 * <p>
 * @version:
 * @revise:
 *
 */
public interface OnEditorListener {
	void onSuccess();

	void onFailure();

	void onProgress(float progress);
}
