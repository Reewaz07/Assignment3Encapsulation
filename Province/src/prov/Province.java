package prov;

public class Province {
	
	private String Province;
	private String District;
	private String Municipality;
	
	public Province() {
		
	}

	public Province(String province, String district, String municipality) {
		
		Province = province;
		District = district;
		Municipality = municipality;
	}

	public String getProvince() {
		return Province;
	}

	public void setProvince(String province) {
		Province = province;
	}

	public String getDistrict() {
		return District;
	}

	public void setDistrict(String district) {
		District = district;
	}

	public String getMunicipality() {
		return Municipality;
	}

	public void setMunicipality(String municipality) {
		Municipality = municipality;
	}

	
}
