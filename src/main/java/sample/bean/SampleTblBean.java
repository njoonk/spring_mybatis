package sample.bean;

import java.io.Serializable;
import java.util.Date;

public class SampleTblBean implements Serializable {

	private static final long serialVersionUID = 7307399913453177687L;

	private int sampleId;
	private int sampleNum;
	private String sampleName;
    private Date updateTime;

	public int getSampleId() {
		return sampleId;
	}
	public void setSampleId(int sampleId) {
		this.sampleId = sampleId;
	}
	public int getSampleNum() {
		return sampleNum;
	}
	public void setSampleNum(int sampleNum) {
		this.sampleNum = sampleNum;
	}
	public String getSampleName() {
		return sampleName;
	}
	public void setSampleName(String sampleName) {
		this.sampleName = sampleName;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}


}