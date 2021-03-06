package com.carpe.communication;

import java.util.List;
import java.util.Map;

public interface CommunicationDAO {
	public List<Map> selectCommunicationList(Map<String, Object> paramMap) throws Exception;
	public Map selectCallStatCount(Map<String, Object> paramMap) throws Exception;
	public List<Map> selectCallStat(Map<String, Object> paramMap) throws Exception;
	public List<Map> selectSmsStat(Map<String, Object> paramMap) throws Exception;
	public List<Map> selectCommunicationRoomList(Map<String, Object> paramMap) throws Exception;
	public List<Map> selectCommunicationDataList(Map<String, Object> paramMap) throws Exception;
}