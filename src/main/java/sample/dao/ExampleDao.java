package sample.dao;

import java.util.List;
import java.util.Map;

import sample.bean.TestTblBean;

import org.apache.ibatis.annotations.Param;

public interface ExampleDao {

	public List<TestTblBean> selectTestTbl(@Param("map") Map<String, Object> userId);

}