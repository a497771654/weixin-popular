package weixin.popular.bean.wxa;

public class WxaDUserPhone{


	private Watermark watermark;
	/**
	 * phoneNumber : 13580006666
	 * purePhoneNumber : 13580006666
	 * countryCode : 86
	 */

	private String phoneNumber;
	private String purePhoneNumber;
	private String countryCode;



	public Watermark getWatermark() {
		return watermark;
	}

	public void setWatermark(Watermark watermark) {
		this.watermark = watermark;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPurePhoneNumber() {
		return purePhoneNumber;
	}

	public void setPurePhoneNumber(String purePhoneNumber) {
		this.purePhoneNumber = purePhoneNumber;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
}
