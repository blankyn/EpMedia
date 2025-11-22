package Jni;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.util.Log;

/**
 * Copyright (C), 1999-2023
 * <p>
 * @author qfmeng6@163.com
 * @date 2025/11/22 13:58
 * <p>
 * @description:
 * <p>
 * @version:
 * @revise:
 *
 */
public class TrackUtils {

	private TrackUtils() {
	}

	private static final String TAG = "TrackUtils";

	/**
	 * 查找视频轨道
	 * @param extractor
	 * @return
	 */
	public static int selectVideoTrack(MediaExtractor extractor) {
		int numTracks = extractor.getTrackCount();
		for (int i = 0; i < numTracks; i++) {
			MediaFormat format = extractor.getTrackFormat(i);
			String mime = format.getString(MediaFormat.KEY_MIME);
			if (mime.startsWith("video/")) {
				Log.d(TAG, "Extractor selected track " + i + " (" + mime + "): " + format);
				return i;
			}
		}
		return -1;
	}

	/**
	 * 查找音频轨道
	 * @param extractor
	 * @return
	 */
	public static int selectAudioTrack(MediaExtractor extractor) {
		int numTracks = extractor.getTrackCount();
		for (int i = 0; i < numTracks; i++) {
			MediaFormat format = extractor.getTrackFormat(i);
			String mime = format.getString(MediaFormat.KEY_MIME);
			if (mime.startsWith("audio/")) {
				Log.d(TAG, "Extractor selected track " + i + " (" + mime + "): " + format);
				return i;
			}
		}
		return -1;
	}
}
