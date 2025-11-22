package VideoHandle;


/**
 * Copyright (C), 1999-2023
 * <p>
 * @author qfmeng6@163.com
 * @date 2025/11/22 14:00
 * <p>
 * @description: 音频参数
 * <p>
 * @version:
 * @revise:
 *
 */
public class AudioOptions {
	private int sampleRates = 44100;//采样率
	private float volume = 1.0f;
	private String startTime;
	private String duration;

	public int getSampleRates() {
		return sampleRates;
	}

	public void setSampleRates(int sampleRates) {
		this.sampleRates = sampleRates;
	}

	public float getVolume() {
		return volume;
	}

	public void setVolume(float volume) {
		this.volume = volume;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}
}
