package com.ktds.youtube.video.dao;

import java.util.List;

import com.ktds.youtube.video.vo.GroupVideoVO;
import com.ktds.youtube.video.vo.VideoVO;

public interface VideoDao {
	public int insertOneVideo(VideoVO videoVO);
	public int updateOneVideo(VideoVO videoVO);
	public int deleteOneVideo(String videiId);
	public VideoVO selectOneVideo(String videoId);
	public List<GroupVideoVO> selectAllVideos();
}
