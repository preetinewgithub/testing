package com.popupFactory;

import org.openqa.selenium.By;

import com.generic.Pojo;

public class SelectRolePopUpPageByPreeti {
	
	private Pojo objPojo;

	public SelectRolePopUpPageByPreeti(Pojo pojo) {
		this.objPojo = pojo;
	}
	
	By loc_hdrSelectRolePopUpPage = By.xpath("//span[text()='Select Role']");
	By loc_drpSelectRole=By.xpath("//select[@id='roleChangeID']");
	By loc_btnProceed = By.xpath("//button[text()='Proceed']");
	
	
	
	public void verifySelectRolePopupPageIsDisplayed(){
		objPojo.getObjWrapperFunctions().checkElementDisplayed(loc_hdrSelectRolePopUpPage);
		objPojo.getObjUtilities().logReporter("Verify select pop up page is displayed.", objPojo.getObjWrapperFunctions().checkElementDisplayed(loc_hdrSelectRolePopUpPage));
	}
	
	public void selectUserRole(String strSelectUserRole){
		objPojo.getObjWrapperFunctions().checkElementDisplayed(loc_drpSelectRole);
		objPojo.getObjUtilities().logReporter("Select user role '"+strSelectUserRole+"' .", objPojo.getObjWrapperFunctions().selectDropDownOption(loc_drpSelectRole, strSelectUserRole, "Text"));
	}
	
	
	public void clickProceedOnSelectRolePopupPage() {
		objPojo.getObjUtilities().logReporter("Click 'Proceed' button on select role popup page ",
				objPojo.getObjWrapperFunctions().click(loc_btnProceed));
	}
	
	
	

}
