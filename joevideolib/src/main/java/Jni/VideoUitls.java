package Jni;

import android.media.MediaExtractor;
import android.media.MediaFormat;



/**
 * Copyright (C), 1999-2023
 * <p>
 * @author qfmeng6@163.com
 * @date 2025/11/22 13:59
 * <p>
 * @description: 获取音频或视频的信息
 * <p>
 * @version:
 * @revise:
 *
 */
public class VideoUitls {

	private VideoUitls() {
	}

	/**
	 * 获取视频信息
	 *
	 * @param url
	 * @return 视频时长（单位微秒）
	 */
	public static long getDuration(String url) {
		try {
			MediaExtractor mediaExtractor = new MediaExtractor();
			mediaExtractor.setDataSource(url);
			int videoExt = TrackUtils.selectVideoTrack(mediaExtractor);
			if (videoExt == -1) {
				videoExt = TrackUtils.selectAudioTrack(mediaExtractor);
				if (videoExt == -1) {
					return 0;
				}
			}
			MediaFormat mediaFormat = mediaExtractor.getTrackFormat(videoExt);
			long res = mediaFormat.containsKey(MediaFormat.KEY_DURATION) ? mediaFormat.getLong(MediaFormat.KEY_DURATION) : 0;//时长
			mediaExtractor.release();
			return res;
		} catch (Exception e) {
			return 0;
		}
	}

	/**
	 * 获取音轨数量
	 *
	 * @param url
	 * @return
	 */
	public static int getChannelCount(String url) {
		try {
			MediaExtractor mediaExtractor = new MediaExtractor();
			mediaExtractor.setDataSource(url);
			int audioExt = TrackUtils.selectAudioTrack(mediaExtractor);
			if (audioExt == -1) {
				return 0;
			}
			MediaFormat mediaFormat = mediaExtractor.getTrackFormat(audioExt);
			int channel = mediaFormat.containsKey(MediaFormat.KEY_CHANNEL_COUNT) ? mediaFormat.getInteger(MediaFormat.KEY_CHANNEL_COUNT) : 1;
			mediaExtractor.release();
			return channel;
		} catch (Exception e) {
			return 0;
		}
	}
}
