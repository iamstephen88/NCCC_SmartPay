package proj.nccc.spsw.txn.common;

import java.io.Serializable;

import com.hp.nccc.iso8583.core.ISO8583VO;

public class MessageTO implements Serializable {
	public static String TXTYPE_SPI="SPI";
	private String TXType;
	private String sourceSystem;
	private String targetSystem;
	private String mti;
	private ISO8583VO iso8583VO;
	
	public String getTXType() {
		return TXType;
	}
	public void setTXType(String tXType) {
		TXType = tXType;
	}
	public String getSourceSystem() {
		return sourceSystem;
	}
	public void setSourceSystem(String sourceSystem) {
		this.sourceSystem = sourceSystem;
	}
	public String getTargetSystem() {
		return targetSystem;
	}
	public void setTargetSystem(String targetSystem) {
		this.targetSystem = targetSystem;
	}
	public String getMti() {
		return mti;
	}
	public void setMti(String mti) {
		this.mti = mti;
	}
	public ISO8583VO getIso8583VO() {
		return iso8583VO;
	}
	public void setIso8583VO(ISO8583VO iso8583vo) {
		iso8583VO = iso8583vo;
	}
	
	
}
