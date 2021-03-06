package net.mancke.microcart;

import io.dropwizard.Configuration;
import net.mancke.microcart.osiam.OsiamLoginConfiguration;
import net.mancke.microcart.paypal.PayPalConfiguration;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FrontConfiguration extends Configuration {

	@JsonProperty
    private String backendURL = "http://127.0.0.1:5001";

	@JsonProperty
	private String shopURLPrefix = "http://127.0.0.1:5000/shop";

	@JsonProperty
	private String downloadFileDirectory = "/downloads";

	@JsonProperty
	private float shippingCosts;

	@JsonProperty
	private float shippingCostLimit;
	
	@JsonProperty
	private String precashPaymentInfo;
	
	@JsonProperty
	private String orderSuccessMailSubject;
    
    @JsonProperty
    private OsiamLoginConfiguration osiamLogin;
    
    @JsonProperty
    private PayPalConfiguration payPal;
    
    @JsonProperty
    private String mailCheckFrom;

	public String getShopURLPrefix() {
		return shopURLPrefix;
	}

	public void setShopURLPrefix(String shopURLPrefix) {
		this.shopURLPrefix = shopURLPrefix;
	}

	public String getBackendURL() {
		return backendURL;
	}

	public void setBackendURL(String backendURL) {
		this.backendURL = backendURL;
	}

	public OsiamLoginConfiguration getOsiamLogin() {
		return osiamLogin;
	}

	public void setOsiamLogin(OsiamLoginConfiguration osiamLogin) {
		this.osiamLogin = osiamLogin;
	}

	public PayPalConfiguration getPayPal() {
		return payPal;
	}

	public void setPayPal(PayPalConfiguration payPal) {
		this.payPal = payPal;
	}

	public String getPrecashPaymentInfo() {
		return precashPaymentInfo;
	}

	public void setPrecashPaymentInfo(String precashPaymentInfo) {
		this.precashPaymentInfo = precashPaymentInfo;
	}

	public float getShippingCosts() {
		return shippingCosts;
	}

	public void setShippingCosts(float shippingCosts) {
		this.shippingCosts = shippingCosts;
	}

	public float getShippingCostLimit() {
		return shippingCostLimit;
	}

	public void setShippingCostLimit(float shippingCostLimit) {
		this.shippingCostLimit = shippingCostLimit;
	}

	public String getOrderSuccessMailSubject() {
		return orderSuccessMailSubject;
	}

	public void setOrderSuccessMailSubject(String orderSuccessMailSubject) {
		this.orderSuccessMailSubject = orderSuccessMailSubject;
	}

	public String getMailCheckFrom() {
		return mailCheckFrom;
	}

	public void setMailCheckFrom(String mailCheckFrom) {
		this.mailCheckFrom = mailCheckFrom;
	}

	public String getDownloadFileDirectory() {
		return downloadFileDirectory;
	}

	public void setDownloadFileDirectory(String downloadFileDirectory) {
		this.downloadFileDirectory = downloadFileDirectory;
	}
}
