package com.zpq.cloud.model;


import java.sql.Blob;
import java.util.Date;

public class Branding {

    private String name;
    private String address;
    private String country;
    private String state;
    private String city;
    private String zipCode;
    private String officeNumber;
    private String supportNumber;
    private String supportEmail;
    private String website;
    private String contactUrl;
    private String aboutUrl;
    private String privacyPolicyUrl;
    private String termsConditionsUrl;
    private Blob termsConditionsContent;
    private String emailAlias;
    private String domain;

    private String defaultLogo;
    private String portalHeaderLogo;
    private String loginLogo;
    private String externalPageLogo;
    private String postcardLogo;
    private String onboardingLogo;
    private String favicon;

    private String loginColorScheme;
    private String mainColorScheme;

    private String billingNumber;
    private String billingEmail;

    private String serviceStatusUrl;
    private String ebannerLogo;
    private String helpCenterDomain;
    private String demoContactUrl;

    private String executiveHeadShot;
    private String executiveSignature;
    private String executiveName;
    private String executiveTitle;

    private String registrationTestEmail;
    private String salesEmail;
    private String closedSalesEmail;

    private Long id;
    private Date createdDate;
    private Date lastModifiedDate;
    private Long createdUserId;
    private Long lastModifiedUserId;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }

    public String getSupportNumber() {
        return supportNumber;
    }

    public void setSupportNumber(String supportNumber) {
        this.supportNumber = supportNumber;
    }

    public String getSupportEmail() {
        return supportEmail;
    }

    public void setSupportEmail(String supportEmail) {
        this.supportEmail = supportEmail;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getContactUrl() {
        return contactUrl;
    }

    public void setContactUrl(String contactUrl) {
        this.contactUrl = contactUrl;
    }

    public String getAboutUrl() {
        return aboutUrl;
    }

    public void setAboutUrl(String aboutUrl) {
        this.aboutUrl = aboutUrl;
    }

    public String getPrivacyPolicyUrl() {
        return privacyPolicyUrl;
    }

    public void setPrivacyPolicyUrl(String privacyPolicyUrl) {
        this.privacyPolicyUrl = privacyPolicyUrl;
    }

    public String getTermsConditionsUrl() {
        return termsConditionsUrl;
    }

    public void setTermsConditionsUrl(String termsConditionsUrl) {
        this.termsConditionsUrl = termsConditionsUrl;
    }

    public Blob getTermsConditionsContent() {
        return termsConditionsContent;
    }

    public void setTermsConditionsContent(Blob termsConditionsContent) {
        this.termsConditionsContent = termsConditionsContent;
    }

    public String getEmailAlias() {
        return emailAlias;
    }

    public void setEmailAlias(String emailAlias) {
        this.emailAlias = emailAlias;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getDefaultLogo() {
        return defaultLogo;
    }

    public void setDefaultLogo(String defaultLogo) {
        this.defaultLogo = defaultLogo;
    }

    public String getPortalHeaderLogo() {
        return portalHeaderLogo;
    }

    public void setPortalHeaderLogo(String portalHeaderLogo) {
        this.portalHeaderLogo = portalHeaderLogo;
    }

    public String getLoginLogo() {
        return loginLogo;
    }

    public void setLoginLogo(String loginLogo) {
        this.loginLogo = loginLogo;
    }

    public String getExternalPageLogo() {
        return externalPageLogo;
    }

    public void setExternalPageLogo(String externalPageLogo) {
        this.externalPageLogo = externalPageLogo;
    }

    public String getPostcardLogo() {
        return postcardLogo;
    }

    public void setPostcardLogo(String postcardLogo) {
        this.postcardLogo = postcardLogo;
    }

    public String getOnboardingLogo() {
        return onboardingLogo;
    }

    public void setOnboardingLogo(String onboardingLogo) {
        this.onboardingLogo = onboardingLogo;
    }

    public String getFavicon() {
        return favicon;
    }

    public void setFavicon(String favicon) {
        this.favicon = favicon;
    }

    public String getLoginColorScheme() {
        return loginColorScheme;
    }

    public void setLoginColorScheme(String loginColorScheme) {
        this.loginColorScheme = loginColorScheme;
    }

    public String getMainColorScheme() {
        return mainColorScheme;
    }

    public void setMainColorScheme(String mainColorScheme) {
        this.mainColorScheme = mainColorScheme;
    }

    public String getBillingNumber() {
        return billingNumber;
    }

    public void setBillingNumber(String billingNumber) {
        this.billingNumber = billingNumber;
    }

    public String getBillingEmail() {
        return billingEmail;
    }

    public void setBillingEmail(String billingEmail) {
        this.billingEmail = billingEmail;
    }

    public String getServiceStatusUrl() {
        return serviceStatusUrl;
    }

    public void setServiceStatusUrl(String serviceStatusUrl) {
        this.serviceStatusUrl = serviceStatusUrl;
    }

    public String getEbannerLogo() {
        return ebannerLogo;
    }

    public void setEbannerLogo(String ebannerLogo) {
        this.ebannerLogo = ebannerLogo;
    }

    public String getHelpCenterDomain() {
        return helpCenterDomain;
    }

    public void setHelpCenterDomain(String helpCenterDomain) {
        this.helpCenterDomain = helpCenterDomain;
    }

    public String getDemoContactUrl() {
        return demoContactUrl;
    }

    public void setDemoContactUrl(String demoContactUrl) {
        this.demoContactUrl = demoContactUrl;
    }

    public String getExecutiveHeadShot() {
        return executiveHeadShot;
    }

    public void setExecutiveHeadShot(String executiveHeadShot) {
        this.executiveHeadShot = executiveHeadShot;
    }

    public String getExecutiveSignature() {
        return executiveSignature;
    }

    public void setExecutiveSignature(String executiveSignature) {
        this.executiveSignature = executiveSignature;
    }

    public String getExecutiveName() {
        return executiveName;
    }

    public void setExecutiveName(String executiveName) {
        this.executiveName = executiveName;
    }

    public String getExecutiveTitle() {
        return executiveTitle;
    }

    public void setExecutiveTitle(String executiveTitle) {
        this.executiveTitle = executiveTitle;
    }

    public String getRegistrationTestEmail() {
        return registrationTestEmail;
    }

    public void setRegistrationTestEmail(String registrationTestEmail) {
        this.registrationTestEmail = registrationTestEmail;
    }

    public String getSalesEmail() {
        return salesEmail;
    }

    public void setSalesEmail(String salesEmail) {
        this.salesEmail = salesEmail;
    }

    public String getClosedSalesEmail() {
        return closedSalesEmail;
    }

    public void setClosedSalesEmail(String closedSalesEmail) {
        this.closedSalesEmail = closedSalesEmail;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public Long getCreatedUserId() {
        return createdUserId;
    }

    public void setCreatedUserId(Long createdUserId) {
        this.createdUserId = createdUserId;
    }

    public Long getLastModifiedUserId() {
        return lastModifiedUserId;
    }

    public void setLastModifiedUserId(Long lastModifiedUserId) {
        this.lastModifiedUserId = lastModifiedUserId;
    }
}