//package sample.dao;
//
//import java.sql.SQLException;
//import java.util.List;
//import java.util.Map;
//
//import sample.bean.SampleTblBean;
//import sample.bean.TestTblBean;
//
//import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
//
//public class TestTblDao extends SqlMapClientDaoSupport {
//
//	public int insertTestTbl(Map<String, Object> mapApplistApp) throws SQLException {
//		return getSqlMapClientTemplate().update("insertTestTbl", mapApplistApp);
//	}
//
//	public int insertSampleTbl(Map<String, Object> mapApplistApp) throws SQLException {
//		return getSqlMapClientTemplate().update("insertSampleTbl", mapApplistApp);
//	}
//
//	@SuppressWarnings("unchecked")
//	public List<TestTblBean> selectTestTblList(Map<String, Object> mapParam) throws SQLException {
//		return (List<TestTblBean>) getSqlMapClientTemplate().queryForList("selectTestTbl",mapParam);
//	}
//
//	@SuppressWarnings("unchecked")
//	public List<SampleTblBean> selectSampleTblList(Map<String, Object> mapParam) throws SQLException {
//		return (List<SampleTblBean>) getSqlMapClientTemplate().queryForList("selectSampleTbl",mapParam);
//	}
//
//}