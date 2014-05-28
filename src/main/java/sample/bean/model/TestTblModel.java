package sample.bean.model;

import java.io.Serializable;
import java.util.List;

import sample.bean.SampleTblBean;
import sample.bean.TestTblBean;

public class TestTblModel implements Serializable {

	private static final long serialVersionUID = -2758511412673492544L;

	private List<TestTblBean> listTestTblBean;
	private List<SampleTblBean> listSampleTblBean;

	private TestTblBean testTblBean;

	public List<TestTblBean> getListTestTblBean() {
		return listTestTblBean;
	}

	public void setListTestTblBean(List<TestTblBean> listTestTblBean) {
		this.listTestTblBean = listTestTblBean;
	}

	public List<SampleTblBean> getListSampleTblBean() {
		return listSampleTblBean;
	}

	public void setListSampleTblBean(List<SampleTblBean> listSampleTblBean) {
		this.listSampleTblBean = listSampleTblBean;
	}

	public TestTblBean getTestTblBean() {
		return testTblBean;
	}

	public void setTestTblBean(TestTblBean testTblBean) {
		this.testTblBean = testTblBean;
	}

}